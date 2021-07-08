package com.fundamentals.exercises;
/*
* This content talks about the abstract class WaterBirds
* And the abstract class waterBirds implements methods from an interface called MovmentInterface.
 */
public abstract class WaterBirds implements MovementInterface{
    private int numberOfEyes;
    private int numberOfLegs;
   private double weight;
    private String family;
    // This is a constructor that takes all the parameters
    public WaterBirds(int numberOfEyes , int numberOfLegs, double weight, String family){
        this.numberOfEyes = numberOfEyes;
        this.numberOfLegs = numberOfLegs;
        this.weight = weight;
        this.family = family;

    }//end constructor
    public abstract void eat();//no body of the method
    public int getNumberOfEyes(){ return numberOfEyes;}//end method
    public int getNumberOfLegs(){ return numberOfLegs; }// end method
    public double getWeight(){ return weight; }// end method
    public String getFamily(){ return family; }// end methods

}// end class
