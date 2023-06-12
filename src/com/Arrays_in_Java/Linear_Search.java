// Write a program to find out whether a given integer is present in an array or not.
package com.Arrays_in_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {


    public static void main(String[] args) {
        int mainArray[] = populateArray();
        search(mainArray);


    }

    public static int[] populateArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int length = sc.nextInt();
        int[] mainArray = new int[length];

        // Populating Array
        for (int i = 0; i < length; i++) {
            System.out.print("At Index no " + i + " the value will be :");
            mainArray[i] = sc.nextInt();
        }


        System.out.println("\nSo, Your Array Looks Like This\n");
        //Accessing The Array
        System.out.println(Arrays.toString(mainArray));
        return mainArray;
    }

    public static boolean search(int[] mainArray) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Target : ");
        int target = sc.nextInt();

        for (int i = 0; i < mainArray.length; i++) {
            if (target == mainArray[i]) {
                System.out.println("Yes, Target Found At Index No : " + i);
                return true;
            }
        }
        System.out.println("Target Not Found");
        return false;

    }

}

