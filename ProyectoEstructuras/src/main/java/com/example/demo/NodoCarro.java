/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author Saryf
 */
public class NodoCarro {
      private carro dato;  
    private NodoCarro next;  

    public NodoCarro(carro dato, NodoCarro next) {
        this.dato = dato;
        this.next = next;
    }

    public carro getDato() {
        return dato;
    }

    public void setDato(carro dato) {
        this.dato = dato;
    }

    public NodoCarro getNext() {
        return next;
    }

    public void setNext(NodoCarro next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodoCarro{" + "dato=" + dato + ", next=" + next + '}';
    }
    

}
