
public class MathCalculator {
    public static int calculate(int num1, int num2, String operation) {
        if (operation.equals("+")) {
            return num1 + num2;
        } else if (operation.equals("-")) {
            return num1 - num2;
        } else if (operation.equals("*")) {
            return num1 * num2;
        } else if (operation.equals("/")) {
            return num1 / num2;
        }
        throw new IllegalArgumentException("Unsupported operation");
    }
}