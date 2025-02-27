package org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {

    public static void main(String[] args){
        /*List<Employees> employee = Arrays.asList(
                new Employees(1,"Jisha","Computer Science",123.90,2),
                new Employees(2,"Juven","Aneasthesia",345.23,6),
                new Employees(3,"Sumesh","Science",765.0,8),
                new Employees(4,"Baby","Computer Science",876.2,5)
        );
        //Find the total number of employees in the company.
        System.out.println("Total employees: "+employee.stream().collect(Collectors.counting()));
        //Calculate the average salary of all employees.
        Double avgSal = employee.stream().mapToDouble(Employees::getSalary).average().orElse(0);
        System.out.println(avgSal);
        //Identify the employee with the highest salary.
        System.out.println("Max Salary : "+employee.stream().max(Comparator.comparing(Employees::getSalary)).get());
        //Filter employees based on years of experience and
        // count the number of employees with more than 5 years of experience.
        System.out.println("Employees exp greater than 5 are : "
                +employee.stream().filter(c -> c.getExperience() >5).count());*/
    }
}
