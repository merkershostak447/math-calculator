public class MathCalculator {
    public static void main(String[] args) {
        double result = performCalculation(5, 3);
        System.out.println("The result is: " + result);
    }

    private static double performCalculation(double a, double b) {
        return a + b;
    }
}
