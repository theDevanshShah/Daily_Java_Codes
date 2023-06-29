package com.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search_Within_A_Range {
    public static void main(String[] args) {

        int[] Array = Populating_The_Array();
        Function(Array);
    }

    public static int[] Populating_The_Array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length Of The Array: ");
        int Length = sc.nextInt();
        int[] Array = new int[Length];
        for (int i = 0; i < Array.length; i++) {
            System.out.print("Enter The Element At Array Index " + i + ": ");
            Array[i] = sc.nextInt();
        }
        System.out.println("So, The Array Looks Like This: " + Arrays.toString(Array));
        return Array;
    }

    public static void Function(int[] Array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter The Starting Point Of The Searching Area: ");
        int Start = sc.nextInt();
        if (Start >= Array.length) {
            System.out.println("The Starting Point " + Start + " is Greater Than or Equal to Array's Length");
            return;
        }
        System.out.print("Enter The Ending Point Of The Searching Area: ");
        int End = sc.nextInt();
        if (End >= Array.length) {
            System.out.println("The Ending Point " + End + " is Greater Than or Equal to Array's Length");
            return;
        }
        System.out.print("Enter The Target: ");
        int Target = sc.nextInt();
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] >= Start && Array[i] <= End) {
                if (Target == Array[i]) {
                    System.out.println("Target Found at Index: " + i);
                    return;
                }

            } else if (Target == Array[i] || Array[i] >= Start && Array[i] <= End) {
                System.out.println("Target Not Found At Index " + i + " but not within the Given Range!");
                return;
            }
        }
        System.out.println("Target Not Found within the Given Range!");
    }
}
