package org.softlang.megal.api;

import java.util.List;
import java.util.ListIterator;

import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.Link;
import org.softlang.megal.MegalFactory;
import org.softlang.megal.Megamodel;

import com.google.common.collect.Lists;

/**
 * <p>
 * Refactoring functionality based on element injection from {@link ModelAPI},
 * {@link #process(Declaration, MegalFactory, List, List)} and
 * {@link #process(Link, MegalFactory, List, List)} may refactor links and
 * declarations optionally removing them.
 * </p>
 * 
 * <p>
 * The refactoring will be applied until no modifications are made or loop limit
 * of {@value #LOOP_DETECTION} is exceeded.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class RefactoringAPI extends ModelAPI {
	private static final String ORIGIN_KEY = "Origin";

	/**
	 * <p>
	 * Assume no more than {@value #LOOP_DETECTION} iterations
	 * </p>
	 */
	public static final int LOOP_DETECTION = 10000;

	/**
	 * <p>
	 * The origin key used for all created items
	 * </p>
	 */
	private final String originKey;

	/**
	 * <p>
	 * Constructs the refactoring API
	 * </p>
	 * 
	 * @param originKey
	 *            The origin key
	 */
	public RefactoringAPI(String originKey) {
		this.originKey = originKey;
	}

	/**
	 * <p>
	 * Processes a link, may create new links and new declarations by adding to
	 * <code>newLinks</code> and <code>newDecls</code>.
	 * </p>
	 * 
	 * <p>
	 * If true is returned, the input element is kept in the model.
	 * </p>
	 * 
	 * @param x
	 *            The link to process
	 * @param f
	 *            The factory used to create new elements, detected from the
	 *            input
	 * @param newLinks
	 *            The list of new links
	 * @param newDecls
	 *            The list of new declarations
	 * @return Returns <code>true</code> if link is kept after processing
	 */
	protected boolean process(Link x, MegalFactory f, List<Link> newLinks,
			List<Declaration> newDecls) {
		return true;
	}

	/**
	 * <p>
	 * Processes a declaration, may create new links and new declarations by
	 * adding to <code>newLinks</code> and <code>newDecls</code>.
	 * </p>
	 * 
	 * <p>
	 * If true is returned, the input element is kept in the model.
	 * </p>
	 * 
	 * @param x
	 *            The declaration to process
	 * @param f
	 *            The factory used to create new elements, detected from the
	 *            input
	 * @param newLinks
	 *            The list of new links
	 * @param newDecls
	 *            The list of new declarations
	 * @return Returns <code>true</code> if link is kept after processing
	 */
	protected boolean process(Declaration x, MegalFactory f,
			List<Link> newLinks, List<Declaration> newDecls) {
		return true;
	}

	@Override
	public void apply(Megamodel megamodel) {
		super.apply(megamodel);

		// Create modification tracker and user targets
		boolean mod;
		List<Link> newLinks = Lists.newArrayList();
		List<Declaration> newDeclarations = Lists.newArrayList();

		// Get Megal factory
		MegalFactory factory = (MegalFactory) megamodel.eClass().getEPackage()
				.getEFactoryInstance();

		int loopNum = 0;
		do {
			// Reset modification tracker
			mod = false;
			// List-iterate the bindings
			for (ListIterator<Link> it = megamodel.getBindings().listIterator(); it
					.hasNext();) {
				// Get current
				Link current = it.next();

				// Reset user targets
				newLinks.clear();
				newDeclarations.clear();

				// Process the binding and remove it if desired
				if (!process(current, factory, newLinks, newDeclarations)) {
					it.remove();
					mod = true;
				}

				// Add all new bindings
				for (Link newLink : newLinks) {
					newLink.getInfo().add(
							createOriginAnnotation(factory));
					it.add(newLink);
					mod = true;
				}

				// Add all new declarations
				for (Declaration newDeclaration : newDeclarations) {
					newDeclaration.getInfo().add(
							createOriginAnnotation(factory));
					megamodel.getDeclarations().add(newDeclaration);
					mod = true;
				}
			}

			// List-iterate the declarations
			for (ListIterator<Declaration> it = megamodel.getDeclarations()
					.listIterator(); it.hasNext();) {
				// Get current
				Declaration current = it.next();

				// Reset user targets
				newLinks.clear();
				newDeclarations.clear();

				// Process the declaration and remove it if desired
				if (!process(current, factory, newLinks, newDeclarations)) {
					it.remove();
					mod = true;
				}

				// Add all new declarations
				for (Declaration newDeclaration : newDeclarations) {
					newDeclaration.getInfo().add(
							createOriginAnnotation(factory));
					it.add(newDeclaration);
					mod = true;
				}

				// Add all new bindings
				for (Link newLink : newLinks) {
					newLink.getInfo().add(
							createOriginAnnotation(factory));
					megamodel.getBindings().add(newLink);
					mod = true;
				}
			}

			// Do not infinitely repeat
			if (loopNum++ > LOOP_DETECTION)
				throw new IllegalStateException(
						"Excessing the maximum limit of " + LOOP_DETECTION
								+ " loops");
		} while (mod);
	}

	private Annotation createOriginAnnotation(MegalFactory factory) {
		Annotation annotation = factory.createAnnotation();
		annotation.setKey(ORIGIN_KEY);
		annotation.setValue(originKey);
		return annotation;
	}
}
