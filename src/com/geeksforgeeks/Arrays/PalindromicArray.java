package com.geeksforgeeks.Arrays;

public class PalindromicArray {
    //https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&category[]=Arrays&sortBy=difficulty
    public static void main(String[] args) {
        int[] a ={111,222,333,444,20};
        int palin = palinArray(a,a.length);
        System.out.println(palin);
    }
    public static int palinArray(int[] a, int n)
    {
        //add code here.
        for(int i =0; i<n; i++){
            boolean palin = isPalindrome(a[i]);
            if(!palin){
                return 0;
            }
        }
        return 1;
    }

    public static boolean isPalindrome(int a){
        int reverse = 0, number=a;
        while(a != 0)
        {
            int remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a = a/10;
        }
        if(reverse==number){
            return true;
        }
        return false;
    }
}
