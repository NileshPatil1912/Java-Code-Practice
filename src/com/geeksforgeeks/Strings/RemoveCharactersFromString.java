package com.geeksforgeeks.Strings;

public class RemoveCharactersFromString {
    //https://practice.geeksforgeeks.org/problems/remove-characters-from-alphanumeric-string0648

    public static String removeCharacters(String S){
        String str = "";
        for(char c : S.toCharArray()){
            if(Character.isDigit(c)){
                str +=c;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String s = "AAC";
        System.out.println(removeCharacters(s));
    }
}
