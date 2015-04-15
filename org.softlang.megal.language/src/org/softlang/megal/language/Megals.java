package org.softlang.megal.language;

import static com.google.common.collect.FluentIterable.from;
import static java.util.Collections.emptyMap;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.softlang.megal.Megamodel;
import org.softlang.megal.language.util.ReaderInputStream;

import com.google.common.io.CharSource;
import com.google.common.io.Files;

public class Megals {
	public static Megamodel load(String source, String... imports) throws IOException {
		CharSource csSource = CharSource.wrap(source);
		CharSource[] csImports = new CharSource[imports.length];

		for (int i = 0; i < imports.length; i++)
			csImports[i] = CharSource.wrap(imports[i]);

		return load(csSource, csImports);
	}

	public static Megamodel load(File source, File... imports) throws IOException {
		return load(Charset.defaultCharset(), source, imports);
	}

	public static Megamodel load(Charset charset, File source, File... imports) throws IOException {
		CharSource csSource = Files.asCharSource(source, charset);
		CharSource[] csImports = new CharSource[imports.length];

		for (int i = 0; i < imports.length; i++)
			csImports[i] = Files.asCharSource(imports[i], charset);

		return load(csSource, csImports);
	}

	public static Megamodel load(CharSource source, CharSource... imports) throws IOException {
		MegalStandaloneSetup.doSetup();

		ResourceSet set = new ResourceSetImpl();

		for (int i = 0; i < imports.length; i++) {
			Resource importResource = set.createResource(URI.createURI("dummy:/import" + i + ".megal"));
			importResource.load(new ReaderInputStream(imports[i].openStream()), emptyMap());
		}

		Resource sourceResource = set.createResource(URI.createURI("dummy:/source.megal"));
		sourceResource.load(new ReaderInputStream(source.openStream()), emptyMap());

		return from(sourceResource.getContents()).filter(Megamodel.class).first().orNull();
	}
}
