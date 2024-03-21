/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Licencia;
import javax.persistence.EntityManager;

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

}
