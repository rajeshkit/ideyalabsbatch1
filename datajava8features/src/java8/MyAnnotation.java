package java8;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.PARAMETER})

public @interface MyAnnotation {
    int total=4567;
    String value();
    int size();

}
