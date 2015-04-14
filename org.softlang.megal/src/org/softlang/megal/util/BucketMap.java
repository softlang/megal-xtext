package org.softlang.megal.util;

import java.util.Map;

public interface BucketMap<K, B, V> extends Map<K, V> {
	boolean containsBucket(B bucket);

	V getBucket(B bucket);

	V removeBucket(B bucket);
}
