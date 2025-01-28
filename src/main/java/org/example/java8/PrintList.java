package org.example.java8;

import java.util.Arrays;
import java.util.List;

public class PrintList {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,7,6,7);
        list.forEach(System.out::println);
    }
}
