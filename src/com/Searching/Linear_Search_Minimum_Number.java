package com.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search_Minimum_Number {
    public static void main(String[] args) {
        int[] Main_Array = Populate_Array();
        Minimum_Element(Main_Array);
    }

    public static int[] Populate_Array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length Of The Array: ");
        int Length = sc.nextInt();
        int[] Main_Array = new int[Length];
        for (int i = 0; i < Main_Array.length; i++) {
            System.out.print("Enter The Element At Index " + i + ": ");
            Main_Array[i] = sc.nextInt();
        }
        System.out.println("So, The Array Looks Like: " + Arrays.toString(Main_Array));
        return Main_Array;
    }

    public static void Minimum_Element(int[] Main_Array) {
        if (Main_Array.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int Minimum_Element = Main_Array[0];
        for (int i = 1; i < Main_Array.length; i++) {
            if (Main_Array[i] < Minimum_Element) {
                Minimum_Element = Main_Array[i];
            }
        }
        System.out.println("The Smallest Element is: " + Minimum_Element);
    }
}
