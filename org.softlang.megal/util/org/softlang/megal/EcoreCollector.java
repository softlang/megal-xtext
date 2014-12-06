package org.softlang.megal;

import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;

public class EcoreCollector {
	public static <T> Collector<T, ?, EList<T>> toEList() {
		return Collectors.toCollection(BasicEList::new);
	}
}
