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
 *
 * @author af_da
 */
public class ClienteBO implements IClienteBO {

    private IClienteDAO clienteDAO;
    private IConexion conexion;

    public ClienteBO() {
        conexion = new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
    }

    @Override
    public Boolean poblarClientes() {
        List<Cliente> listaClientes = this.listaClientes();

        for (int i = 0; i < listaClientes().size(); i++) {
            if (clienteDAO.consultar(listaClientes.get(i).getRfc()) != null) {
                return false;
            }
            clienteDAO.agregar(listaClientes.get(i));

        }
        return true;
    }

    @Override
    public List<Cliente> listaClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Calendar fechaNacimientoMayor = Calendar.getInstance();
        fechaNacimientoMayor.set(1990, Calendar.JANUARY, 1); // Fecha para mayores de 18 años

        Calendar fechaNacimientoMenor = Calendar.getInstance();
        fechaNacimientoMenor.set(2007, Calendar.JANUARY, 1);
        try {
            listaClientes.add(new Cliente("ABC123456DEF", "Juan", "Pérez", "Gómez", false, fechaNacimientoMayor, Encriptacion.encrypt("5551234567")));
            listaClientes.add(new Cliente("DEF789012GHI", "María", "López", "Martínez", true, fechaNacimientoMayor, Encriptacion.encrypt("5559876543")));
            listaClientes.add(new Cliente("GHI345678JKL", "Carlos", "González", "Sánchez", false, fechaNacimientoMayor, Encriptacion.encrypt("5555678901")));
            listaClientes.add(new Cliente("JKL901234MNO", "Laura", "Rodríguez", "Fernández", true, fechaNacimientoMayor, Encriptacion.encrypt("5552345678")));
            listaClientes.add(new Cliente("MNO567890PQR", "Pedro", "Díaz", "Ramírez", false, fechaNacimientoMenor, Encriptacion.encrypt("5558901234")));
            listaClientes.add(new Cliente("PQR123456STU", "Ana", "Hernández", "Gutiérrez", true, fechaNacimientoMenor, Encriptacion.encrypt("5553456789")));
            listaClientes.add(new Cliente("STU789012VWX", "David", "Martín", "García", false, fechaNacimientoMayor, Encriptacion.encrypt("5559012345")));
            listaClientes.add(new Cliente("VWX345678YZA", "Sofía", "Pérez", "López", true, fechaNacimientoMayor, Encriptacion.encrypt("5556789012")));
            listaClientes.add(new Cliente("YZA901234BCD", "Elena", "Ruiz", "Jiménez", false, fechaNacimientoMayor, Encriptacion.encrypt("5551234567")));
            listaClientes.add(new Cliente("BCD567890EFG", "Javier", "Gómez", "Muñoz", true, fechaNacimientoMayor, Encriptacion.encrypt("5559876543")));
            listaClientes.add(new Cliente("EFG123456HIJ", "Patricia", "Sánchez", "Martínez", false, fechaNacimientoMayor, Encriptacion.encrypt("5555678901")));
            listaClientes.add(new Cliente("HIJ789012KLM", "Roberto", "Fernández", "Pérez", true, fechaNacimientoMayor, Encriptacion.encrypt("5552345678")));
            listaClientes.add(new Cliente("KLM345678NOP", "Silvia", "Ramírez", "González", false, fechaNacimientoMenor, Encriptacion.encrypt("5558901234")));
            listaClientes.add(new Cliente("NOP901234QRS", "Miguel", "Gutiérrez", "Hernández", true, fechaNacimientoMenor, Encriptacion.encrypt("5553456789")));
            listaClientes.add(new Cliente("QRS567890TUV", "Lucía", "García", "Díaz", false, fechaNacimientoMayor, Encriptacion.encrypt("5559012345")));
            listaClientes.add(new Cliente("TUV123456WXY", "Daniel", "López", "Sánchez", true, fechaNacimientoMayor, Encriptacion.encrypt("5556789012")));
            listaClientes.add(new Cliente("WXY789012ZAB", "Carmen", "Martínez", "Ruiz", false, fechaNacimientoMayor, Encriptacion.encrypt("5551234567")));
            listaClientes.add(new Cliente("ZAB345678CDE", "Alejandro", "Muñoz", "Gómez", true, fechaNacimientoMayor, Encriptacion.encrypt("5559876543")));
            listaClientes.add(new Cliente("CDE901234FGH", "Natalia", "Pérez", "Fernández", false, fechaNacimientoMenor, Encriptacion.encrypt("5555678901")));
            listaClientes.add(new Cliente("FGH567890IJK", "Fernando", "Jiménez", "Ramírez", true, fechaNacimientoMenor, Encriptacion.encrypt("5552345678")));

        } catch (Exception e) {
            System.out.println("Error en la encriptación: " + e.getMessage());
        }

        return listaClientes;
    }

}
