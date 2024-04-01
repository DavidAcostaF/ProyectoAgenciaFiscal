/*
 * ReporteRealizadoDTO.java
 */
package com.mycompany.agenciafiscaldtos;

import java.util.Calendar;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para un reporte realizado.
 * Contiene información sobre la fecha, tipo, costo y nombre asociados al reporte.
 * 
 */
public class ReporteRealizadoDTO {
    private Calendar fecha;
    private String tipo;
    private Float costo;
    private String nombre;

    /**
     * Crea un nuevo objeto ReporteRealizadoDTO con la fecha, tipo, costo y nombre especificados.
     * 
     * @param fecha La fecha del reporte.
     * @param tipo El tipo de reporte.
     * @param costo El costo asociado al reporte.
     * @param nombre El nombre asociado al reporte.
     */
    public ReporteRealizadoDTO(Calendar fecha, String tipo, Float costo, String nombre) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.costo = costo;
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha del reporte.
     * 
     * @return La fecha del reporte.
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del reporte.
     * 
     * @param fecha La fecha del reporte.
     */
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el tipo de reporte.
     * 
     * @return El tipo de reporte.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de reporte.
     * 
     * @param tipo El tipo de reporte.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el costo asociado al reporte.
     * 
     * @return El costo asociado al reporte.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el costo asociado al reporte.
     * 
     * @param costo El costo asociado al reporte.
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Obtiene el nombre asociado al reporte.
     * 
     * @return El nombre asociado al reporte.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre asociado al reporte.
     * 
     * @param nombre El nombre asociado al reporte.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
