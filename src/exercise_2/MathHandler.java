package exercise_2;


public class MathHandler {

    /**
     * Пустий конструктор
     */
    public MathHandler() {
    }

    /**
     *  Метод реалізації додавання, який приймає, як аргументи, параметри анотації.
     * @return результат додавання двох операндів
     */
    @AnnoParams(operand1 = 3.1, operand2 = 1.3)
    public double sum (double operand1, double operand2) {
        return operand1 + operand2;
    }

    /**
     *  Метод реалізації віднімання, який приймає, як аргументи, параметри анотації.
     * @return результат віднімання двох операндів
     */
    @AnnoParams(operand1 = 11.6, operand2 = 6.1)
    public double sub (double operand1, double operand2) {
        return operand1 - operand2;
    }

    /**
     *  Метод реалізації множення, який приймає, як аргументи, параметри анотації.
     * @return результат множення двох операндів
     */
    @AnnoParams(operand1 = 2, operand2 = 3.3)
    public double mul (double operand1, double operand2) {
        return operand1 * operand2;
    }

    /**
     *  Метод реалізації ділення, який приймає, як аргументи, параметри анотації.
     * @return результат ділення двох операндів
     */
    @AnnoParams(operand1 = 23.1, operand2 = 3)
    public double div (double operand1, double operand2) {
        return operand1 / operand2;
    }

}
