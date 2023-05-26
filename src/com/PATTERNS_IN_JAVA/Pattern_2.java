package com.PATTERNS_IN_JAVA;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {

        // Hollow RECTANGLE  Done by Nested Loops (Loop with in loop)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
