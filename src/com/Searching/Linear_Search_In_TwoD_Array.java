package com.Searching;

public class Linear_Search_In_TwoD_Array {
    public static void main(String[] args) {
        int[][] Array = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        int Target = 5;
        Boolean Final_Result = Result(Array, Target);
        if (Final_Result = true) {
            System.out.println("Target Found");
        } else {
            System.out.println("Target Not Found");
        }
    }

    public static boolean Result(int[][] Array, int Target) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (Array[i][j] == Target) {
                    return true;
                }
            }
        }
        return false;
    }
}
