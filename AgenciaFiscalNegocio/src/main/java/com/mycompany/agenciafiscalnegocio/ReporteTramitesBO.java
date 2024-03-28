/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.ILicenciaDAO;
import com.mycompany.agenciafiscaldaos.IPlacaDAO;
import com.mycompany.agenciafiscaldaos.ITramiteDAO;
import com.mycompany.agenciafiscaldominio.Tramite;
import com.mycompany.agenciafiscaldtos.ReporteRealizadoDTO;
import com.mycompany.agenciafiscaldtos.ReporteTramitesDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author af_da
 */
public class ReporteTramitesBO implements IReporteTramitesBO {

    private IConexion conexion;
    private IClienteDAO clienteDAO;
    private ITramiteDAO tramiteDAO;
    private ILicenciaDAO licenciaDAO;
    private IPlacaDAO placaDAO;

    private ReporteTramitesDTO reporteTramitesDTO;
    private List<ReporteTramitesDTO> listasReportesTramitesDTO;

    public ReporteTramitesBO(IConexion conexion) {
        this.conexion = conexion;
    }
    
    
//    public List<ReporteTramitesDTO> consultarTramites(){
//        tramiteDAO.consultarTramites();
//    };
//    
//    
//    public List<ReporteRealizadoDTO> consultarSinFiltros(){
//        List<Tramite> tramites = tramiteDAO.consultarTramitesConCliente();
//        List<ReporteTramitesDTO>reporteTramitesDTO = new ArrayList<>();
//        for (Tramite tramite: tramites) {
//            String tipo = tramite.getClass().getName();
//            if(tipo.equalsIgnoreCase("placa")){
//                
//            ReporteRealizadoDTO reporte = new ReporteRealizadoDTO();
//            }else if(tipo.equalsIgnoreCase("licencua")){
//            
//            }else{
//            
//            }
//            
//            reporteTramitesDTO.add()
//        }
//        
//        
//    }
}
