package com.narayan.EffectiveJava.JosuaBloch;
//Single to example
public class Elvis{
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() { System.out.println( "Elvis singleton class initialization" ); }
    public static Elvis getInstance() { return INSTANCE; }
    public void leaveTheBuilding() { System.out.println( "LeAVE THE Buikding please" ); }
}
