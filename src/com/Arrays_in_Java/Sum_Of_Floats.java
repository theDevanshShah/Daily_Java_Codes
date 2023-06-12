package com.Arrays_in_Java;

import java.util.*;
import java.util.Arrays;

public class Sum_Of_Floats {
    public static void main(String[] args) {
        float mainArray[] = populateArray();
        float sum = SumOfFloats(mainArray);
        System.out.println("\n\nThe sum of the array elements is: " + sum);
    }

    public static float[] populateArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int length = sc.nextInt();
        float[] mainArray = new float[length];

        // Populating Array
        for (int i = 0; i < length; i++) {
            System.out.print("At Index no " + i + " the value will be : ");
            mainArray[i] = sc.nextFloat();
        }

        System.out.println("\nSo, Your Array Looks Like This\n");
        System.out.print(Arrays.toString(mainArray));

        return mainArray;

    }


    public static float SumOfFloats(float[] mainArray) {
        float sum = 0.0f;
        for (int i = 0; i < mainArray.length; i++) {
            sum += mainArray[i];
        }
        return sum;
    }

}
