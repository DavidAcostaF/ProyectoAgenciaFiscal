/*
 * VehuculoDTO.java
 */
package com.mycompany.agenciafiscaldtos;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para un vehículo.
 * Contiene información sobre el número de serie, marca, color, línea y modelo del vehículo.
 * 
 */
public class VehiculoDTO {

    private String serie;
    private String marca;
    private String color;
    private String linea;
    private String modelo;

    /**
     * Crea un nuevo objeto VehiculoDTO con el número de serie especificado.
     * 
     * @param serie El número de serie del vehículo.
     */
    public VehiculoDTO(String serie) {
        this.serie = serie;
    }

    /**
     * Crea un nuevo objeto VehiculoDTO con los atributos especificados.
     * 
     * @param serie El número de serie del vehículo.
     * @param marca La marca del vehículo.
     * @param color El color del vehículo.
     * @param linea La línea del vehículo.
     * @param modelo El modelo del vehículo.
     */
    public VehiculoDTO(String serie, String marca, String color, String linea, String modelo) {
        this.serie = serie;
        this.marca = marca;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
    }

    /**
     * Obtiene el número de serie del vehículo.
     * 
     * @return El número de serie del vehículo.
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Establece el número de serie del vehículo.
     * 
     * @param serie El número de serie del vehículo.
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

}
