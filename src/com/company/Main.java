package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {7, 2, 2, 5, 10, 7};
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
        int[] inputArray4 = intersection(inputArray,inputArray2);


          for(int i=0;i<inputArray3.length;i++)
        System.out.println(inputArray3[i]);
    }


    public static    int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for(int number=0;number<nums1.length;number++)
            set1.add(number);

        for(int number=0;number<nums2.length;number++)
            set2.add(number);

        if(set1.size()<set2.size())
            return intersection_calc(set1,set2);

        return intersection_calc(set2,set1);
    }




    public static int[] intersection_calc(HashSet<Integer> set1,HashSet<Integer> set2)
    {
        int[] return2 = new int[set1.size()];
        int ind=0;

        for(int number : set1)
        {
            if(set2.contains(number))
            {
                return2[ind]=number;
                ind++;
            }
        }

        return return2;

    }



}


