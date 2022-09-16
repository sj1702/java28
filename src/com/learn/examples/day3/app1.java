package com.learn.examples.day3;

import com.learn.examples.day2.Student;

/**
 What this program snippet doing?
 This program prints name to console

 **/
public class app1 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setName("Ram");
        System.out.println("Name of Student is "+obj1.getName());
    }

}
