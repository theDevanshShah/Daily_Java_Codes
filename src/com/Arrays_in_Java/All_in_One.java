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
    // Dynamic Array

    public static void main(String[] args) {
//        The_1D_Array_population();
//        The_2D_Array_population();
//        Sum_Of_Floats();
//        Linear_Search();
//        Array_Reversal();
//        Average_Of_Array()
//        Sum_Of_Matrix();
        Dynamic_Array();


    }

    public static void The_1D_Array_population() {
        System.out.println("<---Program Number 1---> \n");
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
        System.out.println("<---Program Number 2---> \n");
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
            for (int j = 0; j < Elements[i].length; j++) {
                System.out.print(" " + Elements[i][j]);
            }
            System.out.println();
        }
    }

    public static void Sum_Of_Floats() {
        System.out.println("<---Program Number 3---> \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter The Number Of Elements In Array : ");
        int length = sc.nextInt();
        float[] Array_Of_Floats = new float[length];
        for (int i = 0; i < length; i++) {
            Array_Of_Floats[i] = sc.nextFloat();
        }
        System.out.println(Arrays.toString(Array_Of_Floats));

        float sum = 0.0f;
        for (int i = 0; i < length; i++) {
            sum += Array_Of_Floats[i];
        }
        System.out.println("So The Sum Of All Float Items Is : " + sum + "\n\n");
    }


    public static int Linear_Search() {
        System.out.println("\n\n<---Program Number 4---> \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter The Number Of Elements In Array : ");
        int length = sc.nextInt();
        int[] Linear_Search = new int[length];
        for (int i = 0; i < length; i++) {
            Linear_Search[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(Linear_Search));
        System.out.print("\nEnter The Target : ");
        int Target = sc.nextInt();
        for (int i = 0; i < length; i++) {
            if (Target == Linear_Search[i]) {
                System.out.println("Target Found At Index : " + (i));
                return 0;
            }
        }
        System.out.println("Target Not Found");
        return 0;
    }

    public static void Array_Reversal() {
        System.out.println("\n\n<---Pattern 5--->");
        System.out.print("Enter The Length Of Array : ");
        Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();
        int[] Array = new int[Length];
        for (int i = 0; i < Length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(Array));
        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.println(" " + Array[i]);
        }
        // Reversed Array
        int[] Reversed_Array = new int[Array.length];
        for (int i = 0; i < Length; i++) {
            Reversed_Array[i] = Array[Length - 1 - i];
        }
        System.out.println(Arrays.toString(Reversed_Array));
    }

    public static void Average_Of_Array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<---Average Of Array--->");
        System.out.println("Enter The Length Of An Array : ");
        int Length = sc.nextInt();
        int[] Array = new int[Length];
        for (int i = 0; i < Length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(Array));
        int Sum = 0;
        for (int i = 0; i < Length; i++) {
            Sum += i;
        }
        System.out.println(" The Sum Of All Elements Of An Array IS : " + Sum);
        float Average = (float) Sum / Length;
        System.out.println("The Average Of All Elements From Array IS : " + Average);
    }

    public static void Sum_Of_Matrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<--- PROGRAM 6 --->");

        // Matrix One Stuffed
        System.out.println("Enter The Length Of Row Of Matrix One: ");
        int Row = sc.nextInt();
        System.out.println("Enter The Length Of Col : ");
        int Col = sc.nextInt();
        int[][] Matrix1 = new int[Row][Col];
        for (int i = 0; i < Matrix1.length; i++) {
            for (int j = 0; j < Matrix1[i].length; j++) {
                Matrix1[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        for (int i = 0; i < Matrix1.length; i++) {
            for (int j = 0; j < Matrix1[i].length; j++) {
                System.out.println(" " + Matrix1[i][j] + " ");
            }
            System.out.println();
        }


        // Matrix Two Stuffed
        int Row2 = Row;
        int Col2 = Col;
        int[][] Matrix2 = new int[Row2][Col2];

        for (int i = 0; i < Matrix2.length; i++) {
            for (int j = 0; j < Matrix2[i].length; j++) {
                Matrix2[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < Matrix2.length; i++) {
            for (int j = 0; j < Matrix2[i].length; j++) {
                System.out.println(" " + Matrix2[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void Dynamic_Array() {
        Scanner sc = new Scanner(System.in);
        int[][] Dynamic_Arr = {
                {01, 03},
                {12, 04, 05},
                {01, 300},
                {02, 454, 78, 90, 9},
                {1}
        };
        System.out.println(Arrays.deepToString(Dynamic_Arr));

        for (int i = 0; i < Dynamic_Arr.length; i++) {
            for (int j = 0; j < Dynamic_Arr[i].length; j++) {
                System.out.print(" " + Dynamic_Arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
