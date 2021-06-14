package com.fundamentals.java;

import com.fundamentals.Lessons.Lesson5;

public class Main {

    public static void main(String[] args) {

     //lesson4Exmples();
        lesson5Examples();
    }

    public static void lesson5Examples(){
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10,12);
        int example = myLesson5.showLocalWithReturn(15,8);
        System.out.println(example);
        myLesson5.showInstanceVariable();
        myLesson5.showConversion();
    }
    public static void Lesson4Examples(){
        // write your code here
        System.out.println("welcome to java");
        System.out.println("This my first sentence");
        System.out.println("I am new to java");
        System.out.println("This java course is cool");
        System.out.println("I am learning stuff everyday");
        House myHouse = new House();
        myHouse.doorOpenClose();


    }
}
