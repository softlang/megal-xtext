package jaxb;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.softlang.megal.api.Output;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import pluginroot.elementof.Acceptor;

public class AcceptXML extends Acceptor {
	@Override
	public Output accept(String source) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setValidating(false);
		factory.setNamespaceAware(true);

		try (Reader r = new StringReader(source)) {
			SAXParser parser = factory.newSAXParser();
			XMLReader reader = parser.getXMLReader();

			reader.parse(new InputSource(r));

			return Output.valid();
		} catch (IOException | SAXException | ParserConfigurationException e) {
			return Output.error(e.getLocalizedMessage());
		}
	}

}
