package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5,6,7};
        int[] inputArray2 = {8,9,9,9};

        int[] inputArray3 =  plusOne(inputArray2);
         String aaa = Arrays.toString(inputArray3);
System.out.println(aaa);
    }


    public static int[] plusOne(int[] digits) {
        int Carry=0;
        int i=2;
        int[] digits2;
        digits[digits.length-1] = digits[digits.length-1] +1;

        if(digits[digits.length-1]==10)
        {
            Carry=1;
            digits[digits.length-1]=0;

            while(Carry==1 && i<digits.length)
            {
                digits[digits.length-i]=digits[digits.length-i]+1;
                if(digits[digits.length-i]<10)
                {
                    Carry=0;

                }else if(digits[digits.length-i]>=10)
                {
                    Carry=1;
                    digits[digits.length-i]=0;
                    i++;
                }
            }

        }

        if(digits[0]==0 )
        {
            digits2 = new int[digits.length+1];
            digits2[0]=1;
            for(int y=1;y<digits.length;y++)
            {
                digits2[y]=digits[y];
            }
            return digits2;
        }



        //Get the last digit.Add one to that,see if its increases more than 1.
        //use a while loop to check the others

        return digits;
    }


}


