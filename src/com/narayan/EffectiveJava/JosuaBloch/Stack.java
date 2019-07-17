package com.narayan.EffectiveJava.JosuaBloch;

public interface Stack <E> {
    int size();
    boolean isEmpty();
    void push( E e) throws IllegalStateException;
    E pop();
    E  top();

}
