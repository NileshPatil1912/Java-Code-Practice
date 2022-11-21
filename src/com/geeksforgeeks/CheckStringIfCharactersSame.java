package com.geeksforgeeks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckStringIfCharactersSame {

    //https://practice.geeksforgeeks.org/problems/check-string1818/1?page=1&category[]=Strings&sortBy=difficulty
    public static boolean CheckStringIfCharactersSame(String str){
       for(int i=1; i<str.length(); i++){
           if(str.charAt(i)!=str.charAt(0)){
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args) {
        String str = "aaaaa";
        System.out.println(CheckStringIfCharactersSame(str));
    }
}
