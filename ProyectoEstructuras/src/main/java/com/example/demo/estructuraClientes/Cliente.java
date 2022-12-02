package com.example.demo.estructuraClientes;

/**
 *
 * @author Patrick
 */
public class Cliente {

    private int cedula;
    private String nombre;
    private String fecha_nacimiento;
    private String correo;
    private String categoria;

    public Cliente() {
    }

    public Cliente(int cedula, String nombre, String fecha_nacimiento, String correo, String categoria) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.categoria = categoria;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Información del cliente:" + "\nCédula: " + cedula + "\nNombre: " + nombre
                + "\nFecha de nacimiento: " + fecha_nacimiento + "\nCorreo: " + correo + "\nCategoría: " + categoria;
    }

}
