import java.lang.Math;

public class MathCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers:");
        double num1 = readDouble();
        double num2 = readDouble();

        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
    }

    private static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
