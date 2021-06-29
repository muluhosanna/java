package com.fundamentals.exercises;

public class Lesson9Exercises {
    public void sampleArray(){
        String[] myArray1 = new String[7];
        myArray1[0] = "Vanilla";
        myArray1 [1] = "chocolate";
        myArray1[2] = "Birthday cake";
        myArray1[3] = "Strawberry";
        myArray1[4] = "Mango";
        myArray1[5] = "Cotton candy";
        myArray1[6] = "Coconut";
        for (int i =0; i <myArray1.length; i++){
            System.out.println(myArray1[i]);
        }//end for loop

    }//end method
    public void sample2Array(){
        int[][] myArray2 = {{17,20},{27,27}};
        for (int i =0; i < 2; i++){
            for (int j =0; j < 2; j++){
                System.out.print(myArray2[i][j] + " ");
            }//end end of inner for loop
            System.out.println();
        }//end for loop

    }//end method
}// end class
