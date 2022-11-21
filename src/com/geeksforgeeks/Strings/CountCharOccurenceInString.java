package com.geeksforgeeks.Strings;

import java.util.HashMap;
import java.util.TreeMap;

public class CountCharOccurenceInString {
    public static TreeMap<Character, Integer> countCharOccurenceInString(String str){
        TreeMap<Character, Integer> charCount = new TreeMap<>();

        for (int i = 0; i <str.length(); i++) {
            if (charCount.containsKey(str.charAt(i))) {
                int count = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i), ++count);
            } else {
                charCount.put(str.charAt(i), 1);
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        String str = "NiNileshn Patil";
        System.out.println(countCharOccurenceInString(str));
    }
}
