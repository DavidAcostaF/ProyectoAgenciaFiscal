/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldtos.ClienteNuevoDTO;

/**
 *
 * @author af_da
 */
public interface IRegistroClienteBO {

    public ClienteNuevoDTO registraCliente(ClienteNuevoDTO clienteNuevo);
}
