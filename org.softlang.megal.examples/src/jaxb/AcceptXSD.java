package jaxb;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.softlang.megal.api.Output;
import org.xml.sax.SAXException;

import pluginroot.elementof.Acceptor;

public class AcceptXSD extends Acceptor {
	@Override
	public Output accept(String source) {
		// 1. Lookup a factory for the W3C XML Schema language
		SchemaFactory factory = SchemaFactory
				.newInstance("http://www.w3.org/2001/XMLSchema");

		try (Reader reader = new StringReader(source)) {
			factory.newSchema(new StreamSource(reader));
			return Output.valid();
		} catch (SAXException | IOException e) {
			return Output.error(e.getLocalizedMessage());
		}
	}

}
