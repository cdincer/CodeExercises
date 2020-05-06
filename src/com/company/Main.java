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
        int ccc= strStr(aaa,bbb);
        System.out.println(ccc);
    }


    public static int strStr(String haystack, String needle) {
        int result=-1;
        int needleL=needle.length();
        int haystackL=haystack.length();
        String test="";
        result= haystack.indexOf(needle) !=-1 ? 0 : -1; //true

        if(result==-1)
            return -1;
        else
        {
            for(int i=0;i<haystackL;i++)
            {
                StringBuilder strBuilder = new StringBuilder();
                for(int y=0;y<needleL;y++)
                {
                    strBuilder.append(haystack.charAt(i+y));
                }

                test=strBuilder.toString();
                if(test.equals(needle))
                {
                    result=i;
                    return result;
                }

            }
        }


        return result;
    }


}


