package com.learn.examples.day3;

/*
The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

Given a number N, write a program to print Fibonacci Series up to the N term.

Input: N = 10
Output: 0 1 1 2 3 5 8 13 21 34
 */

public class app3 {

    public void fibonacci(int n){

        int sum = 0;
        int a =0;
        int b =1;

        System.out.println("Fibonacci Series until number "+n + "is: ");
        System.out.println(a);
        System.out.println(b);

        sum = a + b;

        while( sum < n){

            System.out.println(sum);
            a = b ;
            b = sum;
            sum = a + b;

        }

    }

    public static void main(String[] args) {
        app3 obj1 = new app3();
        obj1.fibonacci(35);
    }

}
