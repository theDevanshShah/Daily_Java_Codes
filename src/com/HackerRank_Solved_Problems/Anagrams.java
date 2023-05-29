package com.HackerRank_Solved_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String StringOne = sc.next();
        String StringTwo = sc.next();

        String LowerCaseOne = StringOne.toLowerCase();
        String LowerCaseTwo = StringTwo.toLowerCase();

//        System.out.println(LowerCaseOne);
//        System.out.println(LowerCaseTwo);

        char[] CharOne = LowerCaseOne.toCharArray();
        char[] CharTwo = LowerCaseTwo.toCharArray();

//        System.out.println(CharOne);
//        System.out.println(CharTwo);

        char[] SortedOne = CharOne.clone();
        char[] SortedTwo = CharTwo.clone();

        Arrays.sort(SortedOne);
        Arrays.sort(SortedTwo);

//        System.out.println(SortedOne);
//        System.out.println(SortedTwo);


        if (Arrays.equals(SortedOne, SortedTwo)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("No Anagrams");
        }

    }
}

