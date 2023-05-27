package com.Kunal_Ki_Classes;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {

        swap();

    }

    public static void swap() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int A = sc.nextInt();
        System.out.print("Enter the value of A : ");
        int B = sc.nextInt();

        System.out.println("____________________________");
        System.out.println("Before Swapping ");
        System.out.println("Value of A : " + A);
        System.out.println("Value of B : " + B);

        int Swapper = A;
        A = B;
        B = Swapper;

        System.out.println("____________________________");

        System.out.println("After Swapping ");
        System.out.println("Value of A : " + A);
        System.out.println("Value of B : " + B);

    }
}
