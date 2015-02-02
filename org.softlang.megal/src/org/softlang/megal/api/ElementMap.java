package org.softlang.megal.api;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.softlang.megal.Element;

import com.google.common.base.Objects;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;

/**
 * <p>
 * Maps from an element to a value, the elements identity is used for hashing,
 * the logical equivalence is used for equality
 * </p>
 * 
 * @author Pazuzu
 *
 * @param <V>
 *            The value type
 */
public class ElementMap<K extends Element, V> extends AbstractMap<K, V> {
	/**
	 * The map backing the key wrappers mapping to the values
	 */
	private final Map<ElementKey<K>, V> backing = Maps.newHashMap();

	private final Class<? extends K> type;

	public ElementMap(Class<K> type) {
		this.type = type;
	}

	@Override
	public void clear() {
		backing.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		if (!(type.isInstance(key)))
			return false;

		K k = type.cast(key);

		return backing.containsKey(new ElementKey<K>(k));
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
					private Iterator<Entry<ElementKey<K>, V>> backingIterator = backing.entrySet().iterator();

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
						Entry<ElementKey<K>, V> n = backingIterator.next();

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
					private Iterator<ElementKey<K>> backingIterator = backing.keySet().iterator();

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
						ElementKey<K> n = backingIterator.next();

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

		return backing.get(new ElementKey<K>(k));
	}

	@Override
	public boolean isEmpty() {
		return backing.isEmpty();
	}

	@Override
	public V put(K key, V value) {
		return backing.put(new ElementKey<K>(key), value);
	}

	@Override
	public V remove(Object key) {
		if (!type.isInstance(key))
			return null;

		K k = type.cast(key);

		return backing.remove(new ElementKey<K>(k));
	}

	@Override
	public int size() {
		return backing.size();
	}

	@Override
	public Collection<V> values() {
		return backing.values();
	}

	public static <K extends Element, V> ElementMap<K, V> newElementMap(Class<K> type) {
		return new ElementMap<>(type);
	}

	public static <K extends Element, V> ListMultimap<K, V> newListMultimap(Class<K> type) {
		return Multimaps.newListMultimap(newElementMap(type), () -> Lists.newArrayList());
	}

	public static <K extends Element, V> SetMultimap<K, V> newSetMultimap(Class<K> type) {
		return Multimaps.newSetMultimap(newElementMap(type), () -> Sets.newHashSet());
	}

	public static <K extends Element, V extends Element> SetMultimap<K, V> newElementSetMultimap(Class<K> mapType,
			Class<V> setType) {
		return Multimaps.newSetMultimap(newElementMap(mapType), () -> ElementSet.newElementSet(setType));
	}
}
