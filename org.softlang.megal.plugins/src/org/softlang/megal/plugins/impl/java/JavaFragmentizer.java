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
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.InterfaceDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.MemberDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.MethodDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.PackageDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.TypeDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.VariableDeclaratorContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.ClassBodyDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.ClassDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.CompilationUnitContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.ConstructorDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParserFactory;

/**
 * Disassembles a Java artifact into its fragments.
 * 
 * @author maxmeffert
 *
 */
public class JavaFragmentizer extends ANTLRFragmentizerPlugin<JavaParser, JavaLexer> {
	
	static final private String FRAGMENTTYPE_PACKAGE = "JavaPackage";
	static final private String FRAGMENTTYPE_CLASS = "JavaClass";
	static final private String FRAGMENTTYPE_INTERFACE = "JavaInterface";
	static final private String FRAGMENTTYPE_ENUM = "JavaEnum";
	static final private String FRAGMENTTYPE_FIELD = "JavaField";
	static final private String FRAGMENTTYPE_METHOD = "JavaMethod";
	static final private String FRAGMENTTYPE_CONSTRUCTOR = "JavaConstructor";
	
	static private class PackageRule extends FragmentationRule<CompilationUnitContext> {

		@Override
		protected Class<CompilationUnitContext> contextType() {
			return CompilationUnitContext.class;
		}

		@Override
		protected boolean isAtom(CompilationUnitContext context) {
			return false;
		}

		@Override
		protected boolean test(CompilationUnitContext context) {
			return context.packageDeclaration() instanceof PackageDeclarationContext;
		}

		@Override
		protected Fragment createFragment(Entity entity, Artifact artifact, CompilationUnitContext context) {
			
			return Fragments.create(
					context.packageDeclaration().qualifiedName().getText(), 
					FRAGMENTTYPE_PACKAGE, 
					ANTLRUtils.originalText(context), 
					entity, 
					artifact
					);
			
		}

		
		
	}
	
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
					FRAGMENTTYPE_CLASS, 
					ANTLRUtils.originalText(context),
					entity, 
					artifact
					);
		}
		
	};
	
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
					FRAGMENTTYPE_CLASS, 
					ANTLRUtils.originalText(context),
					entity, 
					artifact
					);
		}
		
	};
	
	static private class InterfaceRule extends FragmentationRule<TypeDeclarationContext> {

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
			return context.interfaceDeclaration() instanceof InterfaceDeclarationContext;
		}

		@Override
		protected Fragment createFragment(Entity entity, Artifact artifact, TypeDeclarationContext context) {
			// Create a new JavaClass fragment
			return Fragments.create(
					context.interfaceDeclaration().Identifier().getText(),
					FRAGMENTTYPE_INTERFACE, 
					ANTLRUtils.originalText(context),
					entity, 
					artifact
					);
		}
		
	};
	
	static private class InnerInterfaceRule extends FragmentationRule<ClassBodyDeclarationContext> {

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
					&& context.memberDeclaration().interfaceDeclaration() instanceof InterfaceDeclarationContext;
		}

		@Override
		protected Fragment createFragment(Entity entity, Artifact artifact, ClassBodyDeclarationContext context) {
			return Fragments.create(
					context.memberDeclaration().interfaceDeclaration().Identifier().getText(),
					FRAGMENTTYPE_INTERFACE, 
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
					FRAGMENTTYPE_METHOD, 
					ANTLRUtils.originalText(context),
					entity, 
					artifact
					);
		}

		
		
	};
	
	static private class ConstructorRule extends FragmentationRule<ConstructorDeclarationContext> {

		@Override
		protected Class<ConstructorDeclarationContext> contextType() {
			return ConstructorDeclarationContext.class;
		}

		@Override
		protected boolean isAtom(ConstructorDeclarationContext context) {
			return true;
		}

		@Override
		protected boolean test(ConstructorDeclarationContext context) {
			return true;
		}

		@Override
		protected Fragment createFragment(Entity entity, Artifact artifact, ConstructorDeclarationContext context) {
			return Fragments.create(
					context.Identifier().getText(),
					FRAGMENTTYPE_CONSTRUCTOR, 
					ANTLRUtils.originalText(context),
					entity, 
					artifact
					);
		}
		
	}
	
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
					FRAGMENTTYPE_FIELD, 
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
		
		rules.add(new PackageRule());
		rules.add(new InnerClassRule());
		rules.add(new ClassRule());
		rules.add(new InterfaceRule());
		rules.add(new InnerInterfaceRule());
		rules.add(new FieldRule());
		rules.add(new MethodRule());
		rules.add(new ConstructorRule());
		
		return rules;
		
	}
	
	
	@Override
	public ANTLRParserFactory<JavaParser, JavaLexer> getParserFactory() {
		return new JavaParserFactory();
	}

}
