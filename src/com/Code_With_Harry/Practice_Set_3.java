package com.Code_With_Harry;

import java.util.Scanner;

public class Practice_Set_3 {
    public static void problem7() {
        System.out.println("Problem 7 : Write a program to find sum of first N numbers. ");
        System.out.println();
        System.out.print("Enter the N here : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {

                System.out.println(i);


            }

        }

        System.out.println("Sum : " + sum);
    }

    public static void problem6() {
        //Problem 6 : Draw a pattern of triangle
        System.out.println("Problem 6 : 180 Degree Rotated Left Cornered Triangle");
        System.out.println(" ");
        int n = 5;
        //Outer Loop
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // Problem 1 : Convert String To Lower Case
//        System.out.println("Problem 1 : Convert String To Lower Case");
//        System.out.print("Enter String Here : ");
//        String string_one = sc.next();
//        System.out.println("Before : " + string_one);
//        string_one = string_one.toLowerCase();
//        System.out.println("After : " + string_one);
//        sc.nextLine();
//
//        System.out.println(" ");
//
//        // Problem 2 : Replace Space From String To UnderScore
//        System.out.println("Problem 2 : Replace Space From String To UnderScore");
//        System.out.print("Enter String Here : ");
//        String string_two = sc.nextLine();
//        System.out.println("Before : " + string_two);
//        string_two = string_two.replace(" ", "_");
//        System.out.println("After : " + string_two);
//
//        System.out.println(" ");
//
//        // Problem 3 : Replace Space To String
//        System.out.println("Problem 3 : Replace Space To String");
//        String letter = "Dear <NAME>, thanks a lot !";
//        System.out.print("Enter Name Here : ");
//        String string_three = sc.nextLine();
//        letter = letter.replace("<NAME>", string_three);
//        System.out.println(letter);
//
//        System.out.println(" ");

//        // Problem 4 : Index of double space and triple space from String
//        System.out.println("Problem 3 : Index of double space and triple space from String ");
//        String string_four = "Hello, This is double space  and this is a tripple space   ";
//        int double_space = string_four.indexOf("  ");
//        System.out.println(double_space);
//        int triple_space = string_four.indexOf("   ");
//        System.out.println(triple_space);

        System.out.println(" ");

        //Problem 5 : Format a string in a Letter Format
//        System.out.println("Problem 5 : Format a string in a Letter Format ");
//        System.out.println(" ");
//        System.out.println("Before Formating");
//        String string_five = "Dear Kashish, I wanted to take a moment to express my heartfelt gratitude for your unwavering support. Your kindness, encouragement, and assistance have meant the world to me, and I am truly thankful for your presence in my life. Your support has made a significant difference, and I am forever grateful.  With sincere appreciation, Devansh Shah";
//        System.out.println(string_five);
//        System.out.println(" ");
//        System.out.println("After Formating");
//        string_five = "Dear Kashish, \n\n I wanted to take a moment to express my heartfelt gratitude for your unwavering support.\n Your kindness, encouragement, and assistance have meant the world to me. \n I am truly thankful for your presence in my life.\n Your support has made a significant difference, and I am forever grateful.  \n\n\t\t\t\t With sincere appreciation, \n\t\t\t\t Devansh Shah";
//        System.out.println(string_five);


        System.out.println(" ");


        problem7();
    }
}
