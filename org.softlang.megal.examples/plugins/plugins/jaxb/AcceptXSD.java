package plugins.jaxb;

import java.io.IOException;
import java.io.Reader;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.softlang.megal.mi2.mmp.Emission;
import org.softlang.megal.mi2.mmp.data.Message;
import org.xml.sax.SAXException;

import plugins.root.elementof.Acceptor;

import com.google.common.io.CharSource;

public class AcceptXSD extends Acceptor {
	@Override
	public boolean accept(Emission emission, CharSource source) {

		// 1. Lookup a factory for the W3C XML Schema language
		SchemaFactory factory = SchemaFactory
				.newInstance("http://www.w3.org/2001/XMLSchema");

		try (Reader reader = source.openStream()) {
			factory.newSchema(new StreamSource(reader));
			return true;
		} catch (SAXException e) {
			emission.emit(Message.createWarningFor(e));
			return false;
		} catch (IOException e) {
			emission.emit(Message.createWarningFor(e));
			return false;
		}
	}
}
