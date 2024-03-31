/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldtos;

import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Vehiculo;
import java.util.Calendar;

/**
 *
 * @author af_da
 */
public class PlacaDTO {

    private String serie;

    private Calendar fecha_emision;

    private Calendar fecha_recepcion;

    private Float costo;

    private Boolean estado;

    private Vehiculo vehiculo;
    
    private Cliente cliente;

    public PlacaDTO(String serie, Calendar fecha_emision, Float costo, Boolean estado, Vehiculo vehiculo) {
        this.serie = serie;
        this.fecha_emision = fecha_emision;
        this.costo = costo;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    public PlacaDTO() {
    }

    public PlacaDTO(String serie, Calendar fecha_emision, Calendar fecha_recepcion, Float costo, Boolean estado, Vehiculo vehiculo) {
        this.serie = serie;
        this.fecha_emision = fecha_emision;
        this.fecha_recepcion = fecha_recepcion;
        this.costo = costo;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    public PlacaDTO(String serie) {
        this.serie = serie;
    }

    public PlacaDTO(Float costo) {
        this.costo = costo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Calendar getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Calendar fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Calendar getFecha_recepcion() {
        return fecha_recepcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha_recepcion(Calendar fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
