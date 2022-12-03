package com.geeksforgeeks.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElement {

    public static void main(String[] args) {
        int Arr[] = {642, 642, 642, 642, 642, 642};
        System.out.println(print2largest(Arr, Arr.length));
    }
    static int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--)
        {
            // If the element is not equal to largest element
            if (arr[i] != arr[n - 1])
            {
               return arr[i];
            }
        }
        return arr[n-2];
    }
}
