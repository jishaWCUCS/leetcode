package org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAnimal {

    //You have a list of Animal objects. The object has three fields: String name, String location, and Double size.
    //Using streams, convert location to uppercase, sort the list alphabetically by name, and print size over 2.0

    public static void main(String[] args) {
        List<Animal> list = Arrays.asList(
                new Animal("dog", "Africa", 2.8),
                new Animal("cat", "Africa", 2.2),
                new Animal("dog", "America", 1.0),
                new Animal("dog", "Cuba", 1.2));
        List<Animal> sortedList = list.stream().
                map(animal -> new Animal(animal.getName(), animal.getLocation().toUpperCase(), animal.getSize())).
                sorted(Comparator.comparing(e -> e.getName())).
                filter(a -> a.getSize() > 2.0).collect(Collectors.toList());
        System.out.println(sortedList);

    }





















  /*  List<Animal> processedAnimal = list.stream().
            map(animal -> new Animal(animal.getName(), animal.getLocation().toUpperCase(), animal.getSize())).
                   sorted(Comparator.comparing(Animal::getName)).
            filter(e->e.getSize() >=2.0).collect(Collectors.toList());
        processedAnimal.forEach(System.out::println);
}*/



}
