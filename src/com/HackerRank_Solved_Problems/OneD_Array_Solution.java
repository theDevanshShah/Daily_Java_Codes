package com.HackerRank_Solved_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class OneD_Array_Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the Main Array Length: ");
        int Main_Length = sc.nextInt();
        Main_Method(Main_Length);
    }

    public static void Main_Method(int Main_Length) {
        if (Main_Length >= 2) {
            Scanner sc = new Scanner(System.in);
            for (int a = 0; a < Main_Length; a++) {
                //      System.out.print("Enter the Length of Array Number " + (a + 1) + ": ");
                int size = sc.nextInt();
                int[] Array = new int[size];
                int Leap = sc.nextInt();
                for (int i = 0; i < Array.length; i++) {
                    Array[i] = sc.nextInt();
                }
                //    System.out.println(Arrays.toString(Array));
                //   System.out.print("Enter the Leap Value: ");


                boolean result = isPathPossible(Array, Leap);
                if (result) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } else {
            System.out.println("At least enter Main Length greater than 2");
        }
    }

    public static boolean isPathPossible(int[] Array, int Leap) {
        if (Array[0] != 0) {
            return false;
        }

        int currentPosition = 0;
        int n = Array.length;

        for (int i = 0; i < n; i++) {
            if (Array[currentPosition] == 1) {
                break;
            }

            if (currentPosition + Leap >= n) {
                currentPosition += Leap;
            } else if (Array[currentPosition + Leap] == 0) {
                currentPosition += Leap;
            } else if (currentPosition + 1 >= n) {
                currentPosition += 1;
            } else if (Array[currentPosition + 1] == 0) {
                currentPosition += 1;
            } else {
                return false;
            }
        }

        return currentPosition >= n;
    }

}
