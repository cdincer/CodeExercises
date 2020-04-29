package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] inputArray2 = {8, 9, 9, 9};
        char[] reverser = {'H', 'e', 'l', 'l', 'o'};
        char[] reverser2 = {'1', '2', '3', '4', '5'};
        //     int[] inputArray3 =  plusOne(inputArray2);
        //     String aaa = Arrays.toString(inputArray3);
        String aaa = "testcase";

        firstUniqChar(aaa);
        System.out.println(aaa);
    }


    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> OItem = new HashMap<Character, Integer>();
        int spot = -1;
        for (int i = 0; i < s.length(); i++) {
            if (OItem.containsKey(s.charAt(i))) {

                OItem.remove(s.charAt(i));
                OItem.put(s.charAt(i), i);

            } else {
                spot = i;
                OItem.put(s.charAt(i), i);
            }
        }


        Iterator<Map.Entry<Character, Integer>> it = OItem.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> pair = it.next();


            if (spot == -1)
                spot = pair.getValue();

            if (spot > pair.getValue())
                spot = pair.getValue();
        }


        return spot;
    }


}


