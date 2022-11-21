package com.geeksforgeeks.Arrays;

import java.util.Arrays;

public class FindElements {
    //https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements4625
    public static void main(String[] args) {
        long[] a = {7, -2, 3, 4, 9, -1};
        long[] arr = findElements(a, a.length);
        for(long i : arr){
            System.out.println(i);
        }
}

    public static long[] findElements( long a[], long n)
    {
        // Your code goes here
        Arrays.sort(a);
        long[] arr = new long[a.length-2];
        for(int i=0; i<arr.length; i++){
            arr[i] = a[i];
        }
        return arr;
    }
}
