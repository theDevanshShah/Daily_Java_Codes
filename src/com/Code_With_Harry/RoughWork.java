package com.Code_With_Harry;

import java.util.Scanner;

public class RoughWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String newX = String.valueOf(x);

            //Complete this line


            if (x == 0) {
                //newX = newX.concat("00");
                newX = "0" + newX.substring(0);

            }
            if (x < 99) {
                newX = "0" + newX.substring(0);
            }

            String mainX = "";
            mainX = mainX.concat(newX);


            String space = "_";
            String space2;
            int length1 = s1.length();
            if (length1 == 1 && x < 9) {
                space2 = space.replace("_", "              ");
            } else if (length1 == 2) {
                space2 = space.replace("_", "              ");
            } else if (length1 == 3) {
                space2 = space.replace("_", "            ");
            } else if (length1 == 4) {
                space2 = space.replace("_", "           ");
            } else if (length1 == 5) {
                space2 = space.replace("_", "          ");
            } else if (length1 == 6) {
                space2 = space.replace("_", "         ");
            } else if (length1 == 7) {
                space2 = space.replace("_", "        ");
            } else if (length1 == 8) {
                space2 = space.replace("_", "       ");
            } else if (length1 == 9) {
                space2 = space.replace("_", "      ");
            } else if (length1 == 10) {
                space2 = space.replace("_", "     ");
            } else if (length1 == 10 && x > 99) {
                space2 = space.replace("_", "     ");
            } else {
                space2 = space.replace("_", "               ");
            }

            System.out.println(s1 + space2 + mainX);
        }
        System.out.println("================================");

    }
}
//h               000
//hackerrank     000
//hackerrank     000
//h              000
//hello          000
