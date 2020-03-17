package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

String input ="64.233.161.00";

boolean Result =isIPv4Address(input);

    }


public static boolean isIPv4Address(String inputString) {
    boolean Result=true;
    String[] NewArray=  inputString.split("\\.");
    int TempIP=0;

    if(NewArray.length ==4)
    {
        for(int i=0;i<NewArray.length ;i++)
        {
            if(!NewArray[i].isEmpty()  && NewArray[i] !=null && CheckIfInteger(NewArray[i]))
            {
                TempIP=Integer.parseInt(NewArray[i]);
                if(TempIP<0|| TempIP>255)
                {
                    Result=false;
                }
            }else
                Result=false;
        }
    }else
    {
        Result=false;
    }

    return Result;
}

    public static boolean CheckIfInteger(String Item)
    {
        boolean Result=false;
   /* int ItemAtIndex=0;
    char TempChar='a';
    String TempString="";*/

        try
        {
            // checking valid integer using parseInt() method
            if(Item.length()>1 && Item.charAt(0) == '0')
                Result=false;
            else
                {

                Integer.parseInt(Item);
                Result = true;
            }
        }
        catch (NumberFormatException e)
        {
            Result=false;
        }

        return Result;

    }







}


