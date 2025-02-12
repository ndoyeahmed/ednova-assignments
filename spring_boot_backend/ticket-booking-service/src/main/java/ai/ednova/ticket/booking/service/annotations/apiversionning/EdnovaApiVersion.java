package ai.ednova.ticket.booking.service.annotations.apiversionning;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EdnovaApiVersion {
	String value() default "1";
	boolean open() default false;
}
