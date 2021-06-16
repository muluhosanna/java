package com.fundamentals.java;

import com.fundamentals.Lessons.Lesson5;
import com.fundamentals.Lessons.Lesson6;
import com.fundamentals.Lessons.Lesson7;
public class Main {

    public static void main(String[] args) {

     // lesson4Examples();
       //lesson5Examples();
       // lesson6Examples()
        lesson7Example();
    }
public static void lesson7Example(){
   Lesson7 myLesson7 = new Lesson7();
   myLesson7.exampleArithmatic();
  // myLesson7.addTwoNumbers();//uncomment to test
   myLesson7.exampleAssignment();
   myLesson7.exampleAnd();
   myLesson7.exampleOr();
   myLesson7.exampleXor();
   myLesson7.exampleLeftShift();
   myLesson7.exampleRightShift();
   myLesson7.exampleRelational();
   myLesson7.exampleIncrement();
   myLesson7.exampleDecrement();
}// end method

    public static void lesson6Examples() {
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleConcat();
        boolean val = myLesson6.exampleEquals();
        System.out.println(val);
        String str1 = myLesson6.exampleLowercase("HAPPY");
        myLesson6.exampleLowercase("example");
        myLesson6.exampleUppercase("example");

        System.out.println(myLesson6.exampleLength());
        myLesson6.exampleBuilder("Sphagati", 2);
        myLesson6.exampleChar();
        myLesson6.exampleEscape();
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
    public static void lesson4Examples(){
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
