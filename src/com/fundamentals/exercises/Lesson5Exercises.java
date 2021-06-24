package com.fundamentals.exercises;

public class Lesson5Exercises {

    // This primitive type has a value range of -128 to 127
    byte myByte = 9;
    // This primitive type has a value range of -32768 to 32767
    short myShort = 627;
    /*
     * This primitive has a value range of
     *  -2,147,483,648 to 2,147,483,647 * */
    int myInt = 2345;
    /*
     * This primitive type has  a value range of
     * -9,223,372,036,775,808 to 9,223,372,036,855,775,807 * */
    long myLong = 56864L;
    // This primitive a value range varies
    float myFlot = 36.53F;
    double myOtherDouble = 84.98;
    public void numberSystemConversion(){
        int x1 = 0x1d;//hexadecimal representation of 29
        int x2 = 0b11101;// binary representation of 29
        int x3 = 29;// decimal representation of 29
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

    }
    public void wideningDataConversion(){
        int y1 = myByte;   // byte to int
        long val = myShort;    // short to long
        float y2 = myInt;   //int to float

        System.out.println(y1);
        System.out.println(val);
        System.out.println(y2);
    }// end method
    public void narrowingDataConversion(){
        long val1 = (long)myOtherDouble;// double to long
        int myInt1 = (int) myFlot; // float to int
        short myShort1 = (short)myLong; // long to short
        System.out.println(val1);
        System.out.println(myInt1);
        System.out.println(myShort1);

    }// end method
}// end class
