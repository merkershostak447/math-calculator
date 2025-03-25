import org.javatuples.Pair;

public class MathCalculator {

    public static void main(String[] args) {
        // Example: Addition problem
        System.out.println("Result of 5 + 3 = " + Pair.with(5, 3).get());

        // Example: Subtraction problem
        System.out.println("Result of 10 - 4 = " + Pair.with(10, 4).get());

        // Example: Multiplication problem
        System.out.println("Result of 8 * 6 = " + Pair.with(8, 6).get());

        // Example: Division problem
        if (args.length > 0) {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            if (num2 == 0) {
                System.out.println("Cannot divide by zero.");
                return;
            }

            System.out.println("Result of " + num1 + " / " + num2 + " = " + Pair.with(num1, num2).get());
        } else {
            System.out.println("Please provide two numbers as arguments.");
        }
    }
}
