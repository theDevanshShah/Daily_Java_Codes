package com.Kunal_Ki_Classes;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array Initialization
        int[] arrayInt = new int[5];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;
        System.out.println(arrayInt[2]);


        //Array Initialization 2.0
        int[] arrayInt2 = {1, 2, 3, 4, 5,};
        System.out.println(arrayInt2[2]);

        // String Array
        String[] arrayString = new String[5];
        arrayString[0] = "Hii";
        arrayString[1] = "Hii";
        arrayString[2] = "Hii";
        arrayString[3] = "Hii";
        arrayString[4] = "Hii";

        System.out.println(arrayString[2]);

        // Float Array
        float[] arrayFloat = {1, 2, 3, 4, 5};
        System.out.println(arrayFloat[2]);

        // Boolean Array
        boolean[] arrayBoolean = new boolean[5];
        System.out.println(arrayBoolean[2]);

    }
}
