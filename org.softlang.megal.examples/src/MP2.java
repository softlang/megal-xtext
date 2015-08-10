import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;

import org.softlang.megal.MegalAnnotation;
import org.softlang.megal.MegalDeclaration;
import org.softlang.megal.MegalEntity;
import org.softlang.megal.MegalEntityType;
import org.softlang.megal.MegalFile;
import org.softlang.megal.MegalLink;
import org.softlang.megal.MegalPlugin;
import org.softlang.megal.MegalRelationship;
import org.softlang.megal.MegalRelationshipType;
import org.softlang.megal.language.MegalReasoning;
import org.softlang.megal.language.Megals;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.MegamodelKB;
import org.softlang.megal.mi2.MegamodelResolver;
import org.softlang.megal.mi2.Relationship;

import com.google.common.base.Charsets;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.io.CharSink;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;

public class MP2 {
	public static final File[] ALL_FILES = { new File("megamodel/PreludeOut.megal"), new File("megamodel/JDOM.megal"),
			new File("megamodel/Java.megal"), new File("megamodel/JVM.megal"), new File("megamodel/XML.megal"),
			new File("megamodel/Parts.megal"), new File("megamodel/Mapping.megal"),
			new File("megamodel/Deserialization.megal")

	};

	public static void main(String[] args) throws IOException {
		MegalFile m = Megals.load(ALL_FILES[ALL_FILES.length - 1], ALL_FILES);

		KB kb = MegalReasoning.getKB(m);
		EntityType pe = kb.getEntityType("Plugin");
		for (Entity plugin : pe.getInstances()) {
			System.out.println("Plugin " + plugin.getName());
			for (Relationship rel : plugin.outgoing("partOf"))
				System.out.println("  extends " + rel.getRight().getName());

			for (Relationship rel : plugin.incoming())
				if (!"partOf".equals(rel.getTypeName()))
					System.out.println("  defined by " + rel.getLeft().getName());

		}
		System.out.println();

	}
}
