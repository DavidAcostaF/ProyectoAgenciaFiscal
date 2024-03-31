/*
 * ClienteDAO.java
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
 * Esta clase implementa la interfaz {@link IClienteDAO} y proporciona métodos
 * para realizar operaciones CRUD relacionadas con los clientes en la base de
 * datos. Utiliza JPA para interactuar con la capa de persistencia y gestionar
 * la entidad Cliente.
 *
 * La clase ClienteDAO gestiona la persistencia de los objetos Cliente y
 * proporciona métodos para agregar, consultar y filtrar clientes en la base de
 * datos.
 *
 * Esta clase es parte del conjunto de clases DAO (Data Access Object)
 * utilizadas para interactuar con la capa de persistencia de la aplicación.
 *
 */
public class ClienteDAO implements IClienteDAO {

    private IConexion conexion;

    /**
     * Crea una instancia de ClienteDAO con la conexión proporcionada.
     *
     * @param conexion La conexión utilizada para acceder a la base de datos.
     */
    public ClienteDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cliente agregar(Cliente cliente) {
        EntityManager entityManager = conexion.obtenerConexion();

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);

        entityManager.getTransaction().commit();
        entityManager.close();
        return cliente;
    }

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Cliente> consultarClienteFiltro(String nombre, String rfc, Calendar fecha_nacimiento) {
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
