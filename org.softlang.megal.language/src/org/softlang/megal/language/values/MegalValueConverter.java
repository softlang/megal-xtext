package org.softlang.megal.language.values;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

public class MegalValueConverter extends DefaultTerminalConverters {
	@ValueConverter(rule = "STR")
	public IValueConverter<String> STR() {
		return STRING();
	}
}
