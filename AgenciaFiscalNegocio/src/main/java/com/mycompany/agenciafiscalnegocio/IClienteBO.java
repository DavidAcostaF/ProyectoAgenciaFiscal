/*
 * IClienteBO.java
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldtos.ClienteNuevoDTO;
import java.util.List;

/**
 * Interfaz que define las operaciones de negocio relacionadas con los clientes.
 * 
 */
public interface IClienteBO {

    /**
     * Método para poblar la lista de clientes en el sistema.
     * 
     * @return true si los clientes se poblan correctamente, false en caso contrario.
     */
    public Boolean poblarClientes();

    /**
     * Método para obtener la lista de clientes del sistema.
     * 
     * @return Una lista de objetos Cliente.
     */
    public List<Cliente> listaClientes();
}
