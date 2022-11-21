package com.geeksforgeeks;

public class ConvertFirstLetterToUC {
    //https://practice.geeksforgeeks.org/problems/upper-case-conversion5419

    public static String firstLettertoUCString(String s){
        String cap="";
        String[] strArray = s.split(" ");
        for(int i=0; i<strArray.length; i++){
            cap += strArray[i].substring(0, 1).toUpperCase() + strArray[i].substring(1)+" ";
        }
        return cap;
    }
    public static void main(String[] args) {
        String str = "nilesh patil - i love programming";
        System.out.println(firstLettertoUCString(str));
    }
}
