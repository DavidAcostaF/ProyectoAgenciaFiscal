/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldominio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author af_da
 */
@Entity
@Table(name = "licencias")
@DiscriminatorValue(value = "licencia")

public class Licencia extends Tramite implements Serializable {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_vencimiento", nullable = false)
    private Calendar fecha_vencimiento;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_expedicion", nullable = false)
    private Calendar fecha_expedicion;

    @Column(name = "vigencia", nullable = false, length = 20)
    private String vigencia;

    @Column(name = "Costo", nullable = false)
    private Float Costo;

    public Licencia(Calendar fecha_vencimiento, Calendar fecha_expedicion, String vigencia, Float Costo) {
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_expedicion = fecha_expedicion;
        this.vigencia = vigencia;
        this.Costo = Costo;
    }

    public Licencia() {
    }

    public Calendar getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Calendar fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Calendar getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(Calendar fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public Float getCosto() {
        return Costo;
    }

    public void setCosto(Float Costo) {
        this.Costo = Costo;
    }

}
