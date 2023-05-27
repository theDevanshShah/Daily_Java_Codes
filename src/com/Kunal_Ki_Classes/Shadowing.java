package com.Kunal_Ki_Classes;

public class Shadowing {

    static int x = 90;    //Static is must

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
