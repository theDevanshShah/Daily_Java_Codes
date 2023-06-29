package com.Searching;

import java.util.Scanner;

public class Linear_Search_For_String {
    public static void main(String[] args) {
//        String string = String_Population();
//        char[] charArray = string.toCharArray();
//        Linear_Search_For_Strings(charArray);

        Linear_Search();
    }

    public static String String_Population() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String Here : ");
        String string = sc.nextLine();
        System.out.println("The String Looks Like This : " + string);
        return string;
    }

    public static void Linear_Search_For_Strings(char[] charArray) {
        Scanner sc = new Scanner(System.in);
        if (charArray.length == 0) {
            System.out.println("The String Is Empty");
            return;
        }
        System.out.print("Enter The Targeted Character : ");
        String Target = sc.next();
        char targetChar = Target.charAt(0);
        boolean found = false;
        for (int i = 0; i < charArray.length; i++) {
            if (targetChar == charArray[i]) {
                System.out.println("Target Found At Index : " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Target Not Found");
        }
    }

    public static void Linear_Search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String Here : ");
        String Word = sc.nextLine();
        System.out.print("Enter The Targeted Character Here : ");
        String Target = sc.next();
        char TargetedCharacter = Target.charAt(0);

        for (int i = 0; i < Word.length(); i++) {
            if (TargetedCharacter == Word.charAt(i)) {
                System.out.print("Target Found At Index Number : " + i);
                return;
            }
        }

        System.out.println("Target Not Found");
        return;
    }

    public static void Linear_Search_With_Enhanced_For_Loop() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String Here : ");
        String Main_String = sc.nextLine();
        char[] Array = Main_String.toCharArray();
        System.out.print("Enter The Targeted Character Here : ");
        String Entered_Character = sc.next();
        char Target = Entered_Character.charAt(0);
        for (int i = 0; i < Array.length; i++) {
            if (Target == Array[i]) {
                System.out.print("Target Found At Index : " + i);
            }
        }
    }
}   