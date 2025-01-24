package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWordsrInAString {

    public static void main(String[] args){
        String s = "This world is beautiful is this".toLowerCase();
        Map<String, Integer> hmap = new HashMap<>();
        String[] str = s.split(" ");
        int count =0;
        for(String word : str){
            count++;
        }
            System.out.println("Number of words are : "+count);
    }
}
