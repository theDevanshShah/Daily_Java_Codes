package com.Arrays_in_Java;

import java.util.*;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        Array_List();
    }

    public static void Array_List() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
        System.out.println("1st commit");
        System.out.println("2nd commit");
        System.out.println("3rd commit");
        System.out.println("4th commit");

    }
}
