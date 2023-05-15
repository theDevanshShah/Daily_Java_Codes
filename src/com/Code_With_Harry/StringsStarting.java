package com.Code_With_Harry;

import java.util.Scanner;

public class StringsStarting {

    public static void main(String[] args) {

        //String class is used to represent a sequence of characters
        //. It is part of the Java standard library and provides several methods to manipulate and work with strings.

        //Creating a String:
        //You can create a string in Java using the String class constructor or by assigning a string literal to a variable. For example:
        // In Java, we can make Strings by these two methods
        String firstString = "Hyy This is one way to create string";
        String secondString = new String("Hyy This is another way to create string");

        //Printing Those Strings
        System.out.println(firstString);
        System.out.println(secondString);

        //Concatenation of Strings:
        //You can concatenate two strings together using the + operator or the concat() method. For example:String result1 = firstString + " " + secondString;     // Using the + operator
        String result2 = firstString.concat(" ").concat(secondString); // Using the concat() method result1;
        System.out.println(result2);


        //Taking String as an Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word here : ");
        String first = sc.next();
        System.out.println(first);
        System.out.print("Enter the sentence here : ");
        sc.nextLine(); // This is important
        String second = sc.nextLine();
        System.out.println(second);
    }


}
