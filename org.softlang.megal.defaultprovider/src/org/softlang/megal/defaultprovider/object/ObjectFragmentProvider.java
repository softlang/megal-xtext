package org.softlang.megal.defaultprovider.object;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.softlang.megal.fragmentprovider.FragmentProvider;

import com.google.common.collect.Lists;

public class ObjectFragmentProvider implements FragmentProvider {

	@Override
	public boolean accept(Object node) {
		return true;
	}

	@Override
	public List<? extends Object> navigate(Object node, String segment) {

		Object property = properties(node).get(segment);

		List<Object> result;

		if (property instanceof Collection<?>)
			result = Lists.newArrayList((Collection<?>) property);
		else if (property instanceof Object[])
			result = Arrays.asList((Object[]) property);
		else
			result = Collections.singletonList(property);

		return result;
	}

	@Override
	public Set<String> next(Object node) {

		return properties(node).keySet();
	}

	private Map<String, Object> properties(Object object) {
		Map<String, Object> result = new HashMap<String, Object>();

		for (Method method : object.getClass().getMethods()) {
			if (!method.getName().startsWith("get"))
				continue;

			if (method.getParameterCount() != 0)
				continue;

			try {
				result.put(method.getName().substring(3).toLowerCase(), method.invoke(object));
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
