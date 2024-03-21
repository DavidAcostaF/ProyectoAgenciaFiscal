/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.ILicenciaDAO;
import com.mycompany.agenciafiscaldaos.ITramiteDAO;
import com.mycompany.agenciafiscaldaos.LicenciaDAO;
import com.mycompany.agenciafiscaldaos.TramiteDAO;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Licencia;
import com.mycompany.agenciafiscaldominio.Tramite;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaNuevaDTO;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author af_da
 */
public class TramitarLicenciaBO implements ITramitarLicenciaBO {

    private IClienteDAO clienteDAO;
    private ILicenciaDAO licenciaDAO;
    private ITramiteDAO tramiteDAO;
    private ClienteDTO clienteDTO;
    private LicenciaNuevaDTO licenciaNueva;

    private Cliente cliente;

    public TramitarLicenciaBO(IConexion conexion) {
        this.clienteDAO = new ClienteDAO(conexion);
        this.licenciaDAO = new LicenciaDAO(conexion);
        this.tramiteDAO = new TramiteDAO(conexion);
    }

    @Override
    public boolean solicitarLicencia(int años) {
//        if (validacionTramiteVencimiento()) {
//            return;
//        }
        Calendar fechaActual = Calendar.getInstance();
        String vigencia = this.licenciaNueva.getVigencia();
        Float costo = this.licenciaNueva.getCosto();
        Calendar fecha_vencimiento = Calendar.getInstance();
        fecha_vencimiento.add(Calendar.YEAR, años);
        Licencia licencia = new Licencia(fecha_vencimiento, fechaActual, vigencia, costo);
        licencia.setCliente(this.cliente);
        Licencia licenciaCreada = this.licenciaDAO.agregar(licencia);
        if (licenciaCreada.getId() != null) {
            return true;
        }
        return false;
        //Checar de alguna manera al mandar la vigencia hacer que sea el puro
        //numero para sumarlo a la fecha actual para asi que sea mas simple saber cuando vencera
    }

    @Override
    public Cliente clientePendiente() {
        return this.cliente;
    }

    private boolean validacionTramiteVencimiento() {
        Tramite tramite = new Tramite();
        tramite.setCliente(this.cliente);
        Tramite tramiteConsultado = tramiteDAO.consultarLicencias(tramite);

        Calendar fecha_vencimiento = licenciaDAO.consultar(tramiteConsultado.getId()).getFecha_vencimiento();
        Calendar fechaActual = Calendar.getInstance();
        return fecha_vencimiento.before(fechaActual);
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
    public void setLicencia(LicenciaNuevaDTO licenciaNueva) {
        this.licenciaNueva = licenciaNueva;
    }

    @Override
    public Float calcularCosto(String año) {
        System.out.println(año);
        Map<String, Float> costosNormal = new HashMap<>();

        costosNormal.put("1 Año", 600.0F);
        costosNormal.put("2 Años", 900.0F);
        costosNormal.put("3 Años", 1100.0F);

        Map<String, Float> costosDiscapacitado = new HashMap<>();
        costosDiscapacitado.put("1 Año", 200.0F);
        costosDiscapacitado.put("2 Años", 500.0F);
        costosDiscapacitado.put("3 Años", 700.0F);

        if (cliente.getDiscapacitado()) {
            return costosDiscapacitado.get(año);
        } else {
            return costosNormal.get(año);
        }

    }

}
