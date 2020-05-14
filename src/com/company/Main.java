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
        String bbb = "pa";
        int ccc= digitDegree(99);
        System.out.println(ccc);
    }



    public static int digitDegree(int n) {
        Integer sum=0;
        Integer counter=0;
        char[] Items = String.valueOf(n).toCharArray();

        if(Items.length==1)
        {
            return 0;
        }

        while (Items.length>1)
        {
            sum=0;
            counter++;
            for(int i=0;i<Items.length;i++)
            {
                sum+= Integer.parseInt(String.valueOf(Items[i]));
            }
            Items = String.valueOf(sum).toCharArray();

        }

        return counter;

    }

}


