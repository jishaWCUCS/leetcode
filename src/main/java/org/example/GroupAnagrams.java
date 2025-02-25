package org.example;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] words = {"bat", "tab", "cat", "act", "dog"};
        Map<String, List<String>> hmap = new HashMap<>();
        for(String str : words) {
            int[] counter = new int[26];
            for(char ch : str.toCharArray()){
                counter[ch - 'a']++;
            }
            String key = Arrays.toString(counter);
            hmap.putIfAbsent(key, new ArrayList<>());
            hmap.get(key).add(str);
        }
        System.out.println(new ArrayList<>(hmap.values()));
    }

}
