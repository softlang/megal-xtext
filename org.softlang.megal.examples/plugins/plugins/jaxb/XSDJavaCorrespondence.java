package plugins.jaxb;

import static java.util.Collections.singleton;
import static plugins.util.Nodes.asContext;
import static plugins.util.Nodes.asList;
import static plugins.util.Prelude.isElementOfLanguage;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathException;
import javax.xml.xpath.XPathFactory;

import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.context.Context;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.google.common.base.CaseFormat;
import com.google.common.collect.ImmutableBiMap;

public class XSDJavaCorrespondence extends EvaluatorPlugin {
	@Override
	public Set<Element> evaluate(Context context, Relationship relationship) {
		if (!isElementOfLanguage(relationship.getLeft(), "XML")
				|| !isElementOfLanguage(relationship.getRight(), "Java")
				|| !relationship.getLeft().getBinding().isPresent()
				|| !relationship.getRight().getBinding().isPresent())
			return null;

		Object binding = relationship.getRight().getBinding().get();

		// Evaluate to all execute statements
		XPath xpath = XPathFactory.newInstance().newXPath();
		xpath.setNamespaceContext(asContext(ImmutableBiMap.of("xs",
				"http://www.w3.org/2001/XMLSchema")));

		// Open the schema
		try (Reader stream = context.getChars(
				relationship.getLeft().getBinding().get()).openStream()) {

			List<Node> elements = asList((NodeList) xpath
					.evaluate(
							"/xs:schema/xs:element/xs:complexType/..|/xs:schema/xs:complexType",
							new InputSource(stream), XPathConstants.NODESET));

			for (Node node : elements) {
				String name = node.getAttributes().getNamedItem("name")
						.getTextContent();
				String className = CaseFormat.LOWER_CAMEL.to(
						CaseFormat.UPPER_CAMEL, name);

				try {
					// TODO HOOOROIBLA
					context.getBytes(binding + className + ".java").isEmpty();
				} catch (Throwable e) {
					context.emit(Message.error("The class with the name "
							+ className + ", corresponding to the element <"
							+ node.getNodeName() + " ... name=\"" + name
							+ "\" ... /> does not exist."));
				}
			}

			return singleton(relationship);
		} catch (IOException | XPathException e) {
			throw new RuntimeException(e);
		}
	}
}
