package com.fundamentals.exercises;

import com.fundamentals.java.Boat;
import com.fundamentals.java.House;
import com.fundamentals.java.SailBoat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lesson17Exercise {
    public void boatArrayList() {
        ArrayList<Boat> boatList = new ArrayList<>();
        boatList.add(new Boat(400.00f, 25));
        boatList.add(new SailBoat());
        boatList.add(new Boat());
        for (Boat boat : boatList) {
            boat.weight();
        }
    }

    public void houseHashMap() {
        HashMap<House,String> house1 = new HashMap<>();
        house1.put(new House("green")," This is the color of the door ");
        house1.put(new House("Blue","Steel",
                "Concrete",32),"Wow that is cool");
        for (Map.Entry<House,String> myItem : house1.entrySet()){
            System.out.println( myItem.getValue());

        }//end for each loop

        }// end method


}//end class
