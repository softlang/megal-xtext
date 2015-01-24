package org.softlang.megal;

public class TypeReferences {
	public static EntityTypeReference singleRef(EntityType definition) {
		EntityTypeReference r = MegalFactory.eINSTANCE.createEntityTypeReference();
		r.setDefinition(definition);
		r.setMany(false);
		return r;
	}

	public static EntityTypeReference manyRef(EntityType definition, boolean many) {
		EntityTypeReference r = MegalFactory.eINSTANCE.createEntityTypeReference();
		r.setDefinition(definition);
		r.setMany(true);
		return r;
	}

	public static FunctionTypeReference functionRef(EntityType definition, Entity domain, Entity codomain) {
		FunctionTypeReference r = MegalFactory.eINSTANCE.createFunctionTypeReference();
		r.setDefinition(definition);
		r.setDomain(domain);
		r.setCodomain(codomain);
		return r;
	}
}
