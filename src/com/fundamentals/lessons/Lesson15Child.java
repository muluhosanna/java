package com.fundamentals.lessons;
/*
* This class serves as a child class of Lesson15Abstract
 */
public class Lesson15Child extends Lesson15Abstract implements Lesson15Interface {
    public Lesson15Child(int volume, int[]numberKey, int sendKey,
                            String screen){
       super(volume, numberKey, sendKey, screen);
    }
    @Override
    public void receiveCall(){
        System.out.println("Receiving Phone call");
    }// end method
    @Override
    public void sendCall(){
        System.out.println("Sending phone call");

    }//end method
    @Override
    public void endCall() {
        System.out.println("Call has ended");
    }
@Override
        public void holdCall(){
    System.out.println("Holding the call");

    }//end method

}//end class
