package com.geeksforgeeks.Arrays;

public class FindIndex {
    //https://practice.geeksforgeeks.org/problems/find-index4752
    public static void main(String[] args) {
        int N=6;
        int[] arr = { 6, 5, 4, 3, 1, 2 };
        int Key = 4;
        int[] indexes = findIndex(arr, N, Key);
        for(int i : indexes){
            System.out.println(i);
        }
    }

    public static int[] findIndex(int a[], int N, int key){
        int[] indexes = {-1,-1};

        for(int i=0; i<N; i++){
            if(a[i]==key){
                indexes[0]=i;
                break;
            }
        }
        for(int i=N-1; i>=0; i--){
            if(a[i]==key){
                indexes[1]=i;
                break;
            }
        }
        return indexes;
    }
}
