package com.example.demo;

/**
 *
 * @author Saryf
 */
public class carro {

    private String placa;
    private String marca;
    private String tipo;
    private String modelo;
    private int anio;
    private String color;
    private String costo;
    private int pasajeros;
    private String gas;
    private int motor;
    private int 

    public carro(String placa, String marca, String tipo, String modelo, int anio, String color, String costo, int pasajeros, String gas, int motor) {
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.costo = costo;
        this.pasajeros = pasajeros;
        this.gas = gas;
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "carro{" + "placa=" + placa + ", marca=" + marca + ", tipo=" + tipo + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color + ", costo=" + costo + ", pasajeros=" + pasajeros + ", gas=" + gas + ", motor=" + motor + '}';
    }

   

}
