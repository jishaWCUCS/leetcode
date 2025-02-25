package org.example.java8;

import java.util.Objects;

public class Employee{

    private Double rating;
    private String empName;
    private String department;

    public Employee(Double rating, String empName, String department){
        this.rating = rating;
        this.empName = empName;
        this.department = department;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rating=" + rating +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}