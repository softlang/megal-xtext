package org.softlang.megal.mi.wrapped;

import static com.google.common.collect.FluentIterable.from;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import org.softlang.megal.Annotations;
import org.softlang.megal.Entity;
import org.softlang.megal.Link;
import org.softlang.megal.Links;
import org.softlang.megal.Relationships;
import org.softlang.megal.mi.MIEntity;
import org.softlang.megal.mi.MIEntityTypeReference;
import org.softlang.megal.mi.MIRelationship;

import com.google.common.collect.Multimap;

class WrappedEntity extends MIEntity {

	private final WrappedMegamodel container;

	private final String name;

	private final Multimap<String, String> annotations;

	private final MIEntityTypeReference type;

	private final List<URI> links;

	private final Collection<MIRelationship> incoming;

	private final Collection<MIRelationship> outgoing;

	public WrappedEntity(WrappedMegamodel container, Entity source) {
		this.container = container;

		// Get annotation based properties
		name = Annotations.getEffectiveName(source);
		annotations = Annotations.getAnnotationMap(source);

		// Wrap the type of the input entity
		type = container.wrap(source.getType());

		// Get all the links and store them in a list backing
		links = from(Links.allBindings(container.getSource(), source)).transform(Link::getTo).transform(URI::create)
				.toList();

		incoming = from(Relationships.allInvolved(container.getSource(), null, null, source))
				.transform(container::wrap).toList();

		outgoing = from(Relationships.allInvolved(container.getSource(), source, null, null))
				.transform(container::wrap).toList();
	}

	@Override
	public WrappedMegamodel getMegamodel() {
		return container;
	}

	@Override
	public String getDefinedName() {
		return name;
	}

	@Override
	public Multimap<String, String> getAnnotations() {
		return annotations;
	}

	@Override
	public MIEntityTypeReference getType() {
		return type;
	}

	@Override
	public List<URI> getLinks() {
		return links;
	}

	@Override
	public Collection<MIRelationship> getIncoming() {
		return incoming;
	}

	@Override
	public Collection<MIRelationship> getOutgoing() {
		return outgoing;
	}

}