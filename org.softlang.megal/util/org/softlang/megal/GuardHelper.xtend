package org.softlang.megal

import java.util.UUID

final class GuardHelper {
	val UUID uuid

	new(UUID uuid) {
		this.uuid = uuid
	}

	def check(boolean k) {
		if(!k) throw new GuardException(uuid)
	}

	def checkNot(boolean k) {
		if(k) throw new GuardException(uuid)
	}

	def <T> assigned(T t) {
		if(t == null) throw new GuardException(uuid)
	}

	def <T> unassigned(T t) {
		if(t != null) throw new GuardException(uuid)
	}

	def <T> empty(Iterable<?> k) {
		if (k.iterator.hasNext)
			throw new GuardException(uuid)
	}

	def <T> notEmpty(Iterable<?> k) {
		if (!k.iterator.hasNext)
			throw new GuardException(uuid)
	}
}
