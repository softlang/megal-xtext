package org.softlang.megal.language.validation;

import static org.softlang.megal.MegalPackage.Literals.MEGAL_FUNCTION_APPLICATION__FUNCTION;
import static org.softlang.megal.MegalPackage.Literals.MEGAL_FUNCTION_APPLICATION__INPUT;
import static org.softlang.megal.MegalPackage.Literals.MEGAL_FUNCTION_APPLICATION__OUTPUT;
import static org.softlang.megal.MegalPackage.Literals.MEGAL_NAMED__NAME;
import static org.softlang.megal.MegalPackage.Literals.MEGAL_RELATIONSHIP__TYPE;

import java.util.Map.Entry;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.softlang.megal.MegalElement;
import org.softlang.megal.MegalEntity;
import org.softlang.megal.MegalFile;
import org.softlang.megal.MegalFunctionApplication;
import org.softlang.megal.MegalRelationship;
import org.softlang.megal.language.MegalReasoning;
import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.MegamodelKB;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.api.ModelExecutor;
import org.softlang.megal.mi2.api.Result;
import org.softlang.megal.mi2.api.resolution.ContainingProjectResolution;
import org.softlang.megal.mi2.api.resolution.Resolution;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

public class ModelExecutingValidation extends AbstractMegalValidator {
	private static final String IS_INVALID = "IsInvalid";

	@Check
	public void validateModel(final MegalFile megamodel) {
		// Make the default executor
		ModelExecutor executor = new ModelExecutor();

		// Male resolution and get the input
		Resolution resolution = new ContainingProjectResolution(megamodel);
		KB model = MegalReasoning.getKB(megamodel);

		// Perform the evaluation
		final Result result = executor.evaluate(resolution, model);

		// Marker class with scopeF
		class Marking {

			Multimap<MegalElement, EStructuralFeature> getLocations(Element element) {
				// Male a builder initializing the locations
				ImmutableMultimap.Builder<MegalElement, EStructuralFeature> builder = ImmutableMultimap.builder();

				if (element instanceof Entity) {
					// If the element is an entity
					Entity entity = (Entity) element;

					// Get the direct and the generated pair entities
					MegalEntity direct = MegamodelKB.resolve(false, megamodel, entity);
					MegalFunctionApplication pair = MegamodelKB.resolvePair(false, megamodel, entity);

					// If direct exists, add
					if (direct != null)
						builder.put(direct, MEGAL_NAMED__NAME);

					// If generated pair exists, add
					if (pair != null) {
						builder.put(pair, MEGAL_FUNCTION_APPLICATION__INPUT);
						builder.put(pair, MEGAL_FUNCTION_APPLICATION__OUTPUT);
					}

				} else if (element instanceof Relationship) {
					Relationship relationship = (Relationship) element;

					// Get the direct and all generated relationships
					MegalRelationship direct = MegamodelKB.resolve(false, megamodel, relationship);
					MegalFunctionApplication firstOf = MegamodelKB.resolveFirst(false, megamodel, relationship);
					MegalFunctionApplication secondOf = MegamodelKB.resolveSecond(false, megamodel, relationship);
					MegalFunctionApplication elementOf = MegamodelKB.resolveElement(false, megamodel, relationship);

					// If direct exists, add
					if (direct != null)
						builder.put(direct, MEGAL_RELATIONSHIP__TYPE);

					// If first of exists, add
					if (firstOf != null)
						builder.put(firstOf, MEGAL_FUNCTION_APPLICATION__INPUT);

					// If second of exists, add
					if (secondOf != null)
						builder.put(secondOf, MEGAL_FUNCTION_APPLICATION__OUTPUT);

					// If element of exists, add
					if (elementOf != null)
						builder.put(elementOf, MEGAL_FUNCTION_APPLICATION__FUNCTION);
				}

				// Build the result
				return builder.build();
			}

			boolean shouldOutput(Element element, boolean isNotConsidered) {
				// TODO Better rules for this

				// Local or top level
				if (element.hasAnnotation("Suppress"))
					return false;
				if (element.getKB().hasAnnotation("Suppress"))
					return false;

				if (isNotConsidered) {
					// Local or top level untyped not considered
					if (element.hasAnnotation("Suppress", "notConsidered"))
						return false;
					if (element.getKB().hasAnnotation("Suppress", "notConsidered"))
						return false;

					// Top level typed not considered
					if (element instanceof EntityType
							&& element.getKB().hasAnnotation("Suppress", "entityTypeNotConsidered"))
						return false;
					else if (element instanceof RelationshipType
							&& element.getKB().hasAnnotation("Suppress", "relationshipTypeNotConsidered"))
						return false;
					else if (element instanceof Entity
							&& element.getKB().hasAnnotation("Suppress", "entityNotConsidered"))
						return false;
					else if (element instanceof Relationship
							&& element.getKB().hasAnnotation("Suppress", "relationshipNotConsidered"))
						return false;
				}

				return true;
			}

			void infoOnLocations(Element element, String text) {
				if (shouldOutput(element, false))
					for (Entry<MegalElement, EStructuralFeature> location : getLocations(element).entries())
						info(text, location.getKey(), location.getValue());
			}

			void warningOnLocations(Element element, String text) {
				if (shouldOutput(element, false))
					for (Entry<MegalElement, EStructuralFeature> location : getLocations(element).entries())
						warning(text, location.getKey(), location.getValue());
			}

			void errorOnLocations(Element element, String text) {
				if (shouldOutput(element, false))
					for (Entry<MegalElement, EStructuralFeature> location : getLocations(element).entries())
						error(text, location.getKey(), location.getValue());
			}

			void notConsideredOnLocations(Element element, String text) {
				if (shouldOutput(element, true))
					for (Entry<MegalElement, EStructuralFeature> location : getLocations(element).entries())
						warning(text, location.getKey(), location.getValue());
			}

			void execute() {
				// Mark errors for valid items that are supposed to be invalid
				for (Element element : result.getValid())
					if (element.hasAnnotation(IS_INVALID))
						errorOnLocations(element, createExpectedInvalidText(element));

				// Annotate all infos
				for (Entry<Element, String> message : result.getInfos().entries())
					infoOnLocations(message.getKey(), message.getValue());

				// Annotate all warnings
				for (Entry<Element, String> message : result.getWarnings(false).entries())
					// If expected invalid, output an information, else create warning
					if (message.getKey().hasAnnotation(IS_INVALID))
						infoOnLocations(message.getKey(), createAsExpectedWarning(message.getValue()));
					else
						warningOnLocations(message.getKey(), message.getValue());

				// Annotate all errors
				for (Entry<Element, String> message : result.getErrors(false).entries())
					// If expected invalid, output an information, else create error
					if (message.getKey().hasAnnotation(IS_INVALID))
						infoOnLocations(message.getKey(), createAsExpectedError(message.getValue()));
					else
						errorOnLocations(message.getKey(), message.getValue());

				// Annotate all the items that are not considered by evaluation
				for (Element notConsidered : result.notVisited())
					notConsideredOnLocations(notConsidered, createNotConsidered(notConsidered));
			}

		}

		new Marking().execute();
	}

	protected String createNotConsidered(Element notConsidered) {
		return "Element \"" + notConsidered + "\" was not considered";
	}

	protected String createAsExpectedError(String message) {
		return "Failed as expected with error \"" + message + "\"";
	}

	protected String createAsExpectedWarning(String message) {
		return "Failed as expected with warning \"" + message + "\"";
	}

	protected String createExpectedInvalidText(Element element) {
		return "The element \"" + element + "\" is valid, although it was expected to be invalid.";
	}
}
