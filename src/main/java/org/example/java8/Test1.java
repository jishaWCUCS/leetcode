package org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args){
        //List<String> list = Arrays.asList("Jisha","Anu","Amal","Juven","Ajuven","Sumesh");
        //Group The employees By Department Names
        List<EmployeeData> employeeDataList = Arrays.asList(
                new EmployeeData(1,"Jisha","Computer Science",2,"Female",12.4),
                new EmployeeData(2,"Juven","Medicine",5,"Male",98.54),
                new EmployeeData(3,"Sumesh","Computer Science",7,"Male",12.4),
                new EmployeeData(4,"ritu","HR",30,"Female",76.34),
                new EmployeeData(5,"Anmol","Computer Science",32,"Male",25.43)
        );
        //Find list of employees whose name starts with alphabet A
        System.out.println(employeeDataList.stream().filter(e -> e.getName().startsWith("A"))
                .collect(Collectors.toList()));
        //Group The employees By Department Names
        System.out.println(employeeDataList.stream().collect(Collectors.groupingBy(EmployeeData::getDepartment)));

        //Find the total count of employees using stream
        System.out.println(employeeDataList.stream().count());

        //Find the max age of employees
        System.out.println(employeeDataList.stream().max(Comparator.comparing(EmployeeData::getAge)).get());
        //Find all department names
        System.out.println(employeeDataList.stream().map(EmployeeData::getDepartment).distinct().
                collect(Collectors.toList()));
        //Find the count of employee in each department
        System.out.println(employeeDataList.stream().
                collect(Collectors.groupingBy(EmployeeData::getDepartment, Collectors.counting())));
        //Find the list of employees whose age is less than 30
        System.out.println(employeeDataList.stream().filter(c -> c.getAge() <30).collect(Collectors.toList()));
        //Find the list of employees whose age is in between 26 and 31
        System.out.println(employeeDataList.stream().
                filter(e -> e.getAge()<31 && e.getAge()>26).collect(Collectors.toList()));
        //Find the average age of male and female employee
        System.out.println(employeeDataList.stream().collect(Collectors.groupingBy(EmployeeData::getGender,
                Collectors.averagingInt(EmployeeData::getAge))));
        //Find the department who is having maximum number of employee
        System.out.println(employeeDataList.stream().collect(Collectors.groupingBy(EmployeeData::getDepartment,Collectors.counting())).entrySet()
                .stream().max(Map.Entry.comparingByValue()).get());
        //Find the Employee whos department in computer science and sort them by their names

        //Find the average salary in all departments
        System.out.println(employeeDataList.stream().
                collect(Collectors.groupingBy(EmployeeData::getDepartment,Collectors.averagingDouble(EmployeeData::getSalary))));
        //Find the highest salary in each department
        System.out.println(employeeDataList.stream().max(Comparator.comparingDouble(EmployeeData::getSalary)).get());
        //Find the list of employee and sort them by their salary
        System.out.println(employeeDataList.stream().sorted(Comparator.comparing(EmployeeData::getSalary).reversed())
                .collect(Collectors.toList()));
        //Find the employee who has second highest salary
        System.out.println(employeeDataList.stream().
                sorted(Comparator.comparing(EmployeeData::getSalary).reversed()).skip(1).findFirst().get());
    }
}
