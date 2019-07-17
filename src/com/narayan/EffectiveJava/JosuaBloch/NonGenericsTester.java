package com.narayan.EffectiveJava.JosuaBloch;

import java.util.Arrays;
import java.util.List;

public class NonGenericsTester <E>{
    public   void printAlll (List <E> list ) {
        for (E item : list)
            System.out.print( "  " + item + "  " );
        System.out.print( "\n");
    }
}
