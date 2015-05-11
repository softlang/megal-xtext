package plugins.jaxb;

import static plugins.util.Nodes.asContext;
import static plugins.util.Nodes.asList;
import static plugins.util.Prelude.isElementOfLanguage;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathException;
import javax.xml.xpath.XPathFactory;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.google.common.base.CaseFormat;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableBiMap;

public class XSDJavaCorrespondence extends EvaluatorPlugin {

	@Override
	public void evaluate(Context context, Relationship relationship) {
		if (!isElementOfLanguage(relationship.getLeft(), "XML")
				|| !isElementOfLanguage(relationship.getRight(), "Java")
				|| !relationship.getLeft().getBinding().isPresent()
				|| !relationship.getRight().getBinding().isPresent())
			return;

		Object binding = relationship.getRight().getBinding().get();
		Artifact artifactLeft = context.getArtifact(relationship.getLeft()
				.getBinding().get());
		Artifact artifactRight = context.getArtifact(binding);

		// Evaluate to all execute statements
		XPath xpath = XPathFactory.newInstance().newXPath();
		xpath.setNamespaceContext(asContext(ImmutableBiMap.of("xs",
				"http://www.w3.org/2001/XMLSchema")));

		// Open the schema
		try (InputStream stream = artifactLeft.getBytes().openStream()) {

			List<Node> elements = asList((NodeList) xpath
					.evaluate(
							"/xs:schema/xs:element/xs:complexType/..|/xs:schema/xs:complexType",
							new InputSource(stream), XPathConstants.NODESET));

			boolean hasInvalidation = false;
			for (Node node : elements) {
				String name = node.getAttributes().getNamedItem("name")
						.getTextContent();
				String className = CaseFormat.LOWER_CAMEL.to(
						CaseFormat.UPPER_CAMEL, name);

				if (hasInvalidation |= artifactRight.getChild(className
						+ ".java") == null)
					context.error("The class with the name " + className
							+ ", corresponding to the element <"
							+ node.getNodeName() + " ... name=\"" + name
							+ "\" ... /> does not exist.");
			}

			if (!hasInvalidation)
				context.valid();
		} catch (IOException | XPathException e) {
			context.warning(Throwables.getStackTraceAsString(e));
		}
	}
}
