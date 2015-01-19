package org.softlang.megal.evaluation;

import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.FunctionTypeReference;
import org.softlang.megal.Link;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.RelationshipTypeInstance;
import org.softlang.megal.impl.MegalFactoryImpl;

public class MegalFactoryEval extends MegalFactoryImpl {

	@Override
	public Entity createEntity() {
		return new EntityEval();
	}

	@Override
	public EntityType createEntityType() {
		return new EntityTypeEval();
	}

	@Override
	public EntityTypeReference createEntityTypeReference() {
		return new EntityTypeReferenceEval();
	}

	@Override
	public FunctionTypeReference createFunctionTypeReference() {
		return new FunctionTypeReferenceEval();
	}

	@Override
	public Link createLink() {
		return new LinkEval();
	}

	@Override
	public Megamodel createMegamodel() {
		return new MegamodelEval();
	}

	@Override
	public Relationship createRelationship() {
		return new RelationshipEval();
	}

	@Override
	public RelationshipType createRelationshipType() {
		return new RelationshipTypeEval();
	}

	@Override
	public RelationshipTypeInstance createRelationshipTypeInstance() {
		return new RelationshipTypeInstanceEval();
	}
}
