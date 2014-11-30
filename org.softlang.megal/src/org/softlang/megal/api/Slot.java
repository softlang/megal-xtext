package org.softlang.megal.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * Marks a field to be a slot for the {@link ModelAPI}
 * </p>
 * 
 * @author Pazuzu
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Slot {
	boolean mandatory() default true;
}
