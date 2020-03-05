package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
String inner="pwwke";
      int result=  lengthOfLongestSubstring(inner);

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


