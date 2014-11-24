package org.softlang.megal.defaultprovider.searchengine;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.softlang.megal.defaultprovider.TypeFragmentProvider;

import com.google.common.base.Objects;

public class TypenameInitFragmentProvider extends
		TypeFragmentProvider<TypenameInit> {
	public TypenameInitFragmentProvider() {
		super(TypenameInit.class);
	}

	@Override
	protected List<? extends Object> navigateTyped(TypenameInit i,
			String segment) {
		if (Objects.equal(segment, i.nextSegment()))
			return Collections.singletonList(i.next());
		else
			return Collections.emptyList();
	}

	@Override
	protected Set<String> nextTyped(TypenameInit i) {
		if (i.hasNext())
			return Collections.singleton(i.nextSegment());
		else
			return Collections.emptySet();
	}

}
