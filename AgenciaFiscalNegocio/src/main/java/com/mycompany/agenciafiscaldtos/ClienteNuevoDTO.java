/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldtos;

import java.util.Calendar;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para un cliente nuevo.
 * Contiene información sobre el cliente, como su ID, RFC, nombre, apellidos, discapacidad, fecha de nacimiento y teléfono.
 * 
 * @author af_da
 */
public class ClienteNuevoDTO {

    private Long id;
    private String rfc;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private Boolean discapacitado;
    private Calendar fecha_nacimiento;
    private String telefono;

    /**
     * Crea un nuevo objeto ClienteNuevoDTO con los atributos especificados.
     * 
     * @param id El ID del cliente.
     * @param rfc El RFC del cliente.
     * @param nombre El nombre del cliente.
     * @param apellido_paterno El apellido paterno del cliente.
     * @param apellido_materno El apellido materno del cliente.
     * @param discapacitado Indica si el cliente tiene alguna discapacidad.
     * @param fecha_nacimiento La fecha de nacimiento del cliente.
     * @param telefono El número de teléfono del cliente.
     */
    public ClienteNuevoDTO(Long id, String rfc, String nombre, String apellido_paterno, String apellido_materno, Boolean discapacitado, Calendar fecha_nacimiento, String telefono) {
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.discapacitado = discapacitado;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
    }

    /**
     * Obtiene el ID del cliente.
     * 
     * @return El ID del cliente.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del cliente.
     * 
     * @param id El ID del cliente.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el RFC del cliente.
     * 
     * @return El RFC del cliente.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC del cliente.
     * 
     * @param rfc El RFC del cliente.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del cliente.
     * 
     * @return El apellido paterno del cliente.
     */
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    /**
     * Establece el apellido paterno del cliente.
     * 
     * @param apellido_paterno El apellido paterno del cliente.
     */
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    /**
     * Obtiene el apellido materno del cliente.
     * 
     * @return El apellido materno del cliente.
     */
    public String getApellido_materno() {
        return apellido_materno;
    }

    /**
     * Establece el apellido materno del cliente.
     * 
     * @param apellido_materno El apellido materno del cliente.
     */
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    /**
     * Obtiene un valor que indica si el cliente tiene alguna discapacidad.
     * 
     * @return true si el cliente tiene alguna discapacidad, false de lo contrario.
     */
    public Boolean getDiscapacitado() {
        return discapacitado;
    }

    /**
     * Establece si el cliente tiene alguna discapacidad.
     * 
     * @param discapacitado true si el cliente tiene alguna discapacidad, false de lo contrario.
     */
    public void setDiscapacitado(Boolean discapacitado) {
        this.discapacitado = discapacitado;
    }

    /**
     * Obtiene la fecha de nacimiento del cliente.
     * 
     * @return La fecha de nacimiento del cliente.
     */
    public Calendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Establece la fecha de nacimiento del cliente.
     * 
     * @param fecha_nacimiento La fecha de nacimiento del cliente.
     */
    public void setFecha_nacimiento(Calendar fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     * 
     * @return El número de teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     * 
     * @param telefono El número de teléfono del cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
