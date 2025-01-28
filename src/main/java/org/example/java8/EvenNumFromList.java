package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 7, 6, 7);
        System.out.println(list.stream().filter(i -> i%2 == 0).collect(Collectors.toList()));
    }
}
