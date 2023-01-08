package exercise_3;

/**
 * Завдання 3
 * Створіть кілька класів, один клас успадковує інший і використовує інструкцію Inherited.
 * Крім цього, спробуйте ще в проекті використовувати 5 різних інструкцій.
 * @author Vishnevsky
 * @since Jan, 2023
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        String s = (char) 27 + "[93m";
        String s1 = (char) 27 + "[94m";
        String s2 = (char) 27 + "[95m";

    ThirdClass thirdClass = new ThirdClass();
    Class<?> cl = thirdClass.getClass();
        Annotation[] annotations = cl.getAnnotations();

        System.out.println(s + "Клас " + s1 + cl.getSimpleName() + s + " містить наступні анотації:");

        for (Annotation annotation : annotations) {
            System.out.println(s2 + "\t\t" + annotation);
        }

        Field[] fields = cl.getDeclaredFields();
        System.out.println(s + "Поля класу містять наступні анотації:");
        for (Field field : fields) {
            Annotation[] fieldAnnotations = field.getAnnotations();
            if (fieldAnnotations.length > 0) {
                System.out.println(s1 + "\tполе " + field.getName());
            }
            for (Annotation annotation : fieldAnnotations) {
                System.out.println(s2 + "\t\t" + annotation);
            }
        }

        Method[] methods = cl.getMethods();
        System.out.println(s + "Методи класу містять наступні анотації:");
        for (Method method : methods) {
            Annotation[] methodAnnotations = method.getAnnotations();
            if (methodAnnotations.length > 0) {
                System.out.println(s1 + "\tметод " + method.getName() + "()");
            }
            for (Annotation annotation : methodAnnotations) {
                System.out.println(s2 + "\t\t" + annotation.toString());
            }
        }

        Constructor<?>[] constructors = cl.getDeclaredConstructors();
        System.out.println(s + "Конструктори класу містять наступні анотації:");
        for (Constructor<?> constructor : constructors) {
            Annotation[] constructorAnnotations = constructor.getDeclaredAnnotations();
            if (constructorAnnotations.length > 0) {
                System.out.println(s1 + "\tконструктор " + constructor.getName() + "()");
            }
            for (Annotation annotation : constructorAnnotations) {
                System.out.println(s2 + "\t\t" + annotation);
            }
        }


    }
}
