/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldtos;

import java.util.Calendar;

/**
 *
 * @author af_da
 */
public class TramiteDTO {

    private String nombre;
    private String tipo;
    private String fecha;
    private Float costo;

    public TramiteDTO(String nombre, String tipo, String fecha, Float costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

}
