public class MathCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression to calculate");
        String input = sc.nextLine();
        try {
            double result = eval(input);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Invalid expression");
        }
    }

    public static double eval(String expr) throws Exception {
        return new MathExpressionParser().parse(expr).evaluate();
    }
}
