package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateString {
    public static void main(String[] args){
       /*  String str = "Hello There".toLowerCase();
         Set<Character> hset = new HashSet<>();
        Set<Character> set = new LinkedHashSet<>();
         for(char ch : str.toCharArray()){
             if(Character.isLetter(ch) && !hset.add(ch)){
                 set.add(ch);
             }
         }
        System.out.println(set);*/
        String str = "Hello There".toLowerCase();
        Set<Character> hset = new HashSet<>();
        Set<Character> linkedHashSet =  str.chars().
                mapToObj(c -> (char) c).
                filter(Character::isLetter).filter(c->!hset.add(c)).
                collect(Collectors.toCollection(LinkedHashSet :: new));
        System.out.println(linkedHashSet);

    }
}
