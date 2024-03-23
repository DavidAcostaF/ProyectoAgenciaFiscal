/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author af_da
 */
@Entity
@Table(name = "automoviles")
@DiscriminatorValue(value = "automovil")

public class Automovil extends Vehiculo implements Serializable {

    public Automovil() {
    }

    public Automovil(String serie, String marca, String color, String linea, String modelo) {
        super(serie, marca, color, linea, modelo);
    }
    
}
