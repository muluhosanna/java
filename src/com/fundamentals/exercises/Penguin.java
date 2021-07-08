package com.fundamentals.exercises;
/*
* This class is the child class of the abstract class WaterBirds
* And implements the methods in the abstract class WaterBirds
* It also implements the methods in MovementInterface
 */
public class Penguin extends WaterBirds implements MovementInterface{
    public Penguin(int numberOfEyes,int numberOfLegs,double weight,String family){
        super(numberOfEyes,numberOfLegs,weight,family);
    }
    @Override
    public void eat(){
        System.out.println("Penguin eats fish");
    }

    @Override
    public void swim(){
        System.out.println("Penguin swims around 12kmphr");
    }// end method
    @Override
    public void fly(){
        System.out.println("Penguin can not fly");

    }


}
