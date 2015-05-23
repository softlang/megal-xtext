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
import org.xml.sax.SAXException;

import plugins.prelude.GuidedEvaluatorPlugin;

import com.google.common.base.Throwables;

public class XSDConformance extends GuidedEvaluatorPlugin {

	@Override
	public void guidedEvaluate(Relationship relationship) {
		with(isElementOfLanguage(relationship.getLeft(), "XML"));
		with(isElementOfLanguage(relationship.getRight(), "XSD"));

		// Get the XML and the XSD artifact
		Artifact artifactLeft = withArtifact(relationship.getLeft());
		Artifact artifactRight = withArtifact(relationship.getRight());

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
				valid();
			} catch (SAXException e) {
				error("Instance does not conform to schema, reason: "
						+ Throwables.getStackTraceAsString(e));
			}
		} catch (SAXException e) {
			error("Cannot analyze the schema");
		} catch (IOException e) {
			warning(Throwables.getStackTraceAsString(e));
		}

	}
}
