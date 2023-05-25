package com.HackerRank_Solved_Problems;

import java.util.Scanner;

public class eof_file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNumber = 1;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        scanner.close();
    }
}
