package org.softlang.megal.language.tests;

import java.io.File;
import java.io.IOException;

import org.softlang.megal.Megamodel;
import org.softlang.megal.language.Megals;
import org.softlang.megal.mi.MI;
import org.softlang.megal.mi.MIEntity;
import org.softlang.megal.mi.MIEntityType;
import org.softlang.megal.mi.MIMegamodel;
import org.softlang.megal.mi.MIRelationship;
import org.softlang.megal.mi.MIRelationshipType;

public class ModelInterface {
	private static String PRELUDE = "./src/org/softlang/megal/language/tests/Prelude.megal";

	private static String AS = "./src/org/softlang/megal/language/tests/As.megal";

	public static void main(String[] args) throws IOException {
		Megamodel mm = load();
		MIMegamodel mi = initialize(mm);

		dump(mi);

	}

	private static Megamodel load() throws IOException {
		System.out.print("Loading ...");
		Megamodel mm = Megals.load(new File(AS), new File(PRELUDE));
		System.out.println(" done.");
		return mm;
	}

	private static MIMegamodel initialize(Megamodel mm) {
		System.out.print("Initializing ...");
		MIMegamodel mi = MI.initialize(mm);
		System.out.println(" done.");
		return mi;
	}

	private static void dump(MIMegamodel mi) {
		System.out.println("Megamodel " + mi.getName());

		System.out.println("Entity types");
		for (MIEntityType x : mi.getEntityTypes())
			System.out.println("  " + x);
		System.out.println();

		System.out.println("Relationship types");
		for (MIRelationshipType x : mi.getRelationshipTypes())
			System.out.println("  " + x);
		System.out.println();

		System.out.println("Entities");
		for (MIEntity x : mi.getEntities())
			System.out.println("  " + x);
		System.out.println();

		System.out.println("Relationships");
		for (MIRelationship x : mi.getRelationships())
			System.out.println("  " + x);
		System.out.println();
	}

}
