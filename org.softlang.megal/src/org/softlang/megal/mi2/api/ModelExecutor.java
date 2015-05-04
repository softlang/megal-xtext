package org.softlang.megal.mi2.api;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.difference;
import static com.google.common.collect.Sets.newHashSet;
import static java.util.Collections.emptyList;

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
				// Set of evaluated elements, so some element is not evaluated twice
				Set<Element> evaluated = newHashSet();

				// Origin of generated elements for origin tracking of errors
				Map<Element, Element> origin = newHashMap();

				// Current knowledge base and expansion base
				KB current = input;
				KB expansion = KBs.empty();

				for (;;) {
					// Evaluate all the elements
					for (Element element : difference(current.getElements(), evaluated)) {
						// Mark as evaluated
						evaluated.add(element);

						// Compose a local context
						Context context = createContext(origin, element);

						// Get appropriate evaluators
						for (EvaluatorPlugin plugin : select(EvaluatorPlugin.class, element))
							// Try to evaluate, catch an exception into the error messages
							try {
								plugin.evaluate(context, element);
							} catch (RuntimeException t) {
								context.emit(Message.createWarningFor(t));
							} catch (Throwable t) {
								context.emit(Message.createErrorFor(t));
							}

						// Get the appropriate reasoners
						for (ReasonerPlugin plugin : select(ReasonerPlugin.class, element))
							// Try to get the output KB, catch an exception into the error messages
							try {
								KB output = plugin.derive(context, element);

								// Annotate all the generated elements
								for (Element generated : output.getElements())
									origin.put(element, generated);

								// Add the output to the reasoner
								expansion = KBs.union(expansion, output);
							} catch (RuntimeException t) {
								context.emit(Message.createWarningFor(t));
							} catch (Throwable t) {
								context.emit(Message.createErrorFor(t));
							}
					}

					if (KBs.difference(expansion, current).isEmpty())
						// If expansion has no more additions, stop evaluation
						break;
					else
						// Else continue with greater front
						current = KBs.union(current, expansion);
				}

				// Return the result for the given parameters and the evaluator state
				return Result.of(input, current, messages);
			}

			Context createContext(Map<Element, Element> origin, Element element) {
				Context context = new ComposedContext(resolution, new Emission() {
					@Override
					public void emit(Message message) {
						Element secondary = origin.get(element);
						if (secondary == null)
							messages.add(MessageLocation.of(element, message));
						else
							messages.add(MessageLocation.of(secondary, message));
					}
				});
				return context;
			}

			/**
			 * <p>
			 * Selects the desired type of plugin based on the associate element and the type of plugins.
			 * </p>
			 * 
			 * @param type
			 *            The type of plugins
			 * @param element
			 *            The associate element
			 * @return Returns an iterable of plugins
			 */
			<T extends Plugin> Iterable<T> select(Class<T> type, Element element) {
				// Always consider universal plugins
				Iterable<Plugin> result = universalPlugins;

				if (element instanceof Entity) {
					// If entity, get the type
					Entity entity = (Entity) element;
					EntityType entityType = entity.getType();

					// If type exists, append all plugins by entity type
					if (entityType != null)
						result = concat(result, pluginsByEntityType.get(entityType));
				} else if (element instanceof Relationship) {
					// If relationship, get the type
					Relationship relationship = (Relationship) element;
					RelationshipType relationshipType = relationship.getType();

					// If type exists, append all plugins by relationship type
					if (relationshipType != null)
						result = concat(result, pluginsByRelationshipType.get(relationshipType));
				} else
					// Else, no specialized association possible
					result = emptyList();

				// Filter the desired type
				return filter(result, type);
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
