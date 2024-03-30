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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author af_da
 */
public class RegistroClienteBO implements IRegistroClienteBO {

    private IClienteDAO clienteDAO;
    private IConexion conexion;

    public RegistroClienteBO() {
        conexion = new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
    }

    @Override
    public void poblarClientes() {
        List<Cliente> listaClientes = this.listaClientes();

        for (int i = 0; i < listaClientes().size(); i++) {
            clienteDAO.agregar(listaClientes.get(i));
        }
    }

    @Override
    public List<Cliente> listaClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Calendar fechaNacimientoMayor = Calendar.getInstance();
        fechaNacimientoMayor.set(1990, Calendar.JANUARY, 1); // Fecha para mayores de 18 años

        Calendar fechaNacimientoMenor = Calendar.getInstance();
        fechaNacimientoMenor.set(2007, Calendar.JANUARY, 1);
        listaClientes.add(new Cliente("ABC123456DEF", "Juan", "Pérez", "Gómez", false, fechaNacimientoMayor, "555-123-4567"));
        listaClientes.add(new Cliente("DEF789012GHI", "María", "López", "Martínez", true, fechaNacimientoMayor, "555-987-6543"));
        listaClientes.add(new Cliente("GHI345678JKL", "Carlos", "González", "Sánchez", false, fechaNacimientoMayor, "555-567-8901"));
        listaClientes.add(new Cliente("JKL901234MNO", "Laura", "Rodríguez", "Fernández", true, fechaNacimientoMayor, "555-234-5678"));
        listaClientes.add(new Cliente("MNO567890PQR", "Pedro", "Díaz", "Ramírez", false, fechaNacimientoMenor, "555-890-1234"));
        listaClientes.add(new Cliente("PQR123456STU", "Ana", "Hernández", "Gutiérrez", true, fechaNacimientoMenor, "555-345-6789"));
        listaClientes.add(new Cliente("STU789012VWX", "David", "Martín", "García", false, fechaNacimientoMayor, "555-901-2345"));
        listaClientes.add(new Cliente("VWX345678YZA", "Sofía", "Pérez", "López", true, fechaNacimientoMayor, "555-678-9012"));
        listaClientes.add(new Cliente("YZA901234BCD", "Elena", "Ruiz", "Jiménez", false, fechaNacimientoMayor, "555-123-4567"));
        listaClientes.add(new Cliente("BCD567890EFG", "Javier", "Gómez", "Muñoz", true, fechaNacimientoMayor, "555-987-6543"));
        listaClientes.add(new Cliente("EFG123456HIJ", "Patricia", "Sánchez", "Martínez", false, fechaNacimientoMayor, "555-567-8901"));
        listaClientes.add(new Cliente("HIJ789012KLM", "Roberto", "Fernández", "Pérez", true, fechaNacimientoMayor, "555-234-5678"));
        listaClientes.add(new Cliente("KLM345678NOP", "Silvia", "Ramírez", "González", false, fechaNacimientoMenor, "555-890-1234"));
        listaClientes.add(new Cliente("NOP901234QRS", "Miguel", "Gutiérrez", "Hernández", true, fechaNacimientoMenor, "555-345-6789"));
        listaClientes.add(new Cliente("QRS567890TUV", "Lucía", "García", "Díaz", false, fechaNacimientoMayor, "555-901-2345"));
        listaClientes.add(new Cliente("TUV123456WXY", "Daniel", "López", "Sánchez", true, fechaNacimientoMayor, "555-678-9012"));
        listaClientes.add(new Cliente("WXY789012ZAB", "Carmen", "Martínez", "Ruiz", false, fechaNacimientoMayor, "555-123-4567"));
        listaClientes.add(new Cliente("ZAB345678CDE", "Alejandro", "Muñoz", "Gómez", true, fechaNacimientoMayor, "555-987-6543"));
        listaClientes.add(new Cliente("CDE901234FGH", "Natalia", "Pérez", "Fernández", false, fechaNacimientoMenor, "555-567-8901"));
        listaClientes.add(new Cliente("FGH567890IJK", "Fernando", "Jiménez", "Ramírez", true, fechaNacimientoMenor, "555-234-5678"));

        return listaClientes;
    }

}
