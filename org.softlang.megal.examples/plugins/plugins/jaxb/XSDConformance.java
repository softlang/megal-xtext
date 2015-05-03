package plugins.jaxb;

import java.io.IOException;
import java.io.Reader;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.mmp.Context;
import org.softlang.megal.mi2.mmp.Emission;
import org.softlang.megal.mi2.mmp.Plugin;
import org.softlang.megal.mi2.mmp.data.Message;
import org.xml.sax.SAXException;

import com.google.common.io.CharSource;

public class XSDConformance extends Plugin {

	private void conforms(Emission emission, CharSource xml, CharSource xsd) {
		// 1. Lookup a factory for the W3C XML Schema language
		SchemaFactory factory = SchemaFactory
				.newInstance("http://www.w3.org/2001/XMLSchema");

		// 2. Compile the schema.
		// Here the schema is loaded from a java.io.File, but you could use
		// a java.net.URL or a javax.xml.transform.Source instead.
		Schema schema;
		try (Reader reader = xsd.openStream()) {
			schema = factory.newSchema(new StreamSource(reader));
		} catch (SAXException e) {
			emission.emit(Message.createErrorFor(e));
			return;
		} catch (IOException e) {
			emission.emit(Message.createWarningFor(e));
			return;
		}

		// 3. Get a validator from the schema.
		Validator validator = schema.newValidator();

		// 5. Check the document
		try (Reader reader = xml.openStream()) {
			validator.validate(new StreamSource(reader));
		} catch (SAXException e) {
			emission.emit(Message.error("Instance does not conform to schema"));
			return;
		} catch (IOException e) {
			emission.emit(Message.createWarningFor(e));
			return;
		}
	}

	@Override
	public KB evaluate(Context context, Relationship relationship) {
		// Check if an item conforms to something that is element of XSD
		for (Relationship r : relationship.getRight().outgoing("elementOf"))
			if ("XSD".equals(r.getRight().getName()))
				// Pair up all bindings, usually one * one
				for (Object leftBinding : relationship.getLeft().getBindings())
					for (Object rightBinding : relationship.getRight()
							.getBindings()) {
						// Get char sources
						CharSource left = context.getChars(leftBinding);
						CharSource right = context.getChars(rightBinding);

						// Check conformance
						conforms(context, left, right);
					}

		return KBs.emptyKB();
	}
}
