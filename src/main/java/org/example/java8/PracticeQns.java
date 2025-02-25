package org.example.java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeQns {

    //Given a list of integers, separate odd and even numbers?
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddList = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("evenList: "+evenList+", oddList: "+oddList);

        //remove duplicate elements from a list using Java 8 streams
        List<Integer> dupList = Arrays.asList(1,2,3,4,5,6,6,6,7,4,3,2,1);
        List<Integer> filteredList = dupList.stream().distinct().collect(Collectors.toList());
        System.out.println(filteredList);

        //find frequency of each character in a string using Java 8 streams
        String s = "leetcode";
        Map<Character, Long> charcount = s.chars().mapToObj(a -> (char)a).
                collect(Collectors.groupingBy(character -> character,Collectors.counting()));
        System.out.println(charcount);

        //frequency of each element in an array or a list
        List<String> strList = Arrays.asList("Pen","Pencil","Book","Pen","Paper");
        Map<String,Long> map = strList.stream().
                collect(Collectors.groupingBy(str ->str, Collectors.counting()));
        System.out.println(map);

        //sort the given list of decimals in reverse order
        List<Double> decimals = Arrays.asList(1.2,5.6,0.2,6.0,0.1,0.8,2.2);
        decimals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //given list of integers, print the numbers which are multiples of 5
        List<Integer> listoFFives = Arrays.asList(10,20,3,4,5,60,7,80,9);
        System.out.println(listoFFives.stream().filter(n-> n % 5 ==0).collect(Collectors.toList()));

        // list of integers, find maximum and minimum of those numbers
        List<Integer> maxMinList = Arrays.asList(10,20,3,4,5,60,7,80,9);
        int max = maxMinList.stream().max(Comparator.naturalOrder()).get();
        int min = maxMinList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min: "+min+", max: "+max);

        //merge two unsorted arrays into single sorted array using Java 8 streams
        int[] arr = {8,1,3,5};
        int[] arr1 = {0,10,3,5};
        int[] mergedArray = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr1)).
                sorted().toArray();
        System.out.println(Arrays.toString(mergedArray));

        //merge two unsorted arrays into single sorted array without duplicates
        int[] a = {8,1,3,5};
        int[] b = {0,10,3,5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().
                sorted().toArray();
        System.out.println(Arrays.toString(c));

        //get three maximum numbers and three minimum numbers from the given list of integers
        List<Integer> maxMin = Arrays.asList(10,20,3,4,5,60,35,45,99,11,12,15,7,80,9);
        List<Integer> maxList = maxMin.stream().sorted(Comparator.reverseOrder()).
                limit(3).collect(Collectors.toList());
        List<Integer> minList = maxMin.stream().sorted(Comparator.naturalOrder()).
                limit(3).collect(Collectors.toList());
        System.out.println(maxList+", "+minList);

        //Java 8 program to check if two strings are anagrams or not
        String s1 ="listen";
        String s2 = "silent";
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        boolean isAnagram = s1.equals(s2);
        System.out.println(isAnagram);

        //sum of all digits of a number in Java 8
        List<Integer> digits = Arrays.asList(10,20,3);
        int sum = digits.stream().reduce(Integer::sum).get();
        System.out.println(sum);

        //second largest num
        List<Integer> secondLargestNum = Arrays.asList(10,20,3);
        System.out.println(secondLargestNum.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());

        //Given a list of strings, sort them according to increasing order of their length
        List<String> stringList = Arrays.asList("Pen","Pencils","Book","Pen","Paper");
        stringList.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        //Given an integer array, find sum and average of all elements
        List<Integer> digitList = Arrays.asList(10,20,3);
        int intSum = digitList.stream().reduce(Integer::sum).get();
        Double doubleVal = digitList.stream().
                mapToDouble(value -> value.doubleValue()).average().getAsDouble();
        System.out.println(intSum+", "+doubleVal);

        //Find first non-repeated character in a string?
        String stri = "swiss"; // Example input

        Character firstNonRepeated = stri.chars()
                .mapToObj(z -> (char) z)
                .filter(w -> stri.indexOf(w) == stri.lastIndexOf(w)) // Check if character appears only once
                .findFirst()
                .orElse(null); // Return null if no unique character found

        System.out.println(firstNonRepeated); // Output: w

        //Non repeated character
        Character firstRepeated = stri.chars()
                .mapToObj(z -> (char) z)
                .filter(w -> stri.indexOf(w) == stri.lastIndexOf(w)) // Check if character appears only once
                .findFirst()
                .orElse(null);
        System.out.println(firstRepeated);

        //Print duplicate characters in a string
        String inputString = "Java Concept Of The Day";
        Set<Character> hset = new HashSet<>();
        System.out.println(inputString.toLowerCase().chars().mapToObj(m -> (char)m).
                filter(Character::isLetterOrDigit).
                filter(r -> ! hset.add(r)).
                collect(Collectors.toSet()));

    }
}
