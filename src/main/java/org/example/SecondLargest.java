package org.example;

import java.util.*;

public class SecondLargest {

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,30,20,40,40,50,50);
        Optional<Integer> salary = list.stream().
                distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(salary);
    }
}
