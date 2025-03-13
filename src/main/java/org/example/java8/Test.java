package org.example.java8;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void foo(Integer i) {
        System.out.println("foo(Integer)");
    }

    public static void foo(short i) {
        System.out.println("foo(short)");
    }

    public static void foo(long i) {
        System.out.println("foo(long)");
    }

    public static void foo(int... i) {
        System.out.println("foo(int ...)");
    }

    public static void main(String[] args){

        Map<String, String> hmap = new HashMap<>();
        hmap.put("Jisha","Software Engineer");
        hmap.put("Sini","Software Engineer");

        hmap.forEach((key,value) ->{
            System.out.println(key+": "+value);
        });
        System.out.println(hmap.entrySet().stream().
                filter(c -> "Jisha".equals(c.getKey())).collect(Collectors.toList()));
        foo(10);
    }
}
