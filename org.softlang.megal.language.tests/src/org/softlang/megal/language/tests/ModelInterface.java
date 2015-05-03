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
import org.softlang.megal.mi2.api.ModelExecutor;
import org.softlang.megal.mi2.api.MessageLocation;
import org.softlang.megal.mi2.api.Message.Level;
import org.softlang.megal.mi2.api.Result;
import org.softlang.megal.mi2.api.resolution.LocalResolution;

public class ModelInterface {
	private static String PRELUDE = "./src/org/softlang/megal/language/tests/Prelude.megal";

	private static String ROOT = "./src/org/softlang/megal/language/tests/";

	private static String timeValue(long nts) {
		if (nts > 1e+9)
			return roundToD1(nts / 1e+9) + "s";
		if (nts > 1e+6)
			return roundToD1(nts / 1e+6) + "ms";
		if (nts > 1e+3)
			return roundToD1(nts / 1e+3) + "µs";

		return nts + "ns";
	}

	private static String percValue(double fract) {
		return roundToD1(fract * 100.0) + "%";
	}

	public static double roundToD1(double fract) {
		return Math.round(fract * 10.0) / 10.0;
	}

	private static void timePhased(Object... items) {
		long total = (long) items[items.length - 1] - (long) items[0];
		for (int i = 0; i < items.length - 1; i += 2) {
			long dt = (long) items[i + 2] - (long) items[i];
			String phase = (String) items[i + 1];
			System.out.println("Phase " + (i/2 + 1) + ", " + phase + ":");
			System.out.println("  " + timeValue(dt) + "(" + percValue(dt / (double) total) + ")");
		}
	}

	public static void main(String[] args) throws IOException {

		long t1 = System.nanoTime();
		Megamodel mm = load("As");
		long t2 = System.nanoTime();
		KB kb = MegamodelKB.loadAll(mm);
		long t3 = System.nanoTime();
		ModelExecutor sequencer = new ModelExecutor();
		Result result = sequencer.evaluate(new LocalResolution(), kb);
		long t4 = System.nanoTime();
		timePhased(t1, "Load model", t2, "Initialize KB", t3, "Execute", t4);

		for (MessageLocation messageLocation : result.getMessageLocations()) {
			if (messageLocation.getMessage().getLevel() == Level.ERROR)
				System.err.println(messageLocation);
			else
				System.out.println(messageLocation);
			System.out.println();
		}

	}

	private static Megamodel load(String name) throws IOException {
		System.out.print("Loading ...");
		Megamodel mm = Megals.load(new File(ROOT + name + ".megal"), new File(PRELUDE));
		System.out.println(" done.");
		return mm;
	}

	private static void dump(KB kb) {
		System.out.println("Megamodel " + kb.getTitle());

		System.out.println("Entity types");
		for (EntityType x : kb.getEntityTypes()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
		}
		System.out.println();

		System.out.println("Relationship types");
		for (RelationshipType x : kb.getRelationshipTypes()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
		}
		System.out.println();

		System.out.println("Entities");
		for (Entity x : kb.getEntities()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.print("  " + x);
			if (x.getBinding().isPresent())
				System.out.println(" = " + x.getBinding().get());
			else
				System.out.println();
		}
		System.out.println();

		System.out.println("Relationships");
		for (Relationship x : kb.getRelationships()) {
			for (Entry<String, String> annotation : x.getAnnotations().entries())
				System.out.println("  @" + annotation.getKey() + " " + annotation.getValue());
			System.out.println("  " + x);
		}
		System.out.println();
	}
}
