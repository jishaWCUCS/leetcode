package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNumberOfWordsrInAString {

    public static void main(String[] args){
        String s = "This world is beautiful is this".toLowerCase();
        Map<String, Integer> hmap = new HashMap<>();
        String[] str = s.split(" ");
        int count = str.length;
            System.out.println("Number of words are : "+count);
        List<String> list = Arrays.asList(s);

    }
}
