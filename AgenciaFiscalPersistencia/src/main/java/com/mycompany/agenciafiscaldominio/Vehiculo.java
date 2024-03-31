/*
 * Vehiculo.java
 */
package com.mycompany.agenciafiscaldominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase que representa un vehículo.
 *
 * Esta clase es una entidad base para diferentes tipos de vehículos. Contiene
 * información común a todos los vehículos, como la serie, marca, color, línea y
 * modelo del vehículo.
 *
 * @author af_da
 */
@Entity
@Table(name = "vehiculos")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo")
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "serie", nullable = false, length = 20)
    private String serie;

    @Column(name = "marca", nullable = false, length = 20)
    private String marca;

    @Column(name = "color", nullable = false, length = 20)
    private String color;

    @Column(name = "linea", nullable = false, length = 20)
    private String linea;

    @Column(name = "modelo", nullable = false, length = 20)
    private String modelo;

    @OneToOne()
    @JoinColumn(name = "id_placa")
    private Placa placa;

    /**
     * Constructor de la clase Vehiculo.
     *
     * @param serie La serie del vehículo.
     * @param marca La marca del vehículo.
     * @param color El color del vehículo.
     * @param linea La línea del vehículo.
     * @param modelo El modelo del vehículo.
     */
    public Vehiculo(String serie, String marca, String color, String linea, String modelo) {
        this.serie = serie;
        this.marca = marca;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
    }

    /**
     * Constructor por defecto de la clase Vehiculo.
     */
    public Vehiculo() {
    }

    /**
     * Obtiene la serie del vehículo.
     *
     * @return La serie del vehículo.
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Establece la serie del vehículo.
     *
     * @param serie La serie del vehículo.
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Obtiene la marca del vehículo.
     *
     * @return La marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     *
     * @param marca La marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el color del vehículo.
     *
     * @return El color del vehículo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del vehículo.
     *
     * @param color El color del vehículo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene la línea del vehículo.
     *
     * @return La línea del vehículo.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece la línea del vehículo.
     *
     * @param linea La línea del vehículo.
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Obtiene el modelo del vehículo.
     *
     * @return El modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     *
     * @param modelo El modelo del vehículo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene la placa asociada al vehículo.
     *
     * @return La placa asociada al vehículo.
     */
    public Placa getPlaca() {
        return placa;
    }

    /**
     * Establece la placa asociada al vehículo.
     *
     * @param placa La placa asociada al vehículo.
     */
    public void setPlaca(Placa placa) {
        this.placa = placa;
    }

    /**
     * Obtiene el ID del vehículo.
     *
     * @return El ID del vehículo.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del vehículo.
     *
     * @param id El ID del vehículo.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Calcula el hash code del vehículo.
     *
     * @return El hash code del vehículo.
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Compara si este vehículo es igual a otro objeto.
     *
     * @param object El objeto a comparar.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Devuelve una representación en forma de cadena del vehículo.
     *
     * @return Una cadena que representa el vehículo.
     */
    @Override
    public String toString() {
        return "com.mycompany.agenciafiscaldominio.Vehiculo[ id=" + id + " ]";
    }

}
