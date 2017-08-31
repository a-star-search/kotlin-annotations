/**
 * 
 */
package com.moduleforge.libraries.kotlinannotations;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(SOURCE)
@Target({ TYPE, METHOD, CONSTRUCTOR })
/**
 * Use in Kotlin code for documentation purposes. 
 * 
 * Whenever a Kotlin class or method is intended to be accesible at package level only.
 *
 */
public @interface PackagePrivate {

}
