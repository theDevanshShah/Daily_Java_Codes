package com.Code_With_Harry;

import java.util.*;

public class Valid_Username_Regular_Expression {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {

            String str = sc.next();

            String firstChar = str.substring(0, 1);

            if (firstChar.contains("1") || firstChar.contains("2") || firstChar.contains("3") || firstChar.contains("4") || firstChar.contains("5") || firstChar.contains("6") || firstChar.contains("7") || firstChar.contains("8") || firstChar.contains("9") || firstChar.contains("0") || firstChar.contains("_")) {
                System.out.println("Invalid");
            } else if (str.length() < 8 || str.length() > 30) {
                System.out.println("Invalid");
            } else if
            (str.contains("?")
                            || str.contains("~")
                            || str.contains("@")
                            || str.contains("#")
                            || str.contains("$")
                            || str.contains("%")
                            || str.contains("&")
                            || str.contains("^")
                            || str.contains("*")
                            || str.contains("+")
                            || str.contains("-")
                            || str.contains("=")
                            || str.contains("(")
                            || str.contains(")")
                            || str.contains("//")
                            || str.contains("`")
                            || str.contains("[")
                            || str.contains("]")
                            || str.contains("{")
                            || str.contains("}")
                            || str.contains("!")
                            || str.contains(".")
                            || str.contains(",")
                            || str.contains(":")
                            || str.contains(";")
                            || str.contains("|")
                            || str.contains("<")
                            || str.contains(">")
                            || str.contains("'")
                            || str.contains("\"")
                            || str.contains(" ")
                            || str.contains("\\")
            ) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }

        }

    }
}
