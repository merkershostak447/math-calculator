import java.util.*;

class MathCalculator {
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
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        if (num1 == 0 && num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
            System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
            System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
        }
    }
}
