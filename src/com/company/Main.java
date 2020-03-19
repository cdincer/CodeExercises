package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int [] inputArray = {1, 4, 10, 6, 2};
String input ="64.233.161.00";
        int[][] arr = {{7, 4, 0, 1}, 
         {5, 6, 2, 2}, 
         {6, 10, 7, 8}, 
         {1, 4, 2, 0}};
        int[][] arr2 = {{1, 1, 1}, 
         {1, 7, 1}, 
         {1, 1, 1}};
        int[][] arr3=boxBlur(arr2);
//int sum = avoidObstacles(inputArray);


    }


public static int[][] boxBlur(int[][] image) {
    int[][] result = new int[image.length-2][image[0].length-2];
    for (int i = 1; i < image.length-1; i++) {
        for (int j = 1; j < image[i].length-1; j++) {
            result[i-1][j-1] = avg(image, i, j);
        }
    }
    return result;
}

  public static  int avg(int[][] image, int x, int y) {
        int sum = 0;
        for (int i = x-1; i <= x+1; i++) {
            for (int j = y-1; j <= y+1; j++) {
                sum += image[i][j];
            }
        }
        return sum / 9;
    }

/*
Test 1
Input:

image:
[[1,1,1],
 [1,7,1],
 [1,1,1]]

Expected Output:

[[1]]

-----
Test 2
Input:

image:
[[0,18,9],
 [27,9,0],
 [81,63,45]]

Expected Output:

[[28]]
-----
Test 3
Input:

image:
[[36,0,18,9],
 [27,54,9,0],
 [81,63,72,45]]

Expected Output:

[[40,30]]
-----
Test 4
Input:

image:
[[7,4,0,1],
 [5,6,2,2],
 [6,10,7,8],
 [1,4,2,0]]

Expected Output:

[[5,4],
 [4,4]]
 ------
 Test 5
 Input:

 image:
 [[36,0,18,9,9,45,27],
  [27,0,54,9,0,63,90],
  [81,63,72,45,18,27,0],
  [0,0,9,81,27,18,45],
  [45,45,27,27,90,81,72],
  [45,18,9,0,9,18,45],
  [27,81,36,63,63,72,81]]

 Expected Output:

 [[39,30,26,25,31],
  [34,37,35,32,32],
  [38,41,44,46,42],
  [22,24,31,39,45],
  [37,34,36,47,59]]


*/




public static    int avoidObstacles(int[] inputArray) {

        int jump = 1;
        boolean fail = true;

        while(fail) {
            jump++;
            fail = false;
            for(int i=0; i<inputArray.length; i++)
                if(inputArray[i]%jump==0) {
                    fail = true;
                    break;
                }
        }

        return jump;
    }






}


