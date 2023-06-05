package com.Code_With_Harry;

import java.util.StringTokenizer;
import java.util.*;

public class String_Split {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);
        int tokenCount = tokenizer.countTokens();

        System.out.println(tokenCount);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

        scanner.close();
    }
}

