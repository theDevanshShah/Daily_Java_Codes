package com.Arrays_in_Java;

import java.util.*;

public class Basic_Snippet_For_2D_Array {
    public static void main(String[] args) {
        populating();
    }

    public static void populating() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of Rows (i) : ");
        int row = sc.nextInt();
        System.out.print("Enter The Value Of Columns (j) : ");
        int cols = sc.nextInt();

        int[][] twoDarray = new int[row][cols];

        for (int i = 0; i < twoDarray.length; i++) {
            for (int j = 0; j < twoDarray[i].length; j++) {
                System.out.print(" " + twoDarray[i][j]);
            }
            System.out.println();
        }
    }
}
