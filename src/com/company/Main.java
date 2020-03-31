package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


        String XCoor,YCoor;
        XCoor="A1";
        YCoor="B2";
        int Result =  depositProfit(1, 100, 64);
        System.out.println(Result);

    }


 public static   int depositProfit(int deposit, int rate, int threshold) {

        int investedyears=0;
        while(threshold>deposit)
        {
            deposit = deposit+((deposit/100)*rate);

            if(deposit>threshold)
                return investedyears;

            investedyears++;
        }

        return investedyears;
    }

}


