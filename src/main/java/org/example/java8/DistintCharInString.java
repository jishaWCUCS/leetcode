package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DistintCharInString {

    public static void main(String[] args){
        String s ="leetcode";
       String str = s.chars().distinct().mapToObj(c->String.valueOf((char)c)).
               collect(Collectors.joining());
        System.out.println(str);
    }

}
