package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {8, 9, 3,4};
        int[] inputArray3 = {3,3,4};

        char[] reverser = {'H', 'e', 'l', 'l', 'o'};
        char[] reverser2 = {'1', '2', '3', '4', '5'};
        String[] items= {"flower","flow","flight"};
        String[] items2= {"aa","aa"};

        //     int[] inputArray3 =  plusOne(inputArray2);
        //     String aaa = Arrays.toString(inputArray3);
        String aaa = "1010";
        String bbb = "1011";
       //  bbb= convertToTitle(29);
        int a= majorityElement(inputArray3);
        System.out.println(bbb);
    }
    public static int majorityElement(int[] nums) {
        int counter=0;
        int keeper=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                counter++;
                keeper=nums[i];
                if(counter>nums.length/2)
                {
                    return nums[i];
                }
            }else
            {
                counter=0;
                keeper=0;
            }
        }


        return keeper;
    }







}


