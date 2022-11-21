package com.geeksforgeeks.Arrays;

import java.util.Arrays;

public class FascincatingNumbers {
    //https://practice.geeksforgeeks.org/problems/fascinating-number3751
    public static void main(String[] args) {
        long n = 192;
        boolean isFascinating = isfascinating(n);
        if(isFascinating){
            System.out.println("Number is Fascinating");
        }
        else{
            System.out.println("It's not a fascinating number");
        }
    }
    public static boolean fascinating(long n) {
        // code here
        boolean isFascinating = false;
        String num = String.valueOf(n )+ String.valueOf(n*2)+ String.valueOf(n*3);
        char[] numArr = num.toCharArray();
        Arrays.sort(numArr);
        StringBuffer newNum = new StringBuffer();
        for(int i=0; i<numArr.length; i++){
            newNum.append(numArr[i]);
        }
        //System.out.println(newNum);
        if(newNum.toString().equals("123456789")){
            isFascinating = true;
        }
        return isFascinating;
    }

    //Author's Solution
    public static boolean isfascinating(long n) {
        long x = 2 * n;
        long y = 3 * n;
        String s =  Long.toString(x);
        String ss = Long.toString(y);
        String q = Long.toString(n);
        q = q+s;
        q = q+ss;
        int [] hash = new int[10];
        for(int i = 0; i < q.length(); i++){
            hash[q.charAt(i) - '0']++;
        }
        for (int i = 1; i <= 9; i++) {
            if (hash[i] != 1) {
                return false;
            }
        }
        return true;
    }
}
