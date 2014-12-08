package org.softlang.megal.sirius.entitydiagram;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Megamodel;
import org.softlang.megal.sirius.MegalServices;

public class SetLableEntity implements IExternalJavaAction {

	public SetLableEntity() {
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {

		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {

		String lable = (String) arg1.get("lable");
		Entity entity = (Entity) arg0.iterator().next();

		String[] fragments = lable.split(":");

		// Set name of entity if name is not already used in scope.
		if (fragments.length > 0) {
			Entity resolved = MegalServices.INSTANCE.resolveEntity((Megamodel) entity.eContainer(),
					fragments[0]);

			if (resolved == null)
				entity.setName(fragments[0]);
		}

		// Change type if applicable to all relations that are in scope.
		if (fragments.length > 1) {
			EntityType resolved = MegalServices.INSTANCE.resolveEntityType(
					(Megamodel) entity.eContainer(), fragments[1]);
			
			Megamodel megamodel = MegalServices.INSTANCE.getMegamodel(entity);
			
			if (resolved != null)
				entity.getType().setDefinition(resolved);
		}
	}

}
