package com.Code_With_Harry;

import java.util.*;

public class String_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // String Split Method
        String myString = sc.next();
        String[] splitArray = myString.split(" ");

        for (String substring : splitArray) {
            System.out.println(substring);
        }
    }
}
