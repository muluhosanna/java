package com.fundamentals.exercises;

public class Lesson16Exercise {
    public enum MovieGenres{ACTION, COMEDY, DRAMA, FANTASY, HORROR, ROMANCE}
    public void movieFamous(MovieGenres movie){
        String message1 = "The famous movie is";
        switch (movie){
            case ACTION:
                message1  += " ACTION";
                break;
            case COMEDY:
                message1  += " COMEDY";
                break;
            case DRAMA:
                message1  += " DRAMA";
                break;
            case FANTASY:
                message1  += " FANTASY";
                break;
            case HORROR:
                message1  += " HORROR";
                break;
            default:
                message1  += " ROMANCE";
                break;

        }// end switch
        System.out.println(message1);
    }// end method
}// end class
