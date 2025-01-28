package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class maxValInString {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 7, 6, 7);
        List<String> strlist = Arrays.asList("a","b","c");
        System.out.println(list.stream().max(Integer::compare).orElse(0));
        convertToUpCase(strlist);
    }
    public static void convertToUpCase(List<String> strlist){
        System.out.println(strlist.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}
