/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaNuevaDTO;
import com.mycompany.agenciafiscalnegocio.ITramitarLicenciaBO;
import com.mycompany.agenciafiscalnegocio.TramitarLicenciaBO;

/**
 *
 * @author af_da
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConexion conexion = new Conexion();

        ClienteDTO clienteDTO = new ClienteDTO("ABC123456DEX");
        LicenciaNuevaDTO licenciaNueva = new LicenciaNuevaDTO("1 AÑO", 1500F);

        ITramitarLicenciaBO tramite = new TramitarLicenciaBO(conexion);

        tramite.setCliente(clienteDTO);
        tramite.setLicencia(licenciaNueva);
        tramite.solcicitarLicencia();
    }

}
