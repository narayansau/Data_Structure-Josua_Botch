package com.narayan.EffectiveJava.JosuaBloch;

public interface List <E> {
    int size();
    boolean isEmpty();
    E get ( int i ,E e) throws IndexOutOfBoundsException;
    void add(int i , E e) throws IndexOutOfBoundsException;
    E remove(int i) throws IndexOutOfBoundsException;

}
