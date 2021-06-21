package com.fundamentals.Lessons;

/*
 * The contents of this class is for the lesson 5 slide deck
 * primitive Data Types
 * */
public class Lesson5 {

    // This primitive Data Types only be true or false
    boolean myBoolean = true;

    // This primitive type has a value rage of 0 to 65535
    char myChar = 'C';
    // This primitive type has a value range of -128 to 127
    byte myByte = 9;
    // Thi primitive type has a value range of -32768 to 32767
    short myShort = 235;
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
    // This primitive type has a value range varies
    double myDouble = 36.43D;
    double myOtherDouble = 84.98;
    // Decimal valve of 26
    int value = 26;
    // Hexadecimal value of 26
    int value2 = 0x1a;
    // Binary value of 26
    int value3 = 0b11010;
    // Octal value of 26
    int value4 = 032;
    // Scientific Notation use E or e
    double d2 = 23.65E8;

    // $ Using underscores to make the numbers readable
    long L2 = 4_568_987_367l;

    // This method shows a local variable
    public void showLocalExample() {
        int able = 26;
        System.out.println(able);
    }//end method

    // This method has two parameters and uses a local variables
    public void showLocalWithParameter(int able, int beta) {
        int total = able + beta;
        System.out.println(total);
    }// end method
    // This method has a return type of int

    public int showLocalWithReturn(int type1, int type2) {
        return type1 + type2;

    }//end method

    // This method uses instance variables and changes value
    public void showInstanceVariable() {
        System.out.println("Before");
        System.out.println(myInt);
        System.out.println("After");
       myInt = 14;
        System.out.println(myInt);
    }//end method

    // Method shows implicit & explicit conversion
    public void showConversion() {
        long val = myInt; //implicit or widening conversion
        int delta = (int) myLong; //explicit or narrowing conversion
        //int echo = (int)L2; //explicit conversion overflow
        // System.out.println(echo); //274,020,071
        int foxtrot = (int) myDouble; //explicit narrowing conversion
        System.out.println(foxtrot); //original 36.43 actual 36
    }
}//End class
