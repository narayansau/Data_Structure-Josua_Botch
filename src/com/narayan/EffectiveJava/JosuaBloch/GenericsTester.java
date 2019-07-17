package com.narayan.EffectiveJava.JosuaBloch;

import java.util.List;

public class GenericsTester{
    public static void printAll(List <?> list) {
        for (Object item : list)
            System.out.print( "  " + item + " " );
        System.out.print( "\n");
    }


    /*public static void reverseArray(List <Double> x, int size) {


        reverse( x , 0, size -1);
        for (int i =0 ; i < size ; i ++
        ) {
            System.out.print( "  rev  "+ x[i] + " " );
        }
    }

    private static void    reverse(List <Double> x, int i, int j){
        if(i<j){//Swap
            Double tmp = x[i];
            x[i] = x[j];
            x[j] = tmp;
            reverse(x, ++i, --j);//Recursive
        }
    }  */
}
