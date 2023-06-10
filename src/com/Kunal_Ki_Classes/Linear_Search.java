package com.Kunal_Ki_Classes;

import java.util.*;

public class Linear_Search {
    private static int[] array;

    public static void main(String[] args) {
        populate_array();

    }

    public static void populate_array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        int length = sc.nextInt();
        array = new int[length];

        // Populating Array
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("So The Array looks like this ");
        // Accessing Array
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        System.out.print("\nNow Enter the target : ");
        int target = sc.nextInt();

        // Calling the other method
        search(array, target);
    }

    public static int search(int[] array, int target) {
        // Running The Loop
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("\nTarget Found At Index : " + i);
                return i;
            }
        }

        System.out.println("Target Not Found");
        return -1;
    }
}
