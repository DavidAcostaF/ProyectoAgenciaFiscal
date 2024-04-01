/*
 * ReporteTramitesDTO.java
 */
package com.mycompany.agenciafiscaldtos;

import java.util.Calendar;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para un reporte de trámites.
 * Contiene información sobre el nombre, fecha de inicio, fecha de fin y tipo de trámite asociados al reporte.
 * 
 */
public class ReporteTramitesDTO {
    private String nombre;
    private Calendar desde;
    private Calendar hasta;
    private String tipoTramite;

    /**
     * Crea un nuevo objeto ReporteTramitesDTO con el nombre, fechas y tipo de trámite especificados.
     * 
     * @param nombre El nombre asociado al reporte.
     * @param desde La fecha de inicio del reporte.
     * @param hasta La fecha de fin del reporte.
     * @param tipoTramite El tipo de trámite asociado al reporte.
     */
    public ReporteTramitesDTO(String nombre, Calendar desde, Calendar hasta, String tipoTramite) {
        this.nombre = nombre;
        this.desde = desde;
        this.hasta = hasta;
        this.tipoTramite = tipoTramite;
    }

    /**
     * Crea un nuevo objeto ReporteTramitesDTO con las fechas especificadas.
     * 
     * @param desde La fecha de inicio del reporte.
     * @param hasta La fecha de fin del reporte.
     */
    public ReporteTramitesDTO(Calendar desde, Calendar hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    /**
     * Crea un nuevo objeto ReporteTramitesDTO con el nombre especificado.
     * 
     * @param nombre El nombre asociado al reporte.
     */
    public ReporteTramitesDTO(String nombre) {
        this.nombre = nombre;
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

    /**
     * Obtiene la fecha de inicio del reporte.
     * 
     * @return La fecha de inicio del reporte.
     */
    public Calendar getDesde() {
        return desde;
    }

    /**
     * Establece la fecha de inicio del reporte.
     * 
     * @param desde La fecha de inicio del reporte.
     */
    public void setDesde(Calendar desde) {
        this.desde = desde;
    }

    /**
     * Obtiene la fecha de fin del reporte.
     * 
     * @return La fecha de fin del reporte.
     */
    public Calendar getHasta() {
        return hasta;
    }

    /**
     * Establece la fecha de fin del reporte.
     * 
     * @param hasta La fecha de fin del reporte.
     */
    public void setHasta(Calendar hasta) {
        this.hasta = hasta;
    }

    /**
     * Obtiene el tipo de trámite asociado al reporte.
     * 
     * @return El tipo de trámite asociado al reporte.
     */
    public String getTipoTramite() {
        return tipoTramite;
    }

    /**
     * Establece el tipo de trámite asociado al reporte.
     * 
     * @param tipoTramite El tipo de trámite asociado al reporte.
     */
    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
}
