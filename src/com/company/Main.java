package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {7, 2, 2, 5, 10, 7};
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
          int a = comfortableNumbers(1,9);


          for(int i=0;i<inputArray3.length;i++)
        System.out.println(inputArray3[i]);
    }


   public static int comfortableNumbers(int l, int r) {
       int total_pairs = 0;
       for(int i=l; i<=r; i++){
           for(int j=i+1; j<=r; j++){
               int s_a = digitSum(i);
               int s_b = digitSum(j);
               if (j>=(i-s_a) && j<=(i+s_a) && i>=(j-s_b) && i<=(j+s_b)) {
                   total_pairs++;
               }
           }
       }
       return total_pairs;
   }
    public static int digitSum(int n){
        int sum = 0;

        while(n>0){
            sum += (n%10);
            n = n/10;
        }

        return sum;
    }



//How do we get to the root number
//one time division is not enough




}


