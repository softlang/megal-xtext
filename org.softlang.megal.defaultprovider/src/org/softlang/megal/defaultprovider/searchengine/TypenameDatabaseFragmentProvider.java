package org.softlang.megal.defaultprovider.searchengine;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.softlang.megal.defaultprovider.TypeFragmentProvider;

public class TypenameDatabaseFragmentProvider extends
		TypeFragmentProvider<TypenameDatabase> {

	public TypenameDatabaseFragmentProvider() {
		super(TypenameDatabase.class);
	}

	@Override
	protected List<? extends Object> navigateTyped(TypenameDatabase db,
			String segment) {
		Stream<Typename> defs = db.getTypenames().stream()
				.filter(t -> t.size() == 1).filter(t -> t.isComplete())
				.filter(t -> segment.equals(t.getSegment(0)));

		Stream<TypenameInit> inits = db.getTypenames().stream()
				.filter(t -> t.size() > 1).filter(t -> t.isComplete())
				.filter(t -> segment.equals(t.getSegment(0)))
				.map(t -> new TypenameInit(t, 0));

		return Stream.concat(defs, inits).collect(Collectors.toList());
	}

	@Override
	protected Set<String> nextTyped(TypenameDatabase db) {
		Stream<String> defs = db.getTypenames().stream()
				.filter(t -> t.size() == 1).filter(t -> t.isComplete())
				.map(t -> t.getTypename());

		Stream<String> inits = db.getTypenames().stream()
				.filter(t -> t.size() > 1).filter(t -> t.isComplete())
				.map(t -> t.getSegment(0));

		return Stream.concat(defs, inits).collect(Collectors.toSet());
	}

}
