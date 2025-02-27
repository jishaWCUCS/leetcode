package org.example.java8;

import org.example.StringReverse;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,2,3,5,1,6);
        List<Integer> distinctList= list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        //Find all elements starting with "A" in a list.
        List<String> strList = Arrays.asList("Apple","Boy","Cat","Animal","Bat");
        List<String> strList1 = strList.stream().filter(c ->c.startsWith("A")).collect(Collectors.toList());
        System.out.println(strList1);

        //You have a list of Animal objects. The object has three fields: String name, String location, and Double size.
        //Using streams, convert location to uppercase, sort the list alphabetically by name, and print size over 2.0
        List<Animal> animals = Arrays.asList(
                new Animal("kuala","Africa",2.0),
                new Animal("Lion","America",2.2),
                new Animal("Tiger","Cuba",1.2),
                new Animal("Giraffe","India",2.4)
        );
        List<Animal> animalList = animals.stream().
                map(animal -> new Animal(animal.getName(),animal.getLocation().toUpperCase(),animal.getSize())).
                sorted(Comparator.comparing(Animal::getName)).
                filter(animal -> animal.getSize() >2.0).collect(Collectors.toList());

        System.out.println(animalList);

        //Sort a list of strings alphabetically and in reverse order.
        List<String> strList2 = strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(strList2);

        List<String> strList3 = strList.stream().sorted().collect(Collectors.toList());
        System.out.println(strList3);

        //Flattens lists of list
        List<List<Integer>> intList =  Arrays.asList(Arrays.asList(1,2,3,4,5));
        List<Integer> intList1 = intList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(intList1);

        //Second Highest number in a list
        List<Integer> list1 = Arrays.asList(1,2,2,3,5,1,6);
        int secInt = list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secInt);

        //Count the frequency of characters in a string using Streams.
        String str2 = "Apple";
        Map<Character, Long> hmap = str2.chars().
                mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("hmap : "+hmap);

        //Generate an infinite Stream of even numbers and limit it to 10 elements.
        List<Integer> list2 = Arrays.asList(
                1,2,2,3,8,9,10,2,3,5,1,6,12,13,14,16,16,17,18,3,6,8,9,10,19,20,21,22,23,24);
        List<Integer> intList2 = list2.stream().filter(n -> n%2 == 0).limit(10).
                collect(Collectors.toList());
        System.out.println(intList2);

        //Check if all elements in a list are greater than a given number
        List<Integer> list3 = Arrays.asList(
                1,2,2,3,8,9,10,2,3,5,1,6,12,13,14,16,16,17,18,3,6,8,9,10,19,20,21,22,23,24);
        Boolean result = list3.stream().anyMatch(n -> n>5);
        System.out.println(result);

        //Find the average of a list of numbers


        //Group employees by department
        List<Employee> empList = Arrays.asList(new Employee(
                4.8,"Juven","Computer Science"),
                new Employee(2.8,"Sumesh","Computer"),
                new Employee(3.2,"Jisha","Medicine")
        );
        Map<Double, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getRating));
        System.out.println(empMap);

//check if a vowel is present in a string.
        String str ="sws";
        Set<Character> set = Set.of('a','e','i','o','u');
        for(char ch : str.toCharArray()){
            if(set.contains(ch)){
                System.out.println("true"+set);
            }
            System.out.println("false");
        }

    }
}
