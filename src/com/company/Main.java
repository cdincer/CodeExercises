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
        String aaa = "abcabc";
        String bbb = "pa";
         aaa= buildPalindrome(aaa);
        System.out.println(aaa);
    }



    public static String buildPalindrome(String str) {
        int i = 0;
        while (!isPalindrome(str.substring(i))) i++;

        while (--i >= 0) str += str.charAt(i);

        return str;
    }

    public static  boolean isPalindrome(String s) {
        if (s.length() < 2) return true;

        if (s.charAt(0) != s.charAt(s.length()-1)) return false;

        return isPalindrome(s.substring(1, s.length() - 1));
    }


}


