/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Cliente;
import javax.persistence.EntityManager;

/**
 *
 * @author af_da
 */
public class ClienteDAO implements IClienteDAO {

    private IConexion conexion;

    public ClienteDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public Cliente agregar(Cliente cliente) {
        EntityManager entityManager = conexion.obtenerConexion();

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);

        entityManager.getTransaction().commit();
        entityManager.close();
        return cliente;
    }

}
