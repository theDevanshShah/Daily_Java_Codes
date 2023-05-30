package com.PATTERNS_IN_JAVA;

import java.util.Scanner;

public class Binary_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                int sum = j + i;
                //Condition
                if (sum % 2 != 0) {
                    System.out.print(" " + 0 + " ");
                } else {
                    System.out.print(" " + 1 + " ");
                }

            }
            System.out.println(" ");
        }
    }
}
