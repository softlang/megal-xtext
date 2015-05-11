package plugins.jaxb;

import static plugins.util.Prelude.isElementOfLanguage;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;
import org.xml.sax.SAXException;

import com.google.common.base.Throwables;

public class XSDConformance extends EvaluatorPlugin {

	@Override
	public void evaluate(Context context, Relationship relationship) {
		if (!isElementOfLanguage(relationship.getLeft(), "XML")
				|| !isElementOfLanguage(relationship.getRight(), "XSD")
				|| !relationship.getLeft().getBinding().isPresent()
				|| !relationship.getRight().getBinding().isPresent())
			return;

		// Get the XML and the XSD artifact
		Artifact artifactLeft = context.getArtifact(relationship.getLeft()
				.getBinding().get());
		Artifact artifactRight = context.getArtifact(relationship.getRight()
				.getBinding().get());

		// Obtain a schema factory
		SchemaFactory factory = SchemaFactory
				.newInstance("http://www.w3.org/2001/XMLSchema");

		// Open XSD
		try (InputStream xsdStream = artifactRight.getBytes().openStream()) {
			// Obtain the schema
			Schema schema = factory.newSchema(new StreamSource(xsdStream));

			// Get the validator
			Validator validator = schema.newValidator();

			// Open XML
			try (InputStream xmlStream = artifactLeft.getBytes().openStream()) {
				// Validate XML
				validator.validate(new StreamSource(xmlStream));

				// Note as valid
				context.valid();
			} catch (SAXException e) {
				context.error("Instance does not conform to schema");
			}
		} catch (SAXException e) {
			context.error("Cannot analyze the schema");
		} catch (IOException e) {
			context.warning(Throwables.getStackTraceAsString(e));
		}

	}
}
