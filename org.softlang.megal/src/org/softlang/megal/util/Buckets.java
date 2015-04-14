package org.softlang.megal.util;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Multimaps.newListMultimap;
import static com.google.common.collect.Multimaps.newSetMultimap;
import static com.google.common.collect.Sets.newHashSet;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Supplier;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;

public class Buckets {
	public static <E, B> BucketSet<E, B> newBucketSet(final Class<E> type,
			final Function<? super E, ? extends B> classification) {
		abstract class Bucket {
			public abstract E getElement();

			public abstract B getBucket();

			@Override
			public int hashCode() {
				return Objects.hashCode(getBucket());
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (!(obj instanceof Bucket))
					return false;
				return Objects.equal(getBucket(), ((Bucket) obj).getBucket());
			}
		}

		class SingletonBucket extends Bucket {
			private final E element;

			public SingletonBucket(E element) {
				this.element = element;
			}

			@Override
			public E getElement() {
				return element;
			}

			@Override
			public B getBucket() {
				return classification.apply(element);
			}
		}

		class ClassOfBucket extends Bucket {
			private final B bucket;

			public ClassOfBucket(B bucket) {
				this.bucket = bucket;
			}

			@Override
			public E getElement() {
				throw new UnsupportedOperationException();
			}

			@Override
			public B getBucket() {
				return bucket;
			}
		}

		class ElementSet extends AbstractSet<E> implements BucketSet<E, B> {
			private final Set<Bucket> backing = newHashSet();

			@Override
			public boolean add(E e) {
				return backing.add(new SingletonBucket(e));
			}

			@Override
			public void clear() {
				backing.clear();
			}

			@Override
			public boolean contains(Object o) {
				if (!type.isInstance(o))
					return false;

				E e = type.cast(o);

				return backing.contains(new SingletonBucket(e));
			}

			@Override
			public boolean isEmpty() {
				return backing.isEmpty();
			}

			@Override
			public Iterator<E> iterator() {
				return new Iterator<E>() {
					private Iterator<Bucket> backingIterator = backing.iterator();

					@Override
					public boolean hasNext() {
						return backingIterator.hasNext();
					}

					@Override
					public void remove() {
						backingIterator.remove();
					}

					@Override
					public E next() {
						Bucket n = backingIterator.next();

						return n.getElement();
					}
				};
			}

			@Override
			public boolean remove(Object o) {
				if (!type.isInstance(o))
					return false;

				E e = type.cast(o);

				return backing.remove(e);
			}

			@Override
			public int size() {
				return backing.size();
			}

			@Override
			public E getBy(B bucket) {
				for (Bucket b : backing)
					if (Objects.equal(b.getBucket(), bucket))
						return b.getElement();

				return null;
			}

			@Override
			public boolean containsBucket(B bucket) {
				return backing.contains(new ClassOfBucket(bucket));
			}
		}

		return new ElementSet();
	}

	public static <K, B, V> BucketMap<K, B, V> newBucketMap(Class<K> type,
			final Function<? super K, ? extends B> classification) {
		abstract class Bucket {
			public abstract K getElement();

			public abstract B getBucket();

			@Override
			public int hashCode() {
				return Objects.hashCode(getBucket());
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (!(obj instanceof Bucket))
					return false;
				return Objects.equal(getBucket(), ((Bucket) obj).getBucket());
			}
		}

		class SingletonBucket extends Bucket {
			private final K element;

			public SingletonBucket(K element) {
				this.element = element;
			}

			@Override
			public K getElement() {
				return element;
			}

			@Override
			public B getBucket() {
				return classification.apply(element);
			}
		}

		class ClassOfBucket extends Bucket {
			private final B bucket;

			public ClassOfBucket(B bucket) {
				this.bucket = bucket;
			}

			@Override
			public K getElement() {
				throw new UnsupportedOperationException();
			}

			@Override
			public B getBucket() {
				return bucket;
			}
		}

		class ElementMap extends AbstractMap<K, V> implements BucketMap<K, B, V> {
			/**
			 * The map backing the key wrappers mapping to the values
			 */
			private final Map<Bucket, V> backing = Maps.newHashMap();

			@Override
			public void clear() {
				backing.clear();
			}

			@Override
			public boolean containsKey(Object key) {
				if (!(type.isInstance(key)))
					return false;

				K k = type.cast(key);

				return backing.containsKey(new SingletonBucket(k));
			}

			@Override
			public boolean containsValue(Object value) {
				return backing.containsValue(value);
			}

			@Override
			public Set<Entry<K, V>> entrySet() {
				return new AbstractSet<Entry<K, V>>() {
					@Override
					public boolean add(Entry<K, V> e) {
						return !Objects.equal(ElementMap.this.put(e.getKey(), e.getValue()), e.getValue());
					}

					@Override
					public boolean contains(Object o) {
						if (!(o instanceof Entry<?, ?>))
							return false;

						Entry<?, ?> e = (Entry<?, ?>) o;

						return Objects.equal(ElementMap.this.get(e.getKey()), e.getValue());
					}

					@Override
					public void clear() {
						backing.clear();
					}

					@Override
					public boolean isEmpty() {
						return backing.isEmpty();
					}

					@Override
					public Iterator<Entry<K, V>> iterator() {

						return new Iterator<Entry<K, V>>() {
							private Iterator<Entry<Bucket, V>> backingIterator = backing.entrySet().iterator();

							@Override
							public boolean hasNext() {
								return backingIterator.hasNext();
							}

							@Override
							public void remove() {
								backingIterator.remove();
							}

							@Override
							public Entry<K, V> next() {
								Entry<Bucket, V> n = backingIterator.next();

								return Maps.immutableEntry(n.getKey().getElement(), n.getValue());
							}
						};
					}

					@Override
					public boolean remove(Object o) {
						if (!(o instanceof Entry<?, ?>))
							return false;

						Entry<?, ?> e = (Entry<?, ?>) o;

						return ElementMap.this.remove(e.getKey(), e.getValue());
					}

					@Override
					public int size() {
						return backing.size();
					}
				};
			}

			@Override
			public Set<K> keySet() {
				return new AbstractSet<K>() {

					@Override
					public boolean contains(Object o) {
						if (!type.isInstance(o))
							return false;

						K e = type.cast(o);

						return ElementMap.this.containsKey(e);
					}

					@Override
					public void clear() {
						backing.clear();
					}

					@Override
					public boolean isEmpty() {
						return backing.isEmpty();
					}

					@Override
					public Iterator<K> iterator() {

						return new Iterator<K>() {
							private Iterator<Bucket> backingIterator = backing.keySet().iterator();

							@Override
							public boolean hasNext() {
								return backingIterator.hasNext();
							}

							@Override
							public void remove() {
								backingIterator.remove();
							}

							@Override
							public K next() {
								Bucket n = backingIterator.next();

								return n.getElement();
							}
						};
					}

					@Override
					public boolean remove(Object o) {
						if (!type.isInstance(o))
							return false;

						K e = type.cast(o);

						return ElementMap.this.remove(e) != null;
					}

					@Override
					public int size() {
						return backing.size();
					}
				};
			}

			@Override
			public V get(Object key) {
				if (!type.isInstance(key))
					return null;

				K k = type.cast(key);

				return backing.get(new SingletonBucket(k));
			}

			@Override
			public boolean isEmpty() {
				return backing.isEmpty();
			}

			@Override
			public V put(K key, V value) {
				return backing.put(new SingletonBucket(key), value);
			}

			@Override
			public V remove(Object key) {
				if (!type.isInstance(key))
					return null;

				K k = type.cast(key);

				return backing.remove(new SingletonBucket(k));
			}

			@Override
			public int size() {
				return backing.size();
			}

			@Override
			public Collection<V> values() {
				return backing.values();
			}

			@Override
			public V getBucket(B bucket) {
				return backing.get(new ClassOfBucket(bucket));
			}

			@Override
			public V removeBucket(B bucket) {
				return backing.remove(new ClassOfBucket(bucket));
			}

			@Override
			public boolean containsBucket(B bucket) {
				return backing.containsKey(new ClassOfBucket(bucket));
			}
		}

		return new ElementMap();
	}

	public static <K, B, V> Multimap<K, V> newBucketMultimap(final Class<K> type,
			final Function<? super K, ? extends B> classification) {
		return newBucketListMultimap(type, classification);
	}

	public static <K, B, V> ListMultimap<K, V> newBucketListMultimap(final Class<K> type,
			final Function<? super K, ? extends B> classification) {

		return newListMultimap(newBucketMap(type, classification), new Supplier<List<V>>() {
			@Override
			public List<V> get() {
				return newArrayList();
			}
		});
	}

	public static <K, B, V> SetMultimap<K, V> newBucketSetMultimap(final Class<K> type,
			final Function<? super K, ? extends B> classification) {

		return newSetMultimap(newBucketMap(type, classification), new Supplier<Set<V>>() {
			@Override
			public Set<V> get() {
				return newHashSet();
			}
		});
	}
}
