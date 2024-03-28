/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Tramite;
import java.util.List;

/**
 *
 * @author af_da
 */
public interface ITramiteDAO {

    public Tramite consultarLicenciasCliente(Tramite tramite);

    public List<Tramite> consultarClientes();

    public List<Tramite> consultarTramites();

}
