package com.PATTERNS_IN_JAVA;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {

        // SOLID RECTANGLE  Done by Nested Loops (Loop with in loop)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
