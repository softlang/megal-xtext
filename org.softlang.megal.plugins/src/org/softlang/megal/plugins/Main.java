package org.softlang.megal.plugins;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.softlang.megal.language.*;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.MegamodelKB;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.api.ModelExecutor;
import org.softlang.megal.mi2.api.resolution.LocalResolution;
import org.softlang.megal.mi2.api.resolution.Resolution;
import org.softlang.megal.plugins.api.fragmentation.Fragments;

@SuppressWarnings("unused")
public class Main {
	
	static final private File root = new File("..");
	static final private Resolution rootResolution = new LocalResolution(){

		@Override
		protected File getRoot() {
			try {
				return root.getCanonicalFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return root;
		}
		
	};
		
	static private String input = "megal/bindings.megal";
	static private String output = "output/out.megal";
	
	static private KB load (File f) throws IOException {
		
		if (f.isDirectory()) {
		
			throw new IllegalStateException("File is a directory!");
			
		}
		
		System.out.println("Loading KB...");
		
		KB kb =  MegamodelKB.loadAll(Megals.load(f, f.getParentFile().listFiles()));
		
		System.out.println("KB loaded.");
		
		return kb;
		
	}
	
	static private KB evaluate (KB kb) throws IOException {
		
		System.out.println("Evaluating KB...");
		
		ModelExecutor ex = new ModelExecutor();
		kb = ex.evaluate(rootResolution, kb).getOutput();
		
		System.out.println("KB evalutated.");
		
		return kb;
		
	}
	
	static private void printTypes (KB kb, PrintStream out) {
		
		out.println();
		
		for (EntityType et :kb.getEntityTypes()) {
			
			out.println(et);
			
		}
		
		out.println();
		
		for (RelationshipType rt : kb.getRelationshipTypes()) {
			
			out.println(rt);	
			
		}
		
	}
	
	static private void printInstances (KB kb, PrintStream out) {
		
		out.println();
		out.println("/*");
		out.println("============================================");
		out.println("   Derived Instances in Alphabetic Order.   ");
		out.println("============================================");
		out.println("*/");
		out.println();
		
		List<Entity> es = kb.getEntities().stream()
				.filter( e -> e.getType() != null && !e.getType().getName().equals("Plugin")  )
//				.sorted( (a,b) -> a.getName().compareToIgnoreCase(b.getName()) )
				.collect(Collectors.toList());
		
		for (Entity e : es) {
			
			for (String name : e.getAnnotations().keys()) {
				
				String value = e.getAnnotation(name);
				
				if (name.equals("FragmentText")) {
					
					value = value.split(System.getProperty("line.separator"),2)[0] + " ...";
				
				}
				
				out.println("@" + name + " '" + value + "'");
				
			}
				
			out.println(e);
			
			for (Relationship rel : kb.getRelationships().stream().filter( r -> r.getLeft().equals(e)).collect(Collectors.toList())) {
				
				out.println(rel);
				
			}
			
			
			
			
			
			if (e.getBinding() != null) {
				out.println(e.getName() + " = '" + e.getBinding() + "'");
			}
			
			
			
			
			out.println();
			
		}
		
//		List<Relationship> rels = kb.getRelationships().stream()
//				.filter( r -> !r.getLeft().getType().getName().equals("Plugin")  )
//				.sorted( (a,b) -> a.getLeft().getName().compareToIgnoreCase(b.getLeft().getName()) )
//				.collect(Collectors.toList());
//		
//		for (Relationship rel : rels) {
//			
//			out.println(rel);
//			
//		}
		
	}
		
	public static void main(String[] args) throws IOException {
		
		System.out.println("Start.");
		
		KB kb = evaluate(load(new File(input)));
		
		printInstances(kb, System.out);
		
		PrintStream out = new PrintStream(new FileOutputStream(output));
//		printTypes(kb,out);
		printInstances(kb,out);
		out.close();
		
		
	}

}
