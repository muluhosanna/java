package com.fundamentals.lessons;
import com.fundamentals.java.House;
/*
* This class goes over the Lesson 18 content
* Exception Handling
 */
public class Lesson18 {
    House ranch;
    public void exampleThrows() throws NullPointerException{
        System.out.println(ranch.getWindowSize());
    }// end method
    public void exampleException1() {
        int[] values = {2, 4, 6};
        try {
            System.out.println(values[3]);
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Index out of bounds =" + ex.getMessage());
        }
        }//end method
public void exampleException2(){
    // String[] names = {"Matt","Debbie","Paul"};
    House[] names = {new House(),new House(),ranch};
        try {
            System.out.println(names[3].getWindowSize());

        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array out of bounds - " + ex.getMessage());

        }catch (NullPointerException ax){
            System.out.println("Null pointer - " + ax.getMessage());
        }
}// end method
    public void exampleFinally(){
        try {
            System.out.println(ranch.getWindowSize());
        }catch (NullPointerException ex){
            System.out.println("Null pointer - " + ex.getMessage());
        }finally {System.out.println("Ranch finally block called");

        }
    }//end method
    public void myArrayException(){
        String[] names = {"Dave","Matt","Jody"};
        try {
            byte b = Byte.parseByte(names[1]);
            System.out.println(b);
        }catch (IndexOutOfBoundsException ex){
            System.out.println("please provide at least 1 argument");
        }catch (NumberFormatException ed){
            System.out.println("That is not a number");
        }catch (StackOverflowError e){
            System.out.println("you have given me more than a byte");
        }catch (Exception ea){
            System.out.println("I dunno what you did - " + ea.getMessage());
        }//end try/end catch/end catch/end catch
    }//end method

}// end class
