package com.Sorting_In_Java;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.print("Without Sorting : " + Arrays.toString(array));

        // Bubble Sort Logic

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i] > array[i + 1]) {
                    // Swapping Logic
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        System.out.print(" \n After Sorting : " + Arrays.toString(array));
    }
}
