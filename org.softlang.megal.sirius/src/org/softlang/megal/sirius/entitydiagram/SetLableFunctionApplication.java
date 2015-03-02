package org.softlang.megal.sirius.entitydiagram;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.softlang.megal.Entity;
import org.softlang.megal.FunctionApplication;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.sirius.MegalServices;

public class SetLableFunctionApplication implements IExternalJavaAction {

	public SetLableFunctionApplication() {
	
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		String lable = (String) arg1.get("lable");
		FunctionApplication functionApplication = (FunctionApplication) arg0.iterator().next();

		Megamodel megamodel = MegalServices.INSTANCE.getMegamodel(functionApplication);

		List<Entity> entities = MegalServices.INSTANCE.getEntities(megamodel);

		Optional<Entity> entity = entities.stream().filter(x -> lable.equals(x.getName()))
				.findFirst();

		if (!entity.isPresent())
			return;

		functionApplication.setFunction(entity.get());
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
