package org.example.java8;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,6,3,2};
        int[] arr2 = {3,4,5,9,7};
        int middleInteger = findMergedMiddleNumber(arr1, arr2);
        System.out.println(middleInteger);
    }

    private static int findMergedMiddleNumber(int[] arr1, int[] arr2) {
        int[] mergedArray =  new int[arr1.length+arr2.length];
        int n = mergedArray.length/2;
        System.arraycopy(arr1,0,mergedArray,0,arr1.length);
        System.arraycopy(arr2,0,mergedArray,arr1.length,arr2.length);
        Arrays.sort(mergedArray);//1,2,3,3,4,5,6,7,9
        return mergedArray[n];
    }
}
