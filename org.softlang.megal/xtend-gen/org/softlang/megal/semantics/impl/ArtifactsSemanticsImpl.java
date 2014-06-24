package org.softlang.megal.semantics.impl;

import com.google.common.base.Optional;
import org.softlang.megal.megaL.ED;
import org.softlang.megal.megaL.LD;
import org.softlang.megal.semantics.Diagnostic;
import org.softlang.megal.semantics.EntitySemantics;

@SuppressWarnings("all")
public class ArtifactsSemanticsImpl implements EntitySemantics {
  public void validate(final Diagnostic diagnostic, final ED entity, final Optional<LD> linking) {
    boolean _isPresent = linking.isPresent();
    boolean _not = (!_isPresent);
    if (_not) {
      diagnostic.error("Unlinked artifact");
    }
  }
}
