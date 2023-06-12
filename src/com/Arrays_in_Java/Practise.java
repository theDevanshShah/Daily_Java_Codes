package com.Arrays_in_Java;

import java.util.Arrays;
import java.util.Scanner;

//public class Practise {
//    public static void main(String[] args) {
////        float[] array = populating_Array();
////
////        float sum = sum(array);
////        System.out.println(sum);
//        array_reversal();
//    }
//
//    // Populating array
//    public static float[] populating_Array() {
//        System.out.print("Enter the length of array : ");
//        Scanner sc = new Scanner(System.in);
//        int lengthArr = sc.nextInt();
//        float[] array = new float[lengthArr];
//
//        for (int i = 0; i < lengthArr; i++) {
//            System.out.print("Item at index " + i + " : ");
//            array[i] = sc.nextFloat();
//        }
//
//
//        System.out.println(Arrays.toString(array));
//
//        return array;
//    }
//
//    // Calculating Sum
//    public static float sum(float[] array) {
//        float sum = 0.0f;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//
//        return sum;
//    }

// Reversing Of Array
public class Practise {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(originalArray);
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[lastIndex - i];
        }
        return reversed;
    }
}


