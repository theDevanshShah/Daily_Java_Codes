package com.PATTERNS_IN_JAVA;

import java.util.Scanner;

public class All_Practice_Patterns {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("All_Practice_Patterns");
        pattern_1_solid_cube();
        pattern_2_hollow_cube();
        pattern_3_left_triangle();
        pattern_4_left_triangle_180_rotated();
        pattern_5_right_triangle();
        pattern_6_right_triangle_180_rotated();
        pattern_7_number_triangle_simple();
        pattern_8_number_triangle_rotated_180();
        pattern_9_number_triangle_floyds();
        pattern_10_number_triangle_binary();
        pattern_11_Full_Triangle();
        pattern_12_Reverse_Pyramid();
        pattern_13_Diamond();
    }

    static void pattern_1_solid_cube() {
        System.out.println("Pattern 1 : Solid Cube");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer Loop
        for (int i = 1; i <= n; i++) {
            //Inner Loop
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern_2_hollow_cube() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 2 : Hollow Cube");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer Loop
        for (int i = 1; i <= n; i++) {
            //Inner Loop
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    static void pattern_3_left_triangle() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 3 : Left Triangle");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer Loop
        for (int i = 1; i <= n; i++) {
            //Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern_4_left_triangle_180_rotated() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 4 : Left Triangle 180 Rotate");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer Loop
        for (int i = n; i >= 1; i--) {
            //Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
    }

    static void pattern_5_right_triangle() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 5 : Right Triangle");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer Loop
        for (int i = 0; i < n; i++) {
            //Inner Loop For Spaces
            for (int s = 0; s < i; s++) {
                System.out.print("   ");
            }
            //Inner Loop For Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern_6_right_triangle_180_rotated() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 6 : Right Triangle 180 Rotated");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer Loop
        for (int i = n; i >= 0; i--) {
            //Inner Loop For Spaces
            for (int s = 0; s < i; s++) {
                System.out.print("   ");
            }
            //Inner Loop For Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern_7_number_triangle_simple() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 7 : Number Triangle Simple");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer Loop
        for (int i = 1; i <= n; i++) {
            //Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }

    static void pattern_8_number_triangle_rotated_180() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 8 : Number Triangle 180 Rotation");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer Loop
        for (int i = n; i >= 1; i--) {
            //Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }

    static void pattern_9_number_triangle_floyds() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 9 : Number Triangle FLOYD's Pattern");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;


        //Outer Loop
        for (int i = 1; i <= n; i++) {

            //Inner Loop
            for (int j = 1; j <= i; j++) {

                System.out.print(" " + number + " ");
                number += 1;
            }
            System.out.println();
        }
    }

    static void pattern_10_number_triangle_binary() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 10 : Number Triangle Binary Pattern");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        //Outer Loop
        for (int i = 1; i <= n; i++) {
            //Inner Loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                // Condition
                if (sum % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    static void pattern_11_Full_Triangle() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 11 : Pyramid");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            // Print spaces before each row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }

    static void pattern_12_Reverse_Pyramid() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 12 : Reverse Pyramid");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);


        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) {
            // Print spaces before each row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }


    static void pattern_13_Diamond() {
        System.out.println();
        System.out.println();
        System.out.println("Pattern 13 : Diamond");
        System.out.print("Enter The N : ");
        Scanner sc = new Scanner(System.in);


        //First Loop
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            // Print spaces before each row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
        int rows2 = rows - 1;
        //Second Loop
        for (int i = rows2; i >= 1; i--) {
            // Print spaces before each row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }

    }
}


