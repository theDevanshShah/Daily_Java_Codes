package com.First;

import java.util.Scanner;

public class MyIntro {
    public static void main(String[] args){
        System.out.println("This program takes user input in various data types and prints them back.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name here :");
        String name = sc.next();
        System.out.println("Enter your age here :");
        int age = sc.nextInt();
        System.out.println("Enter your percentage in high-school here :");
        float percentage = sc.nextFloat();
        System.out.println("Enter your phone no :");
        long phone = sc.nextLong();
        System.out.println("Enter your gender here M/F:");
        char gender = sc.next().charAt(0);
        System.out.println("Enter your email here :");
        String email = sc.next();
        System.out.println("So, your NAME is " + name + " and Your AGE is " + age + " and your Percentage is " + percentage + " and your PHONE NO. is " + phone  + " & your EMAIL is " + email + " & finally your GENDER is " + gender);
    }
}
