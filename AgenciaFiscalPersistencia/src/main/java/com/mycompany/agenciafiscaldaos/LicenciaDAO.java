/*
 * LicenciaDAO.java
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Licencia;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 * Implementación de {@link ILicenciaDAO}.
 *
 * Esta clase proporciona métodos para agregar, consultar, actualizar y obtener
 * licencias. También incluye métodos para consultar licencias dentro de un
 * período de tiempo y obtener las licencias de un cliente específico.
 *
 */
public class LicenciaDAO implements ILicenciaDAO {

    private IConexion conexion;

    /**
     * Constructor de LicenciaDAO.
     *
     * @param conexion La conexión utilizada para acceder a la base de datos.
     */
    public LicenciaDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Licencia agregar(Licencia licencia) {
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();
        entityManager.persist(licencia);
        entityManager.getTransaction().commit();
        entityManager.refresh(licencia);
        entityManager.close();
        return licencia;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Licencia consultar(Long id) {
        EntityManager entityManager = conexion.obtenerConexion();
        Licencia licencia = entityManager.find(Licencia.class, id);
        entityManager.getTransaction().begin();
        entityManager.close();
        return licencia;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Licencia> consultarTramitePeriodo(Calendar desde, Calendar hasta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Licencia actualizar(Licencia licencia) {
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();
        entityManager.merge(licencia);
        entityManager.getTransaction().commit();
        entityManager.close();
        return licencia;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Licencia> consultarLicenciasCliente(String rfc) {
        EntityManager entityManager = conexion.obtenerConexion();

        String jpql = "SELECT l FROM Licencia l JOIN Tramite t ON l.id = t.id WHERE t.cliente.rfc = :rfcCliente";
        TypedQuery<Licencia> query = entityManager.createQuery(jpql, Licencia.class);
        query.setParameter("rfcCliente", rfc);
        return query.getResultList();
    }
}
