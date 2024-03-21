/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.ILicenciaDAO;
import com.mycompany.agenciafiscaldaos.LicenciaDAO;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Licencia;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaNuevaDTO;
import java.util.Calendar;

/**
 *
 * @author af_da
 */
public class TramitarLicenciaBO implements ITramitarLicenciaBO {

    private IClienteDAO clienteDAO;
    private ILicenciaDAO licenciaDAO;

    private ClienteDTO clienteDTO;
    private LicenciaNuevaDTO licenciaNueva;

    private Cliente cliente;

    public TramitarLicenciaBO(IConexion conexion) {
        this.clienteDAO = new ClienteDAO(conexion);
        this.licenciaDAO = new LicenciaDAO(conexion);
    }

    @Override
    public void solcicitarLicencia() {
        Calendar fechaActual = Calendar.getInstance();
        String vigencia = this.licenciaNueva.getVigencia();
        Float costo = this.licenciaNueva.getCosto();
        Calendar fecha_vencimiento = Calendar.getInstance();
        fecha_vencimiento.add(Calendar.YEAR, 1);
        //Hardcodeado a 1 año
        Licencia licencia = new Licencia(fecha_vencimiento, fechaActual, vigencia, costo);
        //Cambiar esta madre
        consultarCliente();
        licencia.setCliente(this.cliente);
        this.licenciaDAO.agregar(licencia);
        //Checar de alguna manera al mandar la vigencia hacer que sea el puro
        //numero para sumarlo a la fecha actual para asi que sea mas simple saber cuando vencera
    }

    @Override
    public Cliente clientePendiente() {
        return this.cliente;
    }

    @Override
    public void setCliente(ClienteDTO cliente) {
        this.clienteDTO = cliente;
    }

    @Override
    public Cliente consultarCliente() {
        this.cliente = clienteDAO.consultar(clienteDTO.getRfc());
        return cliente;
    }

    @Override
    public void setLicencia(LicenciaNuevaDTO licenciaNueva) {
        this.licenciaNueva = licenciaNueva;
    }

}
