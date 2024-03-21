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
public class LicenciaNuevaDTO {
    private Calendar fecha_vencimiento;

    private Calendar fecha_expedicion;

    private String vigencia;

    private Float Costo;

    public LicenciaNuevaDTO(Calendar fecha_vencimiento, Calendar fecha_expedicion, String vigencia, Float Costo) {
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_expedicion = fecha_expedicion;
        this.vigencia = vigencia;
        this.Costo = Costo;
    }

    public LicenciaNuevaDTO(String vigencia, Float Costo) {
        this.vigencia = vigencia;
        this.Costo = Costo;
    }

    public Calendar getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Calendar fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Calendar getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(Calendar fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public Float getCosto() {
        return Costo;
    }

    public void setCosto(Float Costo) {
        this.Costo = Costo;
    }
    
    
    
}
