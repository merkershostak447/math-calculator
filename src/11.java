import java.util.*;
public class MathCalculator {
    public static void main(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a math problem: ");
        String problem = scanner.nextLine();
        
        // Evaluate the problem using a math evaluator library
        MathEvaluator evaluator = new MathEvaluator();
        try {
            double result = evaluator.evaluate(problem);
            System.out.println("Result: " + result);
        } catch (MathException e) {
            System.out.println("Invalid math problem");
        }
    }
}
