import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + calculate(num1, num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + calculate(num1, num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + calculate(num1, num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + calculate(num1, num2));
                break;
        }
    }

    private static double calculate(double a, double b) {
        return (a * b);
    }
}
