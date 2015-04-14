package org.softlang.megal.util;

import java.util.Set;

public interface BucketSet<E, B> extends Set<E> {
	boolean containsBucket(B bucket);

	E getBy(B bucket);
}
