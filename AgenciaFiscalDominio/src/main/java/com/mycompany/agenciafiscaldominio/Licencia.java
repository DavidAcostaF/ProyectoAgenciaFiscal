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

    @ManyToOne()
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

}
