package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


        int[] inputArray = {6, 2, 3, 8};

        int result = makeArrayConsecutive2(inputArray);

        System.out.println(result);


    }

    public static int makeArrayConsecutive2(int[] statues) {

        int counter, former, latter;
        counter = 0;
for(int i=0; i<statues.length-1;i++)
{
    for(int j=0;j<statues.length-i-1;j++)
    if(statues[j]>statues[j+1])
    {
        former=statues[j];
        statues[j]=statues[j+1];
        statues[j+1]=former;
    }
}
        for (int i = 0; i < statues.length - 1; i++) {
            former = statues[i];
            latter = statues[i + 1];
            if (former + 1 != latter) {
                while(former<latter-1)
                {
                    former++;
                    counter++;
                }
            }
        }

        return counter;
    }

}


