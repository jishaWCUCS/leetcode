package org.example.java8;

public class Animal {

    private  String name;
    private  String location;
    private  Double size;

    public Animal(String name, String location, Double size) {
        this.location = location;
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", size=" + size +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}
