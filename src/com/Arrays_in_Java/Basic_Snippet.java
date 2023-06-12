package com.Arrays_in_Java;

import java.util.*;
import java.util.Arrays;

public class Basic_Snippet {
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

        // Accessing Array
        System.out.println(Arrays.toString(mainArray));
    }

}
