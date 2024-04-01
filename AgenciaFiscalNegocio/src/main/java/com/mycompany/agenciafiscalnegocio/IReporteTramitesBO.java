/*
 * IReporteTramitesBO.java
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldtos.FiltroReporteTramitesDTO;
import com.mycompany.agenciafiscaldtos.TramiteDTO;
import java.util.List;

/**
 * Interfaz que define las operaciones para generar reportes de trámites.
 * 
 * author af_da
 */
public interface IReporteTramitesBO {

    /**
     * Método para establecer el filtro de los trámites a consultar.
     * 
     * @param filtro El objeto FiltroReporteTramitesDTO que contiene el filtro a aplicar.
     */
    public void setFiltroReporteTramitesDTO(FiltroReporteTramitesDTO filtro);

    /**
     * Método para obtener el filtro de los trámites a consultar.
     * 
     * @return El objeto FiltroReporteTramitesDTO que contiene el filtro aplicado.
     */
    public FiltroReporteTramitesDTO getFiltroReporteTramitesDTO();

    /**
     * Método para consultar los trámites basados en el filtro establecido.
     * 
     * @return Una lista de objetos TramiteDTO que representan los trámites consultados.
     */
    public List<TramiteDTO> consultarTramites();

}
