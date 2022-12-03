package com.geeksforgeeks.Strings;

public class RemoveSpaces {
    //https://practice.geeksforgeeks.org/problems/remove-spaces0128/1?page=1&difficulty[]=-2&category[]=Strings&sortBy=difficulty
    public static void main(String[] args) {
        String S = "geeks  for geeks";
        System.out.println(modify(S));
    }
    public static String modify(String S)
    {
        // your code here
        StringBuffer sb = new StringBuffer();
        char[] charArr = S.toCharArray();

        for(int i=0; i< charArr.length; i++){
            if(charArr[i]!=' '){
                sb.append(charArr[i]);
            }
        }
        return sb.toString();
    }

    // Editorial Answer
    public static String removeSpace(String str)
    {
        str = str.replaceAll("\\s","");
        return str;
    }

}
