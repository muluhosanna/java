package com.fundamentals.lessons;
/*
* This class goes over Lesson 16 contents
* enumeration
 */
public class Lesson16 {
    public  enum IcecreamFlavors {VANILA,CHOCOLATE,STRAWBERRY,ROCK_ROAD}
    public void showEnum(){
        Lesson16Enum d1 = Lesson16Enum.WED;
        System.out.println(d1);
        d1.someEnumMethod();
        System.out.println(IcecreamFlavors.STRAWBERRY);
        System.out.println(Lesson16Enum.FRI);
    }//end method
    public void myFavoriteFlavor(IcecreamFlavors flavors){
        String message = "My favorite flavor is ";
        switch (flavors){
            case VANILA:
                message += "vailla";// same as message = message +"vanilla
                break;
            case CHOCOLATE:
                message += "Chocolate";
                break;
            case STRAWBERRY:
                message += "strawberry";
                break;
            default:
                message += "Rocky Road";
                break;


        }//end switch
        System.out.println(message);
    }//end method
}//end class
