package com.fundamentals.lessons;
/*
* This demonstrates on enum part of Lesson16
 */
public enum Lesson16Enum {
    SUN(2),MON(4),TUE(6),WED(8),THU(10),FRI(12),SAT(14);
    private int dayNum;
    private Lesson16Enum(int val){
        dayNum = val;

    }//end constructor

   // private Lesson16Enum() {
   //     System.out.println("constructor called for " + this.toString());

    //}//end constructor
    public int getDayNum(){ return dayNum;

    }// end method
    public void someEnumMethod(){
        System.out.println("Method inside of enum");
    }// end method

}// end enum
