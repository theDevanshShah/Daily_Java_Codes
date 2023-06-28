package com.Sorting_In_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int N = sc.nextInt();
        int[] array = new int[N];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array before sorting: " + Arrays.toString(array));

        // Bubble Sort Logic
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swapping Logic
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}

// By Using Bitwise Swapping Logic
//        for (int i = 0; i < array.length - 1; i++) {
//        for (int j = 0; j < array.length - i - 1; j++) {
//        if (array[j] > array[j + 1]) {
//        // Swapping Logic using Bitwise XOR
//        array[j] = array[j] ^ array[j + 1];
//        array[j + 1] = array[j] ^ array[j + 1];
//        array[j] = array[j] ^ array[j + 1];
//        }
//        }
//        }
