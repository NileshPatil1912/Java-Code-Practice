package com.geeksforgeeks.Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstElementKTime {
    //https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1?page=1&curated[]=1&sortBy=difficulty
    public static void main(String[] args) {
        int[] A = {1, 7, 4, 3, 4, 8, 7};
        int K =2;
        System.out.println(firstElementKTime(A,A.length,K));
    }
    public static int firstElementKTime(int[] a, int n, int k) {
        LinkedHashMap<Integer, Integer> arrayElementCounts = new LinkedHashMap<>();
        for(int i=0; i<n; i++){
            if(arrayElementCounts.containsKey(a[i])){
                int count = arrayElementCounts.get(a[i]);
                arrayElementCounts.put(a[i],++count);
            }
            else{
                arrayElementCounts.put(a[i],1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: arrayElementCounts.entrySet()) {
            if(entry.getValue() >= k) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
