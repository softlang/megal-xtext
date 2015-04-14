package org.softlang.megal.language.tests;

import java.io.File;
import java.io.IOException;

import org.softlang.megal.Megamodel;
import org.softlang.megal.language.Megals;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.MegamodelKB;
import org.softlang.megal.mi2.NaiveReasoner;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;

public class ModelInterface {
	private static String PRELUDE = "./src/org/softlang/megal/language/tests/Prelude.megal";

	private static String AS = "./src/org/softlang/megal/language/tests/As.megal";

	public static void main(String[] args) throws IOException {

		Megamodel mm = load();

		MegamodelKB kb = new MegamodelKB(mm);

		NaiveReasoner nr = new NaiveReasoner(kb);

		dump(nr);
	}

	private static Megamodel load() throws IOException {
		System.out.print("Loading ...");
		Megamodel mm = Megals.load(new File(AS), new File(PRELUDE));
		System.out.println(" done.");
		return mm;
	}

	private static void dump(NaiveReasoner mi) {
		System.out.println("Megamodel " + mi.getTitle());

		System.out.println("Entity types");
		for (EntityType x : mi.getEntityTypes())
			System.out.println("  " + x);
		System.out.println();

		System.out.println("Relationship types");
		for (RelationshipType x : mi.getRelationshipTypes())
			System.out.println("  " + x);
		System.out.println();

		System.out.println("Entities");
		for (Entity x : mi.getEntities())
			System.out.println("  " + x);
		System.out.println();

		System.out.println("Relationships");
		for (Relationship x : mi.getRelationships())
			System.out.println("  " + x);
		System.out.println();

		testInOut(mi);

		testGCD(mi);

		testFindEvaluators(mi);
	}

	public static void testInOut(NaiveReasoner mi) {
		Entity entity = mi.getEntity("OnlyAs");
		for (Relationship part : entity.incoming())
			System.out.println("->: " + part);
		for (Relationship part : entity.outgoing())
			System.out.println("<-: " + part);
	}

	public static void testGCD(NaiveReasoner mi) {
		EntityType a = mi.getEntityType("Folder");
		EntityType b = mi.getEntityType("Fragment");
		EntityType c = mi.getEntityType("Language");

		EntityType x = a.gcd(b);
		EntityType y = a.gcd(c);
		System.out.println("gcd(Folder, Fragment)=" + x.getName());
		System.out.println("gcd(Folder, Language)=" + y.getName());
	}

	public static void testFindEvaluators(NaiveReasoner mi) {
		EntityType ev = mi.getEntityType("Evaluator");
		System.out.println("Evaluators:");
		for (Entity e : ev.getInstances())
			System.out.println("  " + e);
	}

}
