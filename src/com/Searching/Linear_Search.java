package com.Searching;

import java.util.Scanner;
import java.util.Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[] Array = Populating_Array();
        Linear_Searching(Array);
    }

    public static int[] Populating_Array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length Of The Array : ");
        int Length = sc.nextInt();
        int[] Array = new int[Length];
        for (int i = 0; i < Length; i++) {
            System.out.print("Enter The Element At Index Number " + (i + 1) + " : ");
            Array[i] = sc.nextInt();
        }
        System.out.println("Your Array Looks Like : " + Arrays.toString(Array));
        return Array;
    }

    public static void Linear_Searching(int[] Array) {
        Scanner sc = new Scanner(System.in);

        if (Array.length == 0) {
            System.out.println("The Array Is Empty!");
            return;
        }

        System.out.print("Enter The Target : ");
        int Target = sc.nextInt();

        for (int i = 0; i < Array.length + 1; i++) {
            if (Target == i) {
                System.out.println("Target Found at index number : " + i);
                return;
            }
        }
        System.out.println("Target Not Found!");
        return;
    }
}