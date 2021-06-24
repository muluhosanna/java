package com.fundamentals.java;

public class SailBoat extends Boat{
    private int numberOfSails;
    private int sailSize;
    public SailBoat(){
        System.out.println("Default constructor");
    }// end constructor

    public void setNumberOfSails(int numberOfSails) {
        this.numberOfSails = numberOfSails;
    }//end method

    public int getNumberOfSails() {
        return numberOfSails;
    }//end method

    public void setSailSize(int sailSize) {
        this.sailSize = sailSize;
    }//end method

    public int getSailSize() {
        return sailSize;
    }//end method
}
