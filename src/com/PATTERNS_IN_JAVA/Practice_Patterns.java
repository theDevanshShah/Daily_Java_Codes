package com.PATTERNS_IN_JAVA;

import java.util.Scanner;

public class Practice_Patterns {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        pattern1(4);
        System.out.println("________________________________________________________________________");
        pattern2(5);
        System.out.println("________________________________________________________________________");
        pattern3(10, 20);
        System.out.println("________________________________________________________________________");
        pattern4(5);
        System.out.println("________________________________________________________________________");
        pattern5(5);
        System.out.println("________________________________________________________________________");
        pattern6(10);
        System.out.println("________________________________________________________________________");
        pattern7(10);
        System.out.println("________________________________________________________________________");
        pattern8(10);
        System.out.println("________________________________________________________________________");
        printPattern(10);
    }

    // For Triangle Pattern
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }

    // For Filled Rectangle
    static void pattern2(int m) {
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= m; col++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
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


    //Pattern 4 --> Reverse Triangle
    static void pattern4(int n) {
        //Outer Loop
        for (int row = n; row >= 1; row--) {

            // Inner Loop
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }


    //Pattern 4 --> Reverse Triangle Also Can Be Done Like This
    static void pattern5(int n) {
        //Outer Loop
        for (int row = 1; row <= n; row++) {

            // Inner Loop
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }

    // For Numeric Triangle Pattern
    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col + " ");
            }
            System.out.println();
        }


    }

    // For merging of Triangle and Reverse Triangle
    static void pattern7(int n) {
        // There must be two nested loops
        //First Outer Loop
        for (int row = 1; row <= n; row++) {
            // First Inner Loop
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        //Second Outer Loop
        for (int row = n; row >= 1; row--) {
            // First Inner Loop
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    // Pattern 8
    public static void pattern8(int n) {
        // Outer Loop
        int space;
        for (int row = n; row >= 1; row--) {
            for (space = n - row; space <= n; space++) {
                System.out.print(" ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public static void printPattern(int n) {
        int i, j;

        // outer loop to handle rows
        for (i = n; i >= 1; i--) {

            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (j = 0; j <= n - i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }

}
