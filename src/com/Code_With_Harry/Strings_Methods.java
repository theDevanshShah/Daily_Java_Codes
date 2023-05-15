package com.Code_With_Harry;

import java.util.Scanner;

public class Strings_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. For Length
        System.out.print("Enter First Input Here : ");
        String inputForLength = sc.next();
        System.out.println(inputForLength);
        int lengthMethod = inputForLength.length();
        System.out.println(lengthMethod);

        //2. For Lowercase
        System.out.print("Second Input Here : ");
        String inputForLowercase = sc.next();
        System.out.println(inputForLowercase);
        String lowercaseMethod = inputForLowercase.toLowerCase();
        System.out.println(lowercaseMethod);

        //3. For Uppercase
        System.out.print("Third Input Here : ");
        String inputForUppercase = sc.next();
        System.out.println(inputForUppercase);
        String uppercaseMethod = inputForLowercase.toUpperCase();
        System.out.println(uppercaseMethod);

        //4. Fot Trimming unnecessary spaces from the input
        System.out.print("Fourth Input Here : ");
        sc.nextLine();
        String inputBeforeTrimming = sc.nextLine();
        System.out.println(inputBeforeTrimming);
        String outputBeforeTrimming = inputBeforeTrimming.trim();
        System.out.println(outputBeforeTrimming);

        //5. For characterAt () method
        System.out.print("Fifth Input Here : ");
        String inputForChatAt = sc.next();
        System.out.println(inputForChatAt);
        char outputForChatAt = inputForChatAt.charAt(3);
        System.out.println(outputForChatAt);


        // 6. For SubString() method but just from beginning index
        System.out.print("Sixth Input Here : ");
        String inputForSubString = sc.next();
        System.out.println(inputForSubString);
        String outputForSubString = inputForSubString.substring(3);
        System.out.println(outputForSubString);

        // 7. For SubString() method but just from beginning index to end index
        System.out.print("Seventh Input Here : ");
        String inputForFullSubString = sc.next();
        System.out.println(inputForFullSubString);
        String outputForFullSubString = inputForFullSubString.substring(3, 7);
        System.out.println(outputForFullSubString);

        // 8. For Comparing two Strings & finding whether they are equal or not
        System.out.print("First Input For Equal Method Here : ");
        String firstStringForEqualMethod = sc.next();
        System.out.print("Second Input For Equal Method Here : ");
        String secondStringForEqualMethod = sc.next();
        boolean resultOfComparing = firstStringForEqualMethod.equals(secondStringForEqualMethod);
        System.out.println(resultOfComparing);

        //9. For Comparing Two Strings & Finding Whether They Are Equal Or Not But By Ignoring Case
        System.out.print("First Input For Equal_Ignore_Case : ");
        String firstString = sc.next();
        System.out.print("Second Input For Equal_Ignore_Case : ");
        String secondString = sc.next();
        boolean resultOfEqualIgnoreCase = firstString.equalsIgnoreCase(secondString);
        System.out.println(resultOfEqualIgnoreCase);

        //10. For Checking whether they contain particular character or not.
        System.out.print("Tenth Input Here : ");
        String containsInput = sc.next();
        System.out.println(containsInput);
        boolean resultOfContainsMethod = containsInput.contains("d");
        System.out.println(resultOfContainsMethod);

        //11. StartsWith method
        System.out.println("Eleventh Input Here : ");
        String startsWithMethod = sc.next();
        System.out.println(startsWithMethod);
        boolean resultOfStartsWithMethod = startsWithMethod.startsWith("Hello");
        System.out.println(resultOfStartsWithMethod);

        //12. StartsWith method
        System.out.println("Twelfth Input Here : ");
        String endsWithMethod = sc.next();
        System.out.println(endsWithMethod);
        boolean resultOfEndsWithMethod = endsWithMethod.endsWith("!");
        System.out.println(resultOfEndsWithMethod);
    }
}