package exercise_3;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
public @interface FifthInstruction {
    int id() default 0;
    String name() default "N/A";
    int age() default 0;
}
