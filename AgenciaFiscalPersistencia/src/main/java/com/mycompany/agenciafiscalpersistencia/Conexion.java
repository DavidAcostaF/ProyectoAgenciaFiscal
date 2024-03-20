/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalpersistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author af_da
 */
public class Conexion implements IConexion {

    @Override
    public EntityManager obtenerConexion() {
        //Obtenemos acceso a la frabrica de entitymanagers
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPU");
        // solicitamos una entity manager (acceso a la bd)
        EntityManager entityManager = emFactory.createEntityManager();

        return entityManager;
    }

}
