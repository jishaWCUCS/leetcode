package org.example.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountStringsByLength {
    public static void main(String[] args){
       List<String> list = Arrays.asList("leetcode","abc","bcd","qaqa","qwes");
       Map<Integer, List<String>> hmap = list.stream().
               collect(Collectors.groupingBy(String::length));
        System.out.println(hmap);
       }
}
