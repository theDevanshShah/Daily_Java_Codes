package com.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Searching_For_Maximum_Element {
    public static void main(String[] args) {
        int[] Array = Populating_Array();
        Maximum_Array(Array);
    }

    public static int[] Populating_Array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length Of Array : ");
        int Length = sc.nextInt();
        int[] Array = new int[Length];
        for (int i = 0; i < Length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.print("\nThe Array Looks Like : " + Arrays.toString(Array));
        return Array;
    }

    public static void Maximum_Array(int[] Array) {
        int Max = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > Max) {
                Max = Array[i];
            }
        }
        System.out.println("\nMaximum Element Is : " + Max);
    }
}
