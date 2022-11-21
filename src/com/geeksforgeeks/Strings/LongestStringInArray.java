package com.geeksforgeeks.Strings;

public class LongestStringInArray {

    public static String longestStringInArray(String[] names){
        String longestString=names[0];
        int strLength=names[0].length();

        for(int i =1; i< names.length; i++){
            if(names[i].length()>strLength){
                strLength=names[i].length();
                longestString = names[i];
            }
        }
        return longestString;
    }
    public static void main(String[] args) {
        String names[] = { "abcdefg123456789987456321", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
        System.out.println(longestStringInArray(names));
    }
}
