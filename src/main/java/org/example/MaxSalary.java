package org.example;

import java.util.*;

public class MaxSalary {

    public static void main(String[] args){
        List<Integer> salary = Arrays.asList(100, 200, 400, 300,900);
        Optional<Integer> maxSal = salary.stream().distinct()
                .sorted(Comparator.reverseOrder()).limit(1).findFirst();
        Optional<Integer> maxSal1= salary.stream().distinct()
                .max(Integer::compare).stream().findFirst();
        maxSal.ifPresent(System.out::println);
        maxSal1.ifPresent(System.out::println);
      /*  Integer max = salary.stream().
                reduce((sal1,sal2)->sal1>sal2?sal1 : sal2).get();
        System.out.println(max);*/
    }
}



