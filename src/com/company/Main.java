package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

String[]   crypt={"SEND",
                  "MORE",
                  "MONEY"};

String[]   crypt2={"BAA",
                   "CAB",
                   "DAB"};

String[]   crypt3={"A",
                   "A",
                   "A"};


 char solution3[][] = {{'A','0'}};


char solution[][]={{'O','0'},
 {'M','1'},
 {'Y','2'},
 {'E','5'},
 {'N','6'},
 {'D','7'},
 {'R','8'},
 {'S','9'}};
char solution2[][]={
 {'A','0'},
 {'B','1'},
 {'C','2'},
 {'D','4'}};
      boolean  Test3=    isCryptSolution(crypt3,solution3);


    }


    public static boolean validation(char[] FirstArray,char[] SecondArray,char[] ThirdArray)
    {
        boolean result=true;

        if(FirstArray[0]=='0' || FirstArray[FirstArray.length-1]=='0')
            result= false;
        if(SecondArray[0]=='0' || SecondArray[SecondArray.length-1]=='0')
            result= false;
        if(ThirdArray[0]=='0' || ThirdArray[ThirdArray.length-1]==0)
            result= false;

        String FirstWord= new String(FirstArray);
        String SecondWord= new String(SecondArray);
        String ThirdWord= new String(ThirdArray);

        int FirstNumber  = Integer.parseInt(FirstWord);
        int SecondNumber  = Integer.parseInt(SecondWord);
        int ThirdNumber  = Integer.parseInt(ThirdWord);

        if( FirstNumber+SecondNumber != ThirdNumber)
            result=false;

        if(FirstArray.length == 1 && SecondArray.length ==1 && ThirdArray.length==1 && FirstNumber+SecondNumber == ThirdNumber)
            result= true;

        System.out.print(result);
        return result;
    }


public static    boolean isCryptSolution(String[] crypt, char[][] solution) {
//crypt.length = 3

//Step 1:Convert crypt words to number with help from solution.
//Go through char solution to get the values ?
//Step 2:Assign these values to their

        char[] FirstWord= new char[crypt[0].length()];
        char[] SecondWord= new char[crypt[1].length()];
        char[] ThirdWord= new char[crypt[2].length()];


//Begin magin loop for going through the words.

        for(int i=0;i<crypt.length;i++)
        {
            String ItemToBeDecrypted=crypt[i];
            char[] ArrayToBeDecrypted= ItemToBeDecrypted.toCharArray();

//Second loop go through the match CharArray
            for(int j=0;j<ArrayToBeDecrypted.length;j++)
            {
  //Third loop to go through solution and find the bit.
                for(int y=0;y<solution.length;y++)
                {
                    if(ArrayToBeDecrypted[j]==solution[y][0] && i==0)
                        FirstWord[j]=solution[y][1];
                    if(ArrayToBeDecrypted[j]==solution[y][0] && i==1)
                        SecondWord[j]=solution[y][1];
                    if(ArrayToBeDecrypted[j]==solution[y][0] && i==2)
                        ThirdWord[j]=solution[y][1];
                }
            }



        }        //Main loop closing
System.out.println(FirstWord);
System.out.println(SecondWord);
System.out.println(ThirdWord);




boolean result = validation(FirstWord,SecondWord,ThirdWord);


    return result;
    }



}


