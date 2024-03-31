/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaNuevaDTO;
import com.mycompany.agenciafiscalutileria.Encriptacion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Berry
 */
public class ConsultasBO implements IConsultasBO {

    private IConexion conexion;
    private ClienteDTO filtroClienteDTO;
    private Cliente cliente;
    private IClienteDAO clienteDAO;

    private ClienteDTO clienteDTO;

    public ConsultasBO() {
        this.conexion = new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
    }

    @Override
    public List<ClienteDTO> buscarListaCliente() {
        List<Cliente> clientes = clienteDAO.consultarClienteFiltro(filtroClienteDTO.getNombre(), filtroClienteDTO.getRfc(), filtroClienteDTO.getFecha_nacimiento());
        List<ClienteDTO> clientesDTO = new ArrayList<>();
        if (clientes != null) {
            for (Cliente cliente : clientes) {
                ClienteDTO clienteDTO;
                try {
                    clienteDTO = new ClienteDTO(cliente.getRfc(),
                            cliente.getNombre(),
                            cliente.getApellido_paterno(),
                            cliente.getApellido_materno(),
                            cliente.getDiscapacitado(),
                            cliente.getFecha_nacimiento(),
                            Encriptacion.decrypt(cliente.getTelefono()));
                    clientesDTO.add(clienteDTO);

                } catch (Exception ex) {
                    Logger.getLogger(ConsultasBO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return clientesDTO;

    }

    @Override
    public void setFiltroCliente(ClienteDTO filtroCliente) {
        this.filtroClienteDTO = filtroCliente;
    }

    @Override
    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    @Override
    public ClienteDTO getClienteDTO() {
        return this.clienteDTO;
    }
}
