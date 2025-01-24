package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfDupChar {

    public static void main(String[] args){
        String str = "Hi There Hai".toLowerCase();
        Map<Character, Integer> count = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                count.put(ch, count.getOrDefault(ch,0)+1);
            }
        }
        for(Map.Entry<Character, Integer> dupcount : count.entrySet()){
            if(dupcount.getValue()>1){
                System.out.println("Key: "+dupcount.getKey()+", Value: "+dupcount.getValue());
            }
        }

        //Using Stream API
        Map<Character, Long> count1 = str.chars().
                mapToObj(c -> (char) c).
                filter(Character::isLetter).
                collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(count1);
        count1.entrySet().stream().
                filter(c ->c.getValue() >1).
                forEach(dupCharMap -> System.out.println
                        ("key: "+dupCharMap.getKey()+", Value: "+dupCharMap.getValue()));
    }




    //[h:3,i:2....
}
