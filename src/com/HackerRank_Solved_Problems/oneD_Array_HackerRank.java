package com.HackerRank_Solved_Problems;

import java.util.Scanner;

public class oneD_Array_HackerRank {
    public static void main(String[] args) {
        System.out.println("\n\nFor Array 1");
        Array1();
        System.out.println("\n\nFor Array 2");
        Array2();
        System.out.println("\n\nFor Array 3");
        Array3();
        System.out.println("\n\nFor Array 4");
        Array4();
    }

    public static void Array1() {
        Scanner sc = new Scanner(System.in);
        int[] array = {0, 0, 0, 0, 0};
        int length = array.length;
        int leapValue = 3;


        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            int plusOne = (i + 1) < length ? array[i + 1] : -1;
            int minusOne = (i - 1) >= 0 ? array[i - 1] : -1;
            int leapedValue = (i + leapValue) < length ? array[i + leapValue] : -1;

            if (leapedValue != -1) {
                if (array[0] != 0 || array[1] != 0) {
                    System.out.println("No");
                } else if (currentValue == 0 || plusOne == 0 || minusOne == 0 || leapedValue == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        }

    }

    public static void Array2() {
        int[] array = {0, 0, 0, 1, 1, 1};
        int length = array.length;
        int leapValue = 5;

        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            int plusOne = (i + 1) < length ? array[i + 1] : -1;
            int minusOne = (i - 1) >= 0 ? array[i - 1] : -1;
            int leapedValue = (i + leapValue) < length ? array[i + leapValue] : -1;

            if (leapedValue != -1) {
                if (array[0] != 0 || array[1] != 0) {
                    System.out.println("No");
                } else if (currentValue == 0 || plusOne == 0 || minusOne == 0 || leapedValue == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        }
    }


    public static void Array3() {
        int[] array = {0, 0, 1, 1, 1, 0};
        int length = array.length;
        int leapValue = 3;


        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            int plusOne = (i + 1) < length ? array[i + 1] : -1;
            int minusOne = (i - 1) >= 0 ? array[i - 1] : -1;
            int leapedValue = (i + leapValue) < length ? array[i + leapValue] : -1;

            if (leapedValue != -1) {
                if (array[0] != 0 || array[1] != 0) {
                    System.out.println("No");
                } else if (currentValue == 0 || plusOne == 0 || minusOne == 0 || leapedValue == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        }
    }

    public static void Array4() {
        int[] array = {0, 1, 0};
        int length = array.length;
        int leapValue = 1;

        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            int plusOne = (i + 1) < length ? array[i + 1] : -1;
            int minusOne = (i - 1) >= 0 ? array[i - 1] : -1;
            int leapedValue = (i + leapValue) < length ? array[i + leapValue] : -1;

            if (leapedValue != -1) {
                if (array[0] != 0 || array[1] != 0) {
                    System.out.println("No");
                } else if (currentValue == 0 || plusOne == 0 || minusOne == 0 || leapedValue == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        }
    }
}
