package plugins.jaxb;

import static com.google.common.collect.Iterables.*;
import static plugins.util.Nodes.*;
import static plugins.util.Prelude.isElementOfLanguage;
import static plugins.util.Prelude.isInstance;
import static com.google.common.collect.Sets.*;
import static com.google.common.collect.Maps.*;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Splitter;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

public class XMLFileCorrespondsToJavaObject extends EvaluatorPlugin {

	private static String toFirstUpper(String s) {
		if (s.isEmpty())
			return s;

		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	private static Optional<Object> get(Object object, String field) {
		field = getLast(Splitter.on(':').split(field));
		try {
			return Optional.of(object.getClass().getField(field).get(object));
		} catch (IllegalArgumentException | IllegalAccessException
				| NoSuchFieldException | SecurityException fe) {
			try {
				return Optional.of(object.getClass()
						.getMethod("get" + toFirstUpper(field)).invoke(object));
			} catch (IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException
					| SecurityException ge) {
				return Optional.absent();
			}
		}
	}

	private boolean isMatchable(Node node) {
		switch (node.getNodeType()) {
		case Node.ATTRIBUTE_NODE:
		case Node.ELEMENT_NODE:
		case Node.DOCUMENT_NODE:
			break;

		default:
			return false;
		}

		if (node.getNodeName().startsWith("xmlns"))
			return false;

		// More stop criteria can go here
		return true;
	}

	private boolean matchValue(String source, Object target) {
		if (target == null)
			return "null".equalsIgnoreCase(source);

		if (target instanceof Number)
			return target.equals(Long.valueOf(source))
					|| target.equals(Double.valueOf(source));

		if (target instanceof Boolean)
			return target.equals(Boolean.valueOf(source));

		return String.valueOf(target).equals(source);
	}

	/**
	 * <p>
	 * Matches the XML node with the given object, if not matching,
	 * <code>null</code> is returned, else a map of corresponding elements.
	 * </p>
	 * 
	 * @param file
	 *            The XML node to match
	 * @param object
	 *            THe object to match with
	 * @param errors
	 *            A result-set of errors or <code>null</code>
	 * @return Returns the matches or <code>null</code>
	 */
	private Map<Node, Object> match(Node file, Object object, Set<String> errors) {
		ImmutableMap.Builder<Node, Object> builder = ImmutableMap.builder();

		// Track if there were matchable children
		boolean hasMatchableChildren = false;

		next: for (Node child : asList(file.getChildNodes())) {
			// Skip special or unmatchable nodes
			if (!isMatchable(child))
				continue next;

			// There is a child that passed the matchable mark
			hasMatchableChildren = true;

			Optional<Object> value = get(object, child.getNodeName());

			// No corresponding field, structural error
			if (!value.isPresent()) {
				if (errors != null)
					errors.add("No corresponding field for "
							+ child.getNodeName());
				return null;
			}

			// If direct match
			Map<Node, Object> direct = match(child, value.get(), errors);

			if (direct != null) {
				builder.put(child, value.get());
				builder.putAll(direct);
				continue next;
			}

			// If not matching, different values
			if (matchValue(getValue(child), value.get())) {
				builder.put(child, value.get());
				continue next;
			}

			// Child match
			if (value.get() instanceof Collection<?>) {
				Collection<?> items = (Collection<?>) value.get();
				for (Object item : items) {
					Map<Node, Object> potential = match(child, item, errors);
					if (potential != null) {
						builder.put(child, item);
						builder.putAll(potential);
						continue next;
					}
				}
			}

			if (errors != null)
				errors.add("No corresponding element for child "
						+ child.getNodeName());

			// No match at all
			return null;
		}

		// No child nodes, not the current call's responsibility to match,
		// should be done above where name lookup is possible
		if (!hasMatchableChildren)
			return null;

		// All matched
		return builder.build();
	}

	@Override
	public void evaluate(Context context, Relationship relationship) {
		if (!relationship.getLeft().getBinding().isPresent())
			return;
		if (!relationship.getRight().getBinding().isPresent())
			return;

		if (!isElementOfLanguage(relationship.getLeft(), "XML"))
			return;
		if (!isInstance(relationship.getRight(), "Transient"))
			return;

		Artifact file = context.getArtifact(relationship.getLeft().getBinding()
				.get());
		Object object = relationship.getRight().getBinding().get();

		try (InputStream stream = file.getBytes().openStream()) {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document document = builder.parse(stream);
			document.getDocumentElement().normalize();

			// Optional<String> matchMessage = isMatch(
			// document.getDocumentElement(), object);
			Set<String> errors = newHashSet();
			Map<Node, Object> matches = match(document.getDocumentElement(),
					object, errors);

			if (matches == null)
				context.error("Does not correspond: "
						+ Joiner.on("\r\n").join(errors));
			else {
				StringBuilder info = new StringBuilder();
				boolean sep = false;
				for (Entry<Node, Object> trace : matches.entrySet()) {
					if (sep)
						info.append("\r\n");

					info.append(locationAndValue(trace.getKey()));
					info.append(" <-> ");
					info.append(trace.getValue());

					if (trace.getValue() != null)
						info.append(": "
								+ trace.getValue().getClass().getSimpleName());

					sep = true;
				}
				
				context.info(info.toString());

				context.valid();
			}
			// if (matchMessage.isPresent())
			// context.error(matchMessage.get());
		} catch (IOException | ParserConfigurationException | SAXException e) {
			context.warning(Throwables.getStackTraceAsString(e));
		}

	}
}
