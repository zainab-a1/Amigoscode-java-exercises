package com.amigoscode._1_beginners;

import static com.amigoscode._1_beginners._7_MethodExercises.multiply;

/**
 * Exercise: Methods
 *
 * Learn how to define and call methods in Java.
 * Methods allow you to organize code into reusable blocks, each performing a specific task.
 */
public class _7_MethodExercises {

    // TODO: 1 - Create a method called greet that takes a String parameter 'name'
    // and prints "Hello, {name}!"
    // Hint: public static void greet(String name) { ... }
    public static void greet(String name){

        System.out.println("Hello, " + name);
    }


    // TODO: 2 - Create a method called add that takes two int parameters (a, b)
    // and returns their sum
    // Hint: public static int add(int a, int b) { ... }
    public static int  add (int a,int b){
        int sum = a +b;
        return sum;
    }


    // TODO: 3 - Create a method called isEven that takes an int parameter 'number'
    // and returns true if the number is even, false otherwise
    // Hint: Use the modulus operator (%)
    public static boolean  isEven(int number){
        if (number %2==0) {

        }
        return true;
    }


    // TODO: 4 - Create a method called max that takes two int parameters (a, b)
    // and returns the larger of the two
    // Hint: Use an if statement or the ternary operator
    public static int max(int a, int b){
        int res;
        if(a>b){
            res = a;
        }
        else{
             res= b;
        }

        return res;
    }


    // TODO: 5 - Create a method called factorial that takes an int parameter 'n'
    // and returns n! (n factorial) using a loop
    // Hint: 5! = 5 * 4 * 3 * 2 * 1 = 120. Use a long return type for larger values.
    public static int factorial (int n){

        int num = 1;

        for (int i = 2; i<=n; i++)
        {
            num =i*num;
        }
        return num;
    }


    // TODO: 6 - Create two overloaded methods called multiply:
    //   - One that takes 2 int parameters and returns their product
    //   - One that takes 3 int parameters and returns their product
    // Overloading means having multiple methods with the same name but different parameters.
    public  static int multiply(int a, int b){
        return a *b;
    }

    public static int multiply(int a, int b, int c){
        return a * b * c;
    }


    public static void main(String[] args) {

        // TODO: 7 - Call all the methods above and print their results
        // - Call greet with your name

        greet("Zainab");
        // - Call add with two numbers and print the result
        int sumAdd=add(2, 8);
        System.out.println(sumAdd);
        // - Call isEven with a number and print whether it is even
        boolean isEvenRes=isEven(7);
        System.out.println(isEvenRes);

        // - Call max with two numbers and print the larger one
        int maxNum=max(4, 9);
        System.out.println(maxNum);

        // - Call factorial with 5 and print the result
        int fact =factorial(5);
        System.out.println(fact);

        // - Call both multiply methods and print their results
       int methodOne= multiply(3, 7);
        System.out.println(methodOne);

        int methodTwo= multiply(2, 4, 6);
        System.out.println(methodTwo);

    }
}
