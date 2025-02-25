package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MovePosNegInt {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 11, -13, -5, 6, -7, 5, -3, -6);
        System.out.println(movePosNeg(list));
    }
        public static List movePosNeg(List<Integer> list){
           /*List<Integer> newList = new ArrayList<>();
            int[] arr = new int[list.size()];
            int left = 0;
            int right = list.size() - 1;
            for(int i=0;i<list.size();i++) {
                if (list.get(i) > 0) {
                    arr[right] = list.get(i);
                    right--;
                } else if (list.get(i) <= 0) {
                    arr[left] = list.get(i);
                    left++;
                }
            }
            newList = IntStream.of(arr).boxed().collect(Collectors.toList());
            return newList;*/
            List<Integer> newList = new ArrayList<>(Collections.nCopies(list.size(),0));
            int left = 0;
            int right = list.size() - 1;
            for(Integer num : list){
                if(num>0){
                    newList.set(right--, num);
                }else{
                    newList.set(left++, num);
                }
            }
            return newList;//[-1,-2,-4,-3,9,8,7,6]
        }
}
