package com.Code_With_Harry;

import java.util.Scanner;

public class ruff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {


            String input = scanner.next();

            if (input.length() > 8 && input.length() <= 30 && input.matches("^[a-zA-Z0-9_]+$") && !Character.isDigit(input.charAt(0))) {


                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

}



