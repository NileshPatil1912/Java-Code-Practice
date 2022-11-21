package com.geeksforgeeks;

public class ConvertListOfCharToString {
    //https://practice.geeksforgeeks.org/problems/convert-a-list-of-characters-into-a-string5142/1?page=1&category[]=Strings&sortBy=difficulty
    public static String convertedString(char arr[],int N){
        String str=""+arr[0];
        for(int i=1; i<N; i++){
            str = str+arr[i];
        }
        return str;
    }
    public static void main(String[] args) {
        char[] array = {'g','e','e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
        System.out.println(convertedString(array, array.length));
    }
}
