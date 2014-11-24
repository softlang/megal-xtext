package org.softlang.megal.defaultprovider.searchengine;

import java.util.List;

import com.google.common.collect.Lists;

public class TypenameDatabase {
	private static final int EXPECTED_DATABASE_SIZE = 20000;

	private final List<Typename> typenames;

	public TypenameDatabase() {
		this.typenames = Lists
				.newArrayListWithExpectedSize(EXPECTED_DATABASE_SIZE);
	}

	public List<Typename> getTypenames() {
		return typenames;
	}
}
