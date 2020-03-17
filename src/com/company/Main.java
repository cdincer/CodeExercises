package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

String input ="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";

boolean Result =palindromeRearranging(input);

    }


public static boolean palindromeRearranging(String inputString) {
    HashMap<Character,Integer> ItemsMap= new HashMap<Character,Integer>();
    int TempValue =0;//Carrier of replacement items
    int SingleValue=0;//Counting middle bit
    Character TempCharacter=' ';
    boolean Result=true;

    for(int i=0;i<inputString.length();i++)
    {
        if(ItemsMap.containsKey(inputString.charAt(i)))
        {
            TempValue=ItemsMap.get(inputString.charAt(i));
            ItemsMap.remove(inputString.charAt(i));
            TempCharacter=inputString.charAt(i);
            TempValue++;//We found one more add to it
            ItemsMap.put(TempCharacter, TempValue);
        }else
        {
            ItemsMap.put(inputString.charAt(i),1);
        }
    }

    for(Map.Entry<Character,Integer> MyEntry : ItemsMap.entrySet())
    {
        TempValue=MyEntry.getValue();

        if(TempValue %2 ==1 && TempValue>1)
        {
            Result= false;
        } else if(TempValue ==1)
        {
            SingleValue ++;
        }
    }

    if(SingleValue>1)
        Result=false;

    if(ItemsMap.size() == 1)
        Result=true;

    return Result;

}








}


