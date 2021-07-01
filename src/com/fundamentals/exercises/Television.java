package com.fundamentals.exercises;

public class Television {
   private int screenSize;
    private double price;
    private int numberOfPorts;
    private String isMountable;
    // constructor with two parameters
    public Television(int screenSize, double price){
        this(screenSize,price,4,"Not Mountable");
    }//end constructor
    // constructor with all the parameters
    public Television(int screenSize,double price, int numberOfPorts, String isMountable){
       this.screenSize = screenSize;
        this.price = price;
        this.numberOfPorts = numberOfPorts;
        this.isMountable = isMountable;
    }//end constructor
// setter and getter for the private variables
    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;

    }
    public int getScreenSize(){
        return screenSize;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setIsMountable(String isMountable) {
        this.isMountable = isMountable;
    }

    public String getIsMountable() {
        return isMountable;
    }
    public void turOn(){

        System.out.println("Tv is on");
    }
}//end class
