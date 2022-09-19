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

    public String getStatus(String age){
          int age1 = Integer.getInteger(age);
          if (age1 >= 13) {

              return "Person is a kid" ;
          }
          else if (age1 > 13 && age1 <= 19) {

              return "Person is a teen";
          }
          else if(age1 > 19){

              return "Person is a adult" ;
          }
          else {
              return "Not a valid age";
          }



    }


    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter age of person " );
        String age = obj1.nextLine();
        System.out.println("Person age is "+age);

        app2 obj2 = new app2();
        System.out.println((obj2.getStatus(age)));



    }


}
