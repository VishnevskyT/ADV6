package exercise_3;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface ForthInstruction {
    int id() default 0;
    String name() default "N/A";

    int age () default 0;

}
