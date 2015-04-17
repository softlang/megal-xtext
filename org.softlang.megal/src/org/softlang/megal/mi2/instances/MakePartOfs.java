package org.softlang.megal.mi2.instances;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Reasoner;
import org.softlang.megal.mi2.util.HashMultitable;
import org.softlang.megal.mi2.util.Multitable;

public class MakePartOfs {
	public static KB makePartOfs(Reasoner r) {
		Multitable<String, String, String> relationships = HashMultitable.create();

		for (Entity e : r.getEntities()) {
			int i = e.getName().indexOf('.');
			if (i >= 0) {
				String container = e.getName().substring(0, i);
				relationships.put(e.getName(), container, "partOf");
			}
		}

		return KBs.builder().setTitle("PartOfs").setRelationships(relationships).build();
	}
}
