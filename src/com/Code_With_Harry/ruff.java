package com.Code_With_Harry;

import java.util.*;

public class ruff {
    public static void main(String Args[]) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String newX = String.format("%030d", x);
        System.out.println(newX);

    }
}
