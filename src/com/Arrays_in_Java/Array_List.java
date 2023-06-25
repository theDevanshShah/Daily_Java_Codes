package com.Arrays_in_Java;

import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        // All_Types_Of_List();
        Automatic_Array_Lists();
    }

    static void All_Types_Of_List() {
        // Initialization Of ArrayLists
        ArrayList<Integer> Integer_List = new ArrayList<Integer>();
        ArrayList<String> String_List = new ArrayList<String>();
        ArrayList<Float> Float_List = new ArrayList<Float>();
        ArrayList<Boolean> Boolean_List = new ArrayList<Boolean>();


        // Adding Elements In ArrayLists
        Integer_List.add(1);
        Integer_List.add(2);
        Integer_List.add(3);
        Integer_List.add(4);
        Integer_List.add(5);

        String_List.add("Devansh");
        String_List.add("Hetarth");
        String_List.add("Kasak");
        String_List.add("Henny");
        String_List.add("Max");

        Float_List.add(1.0f);
        Float_List.add(1.0f);
        Float_List.add(1.0f);
        Float_List.add(1.0f);
        Float_List.add(1.0f);

        Boolean_List.add(true);
        Boolean_List.add(false);
        Boolean_List.add(true);
        Boolean_List.add(false);
        Boolean_List.add(false);


        // Getting Elements
        int Element1 = Integer_List.get(1);
        String Element2 = String_List.get(1);
        Float Element3 = Float_List.get(1);
        Boolean Element4 = Boolean_List.get(1);

        System.out.println(Element1);
        System.out.println(Element2);
        System.out.println(Element3);
        System.out.println(Element4);

        // Printing ArrayLists
        System.out.println("\nBefore Changes");
        System.out.println(Integer_List);
        System.out.println(String_List);
        System.out.println(Float_List);
        System.out.println(Boolean_List);

        // Adding Elements In Middle Of The Array List
        Integer_List.add(0, 0);
        String_List.add(0, "Kashish");
        Float_List.add(0, 0.0f);
        Boolean_List.add(0, true);

        System.out.println();
        System.out.println("After Changes");
        System.out.println(Integer_List);
        System.out.println(String_List);
        System.out.println(Float_List);
        System.out.println(Boolean_List);

        // Setting Different Values To An Existing Array List Item

        //Before Changes
        System.out.println(String_List);

        //After Changes
        String New_String = " Maxii";
        String_List.set(5, New_String);
        System.out.println(String_List);

        // Removing An Existing ArrayList Element
        Integer_List.remove(5);
        String_List.remove(5);
        Float_List.remove(5);
        Boolean_List.remove(5);

        // Printing Lists Again To See The Changes
        System.out.println();
        System.out.println(Integer_List);
        System.out.println(String_List);
        System.out.println(Float_List);
        System.out.println(Boolean_List);
    }

    public static void Automatic_Array_Lists() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> List = new ArrayList<Integer>();
        System.out.println("Enter The Lingth Of An Array List : ");
        int Length = sc.nextInt();
        for (int i = 0; i < Length; i++) {
            List.add(sc.nextInt());
        }
        System.out.println(List);
    }
}
