package org.softlang.megal.calculation;

import com.google.common.collect.Iterables;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.softlang.megal.megaL.ED;
import org.softlang.megal.megaL.EDGroup;
import org.softlang.megal.megaL.ETD;
import org.softlang.megal.megaL.Import;
import org.softlang.megal.megaL.MegaLDefinition;
import org.softlang.megal.megaL.RD;
import org.softlang.megal.megaL.RTD;

@SuppressWarnings("all")
public class Calculation {
  /**
   * Searches the definition and their respective imports
   * @param d The definition for which to search
   * @return Returns a set of the search definition and their imports
   */
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
  
  /**
   * Searches the definition and their respective imports
   * @param d The definition for which to search
   * @return Returns a set of the search definitions imports
   */
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
  
  public static Set<ETD> effectiveETDs(final MegaLDefinition d) {
    Set<MegaLDefinition> _allDefinitions = Calculation.allDefinitions(d);
    final Function1<MegaLDefinition, EList<ETD>> _function = new Function1<MegaLDefinition, EList<ETD>>() {
      public EList<ETD> apply(final MegaLDefinition it) {
        return it.getEtds();
      }
    };
    Iterable<EList<ETD>> _map = IterableExtensions.<MegaLDefinition, EList<ETD>>map(_allDefinitions, _function);
    Iterable<ETD> _flatten = Iterables.<ETD>concat(_map);
    return IterableExtensions.<ETD>toSet(_flatten);
  }
  
  public static Set<RTD> effectiveRTDs(final MegaLDefinition d) {
    Set<MegaLDefinition> _allDefinitions = Calculation.allDefinitions(d);
    final Function1<MegaLDefinition, EList<RTD>> _function = new Function1<MegaLDefinition, EList<RTD>>() {
      public EList<RTD> apply(final MegaLDefinition it) {
        return it.getRtds();
      }
    };
    Iterable<EList<RTD>> _map = IterableExtensions.<MegaLDefinition, EList<RTD>>map(_allDefinitions, _function);
    Iterable<RTD> _flatten = Iterables.<RTD>concat(_map);
    return IterableExtensions.<RTD>toSet(_flatten);
  }
  
  public static Set<ED> effectiveEDs(final MegaLDefinition d) {
    Set<MegaLDefinition> _allDefinitions = Calculation.allDefinitions(d);
    final Function1<MegaLDefinition, Iterable<ED>> _function = new Function1<MegaLDefinition, Iterable<ED>>() {
      public Iterable<ED> apply(final MegaLDefinition it) {
        EList<EDGroup> _eds = it.getEds();
        final Function1<EDGroup, EList<ED>> _function = new Function1<EDGroup, EList<ED>>() {
          public EList<ED> apply(final EDGroup it) {
            return it.getItems();
          }
        };
        List<EList<ED>> _map = ListExtensions.<EDGroup, EList<ED>>map(_eds, _function);
        return Iterables.<ED>concat(_map);
      }
    };
    Iterable<Iterable<ED>> _map = IterableExtensions.<MegaLDefinition, Iterable<ED>>map(_allDefinitions, _function);
    Iterable<ED> _flatten = Iterables.<ED>concat(_map);
    return IterableExtensions.<ED>toSet(_flatten);
  }
  
  public static Set<RD> effectiveRDs(final MegaLDefinition d) {
    Set<MegaLDefinition> _allDefinitions = Calculation.allDefinitions(d);
    final Function1<MegaLDefinition, EList<RD>> _function = new Function1<MegaLDefinition, EList<RD>>() {
      public EList<RD> apply(final MegaLDefinition it) {
        return it.getRds();
      }
    };
    Iterable<EList<RD>> _map = IterableExtensions.<MegaLDefinition, EList<RD>>map(_allDefinitions, _function);
    Iterable<RD> _flatten = Iterables.<RD>concat(_map);
    return IterableExtensions.<RD>toSet(_flatten);
  }
}
