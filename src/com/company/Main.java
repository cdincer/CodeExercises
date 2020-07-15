package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {7, 2, 2, 5, 10, 7};
        int[] inputArray3 = {24, 85, 0};
        int[] inputArray4 = {1,12,-5,-6,50,3};
        int[][] Marr =  {{2,2,3},{3,4,3}};

        char[] reverser = {'H', 'e', 'l', 'l', 'o'};
        char[] reverser2 = {'1', '2', '3', '4', '5'};
        String[] items= {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] items2= {"KFC", "Shogun", "Burger King"};



        //     int[] inputArray3 =  plusOne(inputArray2);
        //     String aaa = Arrays.toString(inputArray3);
        String aaa ="there are some (12) digits 5566 in this 770 string 239";
        String bbb = "ab-CDE-fg_hi";
    double ccc =    findMaxAverage(inputArray4,4);
       //  bbb= convertToTitle(29);

    }

//2147483646





    public static double findMaxAverage(int[] nums, int k) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            sum[i] = sum[i - 1] + nums[i];
        }
        double res = sum[k - 1] * 1.0 / k;

        for (int i = k; i < nums.length; i++)
        {
            res = Math.max(res, (sum[i] - sum[i - k]) * 1.0 / k);
        }
        return res;
    }



}


