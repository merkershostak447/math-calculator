import java.util.Random;

public class MathCalculator {
  private static final Random RANDOM = new Random();

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }

  public static void main(String[] args) {
    MathCalculator calculator = new MathCalculator();
    System.out.println("The result of the addition is: " + calculator.add(10, 5));
    System.out.println("The result of the subtraction is: " + calculator.subtract(10, 5));
    System.out.println("The result of the multiplication is: " + calculator.multiply(10, 5));
    System.out.println("The result of the division is: " + calculator.divide(10, 5));
  }
}
