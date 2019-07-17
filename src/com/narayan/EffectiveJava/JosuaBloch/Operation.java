package com.narayan.EffectiveJava.JosuaBloch;

public enum Operation {
    PLUS ("+" ){ double apply(double x, double y  ){return x + y;} },
    MINUS ("-") { double apply(double x, double y){return x - y;} },
    TIMES ("*"){ double apply(double x, double y){return x * y;} },
    DIVIDE("/") { double apply(double x, double y){return x / y;} };

    Operation(String symbol) {
        this.symbol=symbol;
    }

    private String symbol;


    abstract double apply(double x, double y);
}