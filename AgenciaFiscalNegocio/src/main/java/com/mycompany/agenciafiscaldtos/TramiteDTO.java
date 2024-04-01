/*
 * TramiteDTO.java
 */
package com.mycompany.agenciafiscaldtos;

import java.util.Calendar;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para un trámite.
 * Contiene información sobre el nombre, tipo, fecha y costo del trámite.
 * 
 */
public class TramiteDTO {

    private String nombre;
    private String tipo;
    private String fecha;
    private Float costo;

    /**
     * Crea un nuevo objeto TramiteDTO con el nombre, tipo, fecha y costo especificados.
     * 
     * @param nombre El nombre del trámite.
     * @param tipo El tipo de trámite.
     * @param fecha La fecha del trámite.
     * @param costo El costo del trámite.
     */
    public TramiteDTO(String nombre, String tipo, String fecha, Float costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.costo = costo;
    }

    /**
     * Obtiene el nombre del trámite.
     * 
     * @return El nombre del trámite.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del trámite.
     * 
     * @param nombre El nombre del trámite.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo de trámite.
     * 
     * @return El tipo de trámite.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de trámite.
     * 
     * @param tipo El tipo de trámite.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene la fecha del trámite.
     * 
     * @return La fecha del trámite.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del trámite.
     * 
     * @param fecha La fecha del trámite.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el costo del trámite.
     * 
     * @return El costo del trámite.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el costo del trámite.
     * 
     * @param costo El costo del trámite.
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

}
