
package com.myproject;

import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the math problem: ");
        String problem = sc.nextLine();
        // write code to evaluate the problem here
        int result = 0;
        try {
            result = eval(problem);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Result: " + result);
    }

    public static int eval(String problem) throws Exception {
        // write code to evaluate the problem here
        return 0;
    }
}