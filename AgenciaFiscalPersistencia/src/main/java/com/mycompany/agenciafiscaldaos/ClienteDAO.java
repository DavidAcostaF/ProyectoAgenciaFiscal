/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Cliente;
import java.util.Calendar;
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
                "", Cliente.class);
        List<Cliente> clientes = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return clientes;
    }

    @Override
    public Cliente consultar(String rfc) {
        EntityManager entityManager = conexion.obtenerConexion();

        Query query = entityManager.createNativeQuery("SELECT * FROM clientes WHERE rfc = ?", Cliente.class);
        query.setParameter(1, rfc);

        Cliente cliente = null;
        try {
            cliente = (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            cliente = null;
        }
        return cliente;
    }

    @Override
    public List<Cliente> consultarClienteFiltro(String nombre, String rfc, Calendar fecha_nacimiento) {
        //aun no jala aslñkjdñalk
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();

        StringBuilder jpqlBuilder = new StringBuilder("SELECT c FROM Cliente c ");
        StringBuilder filtro = new StringBuilder();
        if (!nombre.isBlank()) {
            filtro.append(" AND c.nombre LIKE :nombre");
        }
        if (!rfc.isBlank()) {
            filtro.append(" AND c.rfc = :rfc");
        }
        if (fecha_nacimiento != null) {
            filtro.append(" AND FUNCTION('DATE', c.fecha_nacimiento) = FUNCTION('DATE', :fechaNacimiento)");
        }

        if (!filtro.toString().isBlank()) {
            jpqlBuilder.append("WHERE 1=1");
            jpqlBuilder.append(filtro);
        }
        TypedQuery<Cliente> query = entityManager.createQuery(jpqlBuilder.toString(), Cliente.class);

        if (!nombre.isBlank()) {
            query.setParameter("nombre", "%" + nombre + "%");
        }
        if (!rfc.isBlank()) {
            query.setParameter("rfc", rfc);
        }
        if (fecha_nacimiento != null) {
            query.setParameter("fechaNacimiento", fecha_nacimiento);
        }

        List<Cliente> clientes = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return clientes;

    }

}
