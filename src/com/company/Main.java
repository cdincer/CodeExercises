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
        int[][]  ccc = spiralNumbers(6);
        System.out.println(bbb);
    }
  public static int[][] spiralNumbers(int n) {
      int[][] array = new int[n][n];

      int left = 0;
      int right = n - 1;
      int top = 0;
      int down = n - 1;

   for(int counter=1;counter<n*n;)
   {
       for(int x=left;x<=right;x++)
           array[top][x]=counter++;
       top++;

       for(int y=top;y<=down;y++)
           array[y][right] = counter++;
       right--;

       for(int x=right;x>=left;x--)
           array[down][x]=counter++;
       down--;

       for(int y=down;y>=top;y--)
           array[y][left]=counter++;
       left++;
   }
      return array;
  }





}


