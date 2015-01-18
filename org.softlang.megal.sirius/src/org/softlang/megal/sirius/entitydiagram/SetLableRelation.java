package org.softlang.megal.sirius.entitydiagram;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.RelationshipTypeInstance;
import org.softlang.megal.sirius.MegalServices;

public class SetLableRelation implements IExternalJavaAction {

	public SetLableRelation() {
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {

		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {

		String lable = (String) arg1.get("lable");
		Relationship relation = (Relationship) arg0.iterator().next();

		Megamodel megamodel = MegalServices.INSTANCE.getMegamodel(relation);

		EList<RelationshipTypeInstance> rtis = relation.getLeft().applicableOutgoing(relation.getRight());

		// EList<RelationshipType> rts = megamodel.applicableRelationshipTypes(
		// relation.getLeft(), relation.getRight());

		Optional<RelationshipTypeInstance> rt = rtis.stream().filter(x -> x.aggregatorName().equals(lable)).findFirst();

		if (!rt.isPresent())
			return;

		relation.setType((RelationshipType) rt.get().eContainer());
	}

}
