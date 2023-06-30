package com.HackerRank_Solved_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class OneD_Array {

//    public static boolean canWin(int leap, int[] game) {
//if(){
//
//}
//if(){
//
//}
//        return false;
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            // System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
    }

    public static void Main_Method(int Main_Length) {
        if (Main_Length >= 2) {
            Scanner sc = new Scanner(System.in);
            for (int a = 0; a < Main_Length; a++) {
                System.out.print("Enter the Length of Array Number " + (a + 1) + ": ");
                int size = sc.nextInt();
                int[] Array = new int[size];
                for (int i = 0; i < Array.length; i++) {
                    Array[i] = sc.nextInt();
                }
                System.out.println(Arrays.toString(Array));
                System.out.print("Enter the Leap Value: ");
                int Leap = sc.nextInt();

                for (int j = 1; j < Array.length - 1; j++) {
                    System.out.println("Current Element: " + Array[j]);

                    int Plus_One = Array[j + 1];
                    System.out.println("Plus One: " + Plus_One);
                    int Minus_One = Array[j - 1];
                    System.out.println("Minus One: " + Minus_One);

                    if (j + Leap < Array.length) {
                        int Leaped_Position = Array[j + Leap];
                        System.out.println("Leaped Position: " + Leaped_Position);

                        if (Array[0] == 0 || Array[1] == 0 || Plus_One == 0 || Minus_One == 0 || Leaped_Position == 0 || Leaped_Position >= Main_Length) {
                            System.out.println("Yes");
                        } else {
                            System.out.println("No");
                        }
                    } else if (Plus_One != 0 && Minus_One != 0) {
                        System.out.println("No");
                    } else {
                        System.out.println("Yes");
                    }
                }
            }
        } else {
            System.out.println("At least enter Main Length greater than 2");
            return;
        }
    }
}


