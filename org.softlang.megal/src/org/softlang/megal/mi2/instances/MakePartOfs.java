package org.softlang.megal.mi2.instances;

import static org.softlang.megal.mi2.util.Multitables.multiPut;

import java.util.Set;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Reasoner;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class MakePartOfs {
	public static KB makePartOfs(Reasoner r) {
		Table<String, String, Set<String>> relationships = HashBasedTable.create();

		for (Entity e : r.getEntities()) {
			int i = e.getName().indexOf('.');
			if (i >= 0) {
				String container = e.getName().substring(0, i)
						;
				multiPut(relationships, e.getName(), container, "partOf");
			}
		}

		return KBs.builder().setTitle("PartOfs").setRelationships(relationships).build();
	}
}
