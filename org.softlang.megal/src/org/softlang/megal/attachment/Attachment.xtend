package org.softlang.megal.attachment

import java.util.WeakHashMap
import org.softlang.megal.semantics.Context
import com.google.common.base.Supplier
import org.eclipse.emf.ecore.resource.Resource

class Attachment {
	val static contexts = new WeakHashMap<Object, Context>

	def static getContext(Object of) {
		contexts.get(of)
	}

	def static getContextOrCreate(Resource of, Supplier<Context> sc) {
		if (contexts.containsKey(of))
			return contexts.get(of)

		val r = sc.get
		contexts.put(of, r)
		return r
	}

	def static setContext(Resource of, Context c) {
		contexts.put(of, c)
	}
}
