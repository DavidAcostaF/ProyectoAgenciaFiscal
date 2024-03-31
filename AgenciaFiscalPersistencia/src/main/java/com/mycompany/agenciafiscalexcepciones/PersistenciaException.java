/*
 * PersistenciaException.java
 */
package com.mycompany.agenciafiscalexcepciones;

/**
 * Excepción personalizada para problemas de persistencia.
 *
 * Esta excepción puede ser lanzada cuando ocurren errores relacionados con la
 * persistencia de datos en la aplicación.
 *
 */
public class PersistenciaException extends Exception {

    /**
     * Crea una nueva instancia de PersistenciaException sin detalles
     * adicionales.
     */
    public PersistenciaException() {
    }

    /**
     * Crea una nueva instancia de PersistenciaException con un mensaje
     * detallado.
     *
     * @param message el mensaje detallado de la excepción
     */
    public PersistenciaException(String message) {
        super(message);
    }

    /**
     * Crea una nueva instancia de PersistenciaException con un mensaje
     * detallado y una causa subyacente.
     *
     * @param message el mensaje detallado de la excepción
     * @param cause la causa subyacente de la excepción
     */
    public PersistenciaException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Crea una nueva instancia de PersistenciaException con una causa
     * subyacente.
     *
     * @param cause la causa subyacente de la excepción
     */
    public PersistenciaException(Throwable cause) {
        super(cause);
    }

    /**
     * Crea una nueva instancia de PersistenciaException con un mensaje
     * detallado, una causa subyacente, y opciones para habilitar o suprimir la
     * traza de pila y hacerla editable o no.
     *
     * @param message el mensaje detallado de la excepción
     * @param cause la causa subyacente de la excepción
     * @param enableSuppression indica si la supresión está habilitada o no
     * @param writableStackTrace indica si la traza de pila es editable o no
     */
    public PersistenciaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
