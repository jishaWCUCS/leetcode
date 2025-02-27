package org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortE {

    //Given a list of employees with their ratings, how can you sort the
    // employees based on their ratings using the Java 8 Streaming API?

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(1.8, "Jisha","M"),
                new Employee(2.0, "Sum","C"),
                new Employee(1.2, "Juv","A"),
                new Employee(2.4, "Juv2","C"));
        System.out.println("\nSorted by rating:");
        List<Employee> sorted = empList.stream().sorted(Comparator.comparing(Employee::getRating))
                .collect(Collectors.toList());
        System.out.println(sorted);
        System.out.println("\nSorted by name:");
        List<Employee> empList1 = empList.stream().
                sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());
        System.out.println(empList1);
    }

}
