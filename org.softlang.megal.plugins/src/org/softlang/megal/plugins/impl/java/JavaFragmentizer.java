package org.softlang.megal.plugins.impl.java;

import java.util.ArrayList;
import java.util.Collection;

import org.antlr.v4.runtime.ParserRuleContext;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.api.antlr.ANTLRFragmentizerPlugin;
import org.softlang.megal.plugins.api.antlr.ANTLRParserFactory;
import org.softlang.megal.plugins.api.antlr.ANTLRUtils;
import org.softlang.megal.plugins.api.fragmentation.Fragments;
import org.softlang.megal.plugins.api.fragmentation.Fragments.Fragment;
import org.softlang.megal.plugins.impl.java.antlr.JavaLexer;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.FieldDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.MemberDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.MethodDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.TypeDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.VariableDeclaratorContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.ClassBodyDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.ClassDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParserFactory;

/**
 * Disassembles a Java artifact into its fragments.
 * 
 * @author maxmeffert
 *
 */
public class JavaFragmentizer extends ANTLRFragmentizerPlugin<JavaParser, JavaLexer> {
	
	
	/**
	 * Fragmentation rule for classes
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class ClassRule extends FragmentationRule<TypeDeclarationContext> {

		@Override
		protected Class<TypeDeclarationContext> contextType() {
			return TypeDeclarationContext.class;
		}

		@Override
		protected boolean isAtom(TypeDeclarationContext context) {
			return false;
		}

		@Override
		protected boolean test(TypeDeclarationContext context) {
			return context.classDeclaration() instanceof ClassDeclarationContext;
		}

		@Override
		protected Fragment createFragment(Entity entity, Artifact artifact, TypeDeclarationContext context) {
			// Create a new JavaClass fragment
			return Fragments.create(
					context.classDeclaration().Identifier().getText(),
					"JavaClass", 
					ANTLRUtils.originalText(context),
					entity, 
					artifact
					);
		}
		
	};
	

	// PRODUCES WRONG RESULTS FOR MORE THAN 1 INNER CLASS !!!
	/**
	 * Fragmentation rule for inner classes
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class InnerClassRule extends FragmentationRule<ClassBodyDeclarationContext> {

		@Override
		protected Class<ClassBodyDeclarationContext> contextType() {
			return ClassBodyDeclarationContext.class;
		}

		@Override
		protected boolean isAtom(ClassBodyDeclarationContext context) {
			return false;
		}

		@Override
		protected boolean test(ClassBodyDeclarationContext context) {
			return context.memberDeclaration() instanceof MemberDeclarationContext
					&& context.memberDeclaration().classDeclaration() instanceof ClassDeclarationContext;
		}

		@Override
		protected Fragment createFragment(Entity entity, Artifact artifact, ClassBodyDeclarationContext context) {
			return Fragments.create(
					context.memberDeclaration().classDeclaration().Identifier().getText(),
					"JavaInnerClass", 
					ANTLRUtils.originalText(context),
					entity, 
					artifact
					);
		}
		
	};
	
	/**
	 * Fragmentation rule for methods
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class MethodRule extends FragmentationRule<MethodDeclarationContext> {
		

		@Override
		protected Class<MethodDeclarationContext> contextType() {
			return MethodDeclarationContext.class;
		}

		@Override
		protected boolean isAtom(MethodDeclarationContext context) {
			return true;
		}

		@Override
		protected boolean test(MethodDeclarationContext context) {
			return true;
		}

		@Override
		protected Fragment createFragment(Entity entity, Artifact artifact, MethodDeclarationContext context) {
			return Fragments.create(
					context.Identifier().getText(),
					"JavaMethod", 
					ANTLRUtils.originalText(context),
					entity, 
					artifact
					);
		}

		
		
	};
	
	/**
	 * Fragmentation rule for fields
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class FieldRule extends FragmentationRule<VariableDeclaratorContext> {
		

		@Override
		protected Class<VariableDeclaratorContext> contextType() {
			return VariableDeclaratorContext.class;
		}

		@Override
		protected boolean isAtom(VariableDeclaratorContext context) {
			return true;
		}

		@Override
		protected boolean test(VariableDeclaratorContext context) {
			return context.getParent().getParent() instanceof FieldDeclarationContext;
		}

		@Override
		protected Fragment createFragment(Entity entity, Artifact artifact, VariableDeclaratorContext context) {
			return Fragments.create(
					context.variableDeclaratorId().getText(),
					"JavaField", 
					ANTLRUtils.originalText(context.getParent().getParent()),
					entity, 
					artifact
					);
		}

		
		

		
		
	};
	
	/**
	 * Gets the collection of Java fragmentation rules
	 */
	@Override
	public Collection<FragmentationRule<? extends ParserRuleContext>> getRules() {
		
		Collection<FragmentationRule<? extends ParserRuleContext>> rules = new ArrayList<FragmentationRule<? extends ParserRuleContext>>();
		
		rules.add(new InnerClassRule());
		rules.add(new ClassRule());
		rules.add(new MethodRule());
		rules.add(new FieldRule());
		
		return rules;
		
	}
	
	
	@Override
	public ANTLRParserFactory<JavaParser, JavaLexer> getParserFactory() {
		return new JavaParserFactory();
	}

}
