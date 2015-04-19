package org.softlang.megal.language.tests;

import org.softlang.megal.api.Resolver;
import org.softlang.megal.mi2.Entity;

public class LanguageAndTechnologyResolver extends Resolver {

	@Override
	public boolean resolves(Entity e) {
		if (!e.getBindings().isEmpty())
			return false;

		switch (e.getType().getName()) {
		case "Language":
		case "Technology":
			return true;

		default:
			return false;
		}
	}

	@Override
	public String resolve(Entity e) {
		String base = "http://101companies.org/resources/";

		switch (e.getType().getName()) {
		case "Language":
			return base + "languages/" + e.getName();
		case "Technology":
			return base + "technologies/" + e.getName();

		default:
			throw new IllegalArgumentException();
		}
	}

}
