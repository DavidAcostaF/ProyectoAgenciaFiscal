/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldominio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
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

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @Column(name = "vigencia", nullable = false, length = 20)
    private String vigencia;

    public Licencia(Calendar fecha_vencimiento, String vigencia, Boolean estado) {
        this.fecha_vencimiento = fecha_vencimiento;
        this.vigencia = vigencia;
        this.estado = estado;
    }

    public Licencia() {
    }

    public Calendar getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Calendar fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

}
