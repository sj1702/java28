package com.learn.examples.day3;

import java.util.Scanner;
/**
 What this program snippet doing?
 Given person age, Write a function that will print if the person is kid , teen or adult.

 teen if age is between 13 and 19 inclusive.
 kid if less than 13.
 adult if more than 19.

 **/
public class app2 {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus(String age){




        return "age";
    }


    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter age of person " );
        String age = obj1.nextLine();
        System.out.println("Person age is "+age);


    }


}
