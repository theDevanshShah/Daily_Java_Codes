//Write a Java program to reverse an array.
package com.Arrays_in_Java;


import java.util.Arrays;
import java.util.Scanner;


public class Array_Reversal {

    public static void main(String[] args) {
        int[] mainArray = populateArray();
        int[] reversedArray = array_reversal(mainArray);
        System.out.println(Arrays.toString(reversedArray));


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

        //Accessing The Array
        System.out.println("\nSo, Your Array Looks Like This \n");
        System.out.println(Arrays.toString(mainArray));

        return mainArray;
    }

    public static int[] array_reversal(int[] mainArray) {
        //Scanner sc = new Scanner(System.in);
        int[] reversedArray = new int[mainArray.length];

        // MAIN CALCULATION
        int j = mainArray.length - 1;
        for (int i = 0; i < mainArray.length; i++) {
            reversedArray[i] = mainArray[j];
            j--;
        }


        return reversedArray;
    }


}
