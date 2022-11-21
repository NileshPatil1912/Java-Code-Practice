package com.geeksforgeeks.Arrays;

public class PrintAlternateElements {
    //https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array

    public static void printAlternateElements(int arr[], int n){
        for(int i =0; i< n; i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        printAlternateElements(A, A.length);
    }
}
