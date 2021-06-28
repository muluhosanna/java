package com.fundamentals.exercises;

public class Lesson8Exercises {
   public static void main(String[] args) {
       //String mygrade =  gradeInfov2('A');

      loopExampleV2();
    }

    /*
    * write a method that will take a char parameter
    * and a string return type using a switch and the
    * table below,return the description .If the case
    * does not match the char parameter, return the message
    * 'not valid'
     */

    public static String gradeInfo(char grade){
        String  description;
        switch (grade){
            case 'E':
                description = "Excellent";
                break;
            case 'v':
                            description = "Very Good";
            case 'G':
                description = "Good";
                break;
            case 'A':
                description = "Average";
                break;
            case 'F':
                description ="Failed";
                break;
            default:
                description = "Not valid grade";
                break;


        }
        return description;
    }//end method



    public static String gradeInfov2(char grade){
        switch(grade){
            case 'E': return "Excellent";
            case 'V': return  "Very Good";
            case 'G': return  "Good";
            case 'A' :return  "Average";
            case 'F': return  "Failed";
            default: return  "Not a valid grade";

        }

    }//end method
    /*
    * Write a method that will take no parameters or return type
    * using a loop dislpay numbers 0 to 30 dvisible 3. Using Modulus.
     */
    public static void loopExample2(){
        int value = 0;
        while (value <= 30 && 30 % 3 == 0){
            /*if(value % 3 == 0){*/
                System.out.println(value);
            //}
            value++;
        }

    }//end method

    public static void loopExampleV2(){
        for (int value = 0; value <= 10; value++){
            System.out.println(value* 3);
        }

    }// end method
}// end class
