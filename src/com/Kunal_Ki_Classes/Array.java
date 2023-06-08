package com.Kunal_Ki_Classes;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newKeyword = new String("Hello Hetarth");
        System.out.println(newKeyword);
        newKeyword = new String("Hello Devansh");
        System.out.println(newKeyword);

        alreadyValued();

    }

    public static void alreadyValued() {
        // An array declaration has two components: the type and the name.
        //Here practising all type of array declarations

        System.out.println();
        System.out.println("INTEGER");
        System.out.println();
        int[] intArray = new int[]{1, 2, 3, 4, 5};

        // accessing the elements of the specified array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i +
                    " : " + intArray[i]);
        }

        System.out.println();
        System.out.println("FLOAT");
        System.out.println();
        // Declaration of FLOAT type array
        float[] floatArray = new float[]{1, 2, 3, 4, 5};
        // Accessing of FLOAT type array
        for (int i = 0; i < floatArray.length; i++) {
            System.out.println("Element at index " + i +
                    " : " + floatArray[i]);
        }

        System.out.println();
        System.out.println("STRING");
        System.out.println();
        // Declaration of STRING type array
        String[] stringArray = new String[]{"One", "Two", "Three", "Four", "Five"};
        // Accessing of STRING type array
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Element at index " + i +
                    " : " + stringArray[i]);
        }


        System.out.println();
        System.out.println("CHAR");
        System.out.println();
        // Declaration of CHAR type array
        char[] charArray = new char[]{'A', 'B', 'C', 'D', 'E'};
// Accessing of CHAR type array
        for (int i = 0; i < charArray.length; i++) {
            System.out.println("Element at index " + i +
                    " : " + charArray[i]);
        }
        System.out.println();
        System.out.println("BOOLEAN");
        System.out.println();
        // Declaration of BOOLEAN type array
        boolean[] booleanArray = new boolean[]{true, false, true, false, false};
        // Accessing of BOOLEAN type array
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.println("Element at index " + i +
                    " : " + booleanArray[i]);
        }

        System.out.println();
        System.out.println("DOUBLE");
        System.out.println();
        // Declaration of DOUBLE type array
        double[] doubleArray = new double[]{1, 2, 3, 4, 5};
        // Accessing of DOUBLE type array
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("Element at index " + i +
                    " : " + doubleArray[i]);
        }

        System.out.println();
        System.out.println("SHORT");
        System.out.println();
        // Declaration of SHORT type array
        short[] shortArray = new short[]{1, 2, 3, 4, 5};
        // Accessing of SHORT type array
        for (int i = 0; i < shortArray.length; i++) {
            System.out.println("Element at index " + i + " : " + shortArray[i]);
        }


        System.out.println("\nInteger Array Practise\n");
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Element at index " + i + " is :" + intArr[i]);
        }


    }
}


