package com.fundamentals.Lessons;

import java.util.Scanner;
/*
* The content of the class goes over Lesson7
* Java Operators
 **/
public class Lesson7 {
    int value1 = 23, value2 =45;
    public void exampleArithmatic(){
        int addTotal = value1 + value2;
        int subtractTotal  = value2 - value1;
      int multiplyTotal = value1 * value2;
      int divideTotal = value1  / value2;
      int modulusTotal = value1 % value2;
      System.out.println(addTotal);
        System.out.println(subtractTotal);
        System.out.println(multiplyTotal);
        System.out.println(divideTotal);
        System.out.println(modulusTotal);

    }// end method
public void addTwoNumbers(){
        int able, beta, charlie;
        System.out.println("Enter two integers to calculate their sum.");
Scanner in = new Scanner(System.in);
able = in.nextInt();
beta = in.nextInt();
charlie = able + beta;
System.out.println("The sum of entered value= "+ charlie);

}//end method
  public void exampleAssignment(){
        value1 += value2;
        System.out.println(value1);
        value2 -=value1;
        System.out.println(value2);
        value1 *=value2;
        System.out.println(value1);
        value1 /=value2;
        System.out.println(value1);
        value1 %=value2;
        System.out.println(value1);
  }  //end method
    /*
    * The AND bitwise operator compares the binary of 2 numbers
    * Only the matched set of 1's carry over the answer

    **/
    public void exampleAnd(){
        //the number 10 in binary is 1010
        // the number 2 in binary is 0010
        int result =10 & 2;
        System.out.println(result);//answer is 2


    }// end method
    /*
    * the OR bitwise operator compares the binary of 2 numbers
    * Only one of the binaries need to be a 1 to 1 carry over.
    *  If both are 1, it also carries over to the answer.
     **/
    public void exampleOr(){
        // The number 15 in binary is 1111
        // the number 30 in binary is 00011110
        int result = 15 | 30;
        System.out.println(result);//answer is 310001111

    }// end method
    /*
   * The XOR bitwise operator compares the binary of 2 numbers
   *  If the bits vary when compared, a 1 takes its place.
**/
    public void exampleXor(){
        // The value of 15 in binary is 1111
        // The value of 30 in binary is 00011110
        int result = 15 ^ 30;
        System.out.println(result);// answer is 1700011110
    }/// end method
    /*
    *The shift left operator will take the value as a primitive
    * type and convert it to binary. The right side value will shift
    * its binary bits of the number to the left by the number of spaces.
    * The higher-order bits outside the range of the result type of x are
    * discarded.the remaining bits are shifted left, and the lower-order
    * empty bit position are set to 0
     **/
    public void exampleLeftShift(){
        //The number 15 in binary is 1111
        // The shifting value by 2 results in 00111100 which is 60
        int result = 15 << 2;
        System.out.println(result);

    } // end method
    /*
    * The right shift bitwise operator will take the value as a
    * primitive type and convert it to the binary version.
    * The side value will shift the binary bits of the number to the right by the number of space .
    * When the value is of type int or long, the lower-order bits are discarded .the
    * remaining bits are shifted right, and the higher-order empty bit position are set zero
    * */
    public void exampleRightShift(){
        // The number 30 in binary is 00011110
        // Shifting the value by 2 results in 0111 or7
        int result = 30 >> 2;
        System.out.println(result);
    }// end method
    public void exampleRelational(){
        int echo = 25, foxtrot =30, golf = 25;
        boolean result1 = echo == foxtrot;
        System.out.println( result1);
        boolean result2 = echo != foxtrot;
        System.out.println(result2);
        boolean result3 = foxtrot > golf;
        System.out.println(result3);
        boolean result4 = foxtrot < golf;
        System.out.println(result4);
        boolean result5 = echo >= golf;
        System.out.println(result5);
        boolean result6 = foxtrot <= echo;
        System.out.println(result6);




    }// end method;
    public void exampleIncrement(){
        int home = 10, jump, car;
        jump = home++; //post increment
        System.out.println(jump);
        // home=11
        car = ++home;
        System.out.println(car);


    }// end
    public void exampleDecrement(){
        int able = 10, beta, delta;
        beta = able--;
        System.out.println(beta);//answer10
        //able=9
        delta = --able;//
        System.out.println(delta);//answer=8
    }
 }// end class
