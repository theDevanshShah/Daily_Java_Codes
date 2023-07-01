package com.Searching;

public class TwoD_Array_Minimum_Element {
    public static void main(String[] args) {
        int[][] Array = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9, -9}
        };
        int Min_Value = Result(Array);
        System.out.println("Minimum Value Is : " + Min_Value);

    }

    public static int Result(int[][] Array) {
        int Min_Value = Integer.MAX_VALUE;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (Min_Value > Array[i][j]) {
                    Min_Value = Array[i][j];

                }
            }
        }
        return Min_Value;
    }
}
