package com.Code_With_Harry;

import java.util.*;

public class Dictionary_HasMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        n = input.nextInt();
        input.nextLine(); // Consume the newline character after reading the integer

        // Create an empty dictionary
        Map<String, String> phoneBook = new HashMap<>();

        // Input 'n' key-value pairs into the dictionary
        for (int i = 0; i < n; i++) {
            String[] pair = input.nextLine().split(" ");
            String key = pair[0];
            String value = pair[1];
            phoneBook.put(key, value);
        }

        // Retrieve values by keys
        while (input.hasNextLine()) {
            String key = input.nextLine();
            if (key.equals("exit")) {
                break;
            }
            String value = phoneBook.get(key);
            if (value == null) {
                System.out.println("Not found");
            } else {
                System.out.println(key + "=" + value);
            }
        }

        input.close();
    }
}
