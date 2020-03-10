package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,2},{0,5,0,0},{2,0,3,3}};
        /*
                int[][] matrix = {{4,0,1},{10,7,0},{0,0,0},{9,1,2}}; //15
                int[][] matrix = {{0,1,1,2},{0,5,0,0},{2,0,3,3}}; // 9

         */
        /* i
           0 1 2 3
    j   0 {0,1,1,2},
        1 {0,5,0,0},
        2 {2,0,3,3}
         */

      int result=  matrixElementsSum(matrix);

      System.out.println(result);
    }

//floors loop inner because main  constraint is zeroes nulling the floors down. We start at top and move down
//Anything goes wrong break the floor search.
    public static int matrixElementsSum(int[][] matrix) {
        int rooms = matrix[0].length;
        int floors = matrix.length;
        int sum = 0;
        for(int i = 0; i < rooms; i++) {
            for(int j = 0; j < floors && matrix[j][i] > 0; j++) {
                sum += matrix[j][i];
            }
        }
        return sum;
    }



}


