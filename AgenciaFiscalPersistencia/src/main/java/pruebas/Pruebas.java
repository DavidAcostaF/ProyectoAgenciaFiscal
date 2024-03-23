/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.agenciafiscaldominio.Automovil;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Licencia;
import com.mycompany.agenciafiscaldominio.Placa;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author af_da
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calendar fecha = Calendar.getInstance();

        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPU");
        EntityManager entityManager = emFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Cliente cliente = new Cliente("ABC123456DEF", "Juan", "Pérez", "Gómez", false, fecha, "555-123-4567");
        entityManager.persist(cliente);

//        
        entityManager.getTransaction().commit();
        entityManager.refresh(cliente);
        entityManager.getTransaction().begin();
        Placa placa = new Placa("aaa-123", fecha, 2000F, true);
        entityManager.persist(placa);
        placa.setCliente(cliente);
        entityManager.getTransaction().commit();
        entityManager.refresh(placa);
        entityManager.getTransaction().begin();
        Automovil automovil = new Automovil("ABC-123", "Honda", " Civic", " Negro", " 2003");
        automovil.setColor("negro");
        automovil.setPlaca(placa);
        entityManager.persist(automovil);

        entityManager.getTransaction().commit();
        entityManager.refresh(automovil);
        //System.out.println(automovil);
    }

}
