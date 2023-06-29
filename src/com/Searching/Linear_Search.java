package com.Searching;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {

        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Linear_Searching(Array);
    }

    public static void Linear_Searching(int[] Array) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter The Target : ");
        int Target = sc.nextInt();
        for (int i = 0; i < Array.length + 1; i++) {
            if (Target == i) {
                System.out.println("Yes It IS Found at index number : " + i);
                return;
            }
        }
        System.out.println("No");
        return;
    }
}
