package org.example.java8;

import java.util.*;
import java.util.stream.Collectors;

public class FindSecondDupNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 6, 2, 3, 2, 6, 1);
        Set<Integer> hset = new HashSet<>();
        Optional<Integer> sortedInt = list.stream().filter(c -> !hset.add(c)).skip(1).findFirst();
        sortedInt.ifPresent(dup -> System.out.println(dup));
    }
}