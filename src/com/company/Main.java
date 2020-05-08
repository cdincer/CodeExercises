package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {8, 9, 9, 9};
        char[] reverser = {'H', 'e', 'l', 'l', 'o'};
        char[] reverser2 = {'1', '2', '3', '4', '5'};
        String[] items= {"flower","flow","flight"};
        String[] items2= {"aa","aa"};

        //     int[] inputArray3 =  plusOne(inputArray2);
        //     String aaa = Arrays.toString(inputArray3);
        String aaa = "mississippi";
        String bbb = "pa";
        int ccc= minIncrementForUnique3(inputArray2);
        System.out.println(ccc);
    }










    public static int minIncrementForUnique3(int[] a) {
        int[] freq = new int[70000];
        int moves = 0;

        for (int num : a)
            freq[num]++;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] <= 1)
                continue;
            int diff = freq[i] - 1;
            moves += diff;
            freq[i + 1] += diff;
        }

        return moves;
    }



    public int minIncrementForUnique4(int[] A) {
        int N = A.length;
        int[] count = new int[N*2];
        for(int i=0; i<N; i++) {
            count[A[i]]++;
        }
        int increments = 0;
        for(int i=0; i<count.length; i++) {
            if(count[i]>1) {
                count[i+1] = count[i+1] + (count[i]-1);
                increments = increments + (count[i]-1);
            }
        }
        return increments;
    }
}


