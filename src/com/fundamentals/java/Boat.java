package com.fundamentals.java;

public class Boat {
    private String shellColor;
    private String materialType;
    private float weightCapacity;
    private int windowSize;

    public Boat(){
         System.out.println("This is a default constructor");
    }//end constructor
    public Boat(String shellColor) {
        this.shellColor = shellColor;
        System.out.println("The shell color");

    }//end constructor

    public Boat(float weightCapacity,  int sizeWindow) {
     System.out.println("This is the weight capacity of the boat" + windowSize );
        this.weightCapacity = weightCapacity;
        this.windowSize = sizeWindow;
    }//end method
public void weight(){
        System.out.println( "This is the weight of the boat" );

}
    public void setShellColor(String shellColor) {
        this.shellColor = shellColor;
    }//end method
   public String getShellColor(){
return shellColor;
    }//end method

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }//end method

    public int getWindowSize() {
        return windowSize;
    }//end method

    public float getWeightCapacity() {
        return weightCapacity;
    }//end method

    public void setWeightCapacity(float weightCapacity) {
        this.weightCapacity = weightCapacity;
    }//end method
}// end class
