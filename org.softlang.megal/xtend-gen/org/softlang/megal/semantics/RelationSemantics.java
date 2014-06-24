package org.softlang.megal.semantics;

import com.google.common.base.Optional;
import org.softlang.megal.megaL.LD;
import org.softlang.megal.megaL.RD;
import org.softlang.megal.semantics.Diagnostic;

@SuppressWarnings("all")
public interface RelationSemantics {
  public abstract void validate(final Diagnostic diagnostic, final RD relation, final Optional<LD> sourceLinking, final Optional<LD> targetLinking);
}
