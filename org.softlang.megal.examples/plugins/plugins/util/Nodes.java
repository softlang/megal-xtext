package plugins.util;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.common.collect.BiMap;

import static com.google.common.collect.Iterators.*;

public class Nodes {
	public static List<Node> asList(final NodeList n) {
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

	public static NamespaceContext asContext(BiMap<String, String> mapping) {
		return asContext(null, mapping);
	}

	public static NamespaceContext asContext(final String defaultNSRURI,
			final BiMap<String, String> mapping) {
		return new NamespaceContext() {

			@Override
			public Iterator<String> getPrefixes(String namespaceURI) {
				if (namespaceURI == null)
					throw new IllegalArgumentException();

				if (defaultNSRURI.equals(namespaceURI))
					return singletonIterator(XMLConstants.DEFAULT_NS_PREFIX);

				if (XMLConstants.XML_NS_URI.equals(namespaceURI))
					return singletonIterator(XMLConstants.XML_NS_PREFIX);
				if (XMLConstants.XMLNS_ATTRIBUTE_NS_URI.equals(namespaceURI))
					return singletonIterator(XMLConstants.XMLNS_ATTRIBUTE);

				if (!mapping.inverse().containsKey(namespaceURI))
					return emptyIterator();

				return singletonIterator(mapping.inverse().get(namespaceURI));
			}

			@Override
			public String getPrefix(String namespaceURI) {
				if (namespaceURI == null)
					throw new IllegalArgumentException();

				if (defaultNSRURI.equals(namespaceURI))
					return XMLConstants.DEFAULT_NS_PREFIX;

				if (XMLConstants.XML_NS_URI.equals(namespaceURI))
					return XMLConstants.XML_NS_PREFIX;
				if (XMLConstants.XMLNS_ATTRIBUTE_NS_URI.equals(namespaceURI))
					return XMLConstants.XMLNS_ATTRIBUTE;

				return mapping.inverse().get(namespaceURI);
			}

			@Override
			public String getNamespaceURI(String prefix) {
				if (prefix == null)
					throw new IllegalArgumentException();

				if (XMLConstants.DEFAULT_NS_PREFIX.equals(prefix))
					return defaultNSRURI;

				if (XMLConstants.XML_NS_PREFIX.equals(prefix))
					return XMLConstants.XML_NS_URI;
				if (XMLConstants.XMLNS_ATTRIBUTE.equals(prefix))
					return XMLConstants.XMLNS_ATTRIBUTE_NS_URI;

				if (!mapping.containsKey(prefix))
					return XMLConstants.NULL_NS_URI;

				return mapping.get(prefix);
			}
		};
	}
}
