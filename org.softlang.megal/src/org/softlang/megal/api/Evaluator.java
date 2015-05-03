package org.softlang.megal.api;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.newHashSet;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Set;

import org.softlang.megal.api.context.Context;
import org.softlang.megal.api.resolution.Resolution;
import org.softlang.megal.mi2.Access;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.kb.KB;
import org.softlang.sourcesupport.SourceSupport;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;

public class Evaluator {
	public static final String DEFAULT_REASONER_NAME = "Reasoner";

	public static final String DEFAULT_PLUGIN_NAME = "Evaluator";

	public static final String DEFAULT_PLUGIN_ANNOTATION_NAME = "Plugin";

	public static final String DEFAULT_PART_NAME = "partOf";

	public static final String DEFAULT_REALIZATION_NAME = "realizationOf";

	private final String reasonerName;

	private final String pluginName;

	private final String pluginAnnotationName;

	private final String partName;

	private final String realizationName;

	public Evaluator() {
		this(DEFAULT_REASONER_NAME, DEFAULT_PLUGIN_NAME, DEFAULT_PLUGIN_ANNOTATION_NAME, DEFAULT_PART_NAME,
				DEFAULT_REALIZATION_NAME);
	}

	public Evaluator(String reasonerName, String pluginName, String pluginAnnotationName, String partName,
			String realizationName) {
		this.reasonerName = reasonerName;
		this.pluginName = pluginName;
		this.pluginAnnotationName = pluginAnnotationName;
		this.partName = partName;
		this.realizationName = realizationName;
	}

	/**
	 * <p>
	 * Evaluates the input with the given resolution
	 * </p>
	 * 
	 * @param resolution
	 *            The resolution to use
	 * @param input
	 *            The input
	 * @return Returns the evaluation result
	 */
	public Set<Message> evaluate(final Resolution resolution, final KB input) {
		class Evaluation implements Context {
			final Set<Message> messages;

			final Map<Entity, Plugin> plugins;

			final Set<Plugin> universalPlugins;

			final Multimap<EntityType, Plugin> pluginsByEntityType;

			final Multimap<RelationshipType, Plugin> pluginsByRelationshipType;

			KB kb;

			Evaluation() {
				messages = newHashSet();
				plugins = newHashMap();
				universalPlugins = newHashSet();
				pluginsByEntityType = HashMultimap.create();
				pluginsByRelationshipType = HashMultimap.create();

				kb = input;

				// Get all instances of the reasoner type
				EntityType reasonerType = Access.on(input).getEntityType(getReasonerName());
				if (reasonerType != null)
					for (Entity entity : reasonerType.getInstances()) {
						// Try to load a class
						Class<? extends KB> reasonerClass = resolution.getClass(entity.getBinding(), KB.class);

						try {
							kb = reasonerClass.getConstructor(KB.class).newInstance(input);
						} catch (NoSuchMethodException | SecurityException | InstantiationException
								| IllegalAccessException | IllegalArgumentException e) {
							messages.add(Message.createWarningFor(entity, e));
						} catch (InvocationTargetException e) {
							messages.add(Message.createErrorFor(entity, e));
						}
					}

				// Get all instances of the plugin type
				EntityType pluginType = Access.on(kb).getEntityType(getPluginName());
				if (pluginType != null)
					for (Entity entity : pluginType.getInstances()) {
						// Try to load a class
						Class<? extends Plugin> pluginClass = resolution.getClass(entity.getBinding(), Plugin.class);

						// If class exists, instantiate it
						if (pluginClass != null)
							try {
								// Make instance
								Plugin plugin = pluginClass.newInstance();
								plugins.put(entity, plugin);

								boolean specificAssociation = false;
								// Connect to entity types
								for (EntityType entityType : Access.on(kb).getEntityTypes())
									if (entityType.getAnnotations(getPluginAnnotationName()).contains(entity.getName())) {
										specificAssociation = true;
										pluginsByEntityType.put(entityType, plugin);
									}

								// Connect to relationship types
								for (RelationshipType relationshipType : Access.on(kb).getRelationshipTypes())
									if (relationshipType.getAnnotations(getPluginAnnotationName()).contains(
											entity.getName())) {
										specificAssociation = true;
										pluginsByRelationshipType.put(relationshipType, plugin);
									}

								if (!specificAssociation)
									universalPlugins.add(plugin);

							} catch (InstantiationException | IllegalAccessException e) {
								messages.add(Message.createWarningFor(entity, e));
							}
						else {
							messages.add(Message.warning(entity, "Plugin class is not resolvable"));
						}
					}

				RelationshipType partOf = Access.on(kb).getRelationshipType(getPartName(), getPluginName(),
						getPluginName());
				if (partOf != null)
					for (Relationship relationship : partOf.getInstances()) {
						Plugin container = plugins.get(relationship.getRight());
						Plugin item = plugins.get(relationship.getLeft());

						if (container != null && item != null)
							container.addPart(item);
					}

				RelationshipType realizationOf = Access.on(kb).getRelationshipType(getRealizationName(),
						getPluginName(), KB.ENTITY);
				if (realizationOf != null)
					for (Relationship relationship : realizationOf.getInstances()) {
						Plugin realizer = plugins.get(relationship.getLeft());

						if (realizer != null)
							realizer.addRealization(relationship.getRight());
					}

			}

			@Override
			public void emit(Message message) {
				messages.add(message);
			}

			@Override
			public ByteSource getBytes(Object object) {
				return resolution.getBytes(object);
			}

			@Override
			public CharSource getChars(Object object) {
				return resolution.getChars(object);
			}

			@Override
			public <T> Class<? extends T> getClass(Object object, Class<T> deriving) {
				return resolution.getClass(object, deriving);
			}

			@Override
			public KB getKB() {
				return kb;
			}

			@Override
			public SourceSupport getSourceSupport() {
				return resolution.getSourceSupport();
			}

			Set<Message> run() {
				// Evaluate all the entities
				for (Entity entity : Access.on(kb).getEntities())
					// Get appropriate plugins
					for (Plugin plugin : select(entity))
						plugin.evaluate(this, entity);

				// Evaluate all the relationships
				for (Relationship relationship : Access.on(kb).getRelationships())
					// Get appropriate plugins
					for (Plugin plugin : select(relationship))
						plugin.evaluate(this, relationship);

				return messages;
			}

			/**
			 * <p>
			 * Selects the sequence of plugins based on an entity.
			 * </p>
			 * 
			 * @param entity
			 *            The entity to select for
			 * @return Returns all applicable plugins
			 */
			Iterable<Plugin> select(Entity entity) {
				EntityType type = entity.getType();

				if (type == null)
					return universalPlugins;

				return concat(universalPlugins, pluginsByEntityType.get(type));
			}

			/**
			 * <p>
			 * Selects the sequence of plugins based on an entity.
			 * </p>
			 * 
			 * @param entity
			 *            The entity to select for
			 * @return Returns all applicable plugins
			 */
			Iterable<Plugin> select(Relationship relationship) {
				RelationshipType type = relationship.getType();

				if (type == null)
					return universalPlugins;

				return concat(universalPlugins, pluginsByRelationshipType.get(type));
			}
		}

		return new Evaluation().run();
	}

	public String getPartName() {
		return partName;
	}

	public String getPluginAnnotationName() {
		return pluginAnnotationName;
	}

	public String getPluginName() {
		return pluginName;
	}

	public String getRealizationName() {
		return realizationName;
	}

	public String getReasonerName() {
		return reasonerName;
	}
}
