package com.geeksforgeeks.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> Ids = Arrays.asList(1,2,3,5,4,3,4,5,5,32,1,4,67,66,5);
        Ids.stream().sorted().distinct().forEach(s->System.out.print(s+"    "));
        Ids.stream().sorted().distinct().filter(s->s%2==0).forEach(s->System.out.print(s+"  "));

        int Arr[] = {1, 2, 3, 4};
        System.out.println(Arr.length);
        System.out.println(Arrays.stream(Arr).sum());
    }
}
