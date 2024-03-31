/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.IPlacaDAO;
import com.mycompany.agenciafiscaldaos.PlacaDAO;
import com.mycompany.agenciafiscaldominio.Placa;

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
        IPlacaDAO placaDAO = new PlacaDAO(conexion);
        for (Placa placa :placaDAO.consultarPlacasCliente("DEF789012GHI")) {
            System.out.println(placa.getCosto());
        }
    }

}
