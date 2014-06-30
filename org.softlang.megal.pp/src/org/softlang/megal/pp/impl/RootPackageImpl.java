/**
 */
package org.softlang.megal.pp.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.softlang.megal.pp.Node;
import org.softlang.megal.pp.PPPackage;
import org.softlang.megal.pp.RootPackage;
import org.softlang.megal.pp.Package;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Root Package</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.pp.impl.RootPackageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.softlang.megal.pp.impl.RootPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.pp.impl.RootPackageImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.softlang.megal.pp.impl.RootPackageImpl#getNoClassDefs <em>No Class Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootPackageImpl extends NodeImpl implements RootPackage {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final URI SOURCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected URI source = SOURCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @generated
	 */
	public URI getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(URI newSource) {
		URI oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PPPackage.ROOT_PACKAGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PPPackage.ROOT_PACKAGE__NAME, oldName, name));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PPPackage.ROOT_PACKAGE__SOURCE:
				return getSource();
			case PPPackage.ROOT_PACKAGE__NAME:
				return getName();
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
			case PPPackage.ROOT_PACKAGE__SOURCE:
				setSource((URI)newValue);
				return;
			case PPPackage.ROOT_PACKAGE__NAME:
				setName((String)newValue);
				return;
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
			case PPPackage.ROOT_PACKAGE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case PPPackage.ROOT_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
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
			case PPPackage.ROOT_PACKAGE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case PPPackage.ROOT_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (source: ");
		result.append(source);
		result.append(", name: ");
		result.append(name);
		result.append(", noClassDefs: ");
		result.append(noClassDefs);
		result.append(')');
		return result.toString();
	}

} // RootPackageImpl
