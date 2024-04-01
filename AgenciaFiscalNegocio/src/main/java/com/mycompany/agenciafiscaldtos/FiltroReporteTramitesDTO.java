/*
 * FiltroReporteTramitesDTO.java
 */
package com.mycompany.agenciafiscaldtos;

import java.util.Calendar;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para filtrar reportes de trámites.
 * Contiene filtros como nombre, rango de fechas y tipo de trámite.
 * 
 */
public class FiltroReporteTramitesDTO {
    private String nombre;
    private Calendar desde;
    private Calendar hasta;
    private String tipoTramite;

    /**
     * Crea un nuevo objeto FiltroReporteTramitesDTO con los filtros especificados.
     * 
     * @param nombre El nombre para filtrar los reportes de trámites.
     * @param desde La fecha de inicio para filtrar los reportes de trámites.
     * @param hasta La fecha de fin para filtrar los reportes de trámites.
     * @param tipoTramite El tipo de trámite para filtrar los reportes de trámites.
     */
    public FiltroReporteTramitesDTO(String nombre, Calendar desde, Calendar hasta, String tipoTramite) {
        this.nombre = nombre;
        this.desde = desde;
        this.hasta = hasta;
        this.tipoTramite = tipoTramite;
    }

    /**
     * Crea un nuevo objeto FiltroReporteTramitesDTO con el rango de fechas especificado.
     * 
     * @param desde La fecha de inicio para filtrar los reportes de trámites.
     * @param hasta La fecha de fin para filtrar los reportes de trámites.
     */
    public FiltroReporteTramitesDTO(Calendar desde, Calendar hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    /**
     * Crea un nuevo objeto FiltroReporteTramitesDTO sin filtros.
     */
    public FiltroReporteTramitesDTO() {
    }

    /**
     * Crea un nuevo objeto FiltroReporteTramitesDTO con el nombre especificado.
     * 
     * @param nombre El nombre para filtrar los reportes de trámites.
     */
    public FiltroReporteTramitesDTO(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre para filtrar los reportes de trámites.
     * 
     * @return El nombre para filtrar los reportes de trámites.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre para filtrar los reportes de trámites.
     * 
     * @param nombre El nombre para filtrar los reportes de trámites.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de inicio para filtrar los reportes de trámites.
     * 
     * @return La fecha de inicio para filtrar los reportes de trámites.
     */
    public Calendar getDesde() {
        return desde;
    }

    /**
     * Establece la fecha de inicio para filtrar los reportes de trámites.
     * 
     * @param desde La fecha de inicio para filtrar los reportes de trámites.
     */
    public void setDesde(Calendar desde) {
        this.desde = desde;
    }

    /**
     * Obtiene la fecha de fin para filtrar los reportes de trámites.
     * 
     * @return La fecha de fin para filtrar los reportes de trámites.
     */
    public Calendar getHasta() {
        return hasta;
    }

    /**
     * Establece la fecha de fin para filtrar los reportes de trámites.
     * 
     * @param hasta La fecha de fin para filtrar los reportes de trámites.
     */
    public void setHasta(Calendar hasta) {
        this.hasta = hasta;
    }

    /**
     * Obtiene el tipo de trámite para filtrar los reportes de trámites.
     * 
     * @return El tipo de trámite para filtrar los reportes de trámites.
     */
    public String getTipoTramite() {
        return tipoTramite;
    }

    /**
     * Establece el tipo de trámite para filtrar los reportes de trámites.
     * 
     * @param tipoTramite El tipo de trámite para filtrar los reportes de trámites.
     */
    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
}
