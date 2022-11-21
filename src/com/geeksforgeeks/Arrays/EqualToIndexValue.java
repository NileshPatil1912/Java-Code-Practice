package com.geeksforgeeks.Arrays;

import java.util.ArrayList;

public class EqualToIndexValue {
    //https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&category[]=Arrays&sortBy=difficulty
    public static void main(String[] args) {
        int[] Arr = {15, 2, 45, 12, 7};
        ArrayList<Integer> arrayList= valueEqualToIndex(Arr, Arr.length);
        System.out.println(arrayList);
    }
    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> arrayList= new ArrayList<>();

        for(int i=0; i<n; i++){
            if(arr[i]==i+1){
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }
}
