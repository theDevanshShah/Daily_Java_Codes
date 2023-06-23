package com.Arrays_in_Java;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        Array_List();
    }

    public static void Array_List() {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        ArrayList<Double> double_List = new ArrayList<Double>(5);
        double_List.add(10.00);
        double_List.add(10.0);
        double_List.add(10.1231231);
        for (int i = 0; i < double_List.size(); i++) {
            System.out.println(double_List.get(i));
        }
        System.out.println(double_List.contains(5));
        System.out.println(double_List.contains(10.00));
        double_List.set(0, 10.99);
        System.out.println(double_List.get(0));
    }

}
