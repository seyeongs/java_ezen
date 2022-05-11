package javaClass;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RUNTIME)
public @interface PrintAnotation {
	String value() default "#"; //스트링 값을 전달 받을 건데 없으면 #
	int number() default 20;
}
