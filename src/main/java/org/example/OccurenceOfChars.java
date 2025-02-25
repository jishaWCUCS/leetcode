package org.example;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        Map<Character, Long> map = s.chars().
                mapToObj(c->(char)c).filter(Character::isLetter).
                collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(map);
    }
}
