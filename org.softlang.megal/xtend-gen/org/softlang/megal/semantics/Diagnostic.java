package org.softlang.megal.semantics;

@SuppressWarnings("all")
public interface Diagnostic {
  public abstract void info(final String string);
  
  public abstract void warning(final String string);
  
  public abstract void error(final String string);
}
