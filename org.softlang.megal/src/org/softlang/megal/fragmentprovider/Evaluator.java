package org.softlang.megal.fragmentprovider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.softlang.megal.api.URI;

public class Evaluator {

	private static final String FRAGMENT_PROVIDER_ID = "org.softlang.megal.FragmentProvider";
	private static final String ROOT_PROVIDER_ID = "org.softlang.megal.RootProvider";

	private final Collection<RootProvider> rootProviders = new ArrayList<RootProvider>();
	private final Collection<FragmentProvider> fragmentProviders = new ArrayList<FragmentProvider>();

	private final Map<FragmentProvider, Set<FragmentProvider>> fragmentProviderSubTypes = new HashMap<FragmentProvider, Set<FragmentProvider>>();

	public Evaluator() {

		try {
			// Initialise provider collections.
			rootProviders.addAll(getAllRootProviders());
			fragmentProviders.addAll(getAllFragmentProvider());

			// Initialise subtypes.
			for (FragmentProvider fragmentProvider : fragmentProviders) {

				Set<FragmentProvider> subtypes = new HashSet<FragmentProvider>();
				fragmentProviderSubTypes.put(fragmentProvider, subtypes);

				for (FragmentProvider subtype : fragmentProviders) {
					if (subtype == fragmentProvider)
						continue;

					if (fragmentProvider.getClass().isAssignableFrom(subtype.getClass()))
						subtypes.add(subtype);
				}
			}

		} catch (CoreException e) {
			// Error while initialisation of plugin list.
			e.printStackTrace();
		}
	}

	public List<Object> evaluate(URI uri) {

		List<Object> current = roots(uri.getProtocol(), uri.isNet());

		for (String segment : uri.getSegments())
			current = navigate(current, segment);

		return current;
	}

	public Set<String> next(Object object) {
		Set<String> result = new HashSet<String>();

		for (FragmentProvider fragmentProvider : getApplicableFragmentProviders(object))
			result.addAll(fragmentProvider.next(object));

		return result;
	}

	private List<Object> navigate(List<Object> currents, String segment) {
		List<Object> nexts = new ArrayList<Object>();

		for (Object current : currents)
			nexts.addAll(navigate(current, segment));

		return nexts;
	}

	private List<Object> navigate(Object current, String segment) {
		// Get fragment providers applicable on this object.
		List<FragmentProvider> applicableProviders = getApplicableFragmentProviders(current);

		// Navigate to next nodes.
		List<Object> nexts = new ArrayList<Object>();

		for (FragmentProvider applicableProvider : applicableProviders) {
			nexts.addAll(applicableProvider.navigate(current, segment));
		}

		return nexts;
	}

	private List<FragmentProvider> getApplicableFragmentProviders(Object current) {
		List<FragmentProvider> allFragmentProviders = fragmentProviders.stream()
				.filter(x -> x.accept(current)).collect(Collectors.toList());

		List<FragmentProvider> applicableFragmentProvider = new ArrayList<FragmentProvider>();

		for (FragmentProvider fragmentProvider : allFragmentProviders) {
			boolean valid = true;

			for (FragmentProvider subType : fragmentProviderSubTypes.get(fragmentProvider)) {
				if (allFragmentProviders.contains(subType)) {
					valid = false;
					break;
				}
			}

			if (valid)
				applicableFragmentProvider.add(fragmentProvider);
		}

		return applicableFragmentProvider;
	}

	private List<Object> roots(String protocol, boolean net) {
		List<Object> result = new ArrayList<Object>();

		// TODO: think of solution for net.
		for (RootProvider rootProvider : rootProviders) {
			result.addAll(rootProvider.navigate(protocol));
		}

		return result;
	}

	/**
	 * Getting the extension points of current platform.
	 * 
	 * @return
	 * @throws CoreException
	 */
	private Set<RootProvider> getAllRootProviders() throws CoreException {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor(ROOT_PROVIDER_ID);

		Set<RootProvider> result = new HashSet<RootProvider>();

		for (IConfigurationElement element : elements) {
			result.add((RootProvider) element.createExecutableExtension("class"));
		}

		return result;
	}

	/**
	 * Getting the extension points of current platform.
	 * 
	 * @return
	 * @throws CoreException
	 */
	private Set<FragmentProvider> getAllFragmentProvider() throws CoreException {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = reg.getConfigurationElementsFor(FRAGMENT_PROVIDER_ID);

		Set<FragmentProvider> result = new HashSet<FragmentProvider>();

		for (IConfigurationElement element : elements) {
			result.add((FragmentProvider) element.createExecutableExtension("class"));
		}

		return result;
	}

}
