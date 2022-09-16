package com.learn.examples.day2;

 /**
 What this program snippet doing?
 **/
public class Student {

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
