package org.example;


import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChars {

    public static  void main(String[] args){
        String s = "Hello There";
        Map<Character, Integer> hmap = new HashMap<>();
        for(char c :s.toCharArray()){
            if(Character.isLetter(c)){
                hmap.put(c, hmap.getOrDefault(c,0)+1);
            }
        }
        System.out.println(hmap);
        }
}
