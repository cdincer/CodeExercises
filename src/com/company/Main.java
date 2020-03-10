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
      int result=  matrixElementsSum(matrix);

      System.out.println(result);
    }


    public static int matrixElementsSum(int[][] matrix) {
        int sum =0;
        for(int i =0; i<matrix[0].length;i++) {
            for(int j=0; j<matrix.length;j++) {
                if(matrix[j][i] > 0)
                    sum +=matrix[j][i];
                else
                    break;
            }
        }
        return sum;
    }


}


