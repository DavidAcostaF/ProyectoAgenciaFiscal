/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldtos;

import java.util.Calendar;

/**
 *
 * @author af_da
 */
public class FiltroReporteTramitesDTO {
    private String nombre;
    private Calendar desde;
    private Calendar hasta;
    private String tipoTramite;

    public FiltroReporteTramitesDTO(String nombre, Calendar desde, Calendar hasta, String tipoTramite) {
        this.nombre = nombre;
        this.desde = desde;
        this.hasta = hasta;
        this.tipoTramite = tipoTramite;
    }

    public FiltroReporteTramitesDTO(Calendar desde, Calendar hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    public FiltroReporteTramitesDTO() {
    }

    public FiltroReporteTramitesDTO(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getDesde() {
        return desde;
    }

    public void setDesde(Calendar desde) {
        this.desde = desde;
    }

    public Calendar getHasta() {
        return hasta;
    }

    public void setHasta(Calendar hasta) {
        this.hasta = hasta;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
    
    
}
