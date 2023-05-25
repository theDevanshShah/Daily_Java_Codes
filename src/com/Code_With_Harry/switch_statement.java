package com.Code_With_Harry;

public class switch_statement {

    public static void main(String args[]) {
        System.out.println("Practising Switch Case Statement");
        int age = 4;
        switch (age) {
            case 1 -> System.out.println("It's Not Four");
            case 40 -> System.out.println("It's Not Four");
            case 4 -> System.out.println("It's Four");
            default -> System.out.println("It's Default");
        }

    }
}