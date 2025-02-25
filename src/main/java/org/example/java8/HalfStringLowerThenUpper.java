package org.example.java8;

public class HalfStringLowerThenUpper {
    public static void main(String[] args) {
        String s = "leetcode";
        int n = s.length()/2;
        String firstHalf = s.substring(0,n).toLowerCase();
        String secondHalf = s.substring(n,s.length()).toUpperCase();
        String str = firstHalf + secondHalf;
        System.out.println(str);
    }
}
