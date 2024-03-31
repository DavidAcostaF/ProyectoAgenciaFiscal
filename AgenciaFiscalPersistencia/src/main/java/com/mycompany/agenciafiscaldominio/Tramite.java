/*
* Tramite.java
*/
package com.mycompany.agenciafiscaldominio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa un trámite.
 *
 * Esta clase es una entidad de base para otros tipos de trámites, como
 * licencias o placas. Contiene información común a todos los trámites, como el
 * cliente asociado, la fecha de expedición y el costo del trámite.
 *
 * @author af_da
 */
@Entity
@Table(name = "tramites")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo")
public class Tramite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tramite")
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_expedicion", nullable = false)
    private Calendar fecha_expedicion;

    @Column(name = "Costo", nullable = false)
    private Float Costo;

    /**
     * Constructor por defecto de la clase Tramite.
     */
    public Tramite() {
    }

    /**
     * Devuelve el ID del trámite.
     *
     * @return El ID del trámite.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del trámite.
     *
     * @param id El ID del trámite a establecer.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Devuelve el cliente asociado al trámite.
     *
     * @return El cliente asociado al trámite.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente asociado al trámite.
     *
     * @param cliente El cliente asociado al trámite a establecer.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Devuelve la fecha de expedición del trámite.
     *
     * @return La fecha de expedición del trámite.
     */
    public Calendar getFecha_expedicion() {
        return fecha_expedicion;
    }

    /**
     * Establece la fecha de expedición del trámite.
     *
     * @param fecha_expedicion La fecha de expedición del trámite a establecer.
     */
    public void setFecha_expedicion(Calendar fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    /**
     * Devuelve el costo del trámite.
     *
     * @return El costo del trámite.
     */
    public Float getCosto() {
        return Costo;
    }

    /**
     * Establece el costo del trámite.
     *
     * @param Costo El costo del trámite a establecer.
     */
    public void setCosto(Float Costo) {
        this.Costo = Costo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tramite)) {
            return false;
        }
        Tramite other = (Tramite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.agenciafiscaldominio.Tramite[ id=" + id + " ]";
    }

}
