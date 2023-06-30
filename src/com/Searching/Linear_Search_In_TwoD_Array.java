package com.Searching;

public class Linear_Search_In_TwoD_Array {
    public static void main(String[] args) {
        int[][] Array = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        int Target = 5;
        System.out.println(Result(Array, Target));
    }

    public static int Result(int[][] Array, int Target) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (Array[i][j] == Target) {
                    return Target;
                }
            }
        }
        return 0;
    }
}
