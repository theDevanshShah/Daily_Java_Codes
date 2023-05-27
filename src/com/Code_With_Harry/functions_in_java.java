package com.Code_With_Harry;

import java.util.Scanner;

public class functions_in_java {
    public static double factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid Number");
            return 0;
        }

        double factorial = 1;
        for (double i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        double factorial = (factorial());
        System.out.println("Factorial Of Given Number Is : " + factorial);
    }
}
