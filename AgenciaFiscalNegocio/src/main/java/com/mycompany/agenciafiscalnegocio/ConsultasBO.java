/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.ILicenciaDAO;
import com.mycompany.agenciafiscaldaos.IPlacaDAO;
import com.mycompany.agenciafiscaldaos.ITramiteDAO;
import com.mycompany.agenciafiscaldaos.LicenciaDAO;
import com.mycompany.agenciafiscaldaos.PlacaDAO;
import com.mycompany.agenciafiscaldaos.TramiteDAO;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Licencia;
import com.mycompany.agenciafiscaldominio.Placa;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.PlacaDTO;
import com.mycompany.agenciafiscalutileria.Encriptacion;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Berry
 */
public class ConsultasBO implements IConsultasBO {

    private IConexion conexion;
    private IClienteDAO clienteDAO;
    private ILicenciaDAO licenciaDAO;
    private ITramiteDAO tramiteDAO;
    private IPlacaDAO placaDAO;
    private ClienteDTO filtroClienteDTO;
    private Cliente cliente;

    private ClienteDTO clienteDTO;

    public ConsultasBO() {
        this.conexion = new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
        licenciaDAO = new LicenciaDAO(conexion);
        tramiteDAO = new TramiteDAO(conexion);
        placaDAO = new PlacaDAO(conexion);
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

    @Override
    public List<LicenciaDTO> licenciasCliente() {
        List<Licencia> licencias = licenciaDAO.consultarLicenciasCliente(clienteDTO.getRfc());
        List<LicenciaDTO> licenciasDTO = new ArrayList<>();
        if (licencias != null) {
            for (Licencia licencia : licencias) {
                LicenciaDTO licenciaDTO = new LicenciaDTO();
                licenciaDTO.setCosto(licencia.getCosto());
                licenciaDTO.setFecha_expedicion(licencia.getFecha_expedicion());
                licenciaDTO.setFecha_vencimiento(licencia.getFecha_vencimiento());
                licenciaDTO.setVigencia(licencia.getVigencia());
                licenciaDTO.setEstado(licencia.getEstado());
                licenciasDTO.add(licenciaDTO);
            }
        }

        return licenciasDTO;
    }

    @Override
    public List<PlacaDTO> placasCliente() {
        List<Placa> placas = placaDAO.consultarPlacasCliente(clienteDTO.getRfc());
        List<PlacaDTO> placasDTO = new ArrayList<>();
        if (placas != null) {
            for (Placa placa : placas) {
                PlacaDTO placaDTO = new PlacaDTO();
                placaDTO.setCosto(placa.getCosto());
                placaDTO.setFecha_emision(placa.getFecha_expedicion());
                placaDTO.setFecha_recepcion(placa.getFecha_recepcion());
                placaDTO.setEstado(placa.getEstado());
                placaDTO.setSerie(placa.getSerie());
                placasDTO.add(placaDTO);
            }
        }

        return placasDTO;

    }
}
