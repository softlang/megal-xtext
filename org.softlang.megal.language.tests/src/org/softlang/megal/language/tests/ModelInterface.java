package org.softlang.megal.language.tests;

import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Set;

import org.softlang.megal.Megamodel;
import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Message;
import org.softlang.megal.api.Message.Level;
import org.softlang.megal.api.resolution.LocalResolution;
import org.softlang.megal.language.Megals;
import org.softlang.megal.mi2.Access;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.kb.KB;
import org.softlang.megal.mi2.kb.MegamodelKB;

public class ModelInterface {
	private static String PRELUDE = "./src/org/softlang/megal/language/tests/Prelude.megal";

	private static String AS = "./src/org/softlang/megal/language/tests/As.megal";

	public static void main(String[] args) throws IOException {

		Megamodel mm = load();
		KB kb = MegamodelKB.loadAll(mm);

		Evaluator sequencer = new Evaluator();
		Set<Message> result = sequencer.evaluate(new LocalResolution(), kb);

		dump(kb);
		System.out.println("_______________________________________");
		for (Message messageLocation : result) {
			if (messageLocation.getLevel() == Level.ERROR)
				System.err.println(messageLocation);
			else
				System.out.println(messageLocation);
			System.out.println();
		}

	}

	private static Megamodel load() throws IOException {
		System.out.print("Loading ...");
		Megamodel mm = Megals.load(new File(AS), new File(PRELUDE));
		System.out.println(" done.");
		return mm;
	}

	private static void dump(KB kb) {
		System.out.println("Megamodel " + Access.on(kb).getTitle());

		System.out.println("Entity types");
		for (EntityType x : Access.on(kb).getEntityTypes()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
		}
		System.out.println();

		System.out.println("Relationship types");
		for (RelationshipType x : Access.on(kb).getRelationshipTypes()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
		}
		System.out.println();

		System.out.println("Entities");
		for (Entity x : Access.on(kb).getEntities()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
			System.out.println("  ~ " + x.getBinding());
		}
		System.out.println();

		System.out.println("Relationships");
		for (Relationship x : Access.on(kb).getRelationships()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
		}
		System.out.println();
	}
}
