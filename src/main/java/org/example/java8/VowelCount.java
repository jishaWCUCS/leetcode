package org.example.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class VowelCount {
    //Write a program find Vowel Count in String using Java 8.
    public static void main(String[] args) {
        String s = "leetcode";
        final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');
      /*  int count = 0;
        for(char ch : s.toCharArray()){
           if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u')
               count++;
        }
        System.out.println(count);*/
        System.out.println(s.chars().mapToObj(c->(char)c).filter(c->VOWELS.contains(c)).
                count());
    }
}
