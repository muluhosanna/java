package com.fundamentals.java;
/*
*This class demonstrates control Flow using song
 **/
public class BottlesOfBeerSong {
    public void timeToSing(){
        int bottlesOfBeer = 99;
        String word = "bottles", result ="";
        while(bottlesOfBeer >0){
            if (bottlesOfBeer == 1){
                word = "bottle";
            }// end if
            System.out.println(bottlesOfBeer + " " + word +
                    " of Beer on the wall");
            System.out.println(bottlesOfBeer + " " + word +
                    " of beer");
            System.out.println("Take one down ");
            System.out.println("pass it around");
            bottlesOfBeer--;
            if (bottlesOfBeer > 0){
                System.out.println(bottlesOfBeer + " " +word +
                        " of Beer on the wall\n");

            }else{
                System.out.println("No more bettles of Beer on the wall");

            }// end if/else
        }// end while loop

    }// end method

}// end class
