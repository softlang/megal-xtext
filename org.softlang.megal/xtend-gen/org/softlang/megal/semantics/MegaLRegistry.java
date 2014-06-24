package org.softlang.megal.semantics;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IRegistryEventListener;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.softlang.megal.semantics.EntitySemantics;
import org.softlang.megal.semantics.RelationSemantics;

@SuppressWarnings("all")
public class MegaLRegistry {
  private static class Listener implements IRegistryEventListener {
    private final MegaLRegistry registry;
    
    public Listener(final MegaLRegistry registry) {
      this.registry = registry;
    }
    
    public void added(final IExtension[] extensions) {
      final Procedure1<IExtension> _function = new Procedure1<IExtension>() {
        public void apply(final IExtension e) {
          Listener.this.registry.addExtension(e);
        }
      };
      IterableExtensions.<IExtension>forEach(((Iterable<IExtension>)Conversions.doWrapArray(extensions)), _function);
    }
    
    public void added(final IExtensionPoint[] extensionPoints) {
    }
    
    public void removed(final IExtension[] extensions) {
      final Procedure1<IExtension> _function = new Procedure1<IExtension>() {
        public void apply(final IExtension e) {
          Listener.this.registry.removeExtension(e);
        }
      };
      IterableExtensions.<IExtension>forEach(((Iterable<IExtension>)Conversions.doWrapArray(extensions)), _function);
    }
    
    public void removed(final IExtensionPoint[] extensionPoints) {
    }
  }
  
  private final static String NAME = "name";
  
  private final static String SEMANTICS = "semantics";
  
  private final static String ENTITYTYPE = "org.softlang.entitytype";
  
  private final static String RELATIONTYPE = "org.softlang.relationtype";
  
  private static MegaLRegistry instance;
  
  public static MegaLRegistry getInstance() {
    boolean _equals = Objects.equal(MegaLRegistry.instance, null);
    if (_equals) {
      MegaLRegistry _megaLRegistry = new MegaLRegistry();
      MegaLRegistry.instance = _megaLRegistry;
    }
    return MegaLRegistry.instance;
  }
  
  private final HashMap<String, Optional<RelationSemantics>> relationtypes = CollectionLiterals.<String, Optional<RelationSemantics>>newHashMap();
  
  public Map<String, Optional<RelationSemantics>> getRelationtypes() {
    return Collections.<String, Optional<RelationSemantics>>unmodifiableMap(this.relationtypes);
  }
  
  public Map<String, RelationSemantics> getSoftRelationtypes() {
    Map<String, Optional<RelationSemantics>> _relationtypes = this.getRelationtypes();
    final Function2<String, Optional<RelationSemantics>, Boolean> _function = new Function2<String, Optional<RelationSemantics>, Boolean>() {
      public Boolean apply(final String k, final Optional<RelationSemantics> v) {
        boolean _isPresent = v.isPresent();
        return Boolean.valueOf((!_isPresent));
      }
    };
    Map<String, Optional<RelationSemantics>> _filter = MapExtensions.<String, Optional<RelationSemantics>>filter(_relationtypes, _function);
    final Function1<Optional<RelationSemantics>, RelationSemantics> _function_1 = new Function1<Optional<RelationSemantics>, RelationSemantics>() {
      public RelationSemantics apply(final Optional<RelationSemantics> it) {
        return it.get();
      }
    };
    return MapExtensions.<String, Optional<RelationSemantics>, RelationSemantics>mapValues(_filter, _function_1);
  }
  
  public Map<String, RelationSemantics> getHardRelationtypes() {
    Map<String, Optional<RelationSemantics>> _relationtypes = this.getRelationtypes();
    final Function2<String, Optional<RelationSemantics>, Boolean> _function = new Function2<String, Optional<RelationSemantics>, Boolean>() {
      public Boolean apply(final String k, final Optional<RelationSemantics> v) {
        return Boolean.valueOf(v.isPresent());
      }
    };
    Map<String, Optional<RelationSemantics>> _filter = MapExtensions.<String, Optional<RelationSemantics>>filter(_relationtypes, _function);
    final Function1<Optional<RelationSemantics>, RelationSemantics> _function_1 = new Function1<Optional<RelationSemantics>, RelationSemantics>() {
      public RelationSemantics apply(final Optional<RelationSemantics> it) {
        return it.get();
      }
    };
    return MapExtensions.<String, Optional<RelationSemantics>, RelationSemantics>mapValues(_filter, _function_1);
  }
  
  private final HashMap<String, Optional<EntitySemantics>> entitytypes = CollectionLiterals.<String, Optional<EntitySemantics>>newHashMap();
  
  public Map<String, Optional<EntitySemantics>> getEntitytypes() {
    return Collections.<String, Optional<EntitySemantics>>unmodifiableMap(this.entitytypes);
  }
  
  public Map<String, EntitySemantics> getSoftEntitytypes() {
    Map<String, Optional<EntitySemantics>> _entitytypes = this.getEntitytypes();
    final Function2<String, Optional<EntitySemantics>, Boolean> _function = new Function2<String, Optional<EntitySemantics>, Boolean>() {
      public Boolean apply(final String k, final Optional<EntitySemantics> v) {
        boolean _isPresent = v.isPresent();
        return Boolean.valueOf((!_isPresent));
      }
    };
    Map<String, Optional<EntitySemantics>> _filter = MapExtensions.<String, Optional<EntitySemantics>>filter(_entitytypes, _function);
    final Function1<Optional<EntitySemantics>, EntitySemantics> _function_1 = new Function1<Optional<EntitySemantics>, EntitySemantics>() {
      public EntitySemantics apply(final Optional<EntitySemantics> it) {
        return it.get();
      }
    };
    return MapExtensions.<String, Optional<EntitySemantics>, EntitySemantics>mapValues(_filter, _function_1);
  }
  
  public Map<String, EntitySemantics> getHardEntitytypes() {
    Map<String, Optional<EntitySemantics>> _entitytypes = this.getEntitytypes();
    final Function2<String, Optional<EntitySemantics>, Boolean> _function = new Function2<String, Optional<EntitySemantics>, Boolean>() {
      public Boolean apply(final String k, final Optional<EntitySemantics> v) {
        return Boolean.valueOf(v.isPresent());
      }
    };
    Map<String, Optional<EntitySemantics>> _filter = MapExtensions.<String, Optional<EntitySemantics>>filter(_entitytypes, _function);
    final Function1<Optional<EntitySemantics>, EntitySemantics> _function_1 = new Function1<Optional<EntitySemantics>, EntitySemantics>() {
      public EntitySemantics apply(final Optional<EntitySemantics> it) {
        return it.get();
      }
    };
    return MapExtensions.<String, Optional<EntitySemantics>, EntitySemantics>mapValues(_filter, _function_1);
  }
  
  private MegaLRegistry() {
    IExtensionRegistry _registry = RegistryFactory.getRegistry();
    IExtensionPoint _extensionPoint = _registry.getExtensionPoint(MegaLRegistry.RELATIONTYPE);
    IExtension[] _extensions = _extensionPoint.getExtensions();
    final Procedure1<IExtension> _function = new Procedure1<IExtension>() {
      public void apply(final IExtension it) {
        MegaLRegistry.this.addExtension(it);
      }
    };
    IterableExtensions.<IExtension>forEach(((Iterable<IExtension>)Conversions.doWrapArray(_extensions)), _function);
    IExtensionRegistry _registry_1 = RegistryFactory.getRegistry();
    IExtensionPoint _extensionPoint_1 = _registry_1.getExtensionPoint(MegaLRegistry.ENTITYTYPE);
    IExtension[] _extensions_1 = _extensionPoint_1.getExtensions();
    final Procedure1<IExtension> _function_1 = new Procedure1<IExtension>() {
      public void apply(final IExtension it) {
        MegaLRegistry.this.addExtension(it);
      }
    };
    IterableExtensions.<IExtension>forEach(((Iterable<IExtension>)Conversions.doWrapArray(_extensions_1)), _function_1);
    final MegaLRegistry.Listener listener = new MegaLRegistry.Listener(this);
    IExtensionRegistry _registry_2 = RegistryFactory.getRegistry();
    _registry_2.addListener(listener, MegaLRegistry.RELATIONTYPE);
    IExtensionRegistry _registry_3 = RegistryFactory.getRegistry();
    _registry_3.addListener(listener, MegaLRegistry.ENTITYTYPE);
  }
  
  private long revision = 0L;
  
  public long getRevision() {
    return this.revision;
  }
  
  private long addExtension(final IExtension e) {
    long _xblockexpression = (long) 0;
    {
      String _extensionPointUniqueIdentifier = e.getExtensionPointUniqueIdentifier();
      boolean _equals = Objects.equal(_extensionPointUniqueIdentifier, MegaLRegistry.RELATIONTYPE);
      if (_equals) {
        this.addRelationtype(e);
      }
      long _xifexpression = (long) 0;
      String _extensionPointUniqueIdentifier_1 = e.getExtensionPointUniqueIdentifier();
      boolean _equals_1 = Objects.equal(_extensionPointUniqueIdentifier_1, MegaLRegistry.ENTITYTYPE);
      if (_equals_1) {
        _xifexpression = this.addEntitytype(e);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private long addRelationtype(final IExtension e) {
    try {
      long _xblockexpression = (long) 0;
      {
        IConfigurationElement[] _configurationElements = e.getConfigurationElements();
        for (final IConfigurationElement c : _configurationElements) {
          String _attribute = c.getAttribute(MegaLRegistry.SEMANTICS);
          boolean _equals = Objects.equal(_attribute, null);
          if (_equals) {
            String _attribute_1 = c.getAttribute(MegaLRegistry.NAME);
            Optional<RelationSemantics> _absent = Optional.<RelationSemantics>absent();
            this.relationtypes.put(_attribute_1, _absent);
          } else {
            String _attribute_2 = c.getAttribute(MegaLRegistry.NAME);
            Object _createExecutableExtension = c.createExecutableExtension(MegaLRegistry.SEMANTICS);
            Optional<RelationSemantics> _of = Optional.<RelationSemantics>of(((RelationSemantics) _createExecutableExtension));
            this.relationtypes.put(_attribute_2, _of);
          }
        }
        _xblockexpression = this.revision = (this.revision + 1);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private long addEntitytype(final IExtension e) {
    try {
      long _xblockexpression = (long) 0;
      {
        IConfigurationElement[] _configurationElements = e.getConfigurationElements();
        for (final IConfigurationElement c : _configurationElements) {
          String _attribute = c.getAttribute(MegaLRegistry.SEMANTICS);
          boolean _equals = Objects.equal(_attribute, null);
          if (_equals) {
            String _attribute_1 = c.getAttribute(MegaLRegistry.NAME);
            Optional<EntitySemantics> _absent = Optional.<EntitySemantics>absent();
            this.entitytypes.put(_attribute_1, _absent);
          } else {
            String _attribute_2 = c.getAttribute(MegaLRegistry.NAME);
            Object _createExecutableExtension = c.createExecutableExtension(MegaLRegistry.SEMANTICS);
            Optional<EntitySemantics> _of = Optional.<EntitySemantics>of(((EntitySemantics) _createExecutableExtension));
            this.entitytypes.put(_attribute_2, _of);
          }
        }
        _xblockexpression = this.revision = (this.revision + 1);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private long removeExtension(final IExtension e) {
    long _xblockexpression = (long) 0;
    {
      String _extensionPointUniqueIdentifier = e.getExtensionPointUniqueIdentifier();
      boolean _equals = Objects.equal(_extensionPointUniqueIdentifier, MegaLRegistry.RELATIONTYPE);
      if (_equals) {
        this.removeRelationtype(e);
      }
      long _xifexpression = (long) 0;
      String _extensionPointUniqueIdentifier_1 = e.getExtensionPointUniqueIdentifier();
      boolean _equals_1 = Objects.equal(_extensionPointUniqueIdentifier_1, MegaLRegistry.ENTITYTYPE);
      if (_equals_1) {
        _xifexpression = this.removeEntitytype(e);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private long removeRelationtype(final IExtension e) {
    long _xblockexpression = (long) 0;
    {
      IConfigurationElement[] _configurationElements = e.getConfigurationElements();
      for (final IConfigurationElement c : _configurationElements) {
        String _attribute = c.getAttribute(MegaLRegistry.NAME);
        this.relationtypes.remove(_attribute);
      }
      _xblockexpression = this.revision = (this.revision + 1);
    }
    return _xblockexpression;
  }
  
  private long removeEntitytype(final IExtension e) {
    long _xblockexpression = (long) 0;
    {
      IConfigurationElement[] _configurationElements = e.getConfigurationElements();
      for (final IConfigurationElement c : _configurationElements) {
        String _attribute = c.getAttribute(MegaLRegistry.NAME);
        this.entitytypes.remove(_attribute);
      }
      _xblockexpression = this.revision = (this.revision + 1);
    }
    return _xblockexpression;
  }
}
