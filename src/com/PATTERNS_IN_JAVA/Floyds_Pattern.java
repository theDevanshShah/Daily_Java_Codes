package com.PATTERNS_IN_JAVA;

import java.util.Scanner;

public class Floyds_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + number + " ");
                number++;
            }
            System.out.println();
        }

    }
}
