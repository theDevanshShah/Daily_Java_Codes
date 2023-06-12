package com.Arrays_in_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Practise {

    public static void main(String[] args) {
        // Populating Array
        int[] mainArray = populatingArray();
        // Performing Linear Search
        searching(mainArray);
    }

    // Populating Array
    static int[] populatingArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length Of An Array : ");
        int length = sc.nextInt();
        int[] mainArray = new int[length];
        for (int i = 0; i < length; i++) {
            mainArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(mainArray));
        return mainArray;

    }

    // Performing Linear Search
    static boolean searching(int[] mainArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Target : ");
        int target = sc.nextInt();
        for (int i = 0; i < mainArray.length; i++) {
            if (target == mainArray[i]) {
                System.out.println("Item at index :" + i);
                return true;
            }

        }
        System.out.println("Item Not Found");
        return false;
    }
}