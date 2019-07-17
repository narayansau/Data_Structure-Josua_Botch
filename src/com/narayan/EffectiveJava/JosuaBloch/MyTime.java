package com.narayan.EffectiveJava.JosuaBloch;

public class MyTime extends Time {
    public final int second;

    public MyTime(int hour, int minute, int second) {
        super( hour,  minute);
        this.second = second;
        System.out.println( toString() );

    }

    @Override
    public String toString() {
        return  super.toString()+ "MyTime{" +
                "second=" + second +
                '}';
    }
}
