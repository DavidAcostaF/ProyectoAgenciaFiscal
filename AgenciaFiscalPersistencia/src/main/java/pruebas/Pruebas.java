/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.ILicenciaDAO;
import com.mycompany.agenciafiscaldaos.LicenciaDAO;
import com.mycompany.agenciafiscaldominio.Licencia;

/**
 *
 * @author af_da
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConexion conexion = new Conexion();
        ILicenciaDAO licenciaDAO = new LicenciaDAO(conexion);
        for (Licencia licencia:licenciaDAO.consultarLicenciasCliente("DEF789012GHI")) {
            System.out.println(licencia.getCosto());
        }
    }

}
