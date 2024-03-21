/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Cliente;
import java.util.List;

/**
 *
 * @author af_da
 */
public interface IClienteDAO {

    public Cliente agregar(Cliente cliente);

    public List<Cliente> consultarClientes();

    public Cliente consultar(String rfc);
}
