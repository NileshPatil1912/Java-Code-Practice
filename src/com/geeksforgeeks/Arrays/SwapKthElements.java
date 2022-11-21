package com.geeksforgeeks.Arrays;

public class SwapKthElements {
    //https://practice.geeksforgeeks.org/problems/swap-kth-elements5500
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int N = 8, K = 3;
        swapKth(Arr, N, K);
    }
    static void swapKth(int arr[], int n, int k) {
        // code here
        for(int start=0, end=n-1; start<=end; start++, end--){
            if(start==k && end==n-k){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
