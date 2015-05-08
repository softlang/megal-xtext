package plugins.jaxb;

import java.io.IOException;
import java.io.Reader;
import java.util.Set;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.context.Context;
import org.softlang.megal.mi2.api.emission.Emission;
import org.xml.sax.SAXException;

import plugins.util.Prelude;

import com.google.common.io.CharSource;

import static plugins.util.Prelude.*;
import static java.util.Collections.*;

public class XSDConformance extends EvaluatorPlugin {

	private boolean conforms(Emission emission, CharSource xml, CharSource xsd) {
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
			return false;
		} catch (IOException e) {
			emission.emit(Message.createWarningFor(e));
			return false;
		}

		// 3. Get a validator from the schema.
		Validator validator = schema.newValidator();

		// 5. Check the document
		try (Reader reader = xml.openStream()) {
			validator.validate(new StreamSource(reader));
			return true;
		} catch (SAXException e) {
			emission.emit(Message.error("Instance does not conform to schema"));
			return false;
		} catch (IOException e) {
			emission.emit(Message.createWarningFor(e));
			return false;
		}
	}

	@Override
	public Set<Element> evaluate(Context context, Relationship relationship) {
		if (!isElementOfLanguage(relationship.getLeft(), "XML")
				|| !isElementOfLanguage(relationship.getRight(), "XSD")
				|| !relationship.getLeft().getBinding().isPresent()
				|| !relationship.getRight().getBinding().isPresent())
			return null;

		Object leftBinding = relationship.getLeft().getBinding().get();
		Object rightBinding = relationship.getRight().getBinding().get();

		CharSource left = context.getChars(leftBinding);
		CharSource right = context.getChars(rightBinding);

		// Check conformance
		if (conforms(context, left, right))
			return singleton(relationship);

		return emptySet();
	}
}
