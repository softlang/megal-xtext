package org.softlang.megal.processing;

import java.util.List;

import org.softlang.megal.Declaration;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Link;
import org.softlang.megal.MegalFactory;
import org.softlang.megal.api.In;
import org.softlang.megal.api.RefactoringAPI;
import org.softlang.megal.api.Slot;
import org.softlang.megal.api.URI;

public class LanguageResolving extends RefactoringAPI {

	public LanguageResolving() {
		super("LanguageResolving");
	}

	@Slot
	@In("Prelude")
	protected EntityType language;

	@Override
	protected boolean process(Declaration x, MegalFactory f,
			List<Link> newLinks, List<Declaration> newDecls) {
		if (x instanceof Entity) {
			Entity decl = (Entity) x;

			// Process languages that are not already linked
			if (!decl.getType().isMany()
					&& decl.getType().getDefinition() == language
					&& decl.getLinks().isEmpty()) {

				// Create a link pointing to DBpedia
				Link link = f.createLink();
				link.setLink(decl);
				link.setTo(URI.valueOf("http://dbpedia.org/page/"
						+ decl.getName() + "_(programming_language)"));

				newLinks.add(link);
			}
		}

		return true;
	}

}
