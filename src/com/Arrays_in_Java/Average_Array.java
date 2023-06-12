package com.Arrays_in_Java;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Average_Array {


    public static void main(String[] args) {
        int[] mainArray = populateArray();
        average(mainArray);
    }

    public static int[] populateArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int length = sc.nextInt();
        int[] mainArray = new int[length];

        // Populating Array
        for (int i = 0; i < length; i++) {
            System.out.print("At Index no " + i + " the value will be : ");
            mainArray[i] = sc.nextInt();
        }

        // Accessing Array
        System.out.println(Arrays.toString(mainArray));

        return mainArray;
    }

    // For Finding Average
    public static void average(int[] mainArray) {

        int sum = 0;
        // Getting Sum Of All Elements
        for (int i = 0; i < mainArray.length; i++) {
            sum += mainArray[i];
        }
        System.out.println("So,The Sum Of All Elements : " + sum);
        int average = sum / mainArray.length;
        System.out.println("And The Average Of The Array Is : " + average);

    }

}
