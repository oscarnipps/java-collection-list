package com.company.maps;

import com.company.model.Student;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        //create new map with key value pair
        Map<String,Integer> itemMap = new HashMap<>();
        int id = 0;
        //insert item in map using put ( can also use 'putIfAbsent()' method on the map)
        itemMap.put("shoe" , 2);
        itemMap.put("box" , 1);
        itemMap.put("pot" , 4);
        itemMap.put("book" , 9);
        itemMap.put("slippers" , 4);

        //using for each loop
        itemMap.forEach((key , value) -> {
            System.out.println("{ " + key + " : " + value + " }");
        });
        
        //iterate through the map using the entries in the map
        for (Map.Entry<String, Integer> item : itemMap.entrySet()) {

            System.out.println("{ " + item.getKey() + " : " + item.getValue() + " }");
        }
    }
}
