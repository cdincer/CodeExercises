package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {8, 9, 3,4};
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
        int  ccc = arrayPacking(inputArray3);
        System.out.println(bbb);
    }
  public static  int arrayPacking(int[] a) {
      String M="";
      for(int i=a.length-1;-1<i;i--)
      {
          String s=Integer.toBinaryString(a[i]);
          for(int y=0;y<=8;y++)
          {
              if(s.length()<8)
              {
                  s=0+s;
              }
          }
          M+=s;
      }
      int result = Integer.parseInt(M,2);

      return result;
  }



}


