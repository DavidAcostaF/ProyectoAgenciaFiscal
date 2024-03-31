/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldtos.ClienteDTO;
import java.util.List;

/**
 *
 * @author Berry
 */
public interface IConsultasBO {

    public List<ClienteDTO> buscarListaCliente();

    public void setFiltroCliente(ClienteDTO filtroCliente);
    
    public void setClienteDTO(ClienteDTO clienteDtO);
    
    public ClienteDTO getClienteDTO();
}
