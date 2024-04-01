/*
 * LicenciaDTO.java
 */
package com.mycompany.agenciafiscaldtos;

import java.util.Calendar;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para una licencia.
 * Contiene información como la fecha de vencimiento, fecha de expedición, vigencia, costo y estado.
 * 
 */
public class LicenciaDTO {

    private Calendar fecha_vencimiento;
    private Calendar fecha_expedicion;
    private String vigencia;
    private Float costo;
    private Boolean estado;

    /**
     * Crea un nuevo objeto LicenciaDTO con la fecha de vencimiento especificada.
     * 
     * @param fecha_vencimiento La fecha de vencimiento de la licencia.
     */
    public LicenciaDTO(Calendar fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    /**
     * Crea un nuevo objeto LicenciaDTO sin atributos inicializados.
     */
    public LicenciaDTO() {
    }

    /**
     * Obtiene la fecha de vencimiento de la licencia.
     * 
     * @return La fecha de vencimiento de la licencia.
     */
    public Calendar getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    /**
     * Establece la fecha de vencimiento de la licencia.
     * 
     * @param fecha_vencimiento La fecha de vencimiento de la licencia.
     */
    public void setFecha_vencimiento(Calendar fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    /**
     * Obtiene la fecha de expedición de la licencia.
     * 
     * @return La fecha de expedición de la licencia.
     */
    public Calendar getFecha_expedicion() {
        return fecha_expedicion;
    }

    /**
     * Establece la fecha de expedición de la licencia.
     * 
     * @param fecha_expedicion La fecha de expedición de la licencia.
     */
    public void setFecha_expedicion(Calendar fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    /**
     * Obtiene la vigencia de la licencia.
     * 
     * @return La vigencia de la licencia.
     */
    public String getVigencia() {
        return vigencia;
    }

    /**
     * Establece la vigencia de la licencia.
     * 
     * @param vigencia La vigencia de la licencia.
     */
    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Obtiene el costo de la licencia.
     * 
     * @return El costo de la licencia.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el costo de la licencia.
     * 
     * @param costo El costo de la licencia.
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Obtiene el estado de la licencia.
     * 
     * @return El estado de la licencia.
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la licencia.
     * 
     * @param estado El estado de la licencia.
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
