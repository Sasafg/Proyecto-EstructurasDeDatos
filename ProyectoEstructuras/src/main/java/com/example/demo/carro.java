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
   
    //estras del carro
    private String alarma;
    private String canasta;
    private String racks;
    private String radio;
    private String boton;
    private String gps;

    public carro(String placa, String marca, String tipo, String modelo, int anio, String color, String costo, int pasajeros, String gas, int motor, String alarma, String canasta, String racks, String radio, String boton, String gps) {
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
        this.alarma = alarma;
        this.canasta = canasta;
        this.racks = racks;
        this.radio = radio;
        this.boton = boton;
        this.gps = gps;
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

    public String getAlarma() {
        return alarma;
    }

    public void setAlarma(String alarma) {
        this.alarma = alarma;
    }

    public String getCanasta() {
        return canasta;
    }

    public void setCanasta(String canasta) {
        this.canasta = canasta;
    }

    public String getRacks() {
        return racks;
    }

    public void setRacks(String racks) {
        this.racks = racks;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getBoton() {
        return boton;
    }

    public void setBoton(String boton) {
        this.boton = boton;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "carro{" + "placa=" + placa + ", marca=" + marca + ", tipo=" + tipo + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color + ", costo=" + costo + ", pasajeros=" + pasajeros + ", gas=" + gas + ", motor=" + motor + ", alarma=" + alarma + ", canasta=" + canasta + ", racks=" + racks + ", radio=" + radio + ", boton=" + boton + ", gps=" + gps + '}';
    }
    

    
        
    }