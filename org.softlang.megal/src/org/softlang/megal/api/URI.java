package org.softlang.megal.api;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Joiner;

public class URI {

	/**
	 * Pattern for matching an URI
	 */
	private static final Pattern URI_PATTERN = Pattern
			.compile("([^:]+):(\\/)?((?:\\/[^\\/]+)+)(\\/)?");

	/**
	 * Pattern for matching one segment in the URIs path
	 */
	private static final Pattern SEGMENTS_PATTERN = Pattern
			.compile("\\/[^\\/]+");

	/**
	 * <p>
	 * Converts the string to an URI.
	 * </p>
	 * <p>
	 * Trims any leading or tailing quote.
	 * </p>
	 * <p>
	 * Converts a null string to a null value
	 * </p>
	 * 
	 * @param s
	 *            The string to convert
	 * @return Returns the value of the string
	 */
	public static URI valueOf(String s) {
		if (s == null)
			return null;

		if (s.startsWith("\""))
			s = s.substring(1, s.length());

		if (s.endsWith("\""))
			s = s.substring(0, s.length() - 1);

		// Make result
		URI r = new URI();

		// Match string
		Matcher a = URI_PATTERN.matcher(s);

		// If matches, convert
		if (a.matches()) {

			// Copy simple settings
			r.setProtocol(a.group(1));
			r.setNet(a.group(2) != null);
			r.setFolder(a.group(4) != null);

			// Iterate segments
			Matcher b = SEGMENTS_PATTERN.matcher(a.group(3));
			while (b.find())
				r.getSegments().add(b.group());
		} else
			throw new IllegalArgumentException("Unable to convert URI");

		// Return result
		return r;
	}

	private String protocol;

	private boolean net;

	private List<String> segments = new LinkedList<String>();

	private boolean folder;

	public URI() {
	}

	public URI(String protocol, boolean net, Collection<String> segments) {
		this.protocol = protocol;
		this.net = net;
		this.segments.addAll(segments);
	}

	/**
	 * <p>
	 * The protocol of the URI, i.e. <code>XXXX://rest.of/uri</code>
	 * </p>
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <p>
	 * Sets the protocol, see {@link #getProtocol()}
	 * </p>
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * <p>
	 * True if this URI is remote, i.e. <code>file:/not.net</code> or
	 * <code>http://net</code>
	 * </p>
	 */
	public boolean isNet() {
		return net;
	}

	/**
	 * <p>
	 * Sets the value of net remoteness, see {@link #isNet()}
	 * </p>
	 */
	public void setNet(boolean net) {
		this.net = net;
	}

	/**
	 * <p>
	 * True if this URI ends on a tailing slash, i.e. <code>file:/folder/</code>
	 * or <code>file:/not.folder</code>
	 * </p>
	 */
	public boolean isFolder() {
		return folder;
	}

	/**
	 * <p>
	 * Sets if this URI is folder, see {@link #isFolder()}
	 * </p>
	 */
	public void setFolder(boolean folder) {
		this.folder = folder;
	}

	/**
	 * <p>
	 * Gets the segments of the URI, i.e. <code>file:/XXXX/YYYY/ZZZZ</code>
	 * </p>
	 * <p>
	 * May be modified.
	 * </p>
	 */
	public List<String> getSegments() {
		return segments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (folder ? 1231 : 1237);
		result = prime * result + (net ? 1231 : 1237);
		result = prime * result
				+ ((protocol == null) ? 0 : protocol.hashCode());
		result = prime * result
				+ ((segments == null) ? 0 : segments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		URI other = (URI) obj;
		if (folder != other.folder)
			return false;
		if (net != other.net)
			return false;
		if (protocol == null) {
			if (other.protocol != null)
				return false;
		} else if (!protocol.equals(other.protocol))
			return false;
		if (segments == null) {
			if (other.segments != null)
				return false;
		} else if (!segments.equals(other.segments))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return protocol + ":" + (net ? "//" : "/")
				+ Joiner.on("/").join(segments) + (folder ? "/" : "");
	}
}
