package com.Arrays_in_Java;

import java.util.Arrays;

public class Matrix_Array {
    public static void main(String[] args) {
        int[][] flats = new int[3][3];
        flats[0][0] = 1;
        flats[0][1] = 2;
        flats[0][2] = 3;
        flats[1][0] = 4;
        flats[1][1] = 5;
        flats[1][2] = 6;
        flats[2][0] = 7;
        flats[2][1] = 8;
        flats[2][2] = 9;

        // Arrays.deepToString()
        System.out.println(Arrays.deepToString(flats));

        // Using For Loop
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(" " + flats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
