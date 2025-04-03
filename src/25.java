import java.util.Random;

public class MathCalculator {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(20);
        int num2 = random.nextInt(20);
        double result = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
