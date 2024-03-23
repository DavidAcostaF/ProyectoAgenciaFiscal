/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Placa;
import com.mycompany.agenciafiscaldominio.Vehiculo;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.PlacaDTO;
import com.mycompany.agenciafiscaldtos.VehiculoDTO;

/**
 *
 * @author af_da
 */
public class TramitarPlacaBO implements ITramitarPlacaBO {

    private IConexion conexion;
    private IClienteDAO clienteDAO;

    private Cliente cliente;
    private ClienteDTO clienteDTO;

    private Vehiculo vehiculo;
    private VehiculoDTO vehiculoDTO;

    private Placa placa;
    private PlacaDTO placaDTO;

    public TramitarPlacaBO() {
        conexion = new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);

    }

    @Override
    public void setPlaca(PlacaDTO placa) {
        this.placaDTO = placa;
    }

    @Override
    public void setVehiculo(VehiculoDTO vehiculo) {
        this.vehiculoDTO = vehiculo;
    }

    @Override
    public void solicitarPlacaVehiculoNuevo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setCliente(ClienteDTO cliente) {
        this.clienteDTO = cliente;
    }

    @Override
    public ClienteDTO consultarCliente() {

        this.cliente = clienteDAO.consultar(clienteDTO.getRfc());
        if (cliente == null) {
            return null;
        }
        ClienteDTO clienteDTO = new ClienteDTO(cliente.getRfc(), cliente.getNombre(), cliente.getApellido_paterno(), cliente.getApellido_materno(), cliente.getDiscapacitado(), cliente.getFecha_nacimiento(), cliente.getTelefono());
        return clienteDTO;
    }

    @Override
    public VehiculoDTO consultarVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PlacaDTO validacionLicenciaExistencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
