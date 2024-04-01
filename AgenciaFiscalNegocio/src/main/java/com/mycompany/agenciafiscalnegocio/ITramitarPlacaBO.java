/*
 * ITramitarPlacaBO.java
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldominio.Placa;
import com.mycompany.agenciafiscaldominio.Vehiculo;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.PlacaDTO;
import com.mycompany.agenciafiscaldtos.VehiculoDTO;
import com.mycompany.agenciafiscalexcepciones.ExcepcionConsultarVehiculo;

/**
 * Interfaz que define las operaciones para tramitar una placa de vehículo.
 *
 * author af_da
 */
public interface ITramitarPlacaBO {

    /**
     * Método para consultar los datos de un cliente.
     *
     * @return Un objeto ClienteDTO que contiene los datos del cliente
     * consultado.
     */
    public ClienteDTO consultarCliente();

    /**
     * Método para consultar los datos de un vehículo a partir de su placa.
     *
     * @return Un objeto VehiculoDTO que contiene los datos del vehículo
     * consultado.
     * @throws ExcepcionConsultarVehiculo Si hay un error al consultar el
     * vehículo.
     */
    public VehiculoDTO consultarVehiculoPorPlaca() throws ExcepcionConsultarVehiculo;

    /**
     * Método para consultar los datos de un vehículo.
     *
     * @return Un objeto VehiculoDTO que contiene los datos del vehículo
     * consultado.
     * @throws ExcepcionConsultarVehiculo Si hay un error al consultar el
     * vehículo.
     */
    public VehiculoDTO consultarVehiculo() throws ExcepcionConsultarVehiculo;

    /**
     * Método para establecer los datos de un cliente.
     *
     * @param cliente El objeto ClienteDTO que contiene los datos del cliente a
     * establecer.
     */
    public void setCliente(ClienteDTO cliente);

    /**
     * Método para establecer los datos de un vehículo.
     *
     * @param vehiculo El objeto VehiculoDTO que contiene los datos del vehículo
     * a establecer.
     */
    public void setVehiculo(VehiculoDTO vehiculo);

    /**
     * Método para establecer los datos de una placa.
     *
     * @param placa El objeto PlacaDTO que contiene los datos de la placa a
     * establecer.
     */
    public void setPlaca(PlacaDTO placa);

    /**
     * Método para solicitar una nueva placa para un vehículo.
     *
     * @return Un objeto PlacaDTO que representa la nueva placa solicitada.
     */
    public PlacaDTO solicitarPlacaVehiculo();

    /**
     * Método para validar la existencia de una licencia.
     *
     * @return Un objeto LicenciaDTO que representa la licencia existente si se
     * encuentra, o null si no.
     */
    public LicenciaDTO validacionLicenciaExistencia();

    /**
     * Método para agregar un vehículo a la base de datos.
     *
     * @param placa La placa del vehículo a agregar.
     * @return Un objeto Vehiculo que representa el vehículo agregado.
     */
    public Vehiculo agregarVehiculo(Placa placa);

    /**
     * Método para calcular el costo del trámite de placa basado en el estado
     * del vehículo.
     *
     * @param estado El estado del vehículo.
     * @return El costo del trámite de placa calculado.
     */
    public Float CalcularCosto(String estado);

    /**
     * Método para obtener los datos del vehículo.
     *
     * @return Un objeto VehiculoDTO que contiene los datos del vehículo.
     */
    public VehiculoDTO getVehiculo();

    /**
     * Método para obtener los datos del cliente.
     *
     * @return Un objeto ClienteDTO que contiene los datos del cliente.
     */
    public ClienteDTO getCliente();

    /**
     * Método para consultar los datos de la placa.
     *
     * @return Un objeto PlacaDTO que contiene los datos de la placa.
     */
    public PlacaDTO consultarPlaca();

    /**
     * Método para obtener los datos de la placa.
     *
     * @return Un objeto PlacaDTO que contiene los datos de la placa.
     */
    public PlacaDTO getPlaca();

    /**
     * Método para obtener el costo del trámite de placa.
     *
     * @return El costo del trámite de placa.
     */
    public Float getCostoTramite();

    /**
     * Método para establecer el tipo de trámite de placa.
     *
     * @param tipoTramite El tipo de trámite de placa a establecer.
     */
    public void setTipoTramitePlaca(String tipoTramite);

    /**
     * Método para obtener el tipo de trámite de placa.
     *
     * @return El tipo de trámite de placa.
     */
    public String getTipoTramitePlaca();

}
