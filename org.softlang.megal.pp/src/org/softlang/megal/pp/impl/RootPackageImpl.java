/**
 */
package org.softlang.megal.pp.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.softlang.megal.pp.Classifier;
import org.softlang.megal.pp.Node;
import org.softlang.megal.pp.PPPackage;
import org.softlang.megal.pp.RootPackage;
import org.softlang.megal.pp.Package;
import org.softlang.megal.pp.general.UnresolvableClassifierException;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Root Package</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.pp.impl.RootPackageImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.softlang.megal.pp.impl.RootPackageImpl#getNoClassDefs <em>No Class Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootPackageImpl extends NodeImpl implements RootPackage {
	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoClassDefs() <em>No Class Defs</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNoClassDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> noClassDefs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RootPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PPPackage.Literals.ROOT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getBase() {
		StringBuilder b = new StringBuilder();

		Node n = this;

		boolean separate = false;
		while (n.getChildren().size() == 1
				&& n.getChildren().get(0) instanceof Package) {
			n = n.getChildren().get(0);

			if (separate)
				b.append('.');

			b.append(((Package) n).getName());

			separate = true;
		}
		return b.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNoClassDefs() {
		if (noClassDefs == null) {
			noClassDefs = new EDataTypeUniqueEList<String>(String.class, this, PPPackage.ROOT_PACKAGE__NO_CLASS_DEFS);
		}
		return noClassDefs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Classifier resolveClassifier(String typeName) {
		String[] ps = typeName.split("\\.|\\$");

		Node n = this;

		// TODO: FUCKT because:!!! package vs. nested navigation may make shit
		for (final String p : ps) {
			Optional<Node> nc = Iterables.tryFind(n.getChildren(),
					new Predicate<Node>() {

						@Override
						public boolean apply(Node input) {
							return Objects.equals(p, input.getName());
						}
					});

			if (nc.isPresent())
				n = nc.get();
			else
				throw new UnresolvableClassifierException(p
						+ " does not exist in " + n);
		}

		// No type checking!?
		return (Classifier) n;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PPPackage.ROOT_PACKAGE__BASE:
				return getBase();
			case PPPackage.ROOT_PACKAGE__NO_CLASS_DEFS:
				return getNoClassDefs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PPPackage.ROOT_PACKAGE__NO_CLASS_DEFS:
				getNoClassDefs().clear();
				getNoClassDefs().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PPPackage.ROOT_PACKAGE__NO_CLASS_DEFS:
				getNoClassDefs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PPPackage.ROOT_PACKAGE__BASE:
				return BASE_EDEFAULT == null ? getBase() != null : !BASE_EDEFAULT.equals(getBase());
			case PPPackage.ROOT_PACKAGE__NO_CLASS_DEFS:
				return noClassDefs != null && !noClassDefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case PPPackage.ROOT_PACKAGE___RESOLVE_CLASSIFIER__STRING:
				return resolveClassifier((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (noClassDefs: ");
		result.append(noClassDefs);
		result.append(')');
		return result.toString();
	}

} // RootPackageImpl
