package org.example;

import java.util.*;

public class MaxSalary {

    public static void main(String[] args){
        List<Integer> salary = Arrays.asList(100, 200, 400, 300,900);
        Optional<Integer> maxSal = salary.stream().distinct()
                .sorted(Comparator.reverseOrder()).limit(1).findFirst();
        System.out.println(maxSal);
    }
}
