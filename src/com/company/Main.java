package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

String input ="64.233.161.00";
        int[][] arr = {{7, 4, 0, 1}, 
         {5, 6, 2, 2}, 
         {6, 10, 7, 8}, 
         {1, 4, 2, 0}};
        int[][] arr2 = {{1, 1, 1}, 
         {1, 7, 1}, 
         {1, 1, 1}};
        int[][] arr3=boxBlur(arr);
    }


public static int[][] boxBlur(int[][] image) {
    ArrayList<Integer> MyList= new ArrayList<Integer>();

    int RowLength = (image.length-2)*(image.length-2);
    int[][] centeredimage = new int[RowLength][RowLength];
    int sum=0;
    int mainX,mainY;
    mainX=1;
    mainY=1;
    for(int i=0;i<image.length;i++)
    {

        for(int j=0;j<image[i].length;j++)
        {
            System.out.println("Value for"+i+" "+j);
            sum+= image[i][j];
            if(mainX % 3 ==0 && mainY == 3)
            {
                MyList.add(sum/9);
                sum=0;
                mainY=1;
            }
            mainY++;
        }
        mainX++;
    }


//(n-2)^2, n is the row number.

    int counter=0;
    for(int x=0;x<RowLength;x++)
    {
        for(int y=0;y<RowLength;y++)
        {
            centeredimage[x][y]=MyList.get(counter);
            counter++;
        }
    }


    return centeredimage;

}





}


