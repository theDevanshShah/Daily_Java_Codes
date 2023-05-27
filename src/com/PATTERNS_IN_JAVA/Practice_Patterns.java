package com.PATTERNS_IN_JAVA;

import java.util.*;

public class Practice_Patterns {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //pattern1(4);
        //pattern2(5);
        pattern3(10, 20);
    }

    // For Triangle Pattern
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }

    // For Reverse Triangle Pattern
    static void pattern2(int m) {
        for (int row = 1; row <= m; row++) {
            for (int col = row; col >= m; col--) {
                System.out.println("*");
            }
        }
    }


    // For Hollow Rectangle Pattern
    static void pattern3(int n, int m) {
        //Outer Loop
        for (int row = 1; row <= n; row++) {

            // Inner Loop
            for (int col = 1; col <= m; col++) {

                //Condition
                if (row == 1 || col == 1 || row == n || col == m) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }

}
