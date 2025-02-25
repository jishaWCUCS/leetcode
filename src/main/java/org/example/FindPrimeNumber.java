package org.example;

import java.util.stream.IntStream;

public class FindPrimeNumber {

    public static boolean isPrime(int number) {
       if(number<2) return false;// Prime numbers start from 2
        /*Why sqrt(number)?
        Any factor of a number n greater than sqrt(n) will already have been checked
        as a factor below sqrt(n).
        Example:
        Consider 36:
        Factors: (2 × 18), (3 × 12), (4 × 9), (6 × 6)
        Once we reach sqrt(36) = 6, we don’t need to check beyond that.
        If a number has no divisors up to its square root, it’s prime.*/
       return IntStream.rangeClosed(2, (int)Math.sqrt(number)).
               allMatch(n->number%n !=0);// Check if it's divisible
    }
    public static void main(String[] args) {
        int num = 29;
        System.out.println(num + " is prime: " + isPrime(num));
    }
}
