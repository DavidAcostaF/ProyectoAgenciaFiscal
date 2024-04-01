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
        fechaNacimientoMayor.set(1990, Calendar.JANUARY, 1); 

        Calendar fechaNacimientoMenor = Calendar.getInstance();
        fechaNacimientoMenor.set(2007, Calendar.JANUARY, 1);
        try {
            listaClientes.add(new Cliente("ABC123456DEF1", "Juan", "Pérez", "Gómez", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234567")));
            listaClientes.add(new Cliente("DEF123456GHI2", "Pedro", "González", "López", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234568")));
            listaClientes.add(new Cliente("GHI123456JKL3", "María", "López", "Hernández", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234569")));
            listaClientes.add(new Cliente("JKL123456MNO4", "Ana", "García", "Martínez", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234570")));
            listaClientes.add(new Cliente("MNO123456PQR5", "José", "Rodríguez", "Fernández", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234571")));
            listaClientes.add(new Cliente("PQR123456STU6", "Lucía", "Martínez", "Díaz", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234572")));
            listaClientes.add(new Cliente("STU123456VWX7", "Luis", "Hernández", "Gutiérrez", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234573")));
            listaClientes.add(new Cliente("VWX123456YZA8", "Laura", "Díaz", "Sánchez", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234574")));
            listaClientes.add(new Cliente("YZA123456BCD9", "Sofía", "Gutiérrez", "Romero", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234575")));
            listaClientes.add(new Cliente("BCD123456EF10", "Miguel", "Sánchez", "Pérez", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234576")));
            listaClientes.add(new Cliente("EFG123456HJ11", "Diana", "Romero", "Gómez", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234577")));
            listaClientes.add(new Cliente("HIJ123456LM12", "Carlos", "Pérez", "López", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234578")));
            listaClientes.add(new Cliente("KLM123456NP13", "Elena", "Gómez", "Hernández", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234579")));
            listaClientes.add(new Cliente("NOP123456RS14", "Javier", "López", "Martínez", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234580")));
            listaClientes.add(new Cliente("QRS123456UV15", "Paula", "Hernández", "Díaz", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234581")));
            listaClientes.add(new Cliente("TUV123456XY16", "Andrés", "Martínez", "Sánchez", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234582")));
            listaClientes.add(new Cliente("WXY123456AB17", "Isabel", "Díaz", "Romero", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234583")));
            listaClientes.add(new Cliente("ZAB123456DE18", "Fernando", "Sánchez", "Pérez", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234584")));
            listaClientes.add(new Cliente("CDE123456GH19", "Marina", "Romero", "Gómez", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234585")));
            listaClientes.add(new Cliente("FGH123456JK20", "Roberto", "Pérez", "López", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234586")));
        } catch (Exception e) {
            System.out.println("Error en la encriptación: " + e.getMessage());
        }

        return listaClientes;
    }
}
