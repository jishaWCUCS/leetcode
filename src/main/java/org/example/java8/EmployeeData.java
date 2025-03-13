package org.example.java8;

public class EmployeeData {

    private int empId;
    private String name;
    private String Department;
    private int age;
    private String gender;
    private Double salary;

    public EmployeeData(int empId, String name, String department, int age, String gender, Double salary) {
        this.empId = empId;
        this.name = name;
        Department = department;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
