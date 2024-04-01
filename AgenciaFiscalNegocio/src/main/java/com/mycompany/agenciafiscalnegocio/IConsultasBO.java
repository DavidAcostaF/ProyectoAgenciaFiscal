/*
 * IConsultasBO.java
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.PlacaDTO;
import java.util.List;

/**
 * Interfaz que define las operaciones de consulta relacionadas con los clientes, licencias y placas.
 * 
 * author Berry
 */
public interface IConsultasBO {

    /**
     * Método para buscar una lista de clientes.
     * 
     * @return Una lista de objetos ClienteDTO.
     */
    public List<ClienteDTO> buscarListaCliente();

    /**
     * Método para establecer un filtro de cliente para las consultas.
     * 
     * @param filtroCliente El objeto ClienteDTO que contiene el filtro a aplicar.
     */
    public void setFiltroCliente(ClienteDTO filtroCliente);
    
    /**
     * Método para establecer un objeto ClienteDTO.
     * 
     * @param clienteDTO El objeto ClienteDTO a establecer.
     */
    public void setClienteDTO(ClienteDTO clienteDTO);
    
    /**
     * Método para obtener el objeto ClienteDTO.
     * 
     * @return El objeto ClienteDTO.
     */
    public ClienteDTO getClienteDTO();
    
    /**
     * Método para obtener la lista de licencias de un cliente.
     * 
     * @return Una lista de objetos LicenciaDTO asociados al cliente.
     */
    public List<LicenciaDTO> licenciasCliente();
    
    /**
     * Método para obtener la lista de placas de un cliente.
     * 
     * @return Una lista de objetos PlacaDTO asociados al cliente.
     */
    public List<PlacaDTO> placasCliente();
}
