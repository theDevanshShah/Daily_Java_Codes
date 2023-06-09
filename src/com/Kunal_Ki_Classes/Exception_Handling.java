package com.Kunal_Ki_Classes;

public class Exception_Handling {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};  // Here Array's Length is Just 3 Item Count

        try {
            System.out.println(array[5]); // But here I'm Trying to Access Item No. 5
        } catch (Exception ignored) {
            System.out.println("This will definitely throw an Error");
        }
    }
}
