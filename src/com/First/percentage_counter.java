package com.First;

import java.util.Scanner;

public class percentage_counter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("This Program is for counting percentage of Student's marks out of 100");
            System.out.print("Enter your student name here: ");
            String name = scanner.nextLine();
            System.out.print("Enter your student roll no. here: ");
            String rollNo = scanner.nextLine();

            System.out.print("Enter marks in Science: ");
            int scienceMarks = scanner.nextInt();
            validateMarks(scienceMarks);

            System.out.print("Enter marks in Maths: ");
            int mathsMarks = scanner.nextInt();
            validateMarks(mathsMarks);

            System.out.print("Enter marks in English: ");
            int englishMarks = scanner.nextInt();
            validateMarks(englishMarks);

            System.out.print("Enter marks in Hindi: ");
            int hindiMarks = scanner.nextInt();
            validateMarks(hindiMarks);

            System.out.print("Enter marks in History: ");
            int historyMarks = scanner.nextInt();
            validateMarks(historyMarks);

            int sum = scienceMarks + mathsMarks + englishMarks + hindiMarks + historyMarks;
            System.out.println("Total marks out of 500 is: " + sum);

            float percentage = (float) sum / 500 * 100;
            System.out.println("So " + name + " has total Percentage is: " + percentage + "%");
        }
    }

    public  static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Marks should be between 0 and 100") ;
        }
    }
}

