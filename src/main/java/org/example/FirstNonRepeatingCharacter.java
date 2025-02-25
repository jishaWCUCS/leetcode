package org.example;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args){
        String s ="swiss";
        Map<Character,Integer> hmap = new HashMap<>();
        for(char ch : s.toCharArray()){
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);
        }
        System.out.println(hmap);
        for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
