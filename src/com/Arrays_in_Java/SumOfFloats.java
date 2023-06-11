package com.Arrays_in_Java;

import java.util.*;
import java.util.Arrays;

public class SumOfFloats {
    public static void main(String[] args) {
        populateArray();
    }

    public static void populateArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int length = sc.nextInt();
        int[] mainArray = new int[length];

        // Populating Array
        for (int i = 0; i < length; i++) {
            System.out.print("At Index no " + i + " the value will be :");
            mainArray[i] = sc.nextInt();
        }

        // For Accessing Array
//        for (int j : mainArray) {
//            System.out.println("Item At Index : " + j + " is " + mainArray[j]);
//        }

        System.out.println("\nSo, Your Array Looks Like This\n");
        //Accessing The Array
        for (int i = 0; i < length; i++) {
            System.out.print(" " + mainArray[i]);
        }
    }

}
