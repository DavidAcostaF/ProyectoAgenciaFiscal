/*
 * ITramitarLicenciaBO.java
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Licencia;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.LicenciaNuevaDTO;

/**
 * Interfaz que define las operaciones para tramitar una licencia.
 * 
 */
public interface ITramitarLicenciaBO {

    /**
     * Método para solicitar una nueva licencia con una vigencia determinada.
     * 
     * @param años La cantidad de años de vigencia de la licencia a solicitar.
     * @return Un objeto LicenciaDTO que representa la nueva licencia solicitada.
     */
    public LicenciaDTO solicitarLicencia(int años);

    /**
     * Método para calcular el costo de una licencia basado en un criterio.
     * 
     * @param criterio El criterio a utilizar para calcular el costo de la licencia.
     * @return El costo de la licencia calculado.
     */
    public Float calcularCosto(String criterio);

    /**
     * Método para consultar los datos de un cliente.
     * 
     * @return Un objeto ClienteDTO que contiene los datos del cliente consultado.
     */
    public ClienteDTO consultarCliente();

    /**
     * Método para establecer los datos de un cliente.
     * 
     * @param cliente El objeto ClienteDTO que contiene los datos del cliente a establecer.
     */
    public void setCliente(ClienteDTO cliente);

    /**
     * Método para establecer los datos de una nueva licencia.
     * 
     * @param licenciaNueva El objeto LicenciaNuevaDTO que contiene los datos de la nueva licencia.
     */
    public void setLicencia(LicenciaNuevaDTO licenciaNueva);

    /**
     * Método para validar la existencia de una licencia.
     * 
     * @return Un objeto LicenciaDTO que representa la licencia existente si se encuentra, o null si no.
     */
    public LicenciaDTO validacionLicenciaExistencia();

}
