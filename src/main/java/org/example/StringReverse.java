package org.example;

public class StringReverse {

    public static void main(String[] args){
        String str = "Jisha";
        //char[] ch = str.toCharArray();//['j','i','s'];
        for(int i = str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}
