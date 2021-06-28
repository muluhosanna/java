package com.fundamentals.java;

import com.fundamentals.lessons.*;
import com.fundamentals.exercises.Lesson5Exercises;
import com.fundamentals.lessons.Lesson10;
import com.fundamentals.lessons.Lesson10Demo;
import com.fundamentals.lessons.Lesson11;
import com.fundamentals.exercises.Lesson6Exercises;
import com.fundamentals.lessons.Lesson12;
import com.fundamentals.lessons.Lesson12Child1;
import com.fundamentals.lessons.Lesson12Child2;
//import com.fundamentals.lessons.Lesson14;
import com.fundamentals.exercises.Lesson8Exercises;
public class Main {
    public static int num = 0;
    static {
        num = 42;
        System.out.println("Static Block 1 = " + num);
    }
    static {
        num = 63;
        System.out.println("Static Block 2 = " +num);
    }

    public static void main(String[] args) {

        // lesson4Examples();
        //lesson5Examples();
        // lesson6Examples();
        // lesson7Example();
        //lesson8Examples();
        // moreLesson8();
        //  song();
       // exercise5Example();
        //lesson9Examples();
        //lesson10Examples();
       // houseConstructorExample();
       //lesson11Examples();
       // boatConstructorExample();
        //condoExample();
       // sailBoatExample();
       // exercise6();
       // lesson12Examples();
        //lesson14Examples();
       // lesson8Exercises();
    }
    public static void lesson8Exercises(){
       Lesson8Exercises myExercise8 = new Lesson8Exercises();
       myExercise8.loopExampleV2();

    }
    public static void lesson14Examples(){
        //can not change a value of final variable
        //Lesson14.MY_FIRST_FINAL =10
        int total =Lesson14.MY_FIRST_FINAL +20;
        System.out.println(total);
        // can change a value of a non-final static
        Lesson14.myFirstStatic =40;
        System.out.println(Lesson14.myFirstStatic);
        Lesson14.myStaticMethodExample(10);
        Lesson14.MyInnerClass myInnerClass = new Lesson14.MyInnerClass();
        myInnerClass.myInnerMethod();
    }
    public static void lesson12Examples(){
        Lesson12Child1 child1 = new Lesson12Child1(5);
        System.out.println(child1.calculateArea());
        System.out.println("h " + child1.getHeight());
        Lesson12 myLesson12 = new Lesson12Child2(5,10);
        System.out.println(myLesson12.calculateArea());
        Lesson12 my12 = new Lesson12Child1(5);
        System.out.println(my12.calculateArea());
    }
    public static void  exercise6(){
        Lesson6Exercises myExercise = new Lesson6Exercises();
        myExercise.lowerCase();
        myExercise.signPilcrow();
        myExercise.makingPoem();
    }
    public static void sailBoatExample(){
        SailBoat mySailBoat = new SailBoat();
        mySailBoat.setSailSize(30);
        mySailBoat.getWeightCapacity();
        mySailBoat.setNumberOfSails(4);
    }
    public static void boatConstructorExample(){
        Boat myBoat = new Boat("red");
        myBoat.getWindowSize();
        myBoat.setWindowSize(40);
        myBoat.setShellColor("green");
        myBoat.setWeightCapacity(4000);
        myBoat.getWeightCapacity();
        myBoat.weight(4005,45);


    }
    public static void condoExample(){
        Condo myCondo = new Condo();
        myCondo.setBalcony("small");
        myCondo.doorOpenClose();// from class override
        myCondo.setDoorColor("blue");// from House class
        myCondo.maintenance();
        myCondo.doorOpenClose("closed");//from House class
    }
    public static void lesson11Examples(){
        Lesson11 myEleven = new Lesson11("Kansas city");
        System.out.println(myEleven.getfName() + " " +
        myEleven.getlName() + "is from " +myEleven.getCity());
    }
public static void  houseConstructorExample(){
   House house1 = new House();
   house1.setDoorColor("Green");
   System.out.println(house1.getDoorColor());
   House house2 = new House("red");
   //System.out.println(house2.getFoundationType());//prints null
   House house3 = new House("blue", "metal", "bambo", 32);
   System.out.println(house3.getRoofStyle());
}
public static void lesson10Examples(){
    Lesson10 myTen = new Lesson10();
    myTen.showPublicExample();
    Lesson10Demo myTenDemo = new Lesson10Demo();
    myTenDemo.showOtherModifiers();
}
    public static void lesson9Examples() {
        Lesson9 myNine = new Lesson9();
        myNine.basicIntArray();
        myNine.basicStringArray();
        myNine.basicTwoDimensionalArray();
        myNine.basicThreeDimensionalArray();
        myNine.basicJaggedArray();
    }

    public static void exercise5Example() {
        Lesson5Exercises myExercise1 = new Lesson5Exercises();
        myExercise1.numberSystemConversion();
        myExercise1.wideningDataConversion();
        myExercise1.narrowingDataConversion();

    }

    public static void song() {
        BottlesOfBeerSong bob = new BottlesOfBeerSong();
        bob.timeToSing();
    }

    public static void moreLesson8() {
        Lesson8 myEight = new Lesson8();
        myEight.basicWhileExample();
        myEight.basicDoWhileExample();
        myEight.basicForLoop();
        myEight.basicBranchingExample();
    }//end method

    public static void lesson8Examples() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5, 10);
        myLesson8.basicIfExample(5, 5);
        myLesson8.basicIfElseExample(10, 12);
        myLesson8.basicIfElseExample(12, 12);
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(102);
        myLesson8.basicSwitchExample(3);

    }

    public static void lesson7Example() {
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

    public static void lesson5Examples() {
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10, 12);
        int example = myLesson5.showLocalWithReturn(15, 8);
        System.out.println(example);
        myLesson5.showInstanceVariable();
        myLesson5.showConversion();
    }

    public static void lesson4Examples() {
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
