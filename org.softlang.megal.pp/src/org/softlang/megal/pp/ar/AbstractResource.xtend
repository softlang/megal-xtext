package org.softlang.megal.pp.ar

import com.google.common.io.ByteStreams
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceImpl

abstract class AbstractResource extends ResourceImpl {
	var byte[] bytes

	def getImage() {
		return new ByteArrayInputStream(bytes)
	}

	new() {
	}

	new(URI uri) {
		super(uri)
	}

	def protected abstract void extractModel(Map<?, ?> options) throws IOException

	override protected final doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		bytes = ByteStreams.toByteArray([|inputStream])
		inputStream.close
		
		extractModel(options)
	}

	override protected final doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		ByteStreams.write(bytes, [|outputStream])
		outputStream.close
	}

}
