package org.softlang.sourcesupport;

import static org.eclipse.core.resources.ResourcesPlugin.getWorkspace;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.TypeNameMatch;
import org.eclipse.jdt.core.search.TypeNameMatchRequestor;
import org.eclipse.jdt.launching.JavaRuntime;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class SourceSupportPlugin implements BundleActivator {
	private static SourceSupportPlugin support = null;

	public static SourceSupportPlugin getSupport() {
		return support;
	}

	/**
	 * <p>
	 * The database stores all project source supports that have been calculated
	 * </p>
	 */
	private final Map<String, SourceSupport> database = Maps.newHashMap();

	private final SearchEngine searchEngine = new SearchEngine();

	@Override
	public void start(BundleContext context) throws Exception {
		support = this;

		// Add the listener that rebuilds
		getWorkspace().addResourceChangeListener(listener);

		// Rebuild database
		rebuildDatabase();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		getWorkspace().removeResourceChangeListener(listener);

		support = null;
	}

	/**
	 * <p>
	 * Rebuilds the database by invalidating all projects
	 * </p>
	 */
	private void rebuildDatabase() {
		// Invalidate all the projects
		for (IProject invalidatedProject : getWorkspace().getRoot()
				.getProjects())
			invalidateDatabase(invalidatedProject);
	}

	/**
	 * <p>
	 * Invalidates a project by its name
	 * </p>
	 * 
	 * @param invalidatedProjectName
	 *            The name of the project that is to be invalidated
	 */
	private void invalidateDatabase(String invalidatedProjectName) {
		// Resolve the project name
		IProject invalidatedProject = getWorkspace().getRoot().getProject(
				invalidatedProjectName);

		invalidateDatabase(invalidatedProject);
	}

	/**
	 * <p>
	 * Invalidates a project
	 * </p>
	 * 
	 * @param invalidatedProject
	 *            The project that is to be invalidated
	 */
	private void invalidateDatabase(IProject invalidatedProject) {
		// If the project is not open, it's not eligible for the database
		if (!invalidatedProject.isOpen())
			return;

		// Result model
		SourceSupport model;

		try {
			// Create the java project
			IJavaProject javaProject = JavaCore.create(invalidatedProject);

			// Get all classpath entries required to run this thing
			String[] classpathEntries = JavaRuntime
					.computeDefaultRuntimeClassPath(javaProject);

			// Convert those to URLs, assume no malformed
			URL[] urls = new URL[classpathEntries.length];
			for (int i = 0; i < classpathEntries.length; i++)
				try {
					urls[i] = new Path(classpathEntries[i]).toFile().toURI()
							.toURL();
				} catch (MalformedURLException e) {
					throw new RuntimeException(e);
				}

			// Compute class loader for resolving class names
			ClassLoader classLoader = new URLClassLoader(urls, Thread
					.currentThread().getContextClassLoader());

			// Create the scoped elements and the java search scope
			IJavaProject[] scopeElements = { javaProject };
			IJavaSearchScope scope = SearchEngine.createJavaSearchScope(
					scopeElements, IJavaSearchScope.SOURCES
							| IJavaSearchScope.REFERENCED_PROJECTS
							| IJavaSearchScope.APPLICATION_LIBRARIES);

			Set<String> packages = new SearchScopePackageSet(searchEngine,
					scope);
			Set<String> classes = new SearchScopeTypeSet(searchEngine, scope);

			// Assign a calculated model
			model = new SourceSupport() {
				@Override
				public Set<String> getPackages() {
					return packages;
				}

				@Override
				public Set<String> getClasses() {
					return classes;
				}

				@Override
				public <T> Class<? extends T> loadClass(Class<T> deriving,
						String name) {

					try {
						// Try to load and subclass the class for this name
						Class<?> c = Class.forName(name, false, classLoader);
						if (deriving.isAssignableFrom(c))
							return c.asSubclass(deriving);

						// If not assignable, return null
						return null;
					} catch (ClassNotFoundException e) {
						// If not resolvable, return null
						return null;
					}
				}
			};
		} catch (JavaModelException e) {
			// Assign an error model
			model = new SourceSupport() {
				@Override
				public Set<String> getPackages() {
					return Collections.emptySet();
				}

				@Override
				public Set<String> getClasses() {
					return Collections.emptySet();
				}

				@Override
				public <T> Class<? extends T> loadClass(Class<T> deriving,
						String name) {
					try {
						// Try to load and subclass the class for this name
						Class<?> c = Class.forName(name);
						if (deriving.isAssignableFrom(c))
							return c.asSubclass(deriving);

						// If not assignable, return null
						return null;
					} catch (ClassNotFoundException e) {
						// If not resolvable, return null
						return null;
					}
				}

			};
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}

		// Put the newly calculated model
		database.put(invalidatedProject.getName(), model);
	}

	public SourceSupport analyze(String projectName) {
		return database.get(projectName);
	}

	public SourceSupport analyze(IProject project) {
		return database.get(project.getName());
	}

	/**
	 * <p>
	 * This listener handles the invalidation of changed projects
	 * </p>
	 */
	private final IResourceChangeListener listener = new IResourceChangeListener() {

		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			try {
				// Set catching all projects that need invalidation
				Set<String> invalidatedProjectNames = Sets.newHashSet();

				// Visit the delta
				event.getDelta().accept(new IResourceDeltaVisitor() {
					@Override
					public boolean visit(IResourceDelta delta)
							throws CoreException {
						// Get the project name for the changed resource
						String projectName = delta.getFullPath().segment(0);

						// If it exists, add to the project names
						if (projectName != null)
							invalidatedProjectNames.add(projectName);

						return true;
					}
				});

				// Invalidate all project names
				for (String invalidatedProjectName : invalidatedProjectNames)
					invalidateDatabase(invalidatedProjectName);

			} catch (CoreException e) {
				throw new RuntimeException(e);
			}
		}

	};

}
