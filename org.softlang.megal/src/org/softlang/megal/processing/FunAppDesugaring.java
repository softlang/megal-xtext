package org.softlang.megal.processing;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.softlang.megal.Declaration;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.FunctionApplication;
import org.softlang.megal.Link;
import org.softlang.megal.MegalFactory;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.api.In;
import org.softlang.megal.api.Left;
import org.softlang.megal.api.RefactoringAPI;
import org.softlang.megal.api.Right;
import org.softlang.megal.api.Slot;

public class FunAppDesugaring extends RefactoringAPI {
	public FunAppDesugaring() {
		super("FunAppDesugaring");
	}

	/**
	 * <p>
	 * ModelAPI injected function application
	 * </p>
	 */
	@In("Prelude")
	protected EntityType functionApplication;

	/**
	 * <p>
	 * ModelAPI injected element of
	 * </p>
	 */
	@In("Prelude")
	@Left("FunctionApplication")
	@Right("Function")
	protected RelationshipType elementOf;

	/**
	 * <p>
	 * ModelAPI injected input of
	 * </p>
	 */
	@In("Prelude")
	@Left("Artifact")
	@Right("FunctionApplication")
	protected RelationshipType inputOf;

	/**
	 * <p>
	 * ModelAPI injected output of
	 * </p>
	 */
	@In("Prelude")
	@Left("Artifact")
	@Right("FunctionApplication")
	protected RelationshipType outputOf;

	/**
	 * Count function applications
	 */
	private long n;

	@Override
	protected boolean process(Declaration x, MegalFactory f,
			List<Link> newLinks, List<Declaration> newDecls) {
		if (x instanceof FunctionApplication) {
			FunctionApplication decl = (FunctionApplication) x;

			// Corresponds to 1
			Entity app = f.createEntity();
			app.getInfo().addAll(EcoreUtil.copyAll(decl.getInfo()));
			app.setName(decl.getFunction().getName() + ".App" + (n++));

			EntityTypeReference appType = f.createEntityTypeReference();
			appType.setDefinition(functionApplication);
			appType.setMany(false);

			app.setType(appType);

			newDecls.add(app);

			// Corresponds to 2
			Relationship appElementOfFunction = f.createRelationship();
			appElementOfFunction.setLeft(app);
			appElementOfFunction.setType(elementOf);
			appElementOfFunction.setRight(decl.getFunction());

			newDecls.add(appElementOfFunction);

			// Corresponds to 3
			Relationship inputInputOfApp = f.createRelationship();
			inputInputOfApp.setLeft(decl.getInput());
			inputInputOfApp.setType(inputOf);
			inputInputOfApp.setRight(app);

			newDecls.add(inputInputOfApp);

			// Corresponds to 4
			Relationship outputOutputOfApp = f.createRelationship();
			outputOutputOfApp.setLeft(decl.getOutput());
			outputOutputOfApp.setType(outputOf);
			outputOutputOfApp.setRight(app);

			newDecls.add(outputOutputOfApp);

			// Do not keep
			return false;
		} else {
			return true;
		}
	}

	@Override
	protected void handleUnassignedSlot(List<String> openSetters) {
		// Do not abort here
	}
}
