package com.HackerRank_Solved_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class OneD_Array_Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Main Length : ");
        int Main_Length = sc.nextInt();
        for (int i = 0; i < Main_Length; i++) {
            System.out.print("Enter The Length Of The Array Number " + (i + 1) + " : ");
            int Length = sc.nextInt();
            System.out.print("Enter The Leap Value : ");
            int Leap = sc.nextInt();
            int[] Array = Function(Length, Leap);
            boolean result = Logic(Array, Leap);
            if (result == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static int[] Function(int Length, int Leap) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[Length];
        for (int i = 0; i < Length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(Array));
        return Array;
    }

    public static boolean Logic(int[] Array, int Leap) {
        Scanner sc = new Scanner(System.in);

        // Main Conditions
        int Length = Array.length;

        for (int i = 1; i < Length - 1; i++) {
            // Main Conditions
            int Current_Element = Array[0];
            int Plus_One = Array[Current_Element + 1];
            int Minus_One = Array[Current_Element - 1];

            int Leaped_Value = Array[Current_Element + Leap];
            if (Leaped_Value >= Length) {
                return false;
            } else if (Array[0] == 0 || Array[1] == 0 || Plus_One == 0 || Minus_One == 0) {
                return true;
            }
        }
        return false;
    }
}