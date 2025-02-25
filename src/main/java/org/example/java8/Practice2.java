package org.example.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice2 {

    public static void main(String[] args) {

        //Java Program to find whether a number is prime or not.
        int num = 29;
        if (num <= 1) {
            System.out.println(num + " is not a prime number");
            return;
        }
        boolean isPrime = IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(x -> num % x == 0);
        System.out.println(isPrime);

        //Write a program to print duplicate numbers.lo
        int a[] = {1, 4, 5, 2, 12, 34, 2, 11, 6, 5};
        Map<Integer, Long> hmap = Arrays.stream(a).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> list = hmap.keySet().stream().filter(x -> hmap.get(x) > 1).
                collect(Collectors.toList());
        System.out.println(list);

        //Write a program to find whether a string or number is palindrome or not
        String s = "amananama";
        int len = s.length();
        String s1 = IntStream.range(0, s.length()).
                mapToObj(i -> s.charAt(len - 1 - i)).
                collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        boolean isPalindrome = s.equals(s1);
        System.out.println(isPalindrome);

        //Write a program to find min and max numbers in the array.
        List<Integer> intList = Arrays.asList(1, 4, 5, 2, 12, 34, 2, 11, 6, 5);
        System.out.println(intList.stream().max(Comparator.naturalOrder()).get());
        System.out.println(Arrays.stream(a).boxed().min(Comparator.naturalOrder()).get());
        System.out.println(Arrays.stream(a).boxed().reduce(Integer::max).get());
        System.out.println(Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).findFirst().get());

        //second highest number in an array
        int[] b = {1, 4, 5, 2, 12, 34, 2, 11, 6, 5};
        System.out.println(Arrays.stream(b).boxed().
                sorted(Comparator.reverseOrder()).skip(1).findAny().get());

        //Write a program to Find the Second Lowest Number.
        System.out.println(Arrays.stream(b).boxed().
                sorted(Comparator.naturalOrder()).skip(1).findFirst().get());

        //Write a program to print the First Not Repeated Char in string.
        String stri = "swiss";
        Set<Character> set = new HashSet<>();
        System.out.println(stri.chars().mapToObj(c -> (char)c).
                filter(ch -> stri.indexOf(ch) == stri.lastIndexOf(ch)).findFirst().orElse(null));

        //Write a program to a Flattering list of objects.
        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1,2,3,4,5,6));
        List<Integer> intList1 = listOfList.stream().
                flatMap(list1 -> list1.stream()).collect(Collectors.toList());
        System.out.println(intList1);

        //Write a program to Print Even and Odd Numbers
        int[] c = {1,2,3,4,5,6,7,8,9};
        Arrays.stream(c).boxed().filter(w -> w%2 ==0).forEach(System.out::println);
        Arrays.stream(c).boxed().filter(w -> w%2 !=0).forEach(System.out::println);

        //Write a program to sort the 2 arrays in ascending order.
        int[] d = {1,2,7,8,9};
        int[] e = {3,4,5,6};
        System.out.println(Stream.concat(Arrays.stream(d).boxed(), Arrays.stream(e).boxed()).
                sorted().collect(Collectors.toList()));

        //Write a program to sum an array.
        System.out.println(Arrays.stream(e).boxed().reduce(Integer::sum).get());

        //Write a program to sum an array without using the sum method.
        System.out.println(Arrays.stream(e).boxed().reduce(0,(x,y) -> x+y));

        //Write a program to find the only duplicate count list in the List.
        int[] w = {1, 4, 5, 2, 12, 34, 2, 11, 6, 5};
        Map<Integer, Long> hmap1= Arrays.stream(w).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> list3 = hmap1.keySet().stream().filter(z -> hmap.get(z)>1).collect(Collectors.toList());
        System.out.println(list3);

        //Write a program to find the only duplicate count list in the List.
        int[] y = {1, 4, 5, 2, 12, 34, 2, 11, 6, 5, 6};
        Map<Integer, Long> hmap2= Arrays.stream(y).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long list4 = hmap2.keySet().stream().filter(o -> hmap2.get(o)>1).collect(Collectors.counting());
        System.out.println(list4);

    }
}
