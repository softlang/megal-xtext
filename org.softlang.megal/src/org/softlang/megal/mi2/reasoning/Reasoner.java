package org.softlang.megal.mi2.reasoning;

import java.util.Map;
import java.util.Map.Entry;

import org.softlang.megal.mi2.kb.AbstractKB;
import org.softlang.megal.mi2.kb.KB;
import org.softlang.megal.mi2.kb.Ref;
import org.softlang.megal.mi2.util.Multitable;

import com.google.common.collect.SetMultimap;
import com.google.common.collect.Table.Cell;

public class Reasoner extends AbstractKB {
	private final KB kb;

	public Reasoner(KB kb) {
		this.kb = kb;
	}

	public KB getKB() {
		return kb;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	//
	// protected boolean spawnsEntityType(EntityType entityType) {
	// return
	// spawnEntityTypes().entrySet().contains(immutableEntry(entityType.getName(),
	// entityType.getSupertype().getName()));
	// }
	//
	// protected Map<String, String> spawnEntityTypes() {
	// return emptyList();
	// }

	@Override
	public SetMultimap<String, String> getAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetMultimap<String, String> getTheEntityTypeAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getEntityTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Multitable<Ref, Ref, String> getRelationshipTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Ref> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getBindings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Multitable<String, String, String> getRelationships() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetMultimap<Entry<String, String>, Entry<String, String>> getEntityTypeAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetMultimap<Cell<Ref, Ref, String>, Entry<String, String>> getRelationshipTypeAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetMultimap<Entry<String, Ref>, Entry<String, String>> getEntityAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetMultimap<Cell<String, String, String>, Entry<String, String>> getRelationshipAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

}
