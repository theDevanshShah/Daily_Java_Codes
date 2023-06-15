package com.Arrays_in_Java;

import java.util.Arrays;
import java.util.Scanner;

public class All_in_One {

    // Basic 1D Array
    // Basic 2D Array
    // Sum Of Floats
    // Linear Search
    // Array Reversal
    // Average Of Array
    // Matrix Sum

    public static void main(String[] args) {
        //The_1D_Array_population();
        The_2D_Array_population();

    }

    public static void The_1D_Array_population() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length Of Array : ");
        int length = sc.nextInt();
        int[] Elements = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter The Element On Index " + i + " here : ");
            Elements[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(Elements));
    }

    public static void The_2D_Array_population() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter The Rows Of Array : ");
        int rows = sc.nextInt();
        System.out.print("Enter The Cols Of Array : ");
        int cols = sc.nextInt();
        int[][] Elements = new int[rows][cols];


        for (int i = 0; i < Elements.length; i++) {
            for (int j = 0; j < Elements[i].length; j++) {
                Elements[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(Elements));

        for (int i = 0; i < Elements.length; i++) {
            for (int j = 0; j < Elements[rows].length; j++) {
                System.out.print(" " + Elements[i][j]);
            }
            System.out.println();
        }
    }
}
