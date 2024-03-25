/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaNuevaDTO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Berry
 */
public class ConsultasBO implements IConsultasBO {

    private IConexion conexion;
    private ClienteDTO clienteDTO;
    private Cliente cliente;

    public ConsultasBO() {
        this.conexion = new Conexion();
    }

//    @Override
//    public List<ClienteDTO> buscarListaCliente(String nombre, String rfc, String fechaNacimiento) {
//        //aun no jala aslñkjdñalk
//        EntityManager entityManager = conexion.obtenerConexion();
//        entityManager.getTransaction().begin();
//
//        String jpql = "SELECT c FROM Cliente c WHERE 1=1"; // Inicialmente, una condición siempre verdadera
//
//        if (nombre != null && !nombre.isEmpty()) {
//            jpql += " AND c.nombre LIKE :nombre"; // Agregar condición para el nombre
//        }
//
//        if (rfc != null && !rfc.isEmpty()) {
//            jpql += " AND c.rfc = :rfc"; // Agregar condición para el RFC
//        }
//
//        if (fechaNacimiento != null) {
//            jpql += " AND c.fechaNacimiento = :fechaNacimiento"; // Agregar condición para la fecha de nacimiento
//        }
//
//        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class);
//
//        if (nombre != null && !nombre.isEmpty()) {
//            query.setParameter("nombre", "%" + nombre + "%"); // Establecer parámetro para el nombre
//        }
//
//        if (rfc != null && !rfc.isEmpty()) {
//            query.setParameter("rfc", rfc); // Establecer parámetro para el RFC
//        }
//
//        if (fechaNacimiento != null) {
//            query.setParameter("fechaNacimiento", fechaNacimiento); // Establecer parámetro para la fecha de nacimiento
//        }
//
//        List<Cliente> clientesDTO = query.getResultList();
//
//        entityManager.getTransaction().commit();
//        entityManager.close();
//
//        return clientes;
//    }

}
