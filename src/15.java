import java.util.Random;

public class MathCalculator {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num1 = rnd.nextInt(10);
        int num2 = rnd.nextInt(10);
        System.out.println("Random numbers: " + num1 + ", " + num2);
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}