package com.First;
import java.util.Scanner;
public class Basic_Input{
    public static void main(String[]  args){
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A here :");
        float a = sc.nextFloat();
        System.out.println("Enter the value of B here :");
        float b = sc.nextFloat();
        float sum = a +b;
        System.out.println("The sum of A & B is :" + sum);



        System.out.println("Now this is the program for checking whether the input by user is int or not ");
        System.out.println("Enter the input here :");
        boolean c = sc.hasNextInt();
        System.out.println(c);


        System.out.println("Now this is the program for checking whether the input by user is Float or not ");
        System.out.println("Enter the input here :");
        boolean checkingFloat = sc.hasNextFloat();
        System.out.println(checkingFloat);


        System.out.println("Enter the string here :");
        String str =  sc.nextLine();
        System.out.println(str);

        System.out.println("Now this is the program for checking whether input string by user is string or not");
        System.out.println("Enter the string here :");
        boolean checkingString = sc.hasNextLine();
        System.out.println(checkingString);


    }
}