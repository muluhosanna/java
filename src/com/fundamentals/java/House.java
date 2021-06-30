package com.fundamentals.java;

public class House {

    private String foundationType;
    private String roofStyle;
    private int windowSize;
    private String doorColor;

    // default constructor
    public House() {
      this("red","bamboo","plastic",30);
        System.out.println("This is a default constructor");
    }// end constructor

    // constructor with 1 parameter
    public House(String colorDoor) {

        this(colorDoor,"shingle","dirt" ,24);
        System.out.println("The the door color is" + colorDoor);
    }// end constructor

    public House(String colorDoor, String styleRoof, String typeFoundation, int sizeWindow) {
        this.doorColor = colorDoor;
        this.roofStyle = styleRoof;
        this.foundationType = typeFoundation;
        this.windowSize = sizeWindow;
    }// end constructor

    public void setFoundationType(String foundationType) {
        this.foundationType = foundationType;
    }// end method

    public String getFoundationType() {
        return this.foundationType;
    }// end method

    public void setRoofStyle(String roofStyle) {
        this.roofStyle = roofStyle;

    }//end method

    public String getRoofStyle() {
        return roofStyle;
    }//end method

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }// end method

    public int getWindowSize() {
        return windowSize;
    }// end method

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;

    }// end method

    public String getDoorColor() {
        return doorColor;
    }// end method

    public void doorOpenClose() {
        System.out.println("The door is open");

    }// end method
public void doorOpenClose(String status){
    System.out.println("The door is " + status);
}//end method
}// end class
