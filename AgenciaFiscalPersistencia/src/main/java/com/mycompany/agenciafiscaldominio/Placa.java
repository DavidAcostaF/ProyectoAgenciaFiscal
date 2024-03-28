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
    @Column(name = "fecha_recepcion")
    private Calendar fecha_recepcion;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @OneToOne(mappedBy = "placa")
    private Vehiculo vehiculo;

    public Placa(String serie, Boolean estado) {
        this.serie = serie;
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

    public Calendar getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(Calendar fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
