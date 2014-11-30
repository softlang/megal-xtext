package org.softlang.megal.language.scoping;

import org.eclipse.xtext.naming.IQualifiedNameConverter.DefaultImpl;

public class MegalQualifiedNameConverter extends DefaultImpl {
	@Override
	public String getDelimiter() {
		return "::";
	}
}
