package org.example;

public class StringReverse {

    public static void main(String[] args){
        String str = "Jisha";
        String s  = "";//['j','i','s'];
        for(int i = str.length()-1;i>=0;i--){
            s += str.charAt(i);
        }
        System.out.println(s);
    }
}
