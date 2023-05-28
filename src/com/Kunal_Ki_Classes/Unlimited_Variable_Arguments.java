package com.Kunal_Ki_Classes;

import java.util.Arrays;

public class Unlimited_Variable_Arguments {

    // If I want to take limited arguments for a methods in Java
    public static void limitedArgs(int A, int B) {
        System.out.println("A = " + A + " & B = " + B);
    }

    // But If I want to take UNLIMITED arguments for a methods in Java
    public static void unLimitedArgs(int... N) {
        System.out.println("unLimitedArgs has N as " + Arrays.toString(N));
        // Here Used Arrays.toString() for converting it into ARRAY
        //Again
    }

    public static void main(String[] args) {
        limitedArgs(3, 5);
        unLimitedArgs(4, 24, 56, 821, 2345, 0);
    }
}
