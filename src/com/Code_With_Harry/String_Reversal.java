package com.Code_With_Harry;

import java.util.*;

public class String_Reversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string input from the user

        String input = scanner.nextLine();

        // Convert the string into an array of characters
        char[] charArray = input.toCharArray();

        // Create a new string to store the reversed characters
        String reversedString = "";

        // Use a for loop to reverse print the characters
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString += charArray[i];
        }

        // Print the reversed string
        System.out.println(reversedString);


        if (input.compareTo(reversedString) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
