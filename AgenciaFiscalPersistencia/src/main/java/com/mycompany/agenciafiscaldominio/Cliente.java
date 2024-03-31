/*
 * Esta clase representa un objeto de tipo Cliente.
 */
package com.mycompany.agenciafiscaldominio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa un cliente.
 *
 * Esta clase contiene información sobre un cliente
 *
 * @author af_da
 */
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "rfc", nullable = false, length = 13)
    private String rfc;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name = "apellido_paterno", nullable = false, length = 30)
    private String apellido_paterno;

    @Column(name = "apellido_materno", nullable = false, length = 30)
    private String apellido_materno;

    @Column(name = "discapacitado", nullable = false)
    private Boolean discapacitado;

    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fecha_nacimiento;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "cliente")
    private List<Tramite> tramites;

    /**
     * Constructor por defecto de la clase Cliente.
     */
    public Cliente() {
    }

    /**
     * Constructor de la clase Cliente que recibe parámetros.
     *
     * @param rfc El RFC del cliente.
     * @param nombre El nombre del cliente.
     * @param apellido_paterno El apellido paterno del cliente.
     * @param apellido_materno El apellido materno del cliente.
     * @param discapacitado Indica si el cliente tiene alguna discapacidad.
     * @param fecha_nacimiento La fecha de nacimiento del cliente.
     * @param telefono El número de teléfono del cliente.
     */
    public Cliente(String rfc, String nombre, String apellido_paterno, String apellido_materno, Boolean discapacitado, Calendar fecha_nacimiento, String telefono) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.discapacitado = discapacitado;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
    }

    /**
     * Devuelve el ID del cliente.
     *
     * @return El ID del cliente.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del cliente.
     *
     * @param id El ID del cliente a establecer.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Devuelve el RFC del cliente.
     *
     * @return El RFC del cliente.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC del cliente.
     *
     * @param rfc El RFC del cliente a establecer.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Devuelve el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el apellido paterno del cliente.
     *
     * @return El apellido paterno del cliente.
     */
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    /**
     * Establece el apellido paterno del cliente.
     *
     * @param apellido_paterno El apellido paterno del cliente a establecer.
     */
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    /**
     * Devuelve el apellido materno del cliente.
     *
     * @return El apellido materno del cliente.
     */
    public String getApellido_materno() {
        return apellido_materno;
    }

    /**
     * Establece el apellido materno del cliente.
     *
     * @param apellido_materno El apellido materno del cliente a establecer.
     */
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    /**
     * Indica si el cliente tiene alguna discapacidad.
     *
     * @return true si el cliente tiene alguna discapacidad, false en caso
     * contrario.
     */
    public Boolean getDiscapacitado() {
        return discapacitado;
    }

    /**
     * Establece si el cliente tiene alguna discapacidad.
     *
     * @param discapacitado true si el cliente tiene alguna discapacidad, false
     * en caso contrario.
     */
    public void setDiscapacitado(Boolean discapacitado) {
        this.discapacitado = discapacitado;
    }

    /**
     * Devuelve la fecha de nacimiento del cliente.
     *
     * @return La fecha de nacimiento del cliente.
     */
    public Calendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Establece la fecha de nacimiento del cliente.
     *
     * @param fecha_nacimiento La fecha de nacimiento del cliente a establecer.
     */
    public void setFecha_nacimiento(Calendar fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * Devuelve el número de teléfono del cliente.
     *
     * @return El número de teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono El número de teléfono del cliente a establecer.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve la lista de trámites asociados a este cliente.
     *
     * @return La lista de trámites asociados a este cliente.
     */
    public List<Tramite> getTramites() {
        return tramites;
    }

    /**
     * Establece la lista de trámites asociados a este cliente.
     *
     * @param tramites La lista de trámites asociados a este cliente a
     * establecer.
     */
    public void setTramites(List<Tramite> tramites) {
        this.tramites = tramites;
    }

    /**
     * Devuelve el hash code de este cliente.
     *
     * @return El hash code de este cliente.
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Indica si este cliente es igual a otro objeto.
     *
     * @param object El objeto con el que comparar.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Devuelve una representación en cadena de este cliente.
     *
     * @return Una representación en cadena de este cliente.
     */
    @Override
    public String toString() {
        return "com.mycompany.agenciafiscaldominio.Cliente[ id=" + id + " ]";
    }

}
