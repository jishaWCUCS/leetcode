package org.example.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Java8Practice {

    public static void main(String[] args){
        //Write a Java Program to find whether a number is prime or not.
        int num = 4;
        if(num <=1){
            System.out.println(num+" is a prime number");
            return;
        }
        boolean isPrime = IntStream.rangeClosed(2, (int) Math.sqrt(num)).
                noneMatch(x -> num%x == 0);
        System.out.println(isPrime);
    }
}
