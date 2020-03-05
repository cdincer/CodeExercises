package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*
        Input: "abcabcbb"
        Output: 3
        Input: "bbbbb"
        Output: 1
        Input: "pwwkew"
        Output: 3
        "aab" output:2

         */
String inner="abcabcbb";
      int result=  lengthOfLongestSubstring(inner);

      System.out.println(result);
    }


    public static int lengthOfLongestSubstring(String s) {

        char[] CharArray = s.toCharArray();
        Set<Character> result = new HashSet();
        int CurrCounter=0;
        int HighestCounter=0;

        for(int i=0; i<CharArray.length; i++)
        {
            if(result.contains(CharArray[i]))
            {
                result = new HashSet();

                if(CurrCounter>HighestCounter)
                {
                    HighestCounter=CurrCounter;
                }
                CurrCounter=0;

            }
            else
            {
                result.add(CharArray[i]);
                CurrCounter++;
                if(CurrCounter>HighestCounter)
                {
                    HighestCounter=CurrCounter;
                }
            }
        }


        return HighestCounter;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}


