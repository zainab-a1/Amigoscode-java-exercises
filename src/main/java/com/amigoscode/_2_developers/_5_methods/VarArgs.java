package com.amigoscode._2_developers._5_methods;

import java.util.Arrays;



/**
 * Variable Arguments (Varargs) Exercises
 *
 * Practice using the varargs syntax (Type... name) which allows methods to accept
 * zero or more arguments of the same type. Internally, varargs are treated as arrays.
 */
public class VarArgs {

    // TODO: 1 - Create a method: int sum(int... numbers)
    //  Returns the sum of all provided numbers.
    //  If no arguments are provided, return 0.
    //  Hint: use a for-each loop to iterate over 'numbers'.



   
    public static int sum(int... numbers)
    {
        int sum = 0;

        for( Integer number: numbers)
        {
            sum =number +sum;
        }
        return sum;

    }


    // TODO: 2 - Create a method: String concatenate(String... strings)
    //  Joins all strings with a single space between them.
    //  Example: concatenate("Hello", "World") returns "Hello World"
    //  If no arguments, return an empty string "".
    //  Hint: use StringBuilder or String.join(" ", strings).
    public static String concatenate(String... strings)
    {

        return String.join(" ", strings);

    }


    // TODO: 3 - Create a method: int findMax(int... numbers)
    //  Returns the largest value among the arguments.
    //  If no arguments are provided, throw an IllegalArgumentException
    //  with the message "At least one number required".
    public static int findMax( int... numbers)
    {
        int largest = 0;

            for (Integer number : numbers) {
                if (number > largest) {
                    largest = number;
                }
            }
       return largest;
    }


    // TODO: 4 - Create a method: void printAll(Object... items)
    //  Prints each item on a separate line, prefixed with its index.
    //  Example output:
    //    [0] Hello
    //    [1] 42
    //    [2] true
    public static void printAll(Object... items)
    {
        int index=0;

       for(Object item: items)
       {
           System.out.println("[" + index+ "]"+ " " + item);
           index++;
       }
    }




    public static void main(String[] args) {
        VarArgs va = new VarArgs();

        System.out.println("=== Sum ===");
        // TODO: 5 - Demonstrate calling sum() with different numbers of arguments:
        //  sum()           -> 0  (zero args)
        //  - sum(5)          -> 5  (one arg)
        //  - sum(1, 2, 3, 4) -> 10 (many args)
        //  Print each result.
        int sum =sum(10, 10, 10);
        System.out.println(sum);




        System.out.println("\n=== Concatenate ===");
        // Print: concatenate("Java", "is", "awesome")
        String result=concatenate("Java", "is", "awesome");
        System.out.println(result);


        System.out.println("\n=== Find Max ===");
        // Print: findMax(3, 7, 2, 9, 1)
        int maxNum=findMax(3, 7, 2, 9, 1);
        System.out.println(maxNum);

        System.out.println("\n=== Print All ===");
        // Call: printAll("Hello", 42, true, 3.14)
        printAll("Hello", 42, true, 3.14);

        System.out.println("\n=== Mixed Params ===");
        // TODO: 6 - Create a method: String format(String prefix, int... numbers)
        //  The first parameter is a regular String, followed by varargs.
        //  Returns the prefix followed by the numbers in brackets.
        //  Example: format("Values", 1, 2, 3) returns "Values: [1, 2, 3]"
        //  Hint: varargs must be the LAST parameter in the method signature.
        //  Then call the method and print the result here.
        //

//        public static void format(String prefix, int... numbers)
//        {
//            for(Integer number: numbers)
//            {
//                String res = null;
//                int num [] = new int[] {number};
//                for(int i=0; i<=num.length-1; i++){
//
//                    num[i].append(res);
//                }
//            }
//            System.out.println(prefix +": [" + res +"]");
//        }


       format("Values", 1, 2, 3);




    }
}
