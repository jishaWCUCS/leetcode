package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GriupStringsByLength {
    public static void main(String[] args) {
        List<String> strlist = Arrays.asList("ab", "bcd", "defg", "hij", "lmn", "opqr");
        Map<Integer, List<String>> hmap = strlist.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(hmap);
    }
}
