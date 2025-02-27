package org.example.comparator;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Jisha", 10, 1),
                new Employee("Juven", 5, 2),
                new Employee("Sumesh", 3, 3
                ));
        Collections.sort(list, new AgeComparator());
        System.out.println("\nSorted by Age:");
        list.forEach(System.out::println);

        //Using Java8
        list.sort(Comparator.comparing(s -> s.getAge()));
        System.out.println("\nSorted by name:");
        list.stream().sorted(Comparator.comparing(Employee::getName));
        list.forEach(System.out::println);
    }
}