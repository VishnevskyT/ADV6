package exercise_2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface AnnoParams {
    /**
     * Перший операнд
     * @return double
     */

    double operand1() default 0;

    /**
     * Другий операнд
     * @return double
     */
    double operand2() default 0;

}
