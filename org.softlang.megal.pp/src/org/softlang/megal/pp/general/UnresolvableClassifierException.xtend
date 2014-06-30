package org.softlang.megal.pp.general

import java.util.NoSuchElementException

class UnresolvableClassifierException extends NoSuchElementException {
	
	new() {
		
	}
	
	new(String s) {
		super(s)
	}
	
}