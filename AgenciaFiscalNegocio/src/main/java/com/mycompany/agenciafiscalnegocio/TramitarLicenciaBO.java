/*
 * TramitarLicenciaBO.java
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.Conexion;
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
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.LicenciaNuevaDTO;
import com.mycompany.agenciafiscalutileria.Encriptacion;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa la lógica de negocio para tramitar licencias.
 */
public class TramitarLicenciaBO implements ITramitarLicenciaBO {

    private IClienteDAO clienteDAO;
    private ILicenciaDAO licenciaDAO;
    private ITramiteDAO tramiteDAO;
    private IConexion conexion;

    private ClienteDTO clienteDTO;
    private LicenciaNuevaDTO licenciaNueva;
    private Cliente cliente;
    private Licencia licencia;

    /**
     * Constructor de la clase TramitarLicenciaBO.
     */
    public TramitarLicenciaBO() {
        conexion = new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
        this.licenciaDAO = new LicenciaDAO(conexion);
        this.tramiteDAO = new TramiteDAO(conexion);
    }

    /**
     * Solicita una nueva licencia para un cliente con una vigencia específica.
     *
     * @param años Duración en años de la licencia solicitada.
     * @return Objeto LicenciaDTO que representa la nueva licencia.
     */
    @Override
    public LicenciaDTO solicitarLicencia(int años) {
        Calendar fechaActual = Calendar.getInstance();
        String vigencia = this.licenciaNueva.getVigencia();
        Float costo = this.licenciaNueva.getCosto();
        Calendar fecha_vencimiento = Calendar.getInstance();
        fecha_vencimiento.add(Calendar.YEAR, años);
        Licencia licenciaNueva = new Licencia(fecha_vencimiento, vigencia, true);
        licenciaNueva.setFecha_expedicion(fechaActual);
        licenciaNueva.setCliente(this.cliente);
        licenciaNueva.setCosto(costo);
        if (this.licencia != null) {
            actualizarLicenciaEstado(this.licencia);
        }
        Licencia licenciaCreada = this.licenciaDAO.agregar(licenciaNueva);
        return convertirALicenciaDTO(licenciaCreada);
    }

    /**
     * Realiza la validación de la existencia de una licencia para el cliente
     * actual.
     *
     * @return Objeto LicenciaDTO que representa la licencia existente del
     * cliente.
     */
    @Override
    public LicenciaDTO validacionLicenciaExistencia() {
        Tramite tramite = new Tramite();
        tramite.setCliente(this.cliente);
        Tramite tramiteConsultado = tramiteDAO.consultarLicenciaCliente(tramite);
        if (tramiteConsultado == null) {
            return null;
        }
        this.licencia = licenciaDAO.consultar(tramiteConsultado.getId());
        return convertirALicenciaDTO(licencia);
    }
    /**
     * Actualiza el estado de la licencia que recibe
     * @param licencia licencia a actualizar
     */
    private void actualizarLicenciaEstado(Licencia licencia) {
        licencia.setEstado(false);
        licenciaDAO.actualizar(licencia);
    }
    /**
     * Recibe una licencia y la convierte a licenciaDTO
     * @param licencia licencia a convertir
     * @return licenciaDTO convertida
     */
    private LicenciaDTO convertirALicenciaDTO(Licencia licencia) {
        LicenciaDTO licenciaDTO = new LicenciaDTO();
        licenciaDTO.setCosto(licencia.getCosto());
        licenciaDTO.setFecha_expedicion(licencia.getFecha_expedicion());
        licenciaDTO.setFecha_vencimiento(licencia.getFecha_vencimiento());
        licenciaDTO.setVigencia(licencia.getVigencia());
        return licenciaDTO;
    }

    /**
     * Establece el cliente para el cual se realizará el trámite de la licencia.
     *
     * @param cliente ClienteDTO que representa al cliente.
     */
    @Override
    public void setCliente(ClienteDTO cliente) {
        this.clienteDTO = cliente;
    }

    /**
     * Consulta la información del cliente actual.
     *
     * @return Objeto ClienteDTO que representa al cliente.
     */
    @Override
    public ClienteDTO consultarCliente() {
        this.cliente = clienteDAO.consultar(clienteDTO.getRfc());
        if (cliente == null) {
            return null;
        }
        ClienteDTO clienteDTO = null;
        try {
            clienteDTO = new ClienteDTO(cliente.getRfc(), cliente.getNombre(), cliente.getApellido_paterno(), cliente.getApellido_materno(), cliente.getDiscapacitado(), cliente.getFecha_nacimiento(), Encriptacion.decrypt(cliente.getTelefono()));
        } catch (Exception ex) {
            Logger.getLogger(TramitarLicenciaBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clienteDTO;
    }

    /**
     * Establece los datos de la nueva licencia que se solicitará.
     *
     * @param licenciaNueva Datos de la nueva licencia.
     */
    @Override
    public void setLicencia(LicenciaNuevaDTO licenciaNueva) {
        this.licenciaNueva = licenciaNueva;
    }

    /**
     * Calcula el costo de una licencia según su duración y el estado del
     * cliente.
     *
     * @param año Duración en años de la licencia.
     * @return Costo de la licencia.
     */
    @Override
    public Float calcularCosto(String año) {
        Map<String, Float> costosNormal = new HashMap<String, Float>() {
            {
                put("1 Año", 600.0F);
                put("2 Años", 900.0F);
                put("3 Años", 1100.0F);
            }
        };

        Map<String, Float> costosDiscapacitado = new HashMap<String, Float>() {
            {
                put("1 Año", 200.0F);
                put("2 Años", 500.0F);
                put("3 Años", 700.0F);
            }
        };

        if (cliente.getDiscapacitado()) {
            return costosDiscapacitado.get(año);
        } else {
            return costosNormal.get(año);
        }
    }
}
