package com.example.demo;

/**
 *
 * @author Saryf
 */
public class nodo<T> {

    private T value;
    private nodo<T> next;
    private nodo<T> back;

    public nodo() {

    }

    public nodo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public nodo<T> getNext() {
        return next;
    }

    public void setNext(nodo<T> next) {
        this.next = next;
    }

    public nodo<T> getBack() {
        return back;
    }

    public void setBack(nodo<T> back) {
        this.back = back;
    }

}
