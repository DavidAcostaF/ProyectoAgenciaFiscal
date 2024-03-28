/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.AutomovilDAO;
import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IAutomovilDAO;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.ILicenciaDAO;
import com.mycompany.agenciafiscaldaos.IPlacaDAO;
import com.mycompany.agenciafiscaldaos.ITramiteDAO;
import com.mycompany.agenciafiscaldaos.IVehiculoDAO;
import com.mycompany.agenciafiscaldaos.LicenciaDAO;
import com.mycompany.agenciafiscaldaos.PlacaDAO;
import com.mycompany.agenciafiscaldaos.TramiteDAO;
import com.mycompany.agenciafiscaldaos.VehiculoDAO;
import com.mycompany.agenciafiscaldominio.Automovil;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Licencia;
import com.mycompany.agenciafiscaldominio.Placa;
import com.mycompany.agenciafiscaldominio.Tramite;
import com.mycompany.agenciafiscaldominio.Vehiculo;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.PlacaDTO;
import com.mycompany.agenciafiscaldtos.VehiculoDTO;
import com.mycompany.agenciafiscalexcepciones.ExcepcionConsultarVehiculo;
import com.mycompany.agenciafiscalexcepciones.PersistenciaException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
    private ITramiteDAO tramiteDAO;
    private ILicenciaDAO licenciaDAO;

    private VehiculoDTO vehiculoDTO;
    private PlacaDTO placaDTO;
    private ClienteDTO clienteDTO;

    private Placa placa;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Float costoTramite;
    private String tipoTramitePlaca;

    public TramitarPlacaBO() {
        this.conexion = new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
        this.vehiculoDAO = new VehiculoDAO(conexion);
        this.automovilDAO = new AutomovilDAO(conexion);
        this.placaDAO = new PlacaDAO(conexion);
        this.tramiteDAO = new TramiteDAO(conexion);
        this.licenciaDAO = new LicenciaDAO(conexion);
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
    public PlacaDTO solicitarPlacaVehiculo() {
        Calendar fecha = Calendar.getInstance();
        Placa placa = new Placa(generarSeriePlaca(), fecha, placaDTO.getCosto(), true);
        placa.setCliente(cliente);

        Placa placaNueva = placaDAO.agregar(placa);
        Vehiculo vehiculo = this.agregarVehiculo(placaNueva);
        if (this.placa != null) {
            actualizarPlaca(this.placa);
        }
        return convertirAPlacaDTO(placaNueva);
    }

    private void actualizarPlaca(Placa placa) {
        Calendar fechaActual = Calendar.getInstance();
        placa.setFecha_recepcion(fechaActual);
        placa.setEstado(false);
        placaDAO.actualizar(placa);
    }

    private String generarSeriePlaca() {
        // Generador de letras aleatorias
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        // Generar las tres letras
        for (int i = 0; i < 3; i++) {
            char letra = letras.charAt(random.nextInt(letras.length()));
            sb.append(letra);
        }

        // Separador "-"
        sb.append("-");

        // Generador de números aleatorios
        String numeros = "0123456789";

        // Generar los tres dígitos
        for (int i = 0; i < 3; i++) {
            char numero = numeros.charAt(random.nextInt(numeros.length()));
            sb.append(numero);
        }

        return sb.toString();

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
    public VehiculoDTO consultarVehiculoPorPlaca() throws ExcepcionConsultarVehiculo {
        try {
            this.vehiculo = vehiculoDAO.consultarPorPlaca(placaDTO.getSerie());

        } catch (PersistenciaException pe) {
            throw new ExcepcionConsultarVehiculo("No se ha encontrado el vehiculo");
        }
        if (vehiculo == null) {
            return null;
        }
        vehiculoDTO = new VehiculoDTO(vehiculo.getSerie(), vehiculo.getMarca(), vehiculo.getColor(), vehiculo.getLinea(), vehiculo.getModelo());
        return vehiculoDTO;
    }

    @Override
    public LicenciaDTO validacionLicenciaExistencia() {
        Tramite tramiteCliente = new Tramite();
        tramiteCliente.setCliente(cliente);
        Tramite tramiteConsultado = tramiteDAO.consultarLicenciaCliente(tramiteCliente);
        if (tramiteConsultado == null) {
            return null;
        }
        Licencia licenciaConsultatada = licenciaDAO.consultar(tramiteConsultado.getId());

        LicenciaDTO licenciaDTO = new LicenciaDTO();
        licenciaDTO.setCosto(licenciaDTO.getCosto());
        licenciaDTO.setFecha_expedicion(licenciaDTO.getFecha_expedicion());
        licenciaDTO.setFecha_vencimiento(licenciaDTO.getFecha_vencimiento());
        licenciaDTO.setVigencia(licenciaDTO.getVigencia());
        return licenciaDTO;
    }

    @Override
    public Vehiculo agregarVehiculo(Placa placa) {
        Automovil automovil = new Automovil(vehiculoDTO.getSerie(), vehiculoDTO.getMarca(), vehiculoDTO.getColor(), vehiculoDTO.getLinea(), vehiculoDTO.getModelo());
        automovil.setPlaca(placa);
        Automovil automovilAgregado = automovilDAO.agregar(automovil);
        return automovilAgregado;
    }

    @Override
    public Float CalcularCosto(String estado) {
        Map<String, Float> costosNormal = new HashMap<String, Float>() {
            {
                put("nuevo", 1500.0F);
                put("usado", 1000.0F);
            }
        };
        costoTramite = costosNormal.get(estado);
        return costoTramite;
    }

    @Override
    public VehiculoDTO getVehiculo() {
        return vehiculoDTO;
    }

    @Override
    public ClienteDTO getCliente() {
        return clienteDTO;
    }

    @Override
    public PlacaDTO consultarPlaca() {
        this.placa = placaDAO.consultar(placaDTO.getSerie());
        if (placa == null) {
            return null;
        }

        return convertirAPlacaDTO(placa);
    }

    @Override
    public PlacaDTO getPlaca() {
        return this.placaDTO;
    }

    @Override
    public Float getCostoTramite() {
        return costoTramite;
    }

    @Override
    public VehiculoDTO consultarVehiculo() throws ExcepcionConsultarVehiculo {
        try {
            this.vehiculo = vehiculoDAO.consultar(vehiculoDTO.getSerie());

        } catch (PersistenciaException pe) {
            throw new ExcepcionConsultarVehiculo("No se ha encontrado el vehiculo");
        }
        if (vehiculo == null) {
            return null;
        }
        vehiculoDTO = new VehiculoDTO(vehiculo.getSerie(), vehiculo.getMarca(), vehiculo.getColor(), vehiculo.getLinea(), vehiculo.getModelo());
        return vehiculoDTO;
    }

    @Override
    public void setTipoTramitePlaca(String tipoTramite) {
        this.tipoTramitePlaca = tipoTramite;
    }

    @Override
    public String getTipoTramitePlaca() {
        return tipoTramitePlaca;
    }

}
