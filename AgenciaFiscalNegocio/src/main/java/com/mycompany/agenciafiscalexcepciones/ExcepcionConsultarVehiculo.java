/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalexcepciones;

/**
 *
 * @author af_da
 */
public class ExcepcionConsultarVehiculo extends Exception{

    public ExcepcionConsultarVehiculo() {
    }

    public ExcepcionConsultarVehiculo(String message) {
        super(message);
    }

    public ExcepcionConsultarVehiculo(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionConsultarVehiculo(Throwable cause) {
        super(cause);
    }

    public ExcepcionConsultarVehiculo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
