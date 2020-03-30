package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


        String XCoor,YCoor;
        XCoor="A1";
        YCoor="B2";
boolean Result =chessBoardCellColor(XCoor,YCoor);

    }


 public static   boolean chessBoardCellColor(String cell1, String cell2) {
        Boolean resut=false;
        //  return Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2;

        String CellResult1 = BlackorWhite(cell1);
        String CellResult2 = BlackorWhite(cell2);
        System.out.println("Cell Result1 + "+ CellResult1);
        System.out.println("Cell Result2 + "+ CellResult2);

        if(CellResult1 == CellResult2)
            resut=true;
        else
            resut = false;

        return resut;
    }


    public static  String BlackorWhite(String Entry)
    {
        HashMap<Character,Integer> ChessBoard = new HashMap<Character,Integer>();
        Integer TotalValue=0;
        ChessBoard.put('A',1);
        ChessBoard.put('B',2);
        ChessBoard.put('C',3);
        ChessBoard.put('D',4);
        ChessBoard.put('E',5);
        ChessBoard.put('F',6);
        ChessBoard.put('G',7);
        ChessBoard.put('H',8);
        String DefaultPoint = "White";
        Integer CellValue = ChessBoard.get(Entry.charAt(0));
        Character FirstCharacter =  Entry.charAt(0);
        if(FirstCharacter == 'A')
        {
            TotalValue = Integer.valueOf(Character.toString( Entry.charAt(1)));
        }else
        {
            TotalValue = CellValue + (8* Integer.valueOf(Character.toString( Entry.charAt(1))));

        }

        System.out.println("Total cell value "+ TotalValue);

        for(int i=1;i<TotalValue;i++)
        {
            if(DefaultPoint == "Black")
            {
                DefaultPoint = "White";
            } else
            {
                DefaultPoint = "Black";
            }
        }

        Entry = DefaultPoint;
        return Entry;
    }


}


