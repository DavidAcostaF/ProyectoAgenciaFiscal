/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IAutomovilDAO;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.IPlacaDAO;
import com.mycompany.agenciafiscaldaos.IVehiculoDAO;
import com.mycompany.agenciafiscaldaos.PlacaDAO;
import com.mycompany.agenciafiscaldaos.VehiculoDAO;
import com.mycompany.agenciafiscaldominio.Automovil;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Placa;
import com.mycompany.agenciafiscaldominio.Vehiculo;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.PlacaDTO;
import com.mycompany.agenciafiscaldtos.VehiculoDTO;
import java.util.Calendar;

/**
 *
 * @author af_da
 */
public class TramitarPlacaBO implements ITramitarPlacaBO {

    private IConexion conexion;

    private IClienteDAO clienteDAO;
    private IVehiculoDAO vehiculoDAO;
    private IPlacaDAO placaDAO;
    private IAutomovilDAO automovilDAO;

    private VehiculoDTO vehiculoDTO;
    private PlacaDTO placaDTO;
    private ClienteDTO clienteDTO;

    private Placa placa;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public TramitarPlacaBO() {
        this.conexion = new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
        this.vehiculoDAO = new VehiculoDAO(conexion);
        this.placaDAO = new PlacaDAO(conexion);
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
    public PlacaDTO solicitarPlacaVehiculoNuevo() {
        Calendar fecha = Calendar.getInstance();
        Placa placa = new Placa(placaDTO.getSerie(), fecha, placaDTO.getCosto(), placaDTO.getEstado());

        Placa placaNueva = placaDAO.agregar(placa);
        Vehiculo vehiculo = this.agregarVehiculo(placaNueva);

        return convertirAPlacaDTO(placaNueva);
    }

    private PlacaDTO convertirAPlacaDTO(Placa placa) {
        PlacaDTO placaDTO = new PlacaDTO(placa.getSerie(), placa.getFecha_emision(), placa.getCosto(), placa.getEstado(), vehiculo);
        return placaDTO;
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
        this.vehiculo = vehiculoDAO.consultar(vehiculoDTO.getSerie());
        if (vehiculo == null) {
            return null;
        }
        VehiculoDTO vehiculoDTO = new VehiculoDTO(vehiculo.getSerie(), vehiculo.getMarca(), vehiculo.getColor(), vehiculo.getLinea(), vehiculo.getModelo());
        return vehiculoDTO;
    }

    @Override
    public PlacaDTO validacionLicenciaExistencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public Vehiculo agregarVehiculo(Placa placa) {
        Automovil automovil = new Automovil(vehiculoDTO.getSerie(), vehiculoDTO.getMarca(), vehiculoDTO.getColor(), vehiculoDTO.getLinea(), vehiculoDTO.getModelo());
        automovil.setPlaca(placa);
        Automovil automovilAgregado = automovilDAO.agregar(automovil);
        return automovilAgregado;
    }

}
