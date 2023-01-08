package exercise_3;

import java.lang.annotation.*;

/**
 * Non-inherited
 */

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ThirdInstruction {
    String HasName() default "Jack";
}
