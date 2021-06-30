package com.fundamentals.lessons;
import com.fundamentals.java.House;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;


import com.fundamentals.java.House;
/*
* The java.util.* should not be used in favor of
* individual import do to memory limitations.
* This class goes over the Lesson17 content
* collection framework
 */
public class Lesson17 {
    public void exampleArrayList1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("happy");
        list.add("Wednesday");
        list.add("Not Monday");
        list.add("Where's Friday");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }//end for loop

    }// end method
    public void exampleArrayList2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(42);
        list.add(103);
        list.add(10);
        for (Integer number : list) {
            System.out.println(number);


        }//  end for loop

    }// end method
    public void exampleArrayListHouse(){
        ArrayList<House> houseList = new ArrayList<>();
        houseList.add(new House());
        //houseList.add(House)
        houseList.add(new House("Green"));
        houseList.add(new House("Blue","Steel",
                "Concrete",32));
        for (House house : houseList){
            System.out.println(house.getDoorColor());
            System.out.println(house.getFoundationType());
            System.out.println(house.getWindowSize());
            System.out.println(house.getRoofStyle() + "\n");
        }//end for loop

    }//end method
public void exampleHashset(){
    HashSet<String> myHash = new HashSet<>();
    myHash.add("Firecrakers");
    myHash.add("sparklers");
    myHash.add("Fountains");
    Iterator<String> iterate = myHash.iterator();
    while(iterate.hasNext()){
        System.out.println(iterate.next());
    }//end while
    // enhanced for loop
    for (String hash : myHash){
        System.out.println(hash);
    }//end for loop
}// end method
public void exampleHashMap(){
    HashMap<Integer, String> myMap = new HashMap<>();
    myMap.put(10,"wednesday");
    myMap.put(15,"Thursday");
    myMap.put(20,"Friday");
    myMap.put(25,"Saturday");
   // myMap.put(30,"Thursday");
    for (Map.Entry<Integer, String> myItem : myMap.entrySet()){
        System.out.println(myItem.getKey() + "=" + myItem.getValue());
    }//end for loop
}// end method
    // id, shingle, concrete, gray

}// end class
