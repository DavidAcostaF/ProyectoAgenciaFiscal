/*
 * PlacaDTO.java
 */
package com.mycompany.agenciafiscaldtos;

import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Vehiculo;
import java.util.Calendar;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para una
 * placa. Contiene información como la serie, fechas de emisión y recepción,
 * costo, estado, vehículo y cliente asociados.
 *
 */
public class PlacaDTO {

    private String serie;
    private Calendar fecha_emision;
    private Calendar fecha_recepcion;
    private Float costo;
    private Boolean estado;
    private Vehiculo vehiculo;
    private Cliente cliente;

    /**
     * Crea un nuevo objeto PlacaDTO con la serie, fecha de emisión, costo,
     * estado y vehículo especificados.
     *
     * @param serie La serie de la placa.
     * @param fecha_emision La fecha de emisión de la placa.
     * @param costo El costo de la placa.
     * @param estado El estado de la placa.
     * @param vehiculo El vehículo asociado a la placa.
     */
    public PlacaDTO(String serie, Calendar fecha_emision, Float costo, Boolean estado, Vehiculo vehiculo) {
        this.serie = serie;
        this.fecha_emision = fecha_emision;
        this.costo = costo;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    /**
     * Crea un nuevo objeto PlacaDTO con la serie, fecha de emisión, fecha de
     * recepción, costo, estado y vehículo especificados.
     *
     * @param serie La serie de la placa.
     * @param fecha_emision La fecha de emisión de la placa.
     * @param fecha_recepcion La fecha de recepción de la placa.
     * @param costo El costo de la placa.
     * @param estado El estado de la placa.
     * @param vehiculo El vehículo asociado a la placa.
     */
    public PlacaDTO(String serie, Calendar fecha_emision, Calendar fecha_recepcion, Float costo, Boolean estado, Vehiculo vehiculo) {
        this.serie = serie;
        this.fecha_emision = fecha_emision;
        this.fecha_recepcion = fecha_recepcion;
        this.costo = costo;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    /**
     * Constructor por defecto.
     */
    public PlacaDTO() {
    }

    /**
     * Crea un nuevo objeto PlacaDTO con la serie especificada.
     *
     * @param serie La serie de la placa.
     */
    public PlacaDTO(String serie) {
        this.serie = serie;
    }

    /**
     * Crea un nuevo objeto PlacaDTO con el costo especificado.
     *
     * @param costo El costo de la placa.
     */
    public PlacaDTO(Float costo) {
        this.costo = costo;
    }

    /**
     * Obtiene la serie de la placa.
     *
     * @return La serie de la placa.
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Establece la serie de la placa.
     *
     * @param serie La serie de la placa.
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Obtiene la fecha de emisión de la placa.
     *
     * @return La fecha de emisión de la placa.
     */
    public Calendar getFecha_emision() {
        return fecha_emision;
    }

    /**
     * Establece la fecha de emisión de la placa.
     *
     * @param fecha_emision La fecha de emisión de la placa.
     */
    public void setFecha_emision(Calendar fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    /**
     * Obtiene la fecha de recepción de la placa.
     *
     * @return La fecha de recepción de la placa.
     */
    public Calendar getFecha_recepcion() {
        return fecha_recepcion;
    }

    /**
     * Establece la fecha de recepción de la placa.
     *
     * @param fecha_recepcion La fecha de recepción de la placa.
     */
    public void setFecha_recepcion(Calendar fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    /**
     * Obtiene el costo de la placa.
     *
     * @return El costo de la placa.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el costo de la placa.
     *
     * @param costo El costo de la placa.
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Obtiene el estado de la placa.
     *
     * @return El estado de la placa.
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la placa.
     *
     * @param estado El estado de la placa.
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el vehículo asociado a la placa.
     *
     * @return El vehículo asociado a la placa.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo asociado a la placa.
     *
     * @param vehiculo El vehículo asociado a la placa.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el cliente asociado a la placa.
     *
     * @return El cliente asociado a la placa.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente asociado a la placa.
     *
     * @param cliente El cliente asociado a la placa.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
