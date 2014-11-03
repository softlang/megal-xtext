package org.softlang.megal

import java.util.UUID
import java.util.Collection

final class GuardHelper {
	val UUID uuid

	new(UUID uuid) {
		this.uuid = uuid
	}

	def check(boolean k) {
		if(!k) throw new GuardException('''Check failed''', uuid)
	}

	def checkNot(boolean k) {
		if(k) throw new GuardException('''Check failed''', uuid)
	}

	def <T> ifAssigned(T t) {
		if(t == null) throw new GuardException('''Value was assigned, «t»''', uuid)
		return t
	}

	def <T> ifUnassigned(T t) {
		if(t != null) throw new GuardException('''Value was null''', uuid)
		return t
	}

	def <T> ifEmpty(Iterable<T> k) {
		if (k.iterator.hasNext)
			throw new GuardException('''Values were not empty, «k»''', uuid)
		k
	}

	def <T> ifNotEmpty(Iterable<T> k) {
		if (!k.iterator.hasNext)
			throw new GuardException('''Values were empty''', uuid)
		k
	}

	def <T> ifContained(T o, Collection<?> c) {
		if (!c.contains(o))
			throw new GuardException('''Values did not contain «o», «c»''', uuid)
		return o
	}

	def <T> ifNotContained(T o, Collection<?> c) {
		if (c.contains(o))
			throw new GuardException('''Values did contain «o», «c»''', uuid)
		return o
	}
}
