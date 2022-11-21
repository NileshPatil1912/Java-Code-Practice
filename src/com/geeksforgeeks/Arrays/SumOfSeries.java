package com.geeksforgeeks.Arrays;

public class SumOfSeries {
    //https://practice.geeksforgeeks.org/problems/sum-of-series2811
    public static void main(String[] args) {
        int n = 46341;
        System.out.println(seriesSum(n));
    }
    public static long seriesSum(int n) {
        // code here
        long sum = ((long)n*(long)(n+1)/2);
        return sum;
    }

    //Author's Solution
    long SeriesSum(int n) {
        long sum = ((long)n * (long)(n + 1)) / 2;

        return sum;
    }
}
