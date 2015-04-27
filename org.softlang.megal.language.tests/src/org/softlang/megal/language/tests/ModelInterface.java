package org.softlang.megal.language.tests;

import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;

import org.softlang.megal.Megamodel;
import org.softlang.megal.language.Megals;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.MegamodelKB;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.mmp.Evaluator;
import org.softlang.megal.mi2.mmp.data.Result;
import org.softlang.megal.mi2.mmp.variants.LocalResolution;
import org.softlang.megal.mi2.reasoning.Providers;
import org.softlang.megal.mi2.reasoning.Reasoner;

public class ModelInterface {
	private static String PRELUDE = "./src/org/softlang/megal/language/tests/Prelude.megal";

	private static String AS = "./src/org/softlang/megal/language/tests/As.megal";

	public static void main(String[] args) throws IOException {

		Megamodel mm = load();
		Reasoner reasoner = Providers.obtain(MegamodelKB.loadAll(mm));

		Evaluator sequencer = new Evaluator();
		Result result = sequencer.evaluate(new LocalResolution(), reasoner);

		System.out.println(result.getMessageLocations());
		dump(result.getKB());
	}

	private static Megamodel load() throws IOException {
		System.out.print("Loading ...");
		Megamodel mm = Megals.load(new File(AS), new File(PRELUDE));
		System.out.println(" done.");
		return mm;
	}

	private static void dump(KB kb) {
		dump(Providers.obtain(kb));
	}

	private static void dump(Reasoner mi) {
		System.out.println("Megamodel " + mi.getTitle());

		System.out.println("Entity types");
		for (EntityType x : mi.getEntityTypes()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
		}
		System.out.println();

		System.out.println("Relationship types");
		for (RelationshipType x : mi.getRelationshipTypes()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
		}
		System.out.println();

		System.out.println("Entities");
		for (Entity x : mi.getEntities()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
			for (Object s : x.getBindings())
				System.out.println("  ~ " + s);
		}
		System.out.println();

		System.out.println("Relationships");
		for (Relationship x : mi.getRelationships()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
		}
		System.out.println();
	}
}
