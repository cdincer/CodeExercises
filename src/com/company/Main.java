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
          inputArray3 = replaceMiddle(inputArray2);


          for(int i=0;i<inputArray3.length;i++)
        System.out.println(inputArray3[i]);
    }
       public static int[] replaceMiddle(int[] arr) {
           int[] c = new int[arr.length-1];
           if(arr.length % 2 ==1)
               return arr;

           int j=0;
           int middle = arr[arr.length/2] + arr[arr.length-arr.length/2-1];

    System.out.println("aaaa " + c.length/2);

           for(int i=0;i<arr.length;i++)
           {


               if( i != arr.length/2 || i != arr.length-arr.length/2  )
               {
                   c[j]=arr[i];
                   j++;
               }
           }
           c[c.length/2]=middle;

           return c;
       }



    int[] replaceMiddle2(int[] arr) {
        int size = arr.length;
        if(size%2!=0) {
            return arr;
        }
        int[] res = new int[size-1];
        int i =0;
        for(int j=0; j<size; j++) {
            if(j==size/2-1) {
                res[i++] = arr[j] + arr[j+1];
            } else if(j != size/2) {
                res[i++] = arr[j];
            }
        }
        return res;
    }




}


