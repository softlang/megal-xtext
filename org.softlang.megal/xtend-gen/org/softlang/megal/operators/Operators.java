package org.softlang.megal.operators;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

@SuppressWarnings("all")
public class Operators {
  public static boolean operator_spaceship(final EObject a, final EObject b) {
    return EcoreUtil.equals(a, b);
  }
  
  public static boolean operator_diamond(final EObject a, final EObject b) {
    boolean _equals = EcoreUtil.equals(a, b);
    return (!_equals);
  }
}
