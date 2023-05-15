package com.Code_With_Harry;

public class operators_in_java {
    public static void main(String[] args) {
        //There are mainly five types of operators in Java.

        // 1. Arithmetic Operators + - * % / ++ --
        // 2. Assignment Operators =  += -=
        // 3. Conditional Operators == != > < >= <=
        // 4. Logical Operators && ||
        // 5. Bitwise Operators & |


        // 1. Arithmetic Operators
        int one = 10;
        int two = 20;

        // Two types of Arithmetic Operators
        //Binary Operators ( Which requires TWO operands for calculations Like here we took ONE and TWO both)
        System.out.println("Arithmetic Operators");
        System.out.println(one + two);
        System.out.println(one - two);
        System.out.println(one * two);
        System.out.println(one / two);
        System.out.println(one % two);

        //Unary Operators ( Which requires ONLY ONE operand for calculations Like here we took either ONE or TWO separately )
        System.out.println(one++);
        System.out.println(++one);
        System.out.println(two--);
        System.out.println(--two);


        // 2. Assignment Operators
        System.out.println("Assignment Operators");
        int three = 100;
        System.out.println(three += 3);
        System.out.println(three -= 3);
        System.out.println(three -= 3);


        // 3. Conditional Operators
        System.out.println("Conditional Operators");
        int four = 10;
        int five = 20;

        boolean isEqual = (four == five);
        boolean isNotEqual = (four != five);
        boolean isGreaterThan = (four > five);
        boolean isLessThan = (four < five);
        boolean isGreaterThanEqualto = (four >= five);
        boolean isLessThanEqualto = (four <= five);

        System.out.println(isEqual);
        System.out.println(isNotEqual);
        System.out.println(isGreaterThan);
        System.out.println(isLessThan);
        System.out.println(isGreaterThanEqualto);
        System.out.println(isLessThanEqualto);

        // 4. Logical Operators

        int six = 10;
        int seven = 5;
        boolean logicalAnd = (six > seven && seven < six);
        boolean logicalOrFirst = (six > seven || seven < six);
        boolean logicalOrSecond = (six != 10 || seven != 5);
        boolean logicalOrThird = (six != 10 || seven == 5);
        boolean logicalAndSecond = (six != 10 && seven == 5);

        System.out.println("Logical Operators");
        System.out.println(logicalAnd);
        System.out.println(logicalOrFirst);
        System.out.println(logicalOrSecond);
        System.out.println(logicalOrThird);
        System.out.println(logicalAndSecond);

        // 5. Bitwise Operators
        int eight = 2;
        int nine = 3;
        int bitwiseAnd = eight & nine;
        int bitwiseOr = eight | nine;
        System.out.println(bitwiseAnd);
        System.out.println(bitwiseOr);



        /*
        Calculation behind  Bitwise_And operator ( & )
        Here calculations goes like if 0 and 1 = 0 >> If one is zero than answer is zero
          0010 ( Bit form of 2 )
          0011 ( Bit form of 3 )
       & ------
          0010 ( Which is Bit form of 2 )


        Calculation behind  Bitwise_And operator ( | )
        Here calculations goes like if 0 or 1 = 0 >> Both has to be zero than only answer is zero
          0010 ( Bit form of 2 )
          0011 ( Bit form of 3 )
       | ------
          0011 ( Which is Bit form of 3 )
         */


    }

}