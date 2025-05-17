public class MathCalculator {

    private double result = 0;

    public MathCalculator() {
        // Initialize the variable to store the result of the calculation
    }

    public void add(double num1, double num2) {
        // Add two numbers and update the result variable
        result = num1 + num2;
    }

    public void subtract(double num1, double num2) {
        // Subtract the second number from the first one and update the result variable
        result = num1 - num2;
    }

    public void multiply(double num1, double num2) {
        // Multiply two numbers and update the result variable
        result = num1 * num2;
    }

    public void divide(double num1, double num2) {
        // Divide one number by another and update the result variable
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        MathCalculator calculator = new MathCalculator();
        // Perform calculations
        System.out.println(calculator.add(5, 3)); // Output: 8.0
        System.out.println(calculator.subtract(10, 4)); // Output: -6.0
        System.out.println(calculator.multiply(2, 3)); // Output: 6.0
        calculator.divide(8, 2); // Output: 4.0

        // Display the result of the addition and subtraction
        double sum = calculator.add(5, 3);
        double difference = calculator.subtract(10, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
