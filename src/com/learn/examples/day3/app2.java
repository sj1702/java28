package com.learn.examples.day3;

import java.util.Scanner;

/**
 * What this program snippet doing?
 * Given person age, Write a function that will print if the person is kid , teen or adult.
 * <p>
 * teen if age is between 13 and 19 inclusive.
 * kid if less than 13.
 * adult if more than 19.
 **/
public class app2 {

    static int age ;

    public String getStatus(int age) {

        //System.out.println("age passed is " + age);

        if (age <= 13) {

            return "kid";

        }
        else if (age > 13 && age <= 19) {

            return "teen";
        }
        else if (age > 19) {

            return "adult";
        }

        else  {

            return "Null";
        }

    }

    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter age of person ");
        //String age1 = obj1.next(); // merging with second line
        app2.age = Integer.parseInt(obj1.next());
        System.out.println("Person age is " + age);

        app2 obj2 = new app2();
        System.out.println("Person is a " + obj2.getStatus(age));


    }


}
