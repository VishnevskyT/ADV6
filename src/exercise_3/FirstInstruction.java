package exercise_3;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstInstruction {
    String name() default "Jack";
    int age() default 22;

}
