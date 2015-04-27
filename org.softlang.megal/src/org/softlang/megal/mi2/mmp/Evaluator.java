package org.softlang.megal.mi2.mmp;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.newHashSet;
import static java.util.Collections.singleton;

import java.util.Map;
import java.util.Set;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.mmp.data.Message;
import org.softlang.megal.mi2.mmp.data.MessageLocation;
import org.softlang.megal.mi2.mmp.data.Result;
import org.softlang.megal.mi2.reasoning.Provider;
import org.softlang.megal.mi2.reasoning.Providers;
import org.softlang.megal.mi2.reasoning.Reasoner;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class Evaluator {
	public static final String DEFAULT_PLUGIN_NAME = "Evaluator";

	public static final String DEFAULT_PLUGIN_ANNOTATION_NAME = "Plugin";

	public static final String DEFAULT_PART_NAME = "partOf";

	public static final String DEFAULT_REALIZATION_NAME = "realizationOf";

	private final Provider provider;

	private final String pluginName;

	private final String pluginAnnotationName;

	private final String partName;

	private final String realizationName;

	public Evaluator(Provider provider, String pluginName, String pluginAnnotationName, String partName,
			String realizationName) {
		this.provider = provider;
		this.pluginName = pluginName;
		this.pluginAnnotationName = pluginAnnotationName;
		this.partName = partName;
		this.realizationName = realizationName;
	}

	public Evaluator(Provider provider) {
		this(provider, DEFAULT_PLUGIN_NAME, DEFAULT_PLUGIN_ANNOTATION_NAME, DEFAULT_PART_NAME, DEFAULT_REALIZATION_NAME);
	}

	public Evaluator() {
		this(Providers.DEFAULT);
	}

	public Provider getProvider() {
		return provider;
	}

	public String getPluginName() {
		return pluginName;
	}

	public String getPluginAnnotationName() {
		return pluginAnnotationName;
	}

	public String getPartName() {
		return partName;
	}

	public String getRealizationName() {
		return realizationName;
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
	 * @return Returns the evaluation resolut
	 */
	public Result evaluate(final Resolution resolution, final Reasoner input) {
		class LayeredAlgorithm {
			final Set<MessageLocation> messageLocations;

			final Map<Entity, Plugin> plugins;

			final Multimap<EntityType, Plugin> pluginsByEntityType;

			final Multimap<RelationshipType, Plugin> pluginsByRelationshipType;

			LayeredAlgorithm() {
				messageLocations = newHashSet();
				plugins = newHashMap();
				pluginsByEntityType = HashMultimap.create();
				pluginsByRelationshipType = HashMultimap.create();

				// Get all instances of the plugin type
				for (Entity entity : input.getEntityType(getPluginName()).getInstances())
					// Get all bindings to the entity
					for (Object binding : entity.getBindings()) {
						// Try to load a class
						Class<? extends Plugin> pluginClass = resolution.getClass(binding, Plugin.class);

						// If class exists, instantiate it
						if (pluginClass != null)
							try {
								// Make instance
								Plugin plugin = pluginClass.newInstance();

								// Track if there is a specific association
								boolean hasSpecificAssociation = false;

								// Connect to entity types
								for (EntityType entityType : input.getEntityTypes())
									if (entityType.getAnnotations(getPluginAnnotationName()).contains(entity.getName())) {
										hasSpecificAssociation = true;
										pluginsByEntityType.put(entityType, plugin);
									}

								// Connect to relationship types
								for (RelationshipType relationshipType : input.getRelationshipTypes())
									if (relationshipType.getAnnotations(getPluginAnnotationName()).contains(
											entity.getName())) {
										hasSpecificAssociation = true;
										pluginsByRelationshipType.put(relationshipType, plugin);
									}

								// If there is no specific association, this is
								// a general plugin and therefore is listed here
								if (!hasSpecificAssociation)
									plugins.put(entity, plugin);
							} catch (InstantiationException | IllegalAccessException e) {
								messageLocations
										.add(MessageLocation.of(singleton(entity), Message.createWarningFor(e)));
							}
						else {
							messageLocations.add(MessageLocation.of(singleton(entity),
									Message.warning("Plugin class is not resolvable")));
						}
					}
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
					return plugins.values();

				return concat(plugins.values(), pluginsByEntityType.get(type));
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
					return plugins.values();

				return concat(plugins.values(), pluginsByRelationshipType.get(type));
			}

			Result run() {
				return Result.of(input.getKB(), KBs.emptyKB()/* JOIN RESIDUES */, messageLocations);
			}
		}

		return new LayeredAlgorithm().run();
	}
}
