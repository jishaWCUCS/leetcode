package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoStringsAreAnagram {
    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";
        boolean isAnagram = isAnagram(s,t);
        System.out.println(isAnagram);

}

    private static boolean isAnagram(String s, String t) {
       /* if(s.length() != t.length()){
            return false;
        }
        char[] ch = s.toCharArray();
        char[] c = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(c);
        return Arrays.equals(ch,c);*/

        //Optimal solution with o(n)
        if(s.length() != t.length())return false;
        int[] counter = new int[26];
        for(int i =0;i<s.length();i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int count : counter){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
