package plugins.jaxb;

import java.io.IOException;
import java.io.Reader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.emission.Emission;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import plugins.root.elementof.Acceptor;

import com.google.common.io.CharSource;

public class AcceptXML extends Acceptor {
	@Override
	public boolean accept(Emission emission, CharSource source) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setValidating(false);
		factory.setNamespaceAware(true);

		try (Reader stream = source.openStream()) {
			SAXParser parser = factory.newSAXParser();
			XMLReader reader = parser.getXMLReader();

			reader.parse(new InputSource(stream));

			return true;
		} catch (SAXException | ParserConfigurationException e) {
			emission.emit(Message.createWarningFor(e));
			return false;
		} catch (IOException e) {
			emission.emit(Message.createWarningFor(e));
			return false;
		}
	}
}
