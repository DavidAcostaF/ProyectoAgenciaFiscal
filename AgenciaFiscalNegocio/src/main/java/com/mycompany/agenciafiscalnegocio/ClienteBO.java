/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldtos.ClienteNuevoDTO;
import com.mycompany.agenciafiscalutileria.Encriptacion;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Esta clase representa un objeto de negocio para el manejo de clientes.
 * Implementa la interfaz IClienteBO.
 *
 * @author af_da
 * @see IClienteBO
 */
public class ClienteBO implements IClienteBO {

    private IClienteDAO clienteDAO;
    private IConexion conexion;

    /**
     * Constructor de la clase ClienteBO. Inicializa la conexión y el DAO para
     * el manejo de clientes.
     */
    public ClienteBO() {
        conexion = new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
    }

    /**
     * Método para poblar la base de datos con clientes. Verifica si un cliente
     * ya existe antes de agregarlo a la base de datos.
     *
     * @return true si se pudieron poblar los clientes correctamente, false si
     * no.
     */
    @Override
    public Boolean poblarClientes() {
        List<Cliente> listaClientes = this.listaClientes();

        for (int i = 0; i < listaClientes.size(); i++) {
            if (clienteDAO.consultar(listaClientes.get(i).getRfc()) != null) {
                return false;
            }
            clienteDAO.agregar(listaClientes.get(i));
        }
        return true;
    }

    /**
     * Método para obtener una lista de clientes predefinidos.
     *
     * @return Una lista de objetos Cliente.
     */
    @Override
    public List<Cliente> listaClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Calendar fechaNacimientoMayor = Calendar.getInstance();
        fechaNacimientoMayor.set(1990, Calendar.JANUARY, 1); // Fecha para mayores de 18 años

        Calendar fechaNacimientoMenor = Calendar.getInstance();
        fechaNacimientoMenor.set(2007, Calendar.JANUARY, 1);
        try {
            listaClientes.add(new Cliente("ABC123456DEF", "Juan", "Pérez", "Gómez", false, fechaNacimientoMayor, Encriptacion.encrypt("5551234567")));
            // Se agregan más clientes con sus respectivos datos...
        } catch (Exception e) {
            System.out.println("Error en la encriptación: " + e.getMessage());
        }

        return listaClientes;
    }
}
