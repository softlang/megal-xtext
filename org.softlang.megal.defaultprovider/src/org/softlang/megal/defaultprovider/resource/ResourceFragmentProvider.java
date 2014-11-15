package org.softlang.megal.defaultprovider.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.softlang.megal.fragmentprovider.FragmentProvider;

public class ResourceFragmentProvider implements FragmentProvider {

	@Override
	public boolean accept(Object node) {
		return node instanceof IResource;
	}

	@Override
	public List<? extends Object> navigate(Object node, String segment) {
		if (node instanceof IContainer) {
			return getChildren((IContainer) node).stream().filter(x -> x.getName().equals(segment))
					.collect(Collectors.toList());
		}

		return Collections.emptyList();
	}


	private List<IResource> getChildren(IContainer container) {

		List<IResource> children = new ArrayList<IResource>();
		try {
			for (IResource child : container.members()) {
				children.add(child);
			}

		} catch (CoreException e) {
			e.printStackTrace();
		}
		return children;
	}

}
