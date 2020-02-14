package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


    int[] inputArray = {-23, 4, -3, 8, -12};

    int result=     adjacentElementsProduct(inputArray);

    System.out.println(result);


    }

public static int adjacentElementsProduct(int[] inputArray) {
        return IntStream.range(1, inputArray.length).map(i->inputArray[i]*inputArray[i-1]).max().getAsInt();}



}
