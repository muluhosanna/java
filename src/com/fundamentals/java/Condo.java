package com.fundamentals.java;
/*
* This class is a subclass of House & is part of
* Lesson12- Inheritance
 */
public class Condo  extends House{
    private String balcony;
    public Condo(){
        System.out.println("Default condo constructor");
    }// end constructor
    public void setBalcony(String balcony){
        this.balcony = balcony;
    }
    public String getBalcony(String balcony){
     return balcony;
    }// end method
  @Override
    public void doorOpenClose(){
        super.doorOpenClose();
        System.out.println("I have no door");
    }
    public void maintenance(){
        System.out.println("Will fix condo issues");
    }// end method
}//end class
