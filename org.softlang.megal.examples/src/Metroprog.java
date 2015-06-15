import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.softlang.megal.MegalAnnotation;
import org.softlang.megal.MegalDeclaration;
import org.softlang.megal.MegalEntity;
import org.softlang.megal.MegalEntityType;
import org.softlang.megal.MegalFile;
import org.softlang.megal.MegalLink;
import org.softlang.megal.MegalRelationship;
import org.softlang.megal.MegalRelationshipType;
import org.softlang.megal.language.Megals;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.Files;

public class Metroprog {
	private static final File PRELUDE = new File("megamodel/Prelude.megal.source");

	public static final File[] ALL_FILES = { new File("megamodel/Prelude.megal"), new File("megamodel/JDOM.megal"),
			new File("megamodel/Java.megal"), new File("megamodel/JVM.megal"), new File("megamodel/XML.megal"),
			new File("megamodel/Parts.megal"), new File("megamodel/Mapping.megal"),
			new File("megamodel/Deserialization.megal")

	};

	private static void printTo(MegalAnnotation a, PrintStream p) {
		p.print("@");
		p.print(a.getKey());
		if (a.getValue() != null) {
			p.print(" '");
			p.print(a.getValue());
			p.print("'");
		}
		p.println();
	}

	private static String toFirstUpper(String s) {
		if (s.isEmpty())
			return s;
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	public static void main(String[] args) throws IOException {
		// generatePrelude();

		int[] agg = { 0, 0, 0, 0 };
		int[] crr = { 0, 0, 0, 0 };
		int[] pre = { 0, 0, 0, 0 };
		for (File file : ALL_FILES) {
			MegalFile m = Megals.load(file, ALL_FILES);
			analyzeFile(m, crr);
			if ("Prelude".equals(m.getName())) {
				pre[0] = crr[0];
				pre[1] = crr[1];
				pre[2] = crr[2];
				pre[3] = crr[3];
			}
			System.out.println("\\hline " + m.getName() + " & " + crr[0] + " & " + crr[1] + " & " + crr[2] + " & "
					+ crr[3] + " \\\\ ");

			agg[0] += crr[0];
			agg[1] += crr[1];
			agg[2] += crr[2];
			agg[3] += crr[3];
		}
		System.out.println("\\hline \\hline \\textbf{Total} & " + agg[0] + " & " + agg[1] + " & " + agg[2] + " & "
				+ agg[3] + " \\\\ ");
		System.out.println("\\hline \\textbf{excl. Prelude} & " + (agg[0] - pre[0]) + " & " + (agg[1] - pre[1]) + " & "
				+ (agg[2] - pre[2]) + " & " + (agg[3] - pre[3]) + " \\\\ ");

	}

	private static void generatePrelude() throws IOException, FileNotFoundException {
		MegalFile f = Megals.load(PRELUDE);

		try (PrintStream p = new PrintStream(new File("megamodel/Prelude.megal"))) {
			p.println("model Prelude");

			for (MegalDeclaration d : f.getDeclarations())
				if (d instanceof MegalEntityType) {
					MegalEntityType x = (MegalEntityType) d;

					String evaluatorName = x.getName() + "Evaluator";
					String reasonerName = x.getName() + "Reasoner";

					p.println("@Plugin '" + evaluatorName + "'");
					p.println("@Plugin '" + reasonerName + "'");
					for (MegalAnnotation a : x.getAnnotations())
						printTo(a, p);
					p.print(x.getName());
					if (x.getSupertype() == null)
						p.println(" as entity");
					else {
						p.print('<');
						p.println(x.getSupertype().getName());
					}

					p.println(evaluatorName + ": Plugin");
					p.println(reasonerName + ": Plugin");

				} else if (d instanceof MegalRelationshipType) {
					MegalRelationshipType x = (MegalRelationshipType) d;

					String baseName = x.getLeft().getName() + toFirstUpper(x.getName()) + x.getRight().getName();
					String evaluatorName = baseName + "Evaluator";
					String reasonerName = baseName + "Reasoner";

					p.println("@Plugin '" + evaluatorName + "'");
					p.println("@Plugin '" + reasonerName + "'");
					for (MegalAnnotation a : x.getAnnotations())
						printTo(a, p);
					p.print(x.getName());
					p.print('<');
					p.print(x.getLeft().getName());
					if (x.isLeftMany())
						p.print('+');
					else if (x.isLeftBoth())
						p.print("(+)");
					p.print('*');

					p.print(x.getRight().getName());
					if (x.isRightMany())
						p.print('+');
					else if (x.isRightBoth())
						p.print("(+)");
					p.println();
					p.println(evaluatorName + ": Plugin");
					p.println(reasonerName + ": Plugin");

				}

		}
	}

	private static void analyzeFile(MegalFile m, int[] out) {
		int acount = m.getAnnotations().size();
		int dcount = m.getDeclarations().size();
		int bcount = m.getBindings().size();
		int pcount = 0;

		for (MegalDeclaration d : m.getDeclarations()) {
			acount += d.getAnnotations().size();
			if (d instanceof MegalEntity) {
				MegalEntity ent = (MegalEntity) d;
				if ("Plugin".equals(ent.getType().getName()))
					pcount++;

			} else if (d instanceof MegalRelationship) {
				MegalRelationship rel = (MegalRelationship) d;
				if ("Plugin".equals(rel.getLeft().getType().getName())
						|| "Plugin".equals(rel.getRight().getType().getName()))
					pcount++;
			} else if (d instanceof MegalEntityType) {
				MegalEntityType ett = (MegalEntityType) d;

				if ("Plugin".equals(ett.getName())
						|| (ett.getSupertype() != null && "Plugin".equals(ett.getSupertype().getName())))
					pcount++;

			} else if (d instanceof MegalRelationshipType) {
				MegalRelationshipType rtt = (MegalRelationshipType) d;

				boolean isAssociation = false;
				for (MegalAnnotation an : rtt.getAnnotations())
					if ("Plugin".equals(an.getKey()))
						isAssociation = true;

				if (isAssociation || "Plugin".equals(rtt.getLeft().getName())
						|| "Plugin".equals(rtt.getRight().getName()))
					pcount++;
			}

		}

		for (MegalLink l : m.getBindings()) {
			if ("Plugin".equals(l.getLink().getType().getName()))
				pcount++;
		}

		out[0] = acount;
		out[1] = dcount;
		out[2] = bcount;
		out[3] = pcount;
	}
}
