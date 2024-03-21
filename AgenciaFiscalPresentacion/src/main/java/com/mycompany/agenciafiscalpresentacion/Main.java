/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.agenciafiscalpresentacion;

import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IConexion;

/**
 *
 * @author Berry
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConexion conexion = new Conexion();

        FromMenuPrincipal fmp = new FromMenuPrincipal(conexion);
        fmp.setVisible(true);
        
    }
    
}
