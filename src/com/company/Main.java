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
        String aaa ="there are some (12) digits 5566 in this 770 string 239";
        String bbb = "ab-CDE-fg_hi";
       //  bbb= convertToTitle(29);
        int  ccc = sumUpNumbers(aaa);
        System.out.println(bbb);
    }
  public static   int sumUpNumbers(String inputString) {
      char[] Items = inputString.toCharArray();
      int result=0;
      StringBuilder inner = new StringBuilder();


//Clean out any kind of debris.
      for(int i=0;i<Items.length;i++)
      {
          if(Character.isDigit(Items[i]))
          {
              inner.append(Items[i]);
          }  else
          {
              inner.append(' ');
          }
      }

//Replace unnecessary spaces with a single one. So we can have
// a healthy array.
      String mid = inner.toString();
      mid = mid.replaceAll(" +", " ");

      System.out.println(mid);
      String[] ItemsS = mid.split(" ");



//System.out.println(inner.toString());

      return result;
  }



}


