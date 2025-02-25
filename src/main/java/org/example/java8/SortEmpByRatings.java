package org.example.java8;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmpByRatings {

    //Given a list of employees with their ratings, how can you sort the
    // employees based on their ratings using the Java 8 Streaming API?

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(1.8, "Jisha","M"),
                new Employee(2.0, "Sum","C"),
                new Employee(1.2, "Juv","A"),
                new Employee(2.4, "Juv2","C"));
        List<Employee> sorted = empList.stream().sorted(Comparator.comparing(Employee::getRating))
                .collect(Collectors.toList());
        System.out.println(sorted);
        List<Employee> empList1 = empList.stream().
                sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());
        System.out.println(empList1);
        Map<Double, List<Employee>> empList2 = empList.stream().collect(Collectors.groupingBy(Employee::getRating));
        System.out.println(empList2);
    }

}
