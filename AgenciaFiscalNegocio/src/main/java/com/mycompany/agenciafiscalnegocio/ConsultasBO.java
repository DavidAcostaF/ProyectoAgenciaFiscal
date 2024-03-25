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
import java.util.LinkedList;
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

    @Override
    public List<ClienteDTO> buscarListaCliente(ClienteDTO clienteDTO) {
        //aun no jala aslñkjdñalk
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();

        String sentencia = "SELECT c FROM Cliente c WHERE 1=1";
        if (clienteDTO.getNombre() != null ){
            sentencia += " AND c.nombre LIKE :nombre";
        }
        if (clienteDTO.getRfc()!= null) {
            sentencia += " AND c.rfc = :rfc";
        }
        if (clienteDTO.getFecha_nacimiento() != null) {
            sentencia += " AND c.fechaNacimiento = :fechaNacimiento";
        }

        TypedQuery<Cliente> query = entityManager.createQuery(sentencia, Cliente.class);

        if (clienteDTO.getNombre() != null) {
            query.setParameter("nombre", "%" + clienteDTO.getNombre() + "%");
        }
        if (clienteDTO.getRfc()!= null) {
            query.setParameter("rfc", clienteDTO.getRfc());
        }
        if (clienteDTO.getFecha_nacimiento() != null) {
            query.setParameter("fechaNacimiento", clienteDTO.getFecha_nacimiento());
        }

        List<Cliente> clientes = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();
        
        List<ClienteDTO> clientesDTO = new LinkedList<>();
        for (Cliente cliente : clientes) {
            ClienteDTO clienteTemporalDTO = new ClienteDTO(cliente.getRfc(), cliente.getNombre(), cliente.getApellido_paterno(), cliente.getApellido_materno(), cliente.getDiscapacitado(), cliente.getFecha_nacimiento(), cliente.getTelefono());
            clientesDTO.add(clienteTemporalDTO);
        }
        return clientesDTO;
        
    }
}
