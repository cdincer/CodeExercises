package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {8, 9, 3,4};
        int[] inputArray3 = {5, 1, 3, 4, 1};

        char[] reverser = {'H', 'e', 'l', 'l', 'o'};
        char[] reverser2 = {'1', '2', '3', '4', '5'};
        String[] items= {"flower","flow","flight"};
        String[] items2= {"aa","aa"};

        //     int[] inputArray3 =  plusOne(inputArray2);
        //     String aaa = Arrays.toString(inputArray3);
        String aaa = "1010";
        String bbb = "aabbbc";
       //  bbb= convertToTitle(29);
        aaa = lineEncoding(bbb);
        System.out.println(bbb);
    }

    public static String lineEncoding(String s) {
        int repetition=1;
        int[] Items = new int[26];
        StringBuilder returnI = new StringBuilder();

        for(int i=1;i<s.length()-1;i++ )
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                repetition++;
            }else
            {
                if(repetition >1)
                    returnI.append(repetition);

                returnI.append(s.charAt(i));
                repetition=1;
            }
        }


        if(repetition >1)
            returnI.append(repetition);

        returnI.append(s.charAt(s.length()-1));



        return returnI.toString();
    }
}


