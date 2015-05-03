package org.softlang.megal.mi2.api;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Lists.newLinkedList;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.newHashSet;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.api.context.ComposedContext;
import org.softlang.megal.mi2.api.context.Context;
import org.softlang.megal.mi2.api.emission.Emission;
import org.softlang.megal.mi2.api.resolution.Resolution;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class ModelExecutor {
	public static final String DEFAULT_PLUGIN_NAME = "Plugin";

	public static final String DEFAULT_PLUGIN_ANNOTATION_NAME = "Plugin";

	public static final String DEFAULT_PART_NAME = "partOf";

	public static final String DEFAULT_REALIZATION_NAME = "realizationOf";

	private final String pluginName;

	private final String pluginAnnotationName;

	private final String partName;

	private final String realizationName;

	public ModelExecutor() {
		this(DEFAULT_PLUGIN_NAME, DEFAULT_PLUGIN_ANNOTATION_NAME, DEFAULT_PART_NAME, DEFAULT_REALIZATION_NAME);
	}

	public ModelExecutor(String pluginName, String pluginAnnotationName, String partName, String realizationName) {
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
	public Result evaluate(final Resolution resolution, final KB input) {
		class Evaluation {
			final Set<MessageLocation> messages;

			final Map<Entity, Plugin> plugins;

			final Set<Plugin> universalPlugins;

			final Multimap<EntityType, Plugin> pluginsByEntityType;

			final Multimap<RelationshipType, Plugin> pluginsByRelationshipType;

			Evaluation() {
				messages = newHashSet();
				plugins = newHashMap();
				universalPlugins = newHashSet();
				pluginsByEntityType = HashMultimap.create();
				pluginsByRelationshipType = HashMultimap.create();

				// Get all instances of the plugin type
				EntityType pluginType = input.getEntityType(getPluginName());
				if (pluginType != null)
					for (Entity entity : pluginType.getInstances())
						for (Object binding : entity.getBinding().asSet()) {
							// Try to load a class
							Class<? extends Plugin> pluginClass = resolution.getClass(binding, Plugin.class);

							// If class exists, instantiate it
							if (pluginClass != null)
								try {
									// Make instance
									Plugin plugin = pluginClass.newInstance();
									plugins.put(entity, plugin);

									boolean specificAssociation = false;
									// Connect to entity types
									for (EntityType entityType : input.getEntityTypes())
										if (entityType.getAnnotations(getPluginAnnotationName()).contains(
												entity.getName())) {
											specificAssociation = true;
											pluginsByEntityType.put(entityType, plugin);
										}

									// Connect to relationship types
									for (RelationshipType relationshipType : input.getRelationshipTypes())
										if (relationshipType.getAnnotations(getPluginAnnotationName()).contains(
												entity.getName())) {
											specificAssociation = true;
											pluginsByRelationshipType.put(relationshipType, plugin);
										}

									if (!specificAssociation)
										universalPlugins.add(plugin);

								} catch (InstantiationException | IllegalAccessException e) {
									messages.add(MessageLocation.of(entity, Message.createWarningFor(e)));
								}
							else {
								messages.add(MessageLocation.of(entity,
										Message.warning("Plugin class is not resolvable")));
							}
						}

				RelationshipType partOf = input.getRelationshipType(getPartName(), getPluginName(), getPluginName());
				if (partOf != null)
					for (Relationship relationship : partOf.getInstances()) {
						Plugin container = plugins.get(relationship.getRight());
						Plugin item = plugins.get(relationship.getLeft());

						if (container != null && item != null)
							container.getParts().add(item);
					}

				RelationshipType realizationOf = input.getRelationshipType(getRealizationName(), getPluginName(),
						KB.ENTITY);
				if (realizationOf != null)
					for (Relationship relationship : realizationOf.getInstances()) {
						Plugin realizer = plugins.get(relationship.getLeft());

						if (realizer != null)
							realizer.getRealization().add(relationship.getRight());
					}

			}

			Result run() {
				KB current = input;
				Map<Element, Element> origin = newHashMap();
				List<KB> reasoned = newLinkedList();

				for (;;) {
					// Clear the next reasoning step
					reasoned.clear();

					// Evaluate all the entities
					for (Entity entity : current.getEntities()) {
						// Compose a local context
						Context context = new ComposedContext(current, resolution, new Emission() {
							@Override
							public void emit(Message message) {
								Element secondary = origin.get(entity);
								if (secondary == null)
									messages.add(MessageLocation.of(entity, message));
								else
									messages.add(MessageLocation.of(secondary, message));
							}
						});

						// Get appropriate plugins
						for (Plugin plugin : select(entity))
							if (plugin instanceof EvaluatorPlugin) {
								EvaluatorPlugin evaluatorPlugin = (EvaluatorPlugin) plugin;

								evaluatorPlugin.evaluate(context, entity);
							} else if (plugin instanceof ReasonerPlugin) {
								ReasonerPlugin reasonerPlugin = (ReasonerPlugin) plugin;

								KB output = reasonerPlugin.derive(context, entity);

								for (Element element : output.getElements())
									origin.put(element, entity);

								reasoned.add(output);
							}
					}

					// Evaluate all the relationships
					for (Relationship relationship : current.getRelationships()) {
						// Compose a local context
						Context context = new ComposedContext(current, resolution, new Emission() {
							@Override
							public void emit(Message message) {
								Element secondary = origin.get(relationship);
								if (secondary == null)
									messages.add(MessageLocation.of(relationship, message));
								else
									messages.add(MessageLocation.of(secondary, message));
							}
						});

						// Get appropriate plugins
						for (Plugin plugin : select(relationship))
							if (plugin instanceof EvaluatorPlugin) {
								EvaluatorPlugin evaluatorPlugin = (EvaluatorPlugin) plugin;

								evaluatorPlugin.evaluate(context, relationship);
							} else if (plugin instanceof ReasonerPlugin) {
								ReasonerPlugin reasonerPlugin = (ReasonerPlugin) plugin;

								KB output = reasonerPlugin.derive(context, relationship);

								for (Element element : output.getElements())
									origin.put(element, relationship);

								reasoned.add(output);
							}
					}

					KB next = KBs.clone(current);
					for (KB sub : reasoned)
						next = KBs.union(next, sub);

					if (equal(current, next))
						break;

					current = next;
				}

				return Result.of(input, current, messages);
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
}
