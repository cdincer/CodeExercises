package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5,6,7};
         rotate(inputArray,3);
         String aaa = Arrays.toString(inputArray);
System.out.println(aaa);
    }


    public static void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        int random=0;

        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
            random =(i + k) % nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }

    }


}


