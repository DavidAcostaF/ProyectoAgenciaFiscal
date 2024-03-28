/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Placa;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author af_da
 */
public class PlacaDAO implements IPlacaDAO {

    private IConexion conexion;

    public PlacaDAO(IConexion conexion) {
        this.conexion = conexion;
    }

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

    @Override
    public Placa consultar(Long id) {
        EntityManager entityManager = conexion.obtenerConexion();
        Placa placa = entityManager.find(Placa.class, id);
        entityManager.close();
        return placa;
    }

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

    @Override
    public Placa actualizar(Placa placa) {
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();
        entityManager.merge(placa);
        entityManager.getTransaction().commit();
        entityManager.close();
        return placa;
    }

    @Override
    public List<Placa> consultarTramitePeriodo(Calendar desde, Calendar hasta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
