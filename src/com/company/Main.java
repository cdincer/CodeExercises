package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {7, 2, 2, 5, 10, 7};
        int[] inputArray3 = {24, 85, 0};
        int[] inputArray4 = {1,1,2,2,3,3};

        char[] reverser = {'H', 'e', 'l', 'l', 'o'};
        char[] reverser2 = {'1', '2', '3', '4', '5'};
        String[] items= {"flower","flow","flight"};
        String[] items2= {"aa","aa"};

        String s ="";

        //     int[] inputArray3 =  plusOne(inputArray2);
        //     String aaa = Arrays.toString(inputArray3);
        String aaa ="there are some (12) digits 5566 in this 770 string 239";
        String bbb = "ab-CDE-fg_hi";
        int ccc = distributeCandies(inputArray4);
       //  bbb= convertToTitle(29);

    }







    public static      int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for(int i =0 ; i< candies.length; i++){
            set.add(candies[i]);
        }

        return Math.min(set.size(), candies.length/2);
    }



}


