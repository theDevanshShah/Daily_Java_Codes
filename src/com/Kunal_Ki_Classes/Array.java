package com.Kunal_Ki_Classes;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //alreadyValued();
        //userValued();
        practiseArray();

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

    public static void userValued() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Length Of The Array : ");
        int length = sc.nextInt();
        int[] numbers = new int[length];

        // Populating Array
        System.out.println("Enter The Elements Of The Array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter The Element For Index " + i + " : ");
            numbers[i] = sc.nextInt();
        }

        //Accessing The Array
        for (int i = 0; i < length; i++) {
            System.out.print(" " + numbers[i]);
        }


        for (int i = 0; i < length; i++) {
            System.out.println("\nElement Of Array's Index " + i + " : " + numbers[i]);
        }

        // Printing Array
        System.out.println(numbers.toString());

        int[] n = {1, 2, 2, 4, 4};

    }


    public static void practiseArray() {
        System.out.print("Enter the length of array :");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] mainArray = new int[arrayLength];

        // Populating Array
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter the item at index " + i + " : ");
            mainArray[i] = sc.nextInt();
        }

        // Accessing The Array
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Array Index " + i + " : " + mainArray[i]);
        }
    }
}


