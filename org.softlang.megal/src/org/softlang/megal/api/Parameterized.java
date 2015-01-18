package org.softlang.megal.api;

import java.util.Set;

public interface Parameterized {
	Set<String> parameterSet();

	String getParameter(String s);

	String putParameter(String s, String v);
	
	
}
