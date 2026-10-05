package com.amigoscode._1_beginners;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class _3_TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        int numberOne= 10;
        double numberTwo = numberOne;
        // Print both variables to see the result.
        System.out.println(numberOne);
        System.out.println(numberTwo);



        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        double numThree= 9.67;
        int numFour =(int) numThree;
        // Print both variables to see what happens to the decimal part.
        System.out.println(numThree);
        System.out.println(numFour);


        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        char c = 67;
        // Print the resulting char.
        System.out.println(c);


        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        System.out.println((char)(90));


        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        String result = "42";
        int numberFive = Integer.parseInt(result);
        // Print the result.
        System.out.println(numberFive);


        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        int numberSix = 42;
        String res = Integer.toString(numberSix);
        // Print the result.
        System.out.println(res);
    }
}
