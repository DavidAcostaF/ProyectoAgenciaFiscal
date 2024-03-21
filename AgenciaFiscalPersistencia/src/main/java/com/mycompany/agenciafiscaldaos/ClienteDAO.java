/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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

    @Override
    public List<Cliente> consultarClientes() {
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Cliente> query = entityManager.createQuery(
                "SELECT l FROM Logros l WHERE l.puntos > 10", Cliente.class);
        List<Cliente> clientes = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return clientes;
    }

}
