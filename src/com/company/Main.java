package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] inputArray = {1,3,2,4};


        int Result =  arrayMaxConsecutiveSum(inputArray,3);
        System.out.println(Result);

    }


 public static    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int TempLargest=0;
        int Container=0;
        for(int i=0;i<inputArray.length-k;i++)
        {
            Container=0;
            for(int j=i;j<i+k;j++)
            {
                Container+=inputArray[j];
            }
            if(Container> TempLargest)
            {
                TempLargest = Container ;
            }
        }


        return TempLargest;
    }


}


