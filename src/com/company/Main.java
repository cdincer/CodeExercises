package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String result="";
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {8, 9, 3,4};
        char[] reverser = {'H', 'e', 'l', 'l', 'o'};
        char[] reverser2 = {'1', '2', '3', '4', '5'};
        String[] items= {"flower","flow","flight"};
        String[] items2= {"aa","aa"};

        //     int[] inputArray3 =  plusOne(inputArray2);
        //     String aaa = Arrays.toString(inputArray3);
        String aaa = "1010";
        String bbb = "1011";
       //  bbb= convertToTitle(29);
        bbb= convertToTitle2(700);
        System.out.println(bbb);
    }
    public static  String convertToTitle2(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.append((char)('A' + n % 26));
            n /= 26;
        }
        result.reverse();
        return result.toString();
    }
    public static String convertToTitle(int n) {
        StringBuilder StringR = new StringBuilder();

        char Column1 = 'A';
        char Column2 = 'A';
        int switchItem=0;
        int x=0;
        //Dividing by 26 doesn't help

        for(int i=0;i<n;i++)
        {
            if(i==52)
                System.out.println("bug");

            if(x<=26 && switchItem==0)
            {
                Column1++;
            }
            else
            if(x<=26 && switchItem==1)
            {
                Column2++;
            }

            if(x==27 && switchItem==0)
            {
                Column1='A';
                switchItem=1;
                x=0;
            }else
            if(x==27 && switchItem==1)
            {
                Column2='A';
                switchItem=0;
                x=0;
            }
        x++;
        }

        StringR.append(Column1);

        if(n>26)
            StringR.append(Column2);



        return StringR.toString();
    }






}


