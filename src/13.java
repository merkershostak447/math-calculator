
public class MathCalculator {
    public int calculate(int num1, int num2, String operator) {
        if (operator.equals("+")) {
            return num1 + num2;
        } else if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("*")) {
            return num1 * num2;
        } else if (operator.equals("/")) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Unsupported operator");
        }
    }
}