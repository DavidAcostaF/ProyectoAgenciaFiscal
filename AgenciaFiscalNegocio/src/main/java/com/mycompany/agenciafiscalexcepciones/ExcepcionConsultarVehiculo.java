/*
 * ExcepcionConsularVehiculo.java
 */
package com.mycompany.agenciafiscalexcepciones;

/**
 * Esta excepción se lanza cuando ocurre un error al intentar consultar información sobre un vehículo.
 * Puede ser lanzada, por ejemplo, si no se puede encontrar el vehículo en la base de datos.
 *
 * @author af_da
 */
public class ExcepcionConsultarVehiculo extends Exception {

    /**
     * Crea una nueva instancia de ExcepcionConsultarVehiculo sin mensaje detallado.
     */
    public ExcepcionConsultarVehiculo() {
    }

    /**
     * Crea una nueva instancia de ExcepcionConsultarVehiculo con el mensaje especificado.
     *
     * @param message Mensaje que describe el error.
     */
    public ExcepcionConsultarVehiculo(String message) {
        super(message);
    }

    /**
     * Crea una nueva instancia de ExcepcionConsultarVehiculo con el mensaje y la causa especificados.
     *
     * @param message Mensaje que describe el error.
     * @param cause Causa del error.
     */
    public ExcepcionConsultarVehiculo(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Crea una nueva instancia de ExcepcionConsultarVehiculo con la causa especificada y un mensaje detallado.
     *
     * @param cause Causa del error.
     */
    public ExcepcionConsultarVehiculo(Throwable cause) {
        super(cause);
    }

    /**
     * Crea una nueva instancia de ExcepcionConsultarVehiculo con el mensaje, la causa, la supresión habilitada o deshabilitada
     * y la escritura de la traza de pila habilitada o deshabilitada especificadas.
     *
     * @param message Mensaje que describe el error.
     * @param cause Causa del error.
     * @param enableSuppression Indica si la supresión está habilitada o deshabilitada.
     * @param writableStackTrace Indica si la traza de pila debe ser escrita.
     */
    public ExcepcionConsultarVehiculo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
