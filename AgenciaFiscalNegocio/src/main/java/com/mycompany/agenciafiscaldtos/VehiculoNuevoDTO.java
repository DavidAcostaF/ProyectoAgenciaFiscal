/*
 * VehiculoNuevoDTO.java
 */
package com.mycompany.agenciafiscaldtos;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para un vehículo nuevo.
 * Contiene información sobre el número de serie, marca, color, línea y modelo del vehículo.
 * 
 */
public class VehiculoNuevoDTO {
    private String serie;
    private String marca;
    private String color;
    private String linea;
    private String modelo;

    /**
     * Crea un nuevo objeto VehiculoNuevoDTO con los atributos especificados.
     * 
     * @param serie El número de serie del vehículo nuevo.
     * @param marca La marca del vehículo nuevo.
     * @param color El color del vehículo nuevo.
     * @param linea La línea del vehículo nuevo.
     * @param modelo El modelo del vehículo nuevo.
     */
    public VehiculoNuevoDTO(String serie, String marca, String color, String linea, String modelo) {
        this.serie = serie;
        this.marca = marca;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
    }

    /**
     * Obtiene el número de serie del vehículo nuevo.
     * 
     * @return El número de serie del vehículo nuevo.
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Establece el número de serie del vehículo nuevo.
     * 
     * @param serie El número de serie del vehículo nuevo.
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Obtiene la marca del vehículo nuevo.
     * 
     * @return La marca del vehículo nuevo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo nuevo.
     * 
     * @param marca La marca del vehículo nuevo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el color del vehículo nuevo.
     * 
     * @return El color del vehículo nuevo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del vehículo nuevo.
     * 
     * @param color El color del vehículo nuevo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene la línea del vehículo nuevo.
     * 
     * @return La línea del vehículo nuevo.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece la línea del vehículo nuevo.
     * 
     * @param linea La línea del vehículo nuevo.
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Obtiene el modelo del vehículo nuevo.
     * 
     * @return El modelo del vehículo nuevo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo nuevo.
     * 
     * @param modelo El modelo del vehículo nuevo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }    
}
