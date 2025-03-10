import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
// Taking input from user
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number: ");
int num1 = sc.nextInt();
System.out.println("Enter the second number: ");
int num2 = sc.nextInt();
// Adding the two numbers
int sum = num1 + num2;
System.out.println("Sum is: " + sum);
}
}