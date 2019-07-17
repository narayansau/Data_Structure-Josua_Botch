package com.narayan.EffectiveJava.JosuaBloch;

public class SinglyLinkedList <E> {
    private static class Node <E> {
        private  E element;
        private Node <E> next;

        public Node(E element, Node <E> next) {
            this.element=element;
            this.next=next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element=element;
        }

        public Node <E> getNext() {
            return next;
        }

        public void setNext(Node <E> next) {
            this.next=next;
        }
    }

    private Node <E> head = null;
    private  Node <E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public Node <E> getHead() {
        return head;
    }

    public void setHead(Node <E> head) {
        this.head=head;
    }

    public Node <E> getTail() {
        return tail;
    }

    public void setTail(Node <E> tail) {
        this.tail=tail;
    }

    public int size() {
        return size;
    }
    public boolean  isEmpty() {
        return size == 0;
    }
    public E first() {
        return  ( isEmpty() ? null : head.getElement());
    }
    public E last() {
        return  ( isEmpty() ? null : tail.getElement());
    }

    public void addFirst(E element) {
        Node <E> newest=new Node <>( element, null );
        if (size == 0)
            tail=head;
        size++;

    }
    public void addLast(E element) {
        Node <E> newest = new Node <>( element, null );
        if ( isEmpty())
            head = newest;

        else
        {
            tail.setNext( newest );
            tail = newest;
            size++;

        }
    }





    public void setSize(int size) {
        this.size=size;
    }
}
