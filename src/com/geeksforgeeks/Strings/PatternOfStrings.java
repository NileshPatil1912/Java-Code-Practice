package com.geeksforgeeks.Strings;

import java.util.ArrayList;

public class PatternOfStrings {
    //https://practice.geeksforgeeks.org/problems/pattern-of-strings3829/1?page=1&difficulty[]=-2&category[]=Strings&sortBy=difficulty
    public static void main(String[] args) {
        String S = "GeeK";
        System.out.println(pattern(S));
    }
    public static ArrayList<String> pattern(String S) {
        // code here
        ArrayList<String> ls = new ArrayList<>();
        for(int i=0; i<S.length(); i++){
            ls.add(S.substring(0,S.length()-i));
        }
        return ls;
    }
}
