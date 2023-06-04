package com.Code_With_Harry;


import java.util.StringTokenizer;

public class String_Tokenizer {
    public static void main(String[] args) {

//        // Single Delimiter Here it is coma( , ) It also can be a space
        String s1 = "Devansh,is,a,good,boy";
        StringTokenizer st1 = new StringTokenizer(s1, ",");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

//        // Multiple Character Delimiter Here it is coma("Devansh") It also can be a space
        String s2 = "DevanshisDevanshisDevanshisDevanshisDevanshisDevanshisDevanshis";
        StringTokenizer st2 = new StringTokenizer(s2, "Devansh");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        // Single Delimiter Here it is coma( , ) It also can be a space & this time it's with returnDelim parameter : True means/ False
        String s3 = "Devansh,is,a,good,boy";
        StringTokenizer st3 = new StringTokenizer(s3, ",", true);
        System.out.println("ST 3");
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());

        }


    }

}
