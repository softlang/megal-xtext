package org.softlang.megal.calculation;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.softlang.megal.megaL.Import;
import org.softlang.megal.megaL.MegaLDefinition;

@SuppressWarnings("all")
public class Calculation {
  public static Set<MegaLDefinition> allDefinitions(final MegaLDefinition d) {
    HashSet<MegaLDefinition> _newHashSet = CollectionLiterals.<MegaLDefinition>newHashSet();
    return Calculation.allDefinitions(d, _newHashSet);
  }
  
  public static Set<MegaLDefinition> allDefinitions(final MegaLDefinition d, final Set<MegaLDefinition> is) {
    boolean _add = is.add(d);
    if (_add) {
      EList<Import> _imports = d.getImports();
      for (final Import i : _imports) {
        MegaLDefinition _ref = i.getRef();
        Calculation.allDefinitions(_ref, is);
      }
    }
    return is;
  }
  
  public static Set<MegaLDefinition> importedDefinitions(final MegaLDefinition d) {
    HashSet<MegaLDefinition> _newHashSet = CollectionLiterals.<MegaLDefinition>newHashSet();
    return Calculation.importedDefinitions(d, _newHashSet);
  }
  
  public static Set<MegaLDefinition> importedDefinitions(final MegaLDefinition d, final Set<MegaLDefinition> is) {
    EList<Import> _imports = d.getImports();
    for (final Import i : _imports) {
      MegaLDefinition _ref = i.getRef();
      Calculation.allDefinitions(_ref, is);
    }
    return is;
  }
}
