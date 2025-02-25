package org.example.comparator;

public class Employee {

    private String name;
    private Integer age;
    private Integer employeeSalary;

    public String getName() {
        return name;
    }

    public Employee(String name, Integer age, Integer employeeSalary) {
        this.name = name;
        this.age = age;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
