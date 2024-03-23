/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldominio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author af_da
 */
@Entity
@Table(name = "placas")
@DiscriminatorValue(value = "placa")

public class Placa extends Tramite implements Serializable {

    @Column(name = "serie", length = 8, nullable = false)
    private String serie;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_emision", nullable = false)
    private Calendar fecha_emision;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_recepcion")
    private Calendar fecha_recepcion;

    @Column(name = "costo", nullable = false)
    private Float costo;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @OneToOne(mappedBy = "placa")
    private Vehiculo vehiculo;

    public Placa(String serie, Calendar fecha_emision, Float costo, Boolean estado) {
        this.serie = serie;
        this.fecha_emision = fecha_emision;
        this.costo = costo;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    public Placa(String serie, Calendar fecha_emision, Calendar fecha_recepcion, Float costo, Boolean estado) {
        this.serie = serie;
        this.fecha_emision = fecha_emision;
        this.fecha_recepcion = fecha_recepcion;
        this.costo = costo;
        this.estado = estado;
    }

    public Placa() {
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

}
