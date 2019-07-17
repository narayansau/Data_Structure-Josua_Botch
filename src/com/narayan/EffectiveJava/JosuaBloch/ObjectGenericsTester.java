package com.narayan.EffectiveJava.JosuaBloch;

import java.util.List;

import java.util.Arrays;
        import java.util.List;

public class ObjectGenericsTester <Object>{
    public   void printAlll (List<Object> list ) {
        for (Object item : list)
            System.out.print( "  " + item + "  " );
        System.out.print( "\n");
    }
}
