/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Placa;
import javax.persistence.EntityManager;

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

}
