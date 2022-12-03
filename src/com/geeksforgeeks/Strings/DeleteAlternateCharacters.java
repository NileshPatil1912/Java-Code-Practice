package com.geeksforgeeks.Strings;

public class DeleteAlternateCharacters {
    //https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1?page=2&difficulty[]=-2&category[]=Strings&sortBy=difficulty
    public static void main(String[] args) {
        String S = "Geeks";
        System.out.println(delAlternate(S));
    }

    static String delAlternate(String S) {
        // code here
        StringBuffer sb = new StringBuffer();
        char[] charArr = S.toCharArray();
        for(int i=0; i<charArr.length; i++){
            if(i%2==0){
                sb.append(charArr[i]);
            }
        }
        return sb.toString();
    }

}
