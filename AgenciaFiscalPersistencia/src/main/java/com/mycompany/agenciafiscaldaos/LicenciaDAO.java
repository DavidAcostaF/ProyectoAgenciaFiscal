/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Licencia;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author af_da
 */
public class LicenciaDAO implements ILicenciaDAO {

    private IConexion conexion;

    public LicenciaDAO(IConexion conexion) {
        this.conexion = conexion;
    }

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

    @Override
    public Licencia consultar(Long id) {
        EntityManager entityManager = conexion.obtenerConexion();
        Licencia licencia = entityManager.find(Licencia.class, id);
        entityManager.getTransaction().begin();
        entityManager.close();
        return licencia;
    }

    @Override
    public List<Licencia> consultarTramitePeriodo(Calendar desde, Calendar hasta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Licencia actualizar(Licencia licencia) {
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();
        entityManager.merge(licencia);
        entityManager.getTransaction().commit();
        entityManager.close();
        return licencia;
    }

    @Override
    public List<Licencia> consultarLicenciasCliente(String rfc) {
        EntityManager entityManager = conexion.obtenerConexion();

        String jpql = "SELECT l FROM Licencia l JOIN Tramite t ON l.id = t.id WHERE t.cliente.rfc = :rfcCliente";
        TypedQuery<Licencia> query = entityManager.createQuery(jpql, Licencia.class);
        query.setParameter("rfcCliente", rfc);
        return query.getResultList();

    }

}
