/*
 * ReporteTramitesBO.java
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Esta clase representa un objeto de negocio para generar reportes de trámites.
 * Implementa la interfaz IReporteTramitesBO.
 *
 * @see IReporteTramitesBO
 */
public class ReporteTramitesBO implements IReporteTramitesBO {

    private IConexion conexion;
    private ITramiteDAO tramiteDAO;

    private FiltroReporteTramitesDTO filtroReporteTramitesDTO;

    /**
     * Constructor de la clase ReporteTramitesBO. Inicializa la conexión y el
     * DAO necesario para realizar las consultas de trámites.
     */
    public ReporteTramitesBO() {
        this.conexion = new Conexion();
        tramiteDAO = new TramiteDAO(conexion);
    }

    /**
     * Método para establecer el filtro para el reporte de trámites.
     *
     * @param filtro El objeto FiltroReporteTramitesDTO que contiene los
     * criterios de filtrado.
     */
    @Override
    public void setFiltroReporteTramitesDTO(FiltroReporteTramitesDTO filtro) {
        this.filtroReporteTramitesDTO = filtro;
    }

    /**
     * Método para obtener el filtro actual utilizado en el reporte de trámites.
     *
     * @return El objeto FiltroReporteTramitesDTO actual.
     */
    @Override
    public FiltroReporteTramitesDTO getFiltroReporteTramitesDTO() {
        return filtroReporteTramitesDTO;
    }

    /**
     * Método para consultar los trámites según el filtro especificado.
     *
     * @return Una lista de objetos TramiteDTO que cumplen con el filtro
     * especificado.
     */
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
                SimpleDateFormat formatoFechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String fechaHoraFormateada = formatoFechaHora.format(tramite.getFecha_expedicion().getTime());
                TramiteDTO reporte = new TramiteDTO(tramite.getCliente().getNombre(), tramite.getClass().getSimpleName(), fechaHoraFormateada, tramite.getCosto());
                tramitesFiltrados.add(reporte);
            }
        }

        return tramitesFiltrados;
    }

}
