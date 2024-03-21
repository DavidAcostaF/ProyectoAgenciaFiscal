/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
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

    @Override
    public Cliente consultar(String rfc) {
        EntityManager entityManager = conexion.obtenerConexion();

        Query query = entityManager.createNativeQuery("SELECT * FROM Clientes WHERE rfc = ?", Cliente.class);
        query.setParameter(1, rfc);

        Cliente cliente = null;
        try {
            cliente = (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            cliente = null;
        }
        return cliente;
    }

}
