/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Licencia;
import com.mycompany.agenciafiscaldominio.Placa;
import com.mycompany.agenciafiscaldominio.Tramite;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;

/**
 *
 * @author af_da
 */
public class TramiteDAO implements ITramiteDAO {

    private IConexion conexion;

    public TramiteDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public Tramite consultarLicenciaCliente(Tramite tramite) {
        EntityManager entityManager = conexion.obtenerConexion();
        // objeto constructor de consultas
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        //Objeto consulta que se esta construyendo
        CriteriaQuery<Tramite> criteria = builder.createQuery(Tramite.class);
        Root<Tramite> root = criteria.from(Tramite.class);
        criteria.select(root).where(builder.and(builder.equal(root.type(), Licencia.class), builder.equal(root.get("cliente").get("id"), tramite.getCliente().getId())));
        //consulta construida
        TypedQuery<Tramite> query = entityManager.createQuery(criteria);
        List<Tramite> tramites = query.getResultList();
        entityManager.close();
        Tramite ultimoTramite = null;
        if (!tramites.isEmpty()) {
            ultimoTramite = tramites.get(tramites.size() - 1);
        }

        return ultimoTramite;

    }

    @Override
    public Tramite consultarPlacasCliente(Tramite tramite) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tramite> consultarTramiteClientes() {
        EntityManager entityManager = conexion.obtenerConexion();

        String jpql = "SELECT t.cliente FROM Tramite t";
        Query query = entityManager.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public List<Tramite> consultarTramites() {
        EntityManager entityManager = conexion.obtenerConexion();

        String jpql = "SELECT t FROM Tramite t";
        Query query = entityManager.createQuery(jpql);
        return query.getResultList();
    }

    @Override
    public List<Tramite> consultarTramitesClienteNombre(String nombre) {
        EntityManager entityManager = conexion.obtenerConexion();
        // objeto constructor de consultas
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        //Objeto consulta que se esta construyendo
        CriteriaQuery<Tramite> criteria = builder.createQuery(Tramite.class);
        Root<Tramite> root = criteria.from(Tramite.class);

        // Crear un predicado para la comparación con LIKE
        Predicate predicate = builder.like(root.get("cliente").get("nombre"), "%" + nombre + "%");

        // Agregar el predicado a la consulta
        criteria.select(root).where(predicate);
        TypedQuery<Tramite> query = entityManager.createQuery(criteria);
        List<Tramite> tramites = query.getResultList();
        entityManager.close();

        return tramites;
    }

    @Override
    public String obtenerTipoTramite(Tramite tramite) {
        EntityManager entityManager = conexion.obtenerConexion();

        Query query = entityManager.createQuery("SELECT TYPE(t) FROM Tramite t WHERE t.id = :id");
        query.setParameter("id", tramite.getId());
        Class<?> tipo = (Class<?>) query.getSingleResult();
        return tipo.getSimpleName(); // Obtener el nombre de la clase como String

    }

    @Override
    public List<Tramite> consultarTramitesConCliente() {
        EntityManager entityManager = conexion.obtenerConexion();

        String jpql = "SELECT t FROM Tramite t JOIN FETCH t.cliente";
        TypedQuery<Tramite> query = entityManager.createQuery(jpql, Tramite.class);
        return query.getResultList();
    }

    public List<Tramite> consultarTramitesConFiltro(String tipo, String nombre, Calendar desde, Calendar hasta) {
        EntityManager entityManager = conexion.obtenerConexion();
        StringBuilder jpqlBuilder = new StringBuilder("SELECT t FROM Tramite t JOIN t.cliente c WHERE 1 = 1");

        if (!nombre.isBlank()) {
            jpqlBuilder.append(" AND c.nombre LIKE :nombre");
        }

        if (!tipo.isBlank()) {
            jpqlBuilder.append(" AND TYPE(t) = :tipoTramite");
        }

        if (desde != null && hasta != null) {
            jpqlBuilder.append(" AND t.fecha_expedicion BETWEEN :fechaInicio AND :fechaFin");
        }

        TypedQuery<Tramite> query = entityManager.createQuery(jpqlBuilder.toString(), Tramite.class);

        if (!nombre.isBlank()) {
            query.setParameter("nombre", "%" + nombre + "%");
        }

        if (!tipo.isBlank()) {
            if (tipo.equalsIgnoreCase("Licencia")) {
                query.setParameter("tipoTramite", Licencia.class);

            } else if (tipo.equalsIgnoreCase("Placa")) {
                query.setParameter("tipoTramite", Placa.class);
            }
        }

        if (desde != null && hasta != null) {
            query.setParameter("fechaInicio", desde);
            query.setParameter("fechaFin", hasta);
        }

        return query.getResultList();
    }

}
