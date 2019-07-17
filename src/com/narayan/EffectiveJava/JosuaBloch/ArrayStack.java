package com.narayan.EffectiveJava.JosuaBloch;

import java.util.Calendar;

public class ArrayStack <E> implements Stack <E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;
    public ArrayStack(int capacity) {
       data = (E []) new Object[CAPACITY] ;

    }

    @Override
    public int size() {
        return ( t+1);
    }

    @Override
    public boolean isEmpty() {
        return ( t == -1);
    }

    @Override
    public void push(E e) throws IllegalStateException {
        if ( size() == CAPACITY) throw new IllegalStateException( "Stack is Full" );
        data[++t] = e;
    }

    @Override
    public E pop() throws ArrayIndexOutOfBoundsException{

        if ( isEmpty() ) throw new ArrayIndexOutOfBoundsException("Stack is Empty");
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }

    @Override
    public E top() {
        return ( isEmpty() ? null : data[t]);
    }
}
