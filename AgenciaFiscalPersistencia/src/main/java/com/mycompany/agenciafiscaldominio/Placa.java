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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    @Column(name = "serie",length = 8,nullable = false)
    private String serie;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_emision", nullable = false)
    private Calendar fecha_emision;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_recepcion", nullable = false)
    private Calendar fecha_recepcion;

    @Column(name = "costo", nullable = false)
    private Float costo;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

}
