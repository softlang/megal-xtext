package org.softlang.megal.calculation;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.softlang.megal.megaL.ED;
import org.softlang.megal.megaL.ETD;
import org.softlang.megal.megaL.Import;
import org.softlang.megal.megaL.MegaLDefinition;
import org.softlang.megal.megaL.RD;
import org.softlang.megal.megaL.RTD;
import org.softlang.megal.megaL.UseETD;
import org.softlang.megal.megaL.UseETDRef;
import org.softlang.megal.megaL.UseEntity;
import org.softlang.megal.operators.Operators;

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
    final Function1<MegaLDefinition, EList<ED>> _function = new Function1<MegaLDefinition, EList<ED>>() {
      public EList<ED> apply(final MegaLDefinition it) {
        return it.getEds();
      }
    };
    Iterable<EList<ED>> _map = IterableExtensions.<MegaLDefinition, EList<ED>>map(_allDefinitions, _function);
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
  
  /**
   * Something may not be a supertype of an entity
   */
  protected static boolean _isSupertypeOf(final UseETD a, final UseEntity b) {
    return false;
  }
  
  /**
   * Entity is always the supertype of something
   */
  protected static boolean _isSupertypeOf(final UseEntity a, final UseETDRef b) {
    return true;
  }
  
  /**
   * A reference a is the supertype of the reference b if the direct
   * supertype of b is a or a is the supertype of the direct supertype of b
   */
  protected static boolean _isSupertypeOf(final UseETDRef a, final UseETDRef b) {
    boolean _or = false;
    ETD _ref = b.getRef();
    UseETD _supertype = _ref.getSupertype();
    boolean _spaceship = Operators.operator_spaceship(_supertype, a);
    if (_spaceship) {
      _or = true;
    } else {
      ETD _ref_1 = b.getRef();
      UseETD _supertype_1 = _ref_1.getSupertype();
      boolean _isSupertypeOf = Calculation.isSupertypeOf(a, _supertype_1);
      _or = _isSupertypeOf;
    }
    return _or;
  }
  
  protected static String _getName(final UseETD a) {
    throw new UnsupportedOperationException();
  }
  
  protected static String _getName(final UseEntity a) {
    return "Entity";
  }
  
  protected static String _getName(final UseETDRef a) {
    ETD _ref = a.getRef();
    return _ref.getName();
  }
  
  public static ArrayList<UseETD> getHierarchy(final UseETD e) {
    final ArrayList<UseETD> h = CollectionLiterals.<UseETD>newArrayList();
    UseETD x = e;
    boolean _notEquals = (!Objects.equal(x, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        h.add(x);
        if ((x instanceof UseETDRef)) {
          ETD _ref = ((UseETDRef)x).getRef();
          UseETD _supertype = _ref.getSupertype();
          x = _supertype;
        } else {
          x = null;
        }
      }
      boolean _notEquals_1 = (!Objects.equal(x, null));
      _while = _notEquals_1;
    }
    return h;
  }
  
  public static List<RTD> getApplicableRTDs(final RD it) {
    EObject _eContainer = it.eContainer();
    final MegaLDefinition m = ((MegaLDefinition) _eContainer);
    Set<RTD> _effectiveRTDs = Calculation.effectiveRTDs(m);
    final Function1<RTD, Boolean> _function = new Function1<RTD, Boolean>() {
      public Boolean apply(final RTD r) {
        String _name = r.getName();
        RTD _rel = it.getRel();
        String _name_1 = _rel.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    final Iterable<RTD> r = IterableExtensions.<RTD>filter(_effectiveRTDs, _function);
    ED _source = it.getSource();
    UseETD _type = _source.getType();
    final ArrayList<UseETD> hl = Calculation.getHierarchy(_type);
    ED _target = it.getTarget();
    UseETD _type_1 = _target.getType();
    final ArrayList<UseETD> hr = Calculation.getHierarchy(_type_1);
    Set<UseETD> _set = IterableExtensions.<UseETD>toSet(hl);
    Set<UseETD> _set_1 = IterableExtensions.<UseETD>toSet(hr);
    Set<List<UseETD>> carp = Sets.<UseETD>cartesianProduct(_set, _set_1);
    final Function1<List<UseETD>, Iterable<RTD>> _function_1 = new Function1<List<UseETD>, Iterable<RTD>>() {
      public Iterable<RTD> apply(final List<UseETD> p) {
        UseETD _head = IterableExtensions.<UseETD>head(p);
        final UseETD letd = ((UseETD) _head);
        UseETD _last = IterableExtensions.<UseETD>last(p);
        final UseETD retd = ((UseETD) _last);
        final Function1<RTD, Boolean> _function = new Function1<RTD, Boolean>() {
          public Boolean apply(final RTD it) {
            boolean _and = false;
            UseETD _domain = it.getDomain();
            boolean _spaceship = Operators.operator_spaceship(_domain, letd);
            if (!_spaceship) {
              _and = false;
            } else {
              UseETD _coDomain = it.getCoDomain();
              boolean _spaceship_1 = Operators.operator_spaceship(_coDomain, retd);
              _and = _spaceship_1;
            }
            return Boolean.valueOf(_and);
          }
        };
        return IterableExtensions.<RTD>filter(r, _function);
      }
    };
    Iterable<Iterable<RTD>> _map = IterableExtensions.<List<UseETD>, Iterable<RTD>>map(carp, _function_1);
    Iterable<RTD> _flatten = Iterables.<RTD>concat(_map);
    List<RTD> _list = IterableExtensions.<RTD>toList(_flatten);
    final Comparator<RTD> _function_2 = new Comparator<RTD>() {
      public int compare(final RTD a, final RTD b) {
        UseETD _domain = a.getDomain();
        UseETD _domain_1 = b.getDomain();
        final boolean ds = Calculation.isSupertypeOf(_domain, _domain_1);
        UseETD _coDomain = a.getCoDomain();
        UseETD _coDomain_1 = b.getCoDomain();
        final boolean cs = Calculation.isSupertypeOf(_coDomain, _coDomain_1);
        boolean _and = false;
        if (!ds) {
          _and = false;
        } else {
          _and = cs;
        }
        if (_and) {
          return 1;
        }
        if (((!ds) && (!cs))) {
          return (-1);
        }
        return 0;
      }
    };
    return IterableExtensions.<RTD>sort(_list, _function_2);
  }
  
  public static Optional<RTD> getAppliedRTD(final RD it) {
    List<RTD> _applicableRTDs = Calculation.getApplicableRTDs(it);
    RTD _head = IterableExtensions.<RTD>head(_applicableRTDs);
    return Optional.<RTD>fromNullable(_head);
  }
  
  public static boolean isSupertypeOf(final UseETD a, final UseETD b) {
    if (a instanceof UseETDRef
         && b instanceof UseETDRef) {
      return _isSupertypeOf((UseETDRef)a, (UseETDRef)b);
    } else if (a instanceof UseEntity
         && b instanceof UseETDRef) {
      return _isSupertypeOf((UseEntity)a, (UseETDRef)b);
    } else if (a != null
         && b instanceof UseEntity) {
      return _isSupertypeOf(a, (UseEntity)b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a, b).toString());
    }
  }
  
  public static String getName(final UseETD a) {
    if (a instanceof UseETDRef) {
      return _getName((UseETDRef)a);
    } else if (a instanceof UseEntity) {
      return _getName((UseEntity)a);
    } else if (a != null) {
      return _getName(a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
}
