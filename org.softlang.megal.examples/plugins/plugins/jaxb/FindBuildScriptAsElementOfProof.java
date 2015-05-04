package plugins.jaxb;

import static com.google.common.collect.Iterables.getFirst;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.util.AbstractList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.parser.DocumentParser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathException;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.tools.ant.IntrospectionHelper;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.apache.tools.ant.Target;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.UnknownElement;
import org.apache.tools.ant.helper.ProjectHelper2;
import org.apache.tools.ant.taskdefs.Exec;
import org.apache.tools.ant.taskdefs.ExecTask;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.context.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import com.google.common.base.Splitter;
import static com.google.common.base.Objects.*;

public class FindBuildScriptAsElementOfProof extends EvaluatorPlugin {
	private static List<Node> asList(final NodeList n) {
		return new AbstractList<Node>() {
			@Override
			public Node get(int index) {
				return n.item(index);
			}

			@Override
			public int size() {
				return n.getLength();
			}
		};
	}

	private static String getIn(Project project, String potentialVariable) {
		if (potentialVariable.startsWith("${")
				&& potentialVariable.endsWith("}"))
			return project.getProperty(potentialVariable.substring(2,
					potentialVariable.length() - 1));

		return potentialVariable;
	}

	private static boolean corresponds(File boundXSD, File boundPackage,
			File schema, File destination, String packageName) {

		for (String item : Splitter.on('.').split(packageName))
			destination = new File(destination, item);

		return equal(boundXSD, schema) && equal(boundPackage, destination);
	}

	private static String suffix(int n) {
		switch (n % 10) {
		case 1:
			return "st";
		case 2:
			return "nd";
		case 3:
			return "rd";

		case 0:
		case 4:
		case 5:
		case 6:
		case 7:
		case 9:
			return "th";
		default:
			return null;
		}
	}

	@Override
	public void evaluate(Context context, Relationship relationship) {
		// Get pair
		Entity pair = relationship.getLeft();

		// If pair not bound, there's no build script to validate in
		if (!pair.getBinding().isPresent())
			return;

		// Get relationships to the parameters
		Relationship firstOf = getFirst(pair.incoming("firstOf"), null);
		Relationship secondOf = getFirst(pair.incoming("secondOf"), null);

		// If any of them does not exist, return
		if (firstOf == null || secondOf == null)
			return;

		// Get the parameter items
		Entity first = firstOf.getLeft();
		Entity second = secondOf.getLeft();

		// If any of them is not bound, can not evaluate
		if (!first.getBinding().isPresent())
			return;
		if (!second.getBinding().isPresent())
			return;

		// Get the XSD location and the package
		File boundXSD = new File(context.getAbsolute(first.getBinding().get()));
		File boundPackage = new File(context.getAbsolute(second.getBinding()
				.get()));

		// If any of them is not resolvable, exit
		if (boundXSD == null || boundPackage == null)
			return;

		// Open the build script
		try (Reader stream = context.getChars(pair.getBinding().get())
				.openStream()) {

			URI buildscript = context.getAbsolute(pair.getBinding().get());

			// Configure with ANT for file resolution
			Project project = new Project();
			ProjectHelper.configureProject(project, new File(buildscript));


			// Evaluate to all execute statements
			XPath xpath = XPathFactory.newInstance().newXPath();

			// Make field for all executes and properties
			List<Node> executes = asList((NodeList) xpath.evaluate(
					"/project/target/exec", new InputSource(stream),
					XPathConstants.NODESET));

			boolean hasEvidence = false;

			// Check all execute statements for evidence
			for (Node node : executes) {
				List<Node> args = asList((NodeList) xpath.evaluate("arg", node,
						XPathConstants.NODESET));

				// If no argument, continue
				if (args.size() == 0)
					continue;

				// Get schema value
				Node schemaArgValue = args.get(0).getAttributes()
						.getNamedItem("value");

				// If not present skip
				if (schemaArgValue == null)
					continue;

				// Store values for schema, folder and target
				String schemaArg = schemaArgValue.getTextContent();
				String destinationArg = null;
				String packageArg = null;

				// Find associated mappings
				for (int i = 1; i < args.size() - 1; i++) {
					// Get argument name
					Node argName = args.get(i).getAttributes()
							.getNamedItem("value");

					// If no argument name, skip
					if (argName == null)
						continue;

					// If argument name is 'd', set folder
					if ("-d".equals(argName.getTextContent())) {
						// Get value
						Node argValue = args.get(i + 1).getAttributes()
								.getNamedItem("path");

						// If present, assign
						if (argValue != null)
							destinationArg = argValue.getTextContent();
					}

					// If argument name is 'p', set package
					if ("-p".equals(argName.getTextContent())) {
						// Get value
						Node argValue = args.get(i + 1).getAttributes()
								.getNamedItem("value");

						// If present, assign
						if (argValue != null)
							packageArg = argValue.getTextContent();
					}
				}

				// Do resolution
				File schema = new File(getIn(project, schemaArg));
				File destination = new File(getIn(project, destinationArg));
				String packageName = getIn(project, packageArg);

				if (corresponds(boundXSD, boundPackage, schema, destination,
						packageName)) {
					int index = 1 + executes.indexOf(node);
					context.emit(Message
							.info("Evidence for pair element found in build script at the "
									+ index + suffix(index) + " <exec>."));
					hasEvidence = true;
					break;
				}
			}
			
			if (!hasEvidence)
				context.emit(Message
						.error("No evidence for pair element relationship found in build script"));

		} catch (IOException | XPathException e) {
			throw new RuntimeException(e);
		}
	}
}
