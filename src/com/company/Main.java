package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result = "";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {7, 2, 2, 5, 10, 7};
        int[] inputArray3 = {24, 85, 0};
        int[] inputArray4 = {3,4,2,3};
        int[][] Marr = {{2, 2, 3}, {3, 4, 3}};

        char[] reverser = {'H', 'e', 'l', 'l', 'o'};
        char[] reverser2 = {'1', '2', '3', '4', '5'};
        String[] items = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] items2 = {"KFC", "Shogun", "Burger King"};
         String plandrome = "ZZzzabzZzz";

        //     int[] inputArray3 =  plusOne(inputArray2);
        //     String aaa = Arrays.toString(inputArray3);
        String aaa = "there are some (12) digits 5566 in this 770 string 239";
        String bbb = "ab-CDE-fg_hi";
        //  bbb= convertToTitle(29);
        boolean ccccc = isCaseInsensitivePalindrome(plandrome);
        for (int i = 0; i < inputArray4.length; i++) {
            System.out.println(inputArray4[i]);
        }

    }

  public static  boolean isCaseInsensitivePalindrome(String inputString) {
      int reversecounter=inputString.length()-1;
      int counter=0;
      inputString = inputString.toUpperCase();
      for(int i=0;i<inputString.length()/2+1;i++)
      {
          Character a = inputString.charAt(i);
          Character b = inputString.charAt(reversecounter-i);

          if(a != b && i!= inputString.length() /2 )
          {
              counter++;
              System.out.print(inputString.charAt(i));
          }

          if(counter>1 )
          {
              return false;
          }

      }

      return true;
  }


}




