package org.example.java8;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharInString {
    public static void main(String[] args) {
        String s = "eetcode";
        Character str = s.chars().mapToObj(c -> (char) c).
                filter(ch -> s.indexOf(ch) == s.lastIndexOf(ch)).findFirst().orElse(null);
        System.out.println(str);
    }
}