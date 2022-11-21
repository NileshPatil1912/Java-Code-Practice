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
        int temp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp;

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
