package jaxb;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.core.runtime.CoreException;
import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Output;
import org.softlang.megal.mi2.Relationship;
import org.xml.sax.SAXException;

import pluginroot.Bindings;

public class XSDConformance extends Evaluator {

	private Output conforms(String xml, String xsd) throws IOException {
		// 1. Lookup a factory for the W3C XML Schema language
		SchemaFactory factory = SchemaFactory
				.newInstance("http://www.w3.org/2001/XMLSchema");

		// 2. Compile the schema.
		// Here the schema is loaded from a java.io.File, but you could use
		// a java.net.URL or a javax.xml.transform.Source instead.
		Schema schema;
		try (Reader reader = new StringReader(xsd)) {
			schema = factory.newSchema(new StreamSource(reader));
		} catch (SAXException e) {
			return Output.error(e.getLocalizedMessage());
		}

		// 3. Get a validator from the schema.
		Validator validator = schema.newValidator();

		// 5. Check the document
		try (Reader reader = new StringReader(xml)) {
			validator.validate(new StreamSource(reader));
			return Output.valid();
		} catch (SAXException e) {
			return Output.error(e.getLocalizedMessage());
		}

	}

	@Override
	public Output evaluate(Relationship relationship) {
		for (Relationship r : relationship.getRight().outgoing("elementOf")) {
			if ("XSD".equals(r.getRight().getName())) {
				try {
					String left = Bindings.read(relationship.getLeft()
							.getBindings());
					String right = Bindings.read(relationship.getRight()
							.getBindings());

					if (left == null || right == null)
						return Output.notApplicable();

					return conforms(left, right);
				} catch (IOException | CoreException e) {
					return Output.error(e.getLocalizedMessage());
				}
			}
		}

		return super.evaluate(relationship);
	}
}
