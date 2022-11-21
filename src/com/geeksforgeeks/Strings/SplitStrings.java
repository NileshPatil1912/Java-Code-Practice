package com.geeksforgeeks.Strings;

import java.util.ArrayList;
import java.util.List;

public class SplitStrings {
    //https://practice.geeksforgeeks.org/problems/split-strings5211

    public static List<String> splitStrings(String S){

        String str1="";
        String str2="";
        String str3 = "";
        List<String> strArray = new ArrayList<>();


        for(int i =0; i<S.length(); i++){
            if(Character.isLetter(S.charAt(i))){
                str1 = str1+S.charAt(i);
            } else if (Character.isDigit(S.charAt(i))) {
                str2 = str2+S.charAt(i);
            }
            else{
                str3 = str3+S.charAt(i);
            }
        }
        strArray.add(str1);
        strArray.add(str2);
        strArray.add(str3);
        return strArray;
    }

    public static void splitString(String str)
    {
        //This is GeekforGeeks Solution
        StringBuffer alpha = new StringBuffer(),
                num = new StringBuffer(), special = new StringBuffer();

        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
            else if(Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }

        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }

    public static void main(String[] args) {
        String S = "geeks01for02geeks03!!!";
        splitString(S);
//        List<String> strArray = splitStrings(S);
//        for(String s: strArray){
//            System.out.println(s);
//        }
    }
}
