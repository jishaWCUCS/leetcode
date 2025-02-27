package org.example.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpSolution {

    public static void main(String[] args) {

        List<Employees> employeesList = Arrays.asList(

                (new Employees(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0)),
                (new Employees(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0)),
                (new Employees(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0)),
                (new Employees(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0)),
                (new Employees(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0)),
                (new Employees(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0)),
                (new Employees(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0)),
                (new Employees(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0)),
                (new Employees(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0)),
                (new Employees(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5)),
                (new Employees(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0)),
                (new Employees(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0)),
                (new Employees(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0)),
                (new Employees(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5)),
                (new Employees(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0)),
                (new Employees(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0)),
                (new Employees(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0)));

        //Find out the count of male and female employees present in the organization?
        System.out.println("Male count : " + employeesList.stream().filter(c -> "Male".equals(c.getGender())).count());
        System.out.println("Female count : " + employeesList.stream().filter(c -> "Female".equals(c.getGender())).count());
        System.out.println(employeesList.stream().collect(Collectors.groupingBy(Employees::getGender, Collectors.counting())));

        //Write a program to print the names of all departments in the organization.
        employeesList.stream().map(Employees::getDepartment).distinct().forEach(System.out::println);

        //Find the average age of Male and Female Employees.
        System.out.println(employeesList.stream().filter(e -> "Male".equals(e.getGender())).
                mapToInt(Employees::getAge).average().orElse(0));
        System.out.println(employeesList.stream().filter(e -> "Female".equals(e.getGender())).
                mapToInt(Employees::getAge).average().orElse(0));

        //Get the Names of employees who joined after 2015.
        System.out.println(employeesList.stream().filter(emp -> emp.getYearOfJoining() > 2015).
                map(Employees::getName).collect(Collectors.toList()));

        //Count the number of employees in each department.
        Map<String, Long> hmap1 =
                employeesList.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting()));
        hmap1.forEach((key, value) ->{
            System.out.println(key+" : "+value);
        });

        //Find out the average salary of each department.
        Map<String, Double> hmap2 = employeesList.stream().collect(Collectors.groupingBy(Employees::getDepartment,
                Collectors.averagingDouble(Employees::getSalary)));
        hmap2.forEach((key,value) ->{
            System.out.println(key+": "+value);
        });

        //Find out the oldest employee, his/her age and department?
        System.out.println("oldest employee: "+employeesList.stream().max(Comparator.comparing(Employees::getAge))
                .map(Employees::getName).get());

        // Find out the average and total salary of the organization.
        System.out.println(employeesList.stream().map(Employees::getSalary).reduce(Double::sum));
        System.out.println(employeesList.stream().mapToDouble(Employees::getSalary).average().getAsDouble());

        // List down the employees of each department.
        Map<String, List<Employees>> hmap3 = employeesList.stream().
                collect(Collectors.groupingBy(Employees::getDepartment));
        hmap3.forEach((key,value) -> {
            System.out.println("--------------------------------------");
            System.out.println("Employees In "+key + " department : ");
            System.out.println("--------------------------------------");
           for(Employees emp : value){
               System.out.println(emp.getName());
           }
        });

        //Find out the highest experienced employees in the organization
        Employees emp1 = employeesList.stream().
                min(Comparator.comparing(Employees::getYearOfJoining)).get();
        System.out.println("Highest experienced Employee: "+emp1.getName());
    }
}
