package exercise_4;

import java.lang.reflect.Method;

/**
 * Завдання 4
 * Створити свою інструкцію, яка міститиме параметри для методу, виконати додавання 2-х чисел.
 * Math(num1 = 100, num2 = 200)
 * public void mathSum(int num1, int num2)
 * @author Vishnevsky
 * @since Jan, 2023
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Class<?> cl = main.getClass();
        try {
            Method method = cl.getMethod("mathSum", int.class, int.class);
            Math math = method.getAnnotation(Math.class);
            main.mathSum(math.num1(),math.num2());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }
@Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {
        System.out.println("Результат додавання двох чисел: " + (num1 + num2));
    System.out.println("П.С.\nСаме стільки, за легендою, жило колись в одному селі трактористів.");
    }
}
