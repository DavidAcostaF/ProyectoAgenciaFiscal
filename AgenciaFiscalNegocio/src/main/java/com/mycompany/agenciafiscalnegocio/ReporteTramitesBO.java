/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.ILicenciaDAO;
import com.mycompany.agenciafiscaldaos.IPlacaDAO;
import com.mycompany.agenciafiscaldaos.ITramiteDAO;
import com.mycompany.agenciafiscaldaos.TramiteDAO;
import com.mycompany.agenciafiscaldominio.Tramite;
import com.mycompany.agenciafiscaldtos.ReporteRealizadoDTO;
import com.mycompany.agenciafiscaldtos.FiltroReporteTramitesDTO;
import com.mycompany.agenciafiscaldtos.TramiteDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author af_da
 */
public class ReporteTramitesBO implements IReporteTramitesBO {

    private IConexion conexion;
    private ITramiteDAO tramiteDAO;

    private FiltroReporteTramitesDTO filtroReporteTramitesDTO;
    private List<TramiteDTO> listasReportesTramitesDTO;

    public ReporteTramitesBO() {
        this.conexion = new Conexion();
        tramiteDAO = new TramiteDAO(conexion);
    }

    @Override
    public void setFiltroReporteTramitesDTO(FiltroReporteTramitesDTO filtro) {
        this.filtroReporteTramitesDTO = filtro;

    }

    @Override
    public FiltroReporteTramitesDTO getFiltroReporteTramitesDTO() {
        return filtroReporteTramitesDTO;
    }

    @Override
    public List<TramiteDTO> consultarTramites() {
        List<TramiteDTO> tramitesFiltrados = null;
        List<Tramite> tramites = tramiteDAO.consultarTramitesConFiltro(
                filtroReporteTramitesDTO.getTipoTramite(),
                filtroReporteTramitesDTO.getNombre(),
                filtroReporteTramitesDTO.getDesde(),
                filtroReporteTramitesDTO.getHasta());

        if (tramites != null) {
            tramitesFiltrados = new ArrayList<>();
            for (Tramite tramite : tramites) {
                TramiteDTO reporte = new TramiteDTO(tramite.getCliente().getNombre(), tramite.getClass().getSimpleName(), tramite.getFecha_expedicion(), tramite.getCosto());

                tramitesFiltrados.add(reporte);
            }
        }

        return tramitesFiltrados;
    }

}
