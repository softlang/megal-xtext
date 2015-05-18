package org.softlang.megal.sirius.entitydiagram;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.softlang.megal.MegalEntity;
import org.softlang.megal.MegalFile;
import org.softlang.megal.MegalFunctionApplication;
import org.softlang.megal.sirius.MegalServices;

public class SetLableFunctionApplication implements IExternalJavaAction {

	public SetLableFunctionApplication() {

	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		String lable = (String) arg1.get("lable");
		MegalFunctionApplication functionApplication = (MegalFunctionApplication) arg0.iterator().next();

		MegalFile megamodel = MegalServices.INSTANCE.megalFile(functionApplication);

		MegalEntity resolved = MegalServices.INSTANCE.resolveEntity(megamodel, lable);

		if (resolved == null)
			return;

		functionApplication.setFunction(resolved);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
