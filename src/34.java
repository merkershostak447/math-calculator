import com.alibaba.fastjson.JSON;

public class MathCalculator {

    // Define a method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Define a method to perform division with remainder
    public static int divideWithRemainder(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }

    // Main function to test the methods
    public static void main(String[] args) {
        try {
            double length = 4.5;
            double width = 3.2;

            System.out.println("Area of rectangle: " + calculateArea(length, width));
            int result = divideWithRemainder(10, 3);
            System.out.println("Divide with remainder: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
