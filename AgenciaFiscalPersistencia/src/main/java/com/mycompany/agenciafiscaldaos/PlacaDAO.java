/*
 * PlacaDAO.java
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Placa;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * Implementación de {@link IPlacaDAO}.
 *
 * Esta clase proporciona métodos para agregar, consultar, actualizar y obtener
 * placas. También incluye métodos para consultar placas dentro de un período de
 * tiempo y obtener las placas de un cliente específico.
 *
 * @author af_da
 */
public class PlacaDAO implements IPlacaDAO {

    private IConexion conexion;

    /**
     * Constructor de PlacaDAO.
     *
     * @param conexion La conexión utilizada para acceder a la base de datos.
     */
    public PlacaDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Placa agregar(Placa placa) {
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();
        entityManager.persist(placa);
        entityManager.getTransaction().commit();
        entityManager.refresh(placa);
        entityManager.close();
        return placa;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Placa consultar(Long id) {
        EntityManager entityManager = conexion.obtenerConexion();
        Placa placa = entityManager.find(Placa.class, id);
        entityManager.close();
        return placa;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Placa consultar(String serie) {
        EntityManager entityManager = conexion.obtenerConexion();

        Query query = entityManager.createNativeQuery("SELECT * FROM placas WHERE serie = ?", Placa.class);
        query.setParameter(1, serie);

        Placa placa = null;
        try {
            placa = (Placa) query.getSingleResult();
        } catch (NoResultException e) {
            placa = null;
        }
        return placa;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Placa actualizar(Placa placa) {
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();
        entityManager.merge(placa);
        entityManager.getTransaction().commit();
        entityManager.close();
        return placa;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Placa> consultarTramitePeriodo(Calendar desde, Calendar hasta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Placa> consultarPlacasCliente(String rfc) {

        EntityManager entityManager = conexion.obtenerConexion();

        String jpql = "SELECT l FROM Placa l JOIN Tramite t ON l.id = t.id WHERE t.cliente.rfc = :rfcCliente";
        TypedQuery<Placa> query = entityManager.createQuery(jpql, Placa.class);
        query.setParameter("rfcCliente", rfc);
        return query.getResultList();
    }

}
