/*
 * LicenciaNuevaDTO.java
 */
package com.mycompany.agenciafiscaldtos;

import java.util.Calendar;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para una nueva licencia.
 * Contiene información como la fecha de vencimiento, fecha de expedición, vigencia y costo.
 * 
 * @author af_da
 */
public class LicenciaNuevaDTO {
    private Calendar fecha_vencimiento;
    private Calendar fecha_expedicion;
    private String vigencia;
    private Float costo;

    /**
     * Crea un nuevo objeto LicenciaNuevaDTO con la fecha de vencimiento, fecha de expedición, vigencia y costo especificados.
     * 
     * @param fecha_vencimiento La fecha de vencimiento de la nueva licencia.
     * @param fecha_expedicion La fecha de expedición de la nueva licencia.
     * @param vigencia La vigencia de la nueva licencia.
     * @param Costo El costo de la nueva licencia.
     */
    public LicenciaNuevaDTO(Calendar fecha_vencimiento, Calendar fecha_expedicion, String vigencia, Float Costo) {
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_expedicion = fecha_expedicion;
        this.vigencia = vigencia;
        this.costo = Costo;
    }

    /**
     * Crea un nuevo objeto LicenciaNuevaDTO con la vigencia y el costo especificados.
     * 
     * @param vigencia La vigencia de la nueva licencia.
     * @param Costo El costo de la nueva licencia.
     */
    public LicenciaNuevaDTO(String vigencia, Float Costo) {
        this.vigencia = vigencia;
        this.costo = Costo;
    }

    /**
     * Obtiene la fecha de vencimiento de la nueva licencia.
     * 
     * @return La fecha de vencimiento de la nueva licencia.
     */
    public Calendar getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    /**
     * Establece la fecha de vencimiento de la nueva licencia.
     * 
     * @param fecha_vencimiento La fecha de vencimiento de la nueva licencia.
     */
    public void setFecha_vencimiento(Calendar fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    /**
     * Obtiene la fecha de expedición de la nueva licencia.
     * 
     * @return La fecha de expedición de la nueva licencia.
     */
    public Calendar getFecha_expedicion() {
        return fecha_expedicion;
    }

    /**
     * Establece la fecha de expedición de la nueva licencia.
     * 
     * @param fecha_expedicion La fecha de expedición de la nueva licencia.
     */
    public void setFecha_expedicion(Calendar fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    /**
     * Obtiene la vigencia de la nueva licencia.
     * 
     * @return La vigencia de la nueva licencia.
     */
    public String getVigencia() {
        return vigencia;
    }

    /**
     * Establece la vigencia de la nueva licencia.
     * 
     * @param vigencia La vigencia de la nueva licencia.
     */
    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Obtiene el costo de la nueva licencia.
     * 
     * @return El costo de la nueva licencia.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el costo de la nueva licencia.
     * 
     * @param Costo El costo de la nueva licencia.
     */
    public void setCosto(Float Costo) {
        this.costo = Costo;
    }
}
