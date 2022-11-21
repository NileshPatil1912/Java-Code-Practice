package com.geeksforgeeks.Arrays;

public class PerfectArray {
    //https://practice.geeksforgeeks.org/problems/perfect-arrays4645

    public static boolean isPerfect(int a[], int n){
        boolean isPerfect = true;

        for(int start = 0, end = a.length-1; start<end;start++, end--){
            if(a[start]!=a[end]){
                isPerfect = false;
                break;
            }
        }
        return isPerfect;
    }
    public static void main(String[] args) {
        int[] Arr = {19, 17, 11, 4, 2, 15, 11, 17, 19, 10, 9, 7, 2, 10, 8, 15, 15, 2, 12, 10, 5, 18, 2};
        System.out.println(isPerfect(Arr, Arr.length));
    }

    //Author's solution
    public boolean IsPerfect(int a[], int n)
    {
        for(int i=0;i<n/2;i++){
            if(a[n-i-1] != a[i])
                return false;
        }
        return true;
    }
}
