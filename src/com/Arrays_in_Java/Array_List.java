package com.Arrays_in_Java;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(3);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.get(1));
    }
}
