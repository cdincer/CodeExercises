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
        String bbb = "pi";
        String ccc= longestCommonPrefix(items2);
        System.out.println(ccc);
    }



   public static String longestCommonPrefix(String[] strs) {

        if(strs.length==0)
            return "";

        int[] Items = new int[255];

        for(int i=0;i<strs.length;i++)
        {
            for(int y=0;y<strs[i].length();y++)
            {
                Items[strs[i].charAt(y)]+=1;
            }
        }

        StringBuilder item = new StringBuilder();
        String Tester= strs[0].toString();
        for(int i=0;i<Tester.length();i++)
        {
            if(Items[Tester.charAt(i)]==strs.length)
            {
                item.append(Tester.charAt(i));
            }
        }
        Tester = item.toString();

        return Tester;
    }


}


