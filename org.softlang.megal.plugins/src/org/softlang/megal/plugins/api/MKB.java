package org.softlang.megal.plugins.api;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.Ref;
import org.softlang.megal.mi2.util.Multitable;

import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Table.Cell;

public class MKB extends KB {

	static private class SMultimap<K,V> implements SetMultimap<K,V> {

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean containsEntry(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsKey(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsValue(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Set<K> keySet() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Multiset<K> keys() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean put(K arg0, V arg1) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean putAll(Multimap<? extends K, ? extends V> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean putAll(K arg0, Iterable<? extends V> arg1) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean remove(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Collection<V> values() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Map<K, Collection<V>> asMap() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<Entry<K, V>> entries() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<V> get(K arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<V> removeAll(Object arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<V> replaceValues(K arg0, Iterable<? extends V> arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	private String title;
	
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public SetMultimap<String, String> getRawAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetMultimap<String, String> getRawTheEntityTypeAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getRawEntityTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Multitable<Ref, Ref, String> getRawRelationshipTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Ref> getRawEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getRawBindings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Multitable<String, String, String> getRawRelationships() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetMultimap<Entry<String, String>, Entry<String, String>> getRawEntityTypeAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetMultimap<Cell<Ref, Ref, String>, Entry<String, String>> getRawRelationshipTypeAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetMultimap<Entry<String, Ref>, Entry<String, String>> getRawEntityAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetMultimap<Cell<String, String, String>, Entry<String, String>> getRawRelationshipAnnotations() {
		// TODO Auto-generated method stub
		return null;
	}

}
