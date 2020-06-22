package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {8, 9, 3,4};
        int[] inputArray3 = {24, 85, 0};

        char[] reverser = {'H', 'e', 'l', 'l', 'o'};
        char[] reverser2 = {'1', '2', '3', '4', '5'};
        String[] items= {"flower","flow","flight"};
        String[] items2= {"aa","aa"};

        //     int[] inputArray3 =  plusOne(inputArray2);
        //     String aaa = Arrays.toString(inputArray3);
        String aaa ="there are some (12) digits 5566 in this 770 string 239";
        String bbb = "ab-CDE-fg_hi";
       //  bbb= convertToTitle(29);
        int  ccc = rounders(2444);
        System.out.println(bbb);
    }
   public static int rounders(int value) {
       int t = 1;
       while (value >= 10) {
           t *= 10;
           int r = 0;
           if (value % 10 >= 5)
               r = 1;
           value /= 10;
           value += r;
           System.out.println("aaa "+ value);
       }
       return t * value;
   }






}


