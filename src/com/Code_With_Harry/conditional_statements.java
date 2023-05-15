package com.Code_With_Harry;

import java.util.*;

public class conditional_statements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //If-else Statement

        System.out.print("Enter your button no : ");
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Button");
        }

        // Switch Case Statement

        System.out.print("Enter your button no ");
        int button2 = sc.nextInt();

        switch (button2) {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Bonjour");
            case 4 -> System.out.println("Holla");
            default -> System.out.println("Invalid");
        }

        // Calculation Using If-Else
        System.out.print("Enter Number 1 here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 here : ");
        int num2 = sc.nextInt();
        System.out.print("Enter The Operator here ");
        char operator = sc.next().charAt(0);
        int result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 * num2;
        } else if (operator == '%') {
            result = num1 * num2;
        } else {
            System.out.println("Invalid operator");
        }

        System.out.println(num1 + operator + num2 + "=" + result);
    }
}
