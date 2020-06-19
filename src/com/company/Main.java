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
        int  ccc = additionWithoutCarrying(456,1734);
        System.out.println(bbb);
    }
   public static  int additionWithoutCarrying(int param1, int param2) {
       int t = 0;
       int mult = 1;
       while (param1 + param2 > 0) {
           int value = (param1 +param2)%10;
           t += value * mult;
           mult *= 10;
           param1 /= 10;
           param2 /= 10;
       }
       return t;
   }





}


