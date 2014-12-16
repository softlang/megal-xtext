package org.softlang.megal.processing;

import java.util.List;

import org.softlang.megal.Declaration;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Link;
import org.softlang.megal.MegalFactory;
import org.softlang.megal.MegalPlugin;
import org.softlang.megal.Megamodel;
import org.softlang.megal.api.In;
import org.softlang.megal.api.RefactoringAPI;
import org.softlang.megal.api.Slot;
import org.softlang.megal.api.URI;
import org.softlang.sourcesupport.SourceSupport;

import static org.softlang.sourcesupport.SourceSupportPlugin.*;

import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

public class LanguageResolving extends RefactoringAPI {

	public LanguageResolving() {
		super("LanguageResolving");
	}

	@In("Prelude")
	protected EntityType language;

	@In("Prelude2.Processed")
	protected EntityType resolver;

	@Override
	public void prepare(Megamodel megamodel) {
		// Prepare
		ImmutableList<Link> resovlerLinks = FluentIterable
				.from(megamodel.getVisibleDeclarations()).filter(Entity.class)
				.filter(k -> k.getType().isAssignableFrom(resolver, false))
				.transformAndConcat(k -> k.getLinks()).toList();

//		SourceSupport ss = getSupport().analyze("superball");
//
//		for (String c : ss.getClasses())
//			System.out.println(c);
//
//		for (Link l : resovlerLinks) {
//			Class<?> c = ss.loadClass(Object.class, "superball.sasa.Koralle");
//			System.out.println("From: " + l.getLink().getName());
//
//			System.out.println();
//		}
	}

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
						+ decl.getShowName().replace(' ', '_')
						+ "_(programming_language)"));

				newLinks.add(link);
			}
		}

		return true;
	}

	@Override
	protected void handleUnassignedSlot(List<String> openSetters) {
		// Do not abort here
	}
}
