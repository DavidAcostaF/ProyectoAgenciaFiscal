/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldtos.FiltroReporteTramitesDTO;
import com.mycompany.agenciafiscaldtos.TramiteDTO;
import java.util.List;

/**
 *
 * @author af_da
 */
public interface IReporteTramitesBO {

    public void setFiltroReporteTramitesDTO(FiltroReporteTramitesDTO filtro);

    public FiltroReporteTramitesDTO getFiltroReporteTramitesDTO();

    public List<TramiteDTO> consultarTramites();

}
