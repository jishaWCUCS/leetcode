package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args){
        String str = "you put it I put they put it and I cut and you cut it";
        Map<String, Integer> hmap = new HashMap<>();
        String[] word = str.split(" ");
        for(String s : word){
            hmap.put(s, hmap.getOrDefault(s,0) +1);
        }
        for(Map.Entry<String,Integer> count : hmap.entrySet()){
            System.out.println("Key is : "+count.getKey()+", Value is "+count.getValue());
        }

    }
}
