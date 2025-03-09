public class MathCalculator {
    public static double add(double x, double y) {
        return x + y;
    }
    
    public static double subtract(double x, double y) {
        return x - y;
    }
    
    public static double multiply(double x, double y) {
        return x * y;
    }
    
    public static double divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return x / y;
    }
}
