package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

String input ="foo(bar(baz))blim";

    }


public static boolean areSimilar(int[] a, int[] b) {
    boolean Result = false;
    Object[] Arr1= new Object[] {a};
    Object[] Arr2= new Object[] {b};
    int temp=0;
    if(Arrays.equals(a, b) )
    {
        return   Result = true;
    }
    else
    {
        for(int i=0;i<b.length;i++)
            for(int j=0;j<b.length;j++)
            {
                temp=b[i];
                b[i]=b[j];
                b[j]=temp;
                if(Arrays.equals(a,b))
                {
                    return true;
                }else
                {
                    b[j]=b[i];
                    b[i]=temp;

                }
            }
    }
    return false;

}






}


