/*
 * Licencia.java
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
 * Clase que representa una licencia.
 *
 * Esta clase hereda de Tramite e incluye información adicional como la fecha de
 * vencimiento, la vigencia y el estado de la licencia.
 *
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

    /**
     * Constructor de la clase Licencia que recibe parámetros.
     *
     * @param fecha_vencimiento La fecha de vencimiento de la licencia.
     * @param vigencia La vigencia de la licencia.
     * @param estado El estado de la licencia.
     */
    public Licencia(Calendar fecha_vencimiento, String vigencia, Boolean estado) {
        this.fecha_vencimiento = fecha_vencimiento;
        this.vigencia = vigencia;
        this.estado = estado;
    }

    /**
     * Constructor por defecto de la clase Licencia.
     */
    public Licencia() {
    }

    /**
     * Devuelve la fecha de vencimiento de la licencia.
     *
     * @return La fecha de vencimiento de la licencia.
     */
    public Calendar getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    /**
     * Establece la fecha de vencimiento de la licencia.
     *
     * @param fecha_vencimiento La fecha de vencimiento de la licencia a
     * establecer.
     */
    public void setFecha_vencimiento(Calendar fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    /**
     * Devuelve la vigencia de la licencia.
     *
     * @return La vigencia de la licencia.
     */
    public String getVigencia() {
        return vigencia;
    }

    /**
     * Establece la vigencia de la licencia.
     *
     * @param vigencia La vigencia de la licencia a establecer.
     */
    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Devuelve el estado de la licencia.
     *
     * @return El estado de la licencia.
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la licencia.
     *
     * @param estado El estado de la licencia a establecer.
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
