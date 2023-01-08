package exercise_2;

import java.lang.reflect.Method;

/**
 * Завдання 2
 *   Написати калькулятор з використанням анотацій, анотація передає 2 параметри.
 *   Зробити повну документацію всіх полів, методів, конструкторів класу використовуючи інструкцію Documented,
 *   або документаційні коментарі.

 * @author Vishnevsky
 * @since January 2023
 * @version 1.0.beta
 */

public class Main {

    public static void main(String[] args) {
        /**
         * Створення екземпляра класу {@link MathHandler}
         */
        MathHandler mathHandler = new MathHandler();

        /**
         * За допомогою Reflection звертаємося до класу {@link MathHandler}
         */

        Class<?> cl = MathHandler.class;

        try {
             /**
              * Створюємо екземпляри методів класу MathHandler
              */
            Method sum = cl.getMethod("sum", double.class, double.class);
            Method sub = cl.getMethod("sub", double.class, double.class);
            Method mul = cl.getMethod("mul", double.class, double.class);
            Method div = cl.getMethod("div", double.class, double.class);

             /**
              * Створюємо екземпляри анотації AnnoParams
              * @param AnnoParams.class
              */
            AnnoParams annoParams1 = sum.getAnnotation(AnnoParams.class);
            AnnoParams annoParams2 = sub.getAnnotation(AnnoParams.class);
            AnnoParams annoParams3 = mul.getAnnotation(AnnoParams.class);
            AnnoParams annoParams4 = div.getAnnotation(AnnoParams.class);

             /**
              * Отримуємо результати методів sum, sub, mul, div класу MathHandler
              * @return double
              */

             System.out.println("Результат додавання двох операндів: " + mathHandler.sum(annoParams1.operand1(),annoParams1.operand2()));
             System.out.println("Результат віднімання двох операндів: " + mathHandler.sub(annoParams2.operand1(),annoParams2.operand2()));
             System.out.println("Результат множення двох операндів: " + mathHandler.mul(annoParams3.operand1(),annoParams3.operand2()));
             System.out.println("Результат ділення двох операндів: " + mathHandler.div(annoParams4.operand1(),annoParams4.operand2()));

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
