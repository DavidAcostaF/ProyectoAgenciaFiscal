/*
 * Automovil.java
 */
package com.mycompany.agenciafiscaldominio;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Clase que representa un automóvil y extiende la clase Vehiculo.
 *
 */
@Entity
@Table(name = "automoviles")
@DiscriminatorValue(value = "automovil")
public class Automovil extends Vehiculo implements Serializable {

    /**
     * Constructor por defecto de la clase Automovil.
     */
    public Automovil() {
    }

    /**
     * Constructor de la clase Automovil que recibe parámetros.
     *
     * @param serie El número de serie del automóvil.
     * @param marca La marca del automóvil.
     * @param color El color del automóvil.
     * @param linea La línea del automóvil.
     * @param modelo El modelo del automóvil.
     */
    public Automovil(String serie, String marca, String color, String linea, String modelo) {
        super(serie, marca, color, linea, modelo);
    }
}
