package plugins.jaxb;

import static plugins.util.Nodes.asContext;
import static plugins.util.Nodes.asList;
import static plugins.util.Prelude.isElementOfLanguage;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import plugins.prelude.GuidedEvaluatorPlugin;

import com.google.common.base.CaseFormat;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.Lists;

public class XSDJavaCorrespondence extends GuidedEvaluatorPlugin {

	@Override
	public void guidedEvaluate(Relationship relationship) throws IOException,
			XPathExpressionException {
		when(isElementOfLanguage(relationship.getLeft(), "XML"));
		when(isElementOfLanguage(relationship.getRight(), "Java"));

		Artifact left = artifactOf(relationship.getLeft());
		Artifact right = artifactOf(relationship.getRight());

		// Evaluate to all execute statements
		XPath xpath = XPathFactory.newInstance().newXPath();
		xpath.setNamespaceContext(asContext(ImmutableBiMap.of("xs",
				"http://www.w3.org/2001/XMLSchema")));

		// Open the schema
		try (InputStream stream = left.getBytes().openStream()) {
			List<Node> elements = asList((NodeList) xpath
					.evaluate(
							"/xs:schema/xs:element/xs:complexType/..|/xs:schema/xs:complexType",
							new InputSource(stream), XPathConstants.NODESET));

			List<String> matched = Lists.newArrayList();
			boolean hasInvalidation = false;
			for (Node node : elements) {
				String name = node.getAttributes().getNamedItem("name")
						.getTextContent();
				String className = CaseFormat.LOWER_CAMEL.to(
						CaseFormat.UPPER_CAMEL, name);

				if (hasInvalidation |= right.getChild(className + ".java") == null) {
					error("The class with the name " + className
							+ ", corresponding to the element <"
							+ node.getNodeName() + " ... name=\"" + name
							+ "\" ... /> does not exist.");
				} else {
					matched.add(className);
				}
			}

			if (!hasInvalidation) {
				valid();
				info(matched.toString());
			}
		}
	}
}
