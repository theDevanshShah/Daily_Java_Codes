package com.HackerEarth;

import java.util.Scanner;

public class Favourite_Singer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of singers here : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            int nums = sc.nextInt();
            System.out.println(nums);
        }
    }
}

