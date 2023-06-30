package com.Searching;

import java.util.Arrays;

public class TwoD_Array_Maximum_Value {
    public static void main(String[] args) {
        int[][] Array = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        int Maximum_Value = Result(Array);
        System.out.println("Maximum Value Is : " + Maximum_Value);

    }

    public static int Result(int[][] Array) {
        int Max_Value = Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (Array[i][j] > Max_Value) {
                    Max_Value = Array[i][j];

                }
            }
        }
        return Max_Value;
    }
}
