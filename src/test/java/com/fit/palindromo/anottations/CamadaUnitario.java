package com.fit.palindromo.anottations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;

/**
 * Anotação para classificar um teste relacionada a camada de unitário
 * 
 * @author caiobastos
 *
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Tag("unitario")
public @interface CamadaUnitario {

}
