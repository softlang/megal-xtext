package org.softlang.megal.mi2.api;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.difference;
import static com.google.common.collect.Sets.newHashSet;

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

import com.google.common.base.Throwables;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;

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
			final Map<Entity, Plugin> plugins;

			final Set<Plugin> universalPlugins;

			final Multimap<EntityType, Plugin> pluginsByEntityType;

			final Multimap<RelationshipType, Plugin> pluginsByRelationshipType;

			final Set<Element> valid;
			final SetMultimap<Element, String> infos;
			final SetMultimap<Element, String> warnings;
			final SetMultimap<Element, String> errors;

			Evaluation() {
				plugins = newHashMap();
				universalPlugins = newHashSet();
				pluginsByEntityType = HashMultimap.create();
				pluginsByRelationshipType = HashMultimap.create();
				valid = newHashSet();
				infos = HashMultimap.create();
				warnings = HashMultimap.create();
				errors = HashMultimap.create();

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
											for (EntityType spec : entityType.getSpecializations())
												pluginsByEntityType.put(spec, plugin);
										}

									// Connect to relationship types
									for (RelationshipType relationshipType : input.getRelationshipTypes())
										if (relationshipType.getAnnotations(getPluginAnnotationName()).contains(
												entity.getName())) {
											specificAssociation = true;
											pluginsByRelationshipType.put(relationshipType, plugin);
											for (RelationshipType spec : relationshipType.getSpecializations())
												pluginsByRelationshipType.put(spec, plugin);
										}

									if (!specificAssociation)
										universalPlugins.add(plugin);

								} catch (Throwable e) {
									errors.put(entity, Throwables.getStackTraceAsString(e));
								}

							else {
								errors.put(entity, "Plugin class " + binding + "  is not resolvable");
							}
						}

				// Get the partOf relationship type
				RelationshipType partOf = input.getRelationshipType(getPartName(), getPluginName(), getPluginName());
				if (partOf != null)
					// If it exists, iterate all the instances
					for (Relationship relationship : partOf.getInstances()) {
						// Get container and element
						Plugin container = plugins.get(relationship.getRight());
						Plugin item = plugins.get(relationship.getLeft());

						// If both exist, add element as part
						if (container != null && item != null)
							container.getParts().add(item);
					}

				// Get the realizationOf relationship type
				RelationshipType realizationOf = input.getRelationshipType(getRealizationName(), getPluginName(),
						KB.ENTITY);
				if (realizationOf != null)
					// If it exists, iterate all the instances
					for (Relationship relationship : realizationOf.getInstances()) {
						// Get the realizer
						Plugin realizer = plugins.get(relationship.getLeft());

						// If it exists, add entity as realized
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
						Iterable<EvaluatorPlugin> select = ImmutableList.copyOf(select(EvaluatorPlugin.class, element));
						for (EvaluatorPlugin plugin : select)
							// Try to evaluate, catch an exception into the error messages
							try {
								plugin.evaluate(context, element);
							} catch (RuntimeException t) {
								context.warning(Throwables.getStackTraceAsString(t));
							} catch (Throwable t) {
								context.error(Throwables.getStackTraceAsString(t));
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
								context.warning(Throwables.getStackTraceAsString(t));
							} catch (Throwable t) {
								context.error(Throwables.getStackTraceAsString(t));
							}
					}

					// TODO Do not evaluate multiple times, may be hard to do because of objects in bindings that do not
					// support equality and hashing

					if (KBs.difference(expansion, current).isEmpty())
						// If expansion has no more additions, stop evaluation
						break;
					else {
						System.out.println(expansion);
						// Else continue with greater front
						current = KBs.union(current, expansion);
					}
				}

				// Return the result for the given parameters and the evaluator state
				return Result.of(input, current, valid, infos, warnings, errors);
			}

			/**
			 * <p>
			 * Creates the context with the given origin and the current element.
			 * </p>
			 * 
			 * @param origin
			 *            The origin tracking map
			 * @param element
			 *            The current element
			 * @return Returns a new context
			 */
			Context createContext(Map<Element, Element> origin, Element element) {
				Context context = new ComposedContext(resolution, new Emission() {
					@Override
					public void valid() {
						valid.add(getOrigin(origin, element));
					}

					@Override
					public void info(String message) {
						infos.put(getOrigin(origin, element), message);
					}

					@Override
					public void warning(String message) {
						warnings.put(getOrigin(origin, element), message);
					}

					@Override
					public void error(String message) {
						errors.put(getOrigin(origin, element), message);
					}

					@Override
					public void valid(Element x, Element... xs) {
						valid.add(getOrigin(origin, x));
						for (Element e : xs)
							valid.add(getOrigin(origin, e));
					}

					@Override
					public void info(String message, Element x, Element... xs) {
						infos.put(getOrigin(origin, x), message);
						for (Element e : xs)
							infos.put(getOrigin(origin, e), message);
					}

					@Override
					public void warning(String message, Element x, Element... xs) {
						warnings.put(getOrigin(origin, x), message);
						for (Element e : xs)
							warnings.put(getOrigin(origin, e), message);
					}

					@Override
					public void error(String message, Element x, Element... xs) {
						errors.put(getOrigin(origin, x), message);
						for (Element e : xs)
							errors.put(getOrigin(origin, e), message);

					}
				});

				return context;
			}

			/**
			 * <p>
			 * Gets the origin of the current element
			 * </p>
			 * 
			 * @param origin
			 *            The origin tracking map
			 * @param element
			 *            The current element
			 * @return Returns the origin
			 */
			Element getOrigin(Map<Element, Element> origin, Element element) {
				Element secondary = origin.get(element);

				return secondary == null ? element : secondary;
			}

			/**
			 * <p>
			 * Selects the desired type of plugin based on the associated element and the type of plugins.
			 * </p>
			 * 
			 * @param type
			 *            The type of plugins
			 * @param element
			 *            The associated element
			 * @return Returns an iterable of plugins
			 */
			<T extends Plugin> Iterable<T> select(Class<T> type, Element element) {
				// Filter the desired type
				return filter(select(element), type);
			}

			/**
			 * <p>
			 * Selects the plugins based on the associated element.
			 * </p>
			 * 
			 * @param element
			 *            The associated element
			 * @return Returns an iterable of plugins
			 */
			Iterable<Plugin> select(Element element) {
				if (element instanceof Entity) {
					// If entity, get the type
					Entity entity = (Entity) element;
					EntityType entityType = entity.getType();

					// If type exists, append all plugins by entity type
					if (entityType != null)
						return concat(universalPlugins, pluginsByEntityType.get(entityType));
					else
						return universalPlugins;
				} else if (element instanceof Relationship) {
					// If relationship, get the type
					Relationship relationship = (Relationship) element;
					RelationshipType relationshipType = relationship.getType();

					// If type exists, append all plugins by relationship type
					if (relationshipType != null)
						return concat(universalPlugins, pluginsByRelationshipType.get(relationshipType));
					else
						return universalPlugins;
				}

				// Else, no specialized association possible
				return universalPlugins;
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
