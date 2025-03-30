import java.util.*;

class MathCalculator {
    static int sum(int a, int b) {
        return a + b;
    }

    static double subtract(double x, double y) {
        return x - y;
    }

    static void multiply(int a, int b, double result) {
        result = a * b;
    }

    static boolean checkIntegers(ArrayList<Double> numbers) {
        for (Double num : numbers) {
            if (!num.matches("\\d+\\.\\d*")) {
                return false;
            }
        }
        return true;
    }
}
