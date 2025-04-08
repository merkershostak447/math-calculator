public class MathCalculator {
    public static void main(String[] args) {
        // Example usage: addition of two numbers
        int result = add(5, 3);
        System.out.println("The sum is: " + result);

        // Example usage: subtraction of two numbers
        int difference = subtract(8, 4);
        System.out.println("The difference is: " + difference);

        // Example usage: multiplication of two numbers
        double product = multiply(6, 7);
        System.out.println("The product is: " + product);

        // Example usage: division of two numbers
        int quotient = divide(12, 3);
        System.out.println("The quotient is: " + quotient);

        // Example usage: exponentiation with a base and an exponent
        double power = exponentiate(4, 3);
        System.out.println("The result is: " + power);

        // Example usage: factorial of a number
        int factorial = calculateFactorial(5);
        System.out.println("The factorial is: " + factorial);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static double multiply(int a, int b) {
        return a * b;
    }

    private static double divide(double a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero is not allowed.");
        return a / b;
    }

    private static int exponentiate(int base, int exponent) {
        if (exponent < 0) return 1 / Math.pow(base, -exponent);
        double result = base;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return (int) result;
    }

    private static int calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        else return (int) Math.pow(n, n);
    }
}
