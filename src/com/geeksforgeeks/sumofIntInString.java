package com.geeksforgeeks;

public class sumofIntInString {

    public static int sumOfIntInString(String name){
        int sum=0;

        for(int i=0; i<name.length();i++){
            if(Character.isDigit(name.charAt(i))){
                String s= ""+name.charAt(i);
                sum = sum+Integer.parseInt(s);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String name="abc123fg4g5h6u8ayr33";
        System.out.println("Sum of Integers in String is : "+sumOfIntInString(name));
    }
}
