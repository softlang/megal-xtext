package org.softlang.megal.semantics;

import com.google.common.base.Optional;
import org.softlang.megal.megaL.ED;
import org.softlang.megal.megaL.LD;
import org.softlang.megal.semantics.Diagnostic;

@SuppressWarnings("all")
public interface EntitySemantics {
  public abstract void validate(final Diagnostic diagnostic, final ED entity, final Optional<LD> linking);
}
