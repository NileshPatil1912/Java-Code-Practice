package com.geeksforgeeks.Arrays;

import java.util.Arrays;

public class TwoArraysEqualOrNot {
    //https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&curated[]=1&sortBy=difficulty
    public static void main(String[] args) {
        long[] A = {1,2,5,4,0};
        long[] B = {2,4,5,0,1};
        if(check(A,B,A.length)){
            System.out.println("Both Arrays are equal");
        }
        else{
            System.out.println("Both Arrays are NOT equal");
        }
    }
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        return Arrays.equals(A,B);
    }
}
