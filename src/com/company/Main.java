package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {7, 2, 2, 5, 10, 7};
        int[] inputArray3 = {24, 85, 0};
        int[] inputArray4 = {2,3,1,2,4,3};
        int[][] Marr =  {{2,2,3},{3,4,3}};

        char[] reverser = {'H', 'e', 'l', 'l', 'o'};
        char[] reverser2 = {'1', '2', '3', '4', '5'};
        String[] items= {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] items2= {"KFC", "Shogun", "Burger King"};



        //     int[] inputArray3 =  plusOne(inputArray2);
        //     String aaa = Arrays.toString(inputArray3);
        String aaa ="there are some (12) digits 5566 in this 770 string 239";
        String bbb = "ab-CDE-fg_hi";
    double ccc =    minSubArrayLen(7,inputArray4);
       //  bbb= convertToTitle(29);

    }





    public static    int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int i=0,j = 0,sum =0;
        int itemin=Integer.MAX_VALUE;

        while(j<nums.length)
        {
            sum += nums[j++];



            while(sum>=s)
            {
                itemin = Math.min(itemin,j-i);
                sum -= nums[i++];
            }
        }
        return itemin == Integer.MAX_VALUE ? 0:itemin;
    }



}


