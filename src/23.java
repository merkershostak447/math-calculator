public class MathCalculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Error: Division by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(1.5, 2.5)); // Outputs: 4.0
        System.out.println(subtract(3.5, 2.5)); // Outputs: 1.0
        System.out.println(multiply(4.5, 2.5)); // Outputs: 11.25
    }
}
