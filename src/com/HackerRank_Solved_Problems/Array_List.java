package com.HackerRank_Solved_Problems;

import java.io.*;
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("\nEnter The Total N : ");
        int Total_Length = sc.nextInt();
        int size = 0;
        ArrayList<ArrayList<Integer>> Main_List = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i < Total_Length + 1; i++) {
            //  System.out.print("\n Enter The Length For ArrayList Number " + i + " : ");
            int Each_Arraylist_Length = sc.nextInt();
            ArrayList<Integer> Each_List = new ArrayList<Integer>();
            for (int j = 0; j < Each_Arraylist_Length; j++) {
                Each_List.add(sc.nextInt());
            }
            // System.out.println(Each_List);
            size = Each_List.size();
            Main_List.add(Each_List);
        }

        System.out.println(Main_List);

        // System.out.print("Enter The Number Of Queries To Be Performed :");
        int Query_Number = sc.nextInt();
        int List_Number;
        int Element_Number;
        for (int i = 0; i < Query_Number; i++) {

            //  System.out.print("Enter The Number Of List To Be Printed :");
            List_Number = sc.nextInt();
            if (List_Number <= Main_List.size()) {
                // System.out.print("Enter The Number Of Element To Be Printed :");
                Element_Number = sc.nextInt();
                if (Element_Number <= size) {
                    System.out.println(Main_List.get(List_Number).get(Element_Number));
                } else {
                    System.out.println("Error !");
                }
            } else {
                System.out.println("Error !");
            }
        }
    }
}
