package org.example;

import java.util.stream.Stream;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        System.out.println(str1.equals(str2));          // false
        System.out.println(str1.equalsIgnoreCase(str2));// true
        System.out.println(str1.compareTo(str2));       // negative value (J < j in ASCII)
        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);
    }
}
