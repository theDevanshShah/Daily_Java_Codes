package com.Arrays_in_Java;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Accessing elements in the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Removing an element from the ArrayList
        numbers.remove(2);

        // Accessing elements after removal
        System.out.println("\nElements after removal:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Checking if the ArrayList contains an element
        int numberToFind = 20;
        if (numbers.contains(numberToFind)) {
            System.out.println("\nThe ArrayList contains " + numberToFind);
        } else {
            System.out.println("\nThe ArrayList does not contain " + numberToFind);
        }

        // Clearing the ArrayList
        numbers.clear();

        // Checking if the ArrayList is empty
        if (numbers.isEmpty()) {
            System.out.println("\nThe ArrayList is empty.");
        }
    }
}
