package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

String input ="foo(bar(baz))blim";
      String result=  reverseInParentheses(input);

      System.out.println(result);
    }


public static String reverseInParentheses(String inputString) {


    StringBuilder MyBuilderMain = new StringBuilder();
    StringBuilder MyBuilderSpare = new StringBuilder();
    int Switch=0;
    int DoubleReverse=0;
    for(int i=0;i<inputString.length();i++)
    {
        char comparison =  inputString.charAt(i);

        if(comparison == '(')
        {
            if(Switch==1)
                DoubleReverse=1;

            Switch=1;
        }
        else if(comparison == ')')
        {
            MyBuilderSpare.reverse();
            MyBuilderMain.append(MyBuilderSpare.toString());
            Switch=0;
            MyBuilderSpare = new StringBuilder();
        }
        if(Switch==1 && comparison != '(' && comparison !=')')
        {
            MyBuilderSpare.append(String.valueOf(inputString.charAt(i)));
        }
        if((Switch==0 && comparison != '(' && comparison !=')') || (DoubleReverse==1 && comparison != '(' && comparison !=')' ))
        {
            MyBuilderMain.append(String.valueOf(inputString.charAt(i)));
        }




    }

    String result = MyBuilderMain.toString();


    return result;
}




}


