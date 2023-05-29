package com.Kunal_Ki_Classes;

public class Function_OverLoading {
    // Same Named Function But Different Type Of Parameters
    public static void main(String[] args) {
        function(3);
        function("Devansh");

    }

    public static void function(int A) {
        System.out.println(A);
    }

    public static void function(String B) {
        System.out.println(B);
    }
}
