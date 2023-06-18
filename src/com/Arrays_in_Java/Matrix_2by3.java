package com.Arrays_in_Java;

import java.util.Scanner;

public class Matrix_2by3 {
    public static void main(String[] args) {
        System.out.println("\n---Enter The Values For First Matrix---\n");
        int[][] matrix1 = populating();
        System.out.println("\n---Enter The Values For Second Matrix---\n");
        int[][] matrix2 = populating();
        sumOfMatrices(matrix1, matrix2);
    }


    public static int[][] populating() {
        Scanner sc = new Scanner(System.in);

        int[][] twoDarray = new int[2][3];

        // Actual Populating Array
        for (int i = 0; i < twoDarray.length; i++) {
            for (int j = 0; j < twoDarray[i].length; j++) {
                twoDarray[i][j] = sc.nextInt();
            }
        }

        System.out.println("");

        // Accessing Array
        for (int i = 0; i < twoDarray.length; i++) {
            for (int j = 0; j < twoDarray[i].length; j++) {
                System.out.print(" " + twoDarray[i][j]);
            }
            System.out.println("");
        }
        return twoDarray;
    }

    public static void sumOfMatrices(int[][] matrix1, int[][] matrix2) {
        int result[][] = new int[2][3];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\n<---So,The Sum Of The Two Strings Is---> \n");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(" " + result[i][j] + " ");
            }
            System.out.println();
        }


    }

}