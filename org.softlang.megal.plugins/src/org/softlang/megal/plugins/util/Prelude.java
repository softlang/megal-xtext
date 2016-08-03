package org.softlang.megal.plugins.util;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Lists.newLinkedList;
import static com.google.common.collect.Sets.newHashSet;

import java.util.Deque;
import java.util.Set;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.Relationship;

/**
 * 
 * @author darjeeling
 *
 */
public class Prelude {
	
	static final public String ARTIFACT = "Artifact";
	static final public String CONCEPT = "Concept";
	static final public String FUNCTION = "Function";
	static final public String SET = "SET";
	static final public String TECHNOLOGY = "Technology";
	static final public String LANGUAGE = "Language";
	static final public String FILE = "File";
	static final public String FOLDER = "Folder";
	static final public String FRAGMENT = "Fragment";
	static final public String RESOURCE = "Resource";
	static final public String TRANSIENT = "Transient";
	static final public String PLUGIN = "Plugin";
	
	static public boolean isInstance(Entity entity, String type) {
		
		EntityType entityType = entity.getKB().getEntityType(type);
		
		if (entityType == null) {
			return false;
		}

		return entity.isInstance(entityType);
		
	}
	
	static public boolean isArtifact (Entity entity) {
		return isInstance(entity,ARTIFACT);
	}
	
	static public boolean isConcept (Entity entity) {
		return isInstance(entity,CONCEPT);
	}
	
	static public boolean isFunction (Entity entity) {
		return isInstance(entity,FUNCTION);
	}
	
	static public boolean isSet (Entity entity) {
		return isInstance(entity,SET);
	}
	
	static public boolean isTechnology (Entity entity) {
		return isInstance(entity,TECHNOLOGY);
	}
	
	static public boolean isLanguage (Entity entity) {
		return isInstance(entity,LANGUAGE);
	}
	
	static public boolean isFile (Entity entity) {
		return isInstance(entity,FILE);
	}
	
	static public boolean isFolder (Entity entity) {
		return isInstance(entity,FOLDER);
	}
	
	static public boolean isFragment (Entity entity) {
		return isInstance(entity,FRAGMENT);
	}
	
	static public boolean isResource (Entity entity) {
		return isInstance(entity,RESOURCE);
	}
	
	static public boolean isTransient (Entity entity) {
		return isInstance(entity,TRANSIENT);
	}
	
	static public boolean isPlugin (Entity entity) {
		return isInstance(entity,PLUGIN);
	}

	public static Iterable<Entity> outgoingTo(Entity entity, String name) {
		
//		return entity.getKB().getRelationships().stream()
//				.filter( r -> r.getTypeName().equals(name) && r.getLeft().equals(entity))
//				.map( r -> r.getRight() )
//				.collect(Collectors.toList());
		
		return from(entity.outgoing(name)).transform(Relationship::getRight);
	}

	public static Iterable<Entity> incomingFrom(Entity entity, String name) {
		return from(entity.incoming(name)).transform(Relationship::getLeft);
	}

	public static boolean isElementOfLanguage(Entity entity, String language) {
		return isElementOfLanguage(entity, entity.getKB().getEntity(language));
	}

	public static boolean isElementOfLanguage(Entity entity, Entity language) {
		for (Entity other : outgoingTo(entity, "elementOf"))
			if (isLanguageAssignable(other, language))
				return true;

		return false;
	}

	public static boolean isLanguageAssignable(Entity sub, String language) {
		return isLanguageAssignable(sub, sub.getKB().getEntity(language));
	}

	public static boolean isLanguageAssignable(Entity sub, Entity language) {
		if (!isInstance(sub, "Language"))
			return false;
		if (!isInstance(language, "Language"))
			return false;

		if (equal(language, sub))
			return true;

		Set<Entity> visited = newHashSet();
		Deque<Entity> candidates = newLinkedList(outgoingTo(sub, "subsetOf"));

		while (!candidates.isEmpty()) {
			Entity superset = candidates.poll();

			if (equal(language, superset))
				return true;

			if (!isInstance(superset, "Language"))
				continue;

			visited.add(superset);

			for (Entity supSup : outgoingTo(superset, "subsetOf"))
				if (!visited.contains(supSup))
					candidates.offer(supSup);
		}

		return false;
	}
}
