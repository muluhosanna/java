package com.fundamentals.exercises;
/*
* This class is the child class of the abstract class WaterBirds.
* And implements the methods in the abstract class WaterBirds.
* It also implements the methods in MovementInterface
*/
public class Duck extends WaterBirds implements MovementInterface{
    public Duck(int numberOfEyes, int numberOfLegs, double weight, String family) {

        super(numberOfEyes, numberOfLegs, weight, family);
    }
    @Override
    public void eat(){
        System.out.println("Duck Eats insects and grass for living");
    }
    @Override
    public void swim(){
        System.out.println("Duck likes swimming over the water surface");
    }// end method
    @Override
    public void fly(){
        System.out.println("Duck can fly ");
    }//end method


}//end class


