/*
 * Esta clase representa una placa.
 */
package com.mycompany.agenciafiscaldominio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa una placa.
 *
 * Esta clase hereda de Tramite e incluye información adicional como la serie de
 * la placa, la fecha de recepción y el estado de la placa. También establece la
 * relación con la entidad Vehiculo mediante una relación uno a uno.
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

    /**
     * Constructor de la clase Placa que recibe parámetros.
     *
     * @param serie La serie de la placa.
     * @param estado El estado de la placa.
     */
    public Placa(String serie, Boolean estado) {
        this.serie = serie;
        this.estado = estado;
    }

    /**
     * Constructor por defecto de la clase Placa.
     */
    public Placa() {
    }

    /**
     * Devuelve la serie de la placa.
     *
     * @return La serie de la placa.
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Establece la serie de la placa.
     *
     * @param serie La serie de la placa a establecer.
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Devuelve la fecha de recepción de la placa.
     *
     * @return La fecha de recepción de la placa.
     */
    public Calendar getFecha_recepcion() {
        return fecha_recepcion;
    }

    /**
     * Establece la fecha de recepción de la placa.
     *
     * @param fecha_recepcion La fecha de recepción de la placa a establecer.
     */
    public void setFecha_recepcion(Calendar fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    /**
     * Devuelve el estado de la placa.
     *
     * @return El estado de la placa.
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la placa.
     *
     * @param estado El estado de la placa a establecer.
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
