/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.agenciafiscaldominio.Cliente;
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
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPU");
        EntityManager entityManager = emFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        // Crear una instancia de Calendar con la fecha de nacimiento deseada
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(1990, Calendar.JANUARY, 1);

        // Crear un objeto Cliente
        Cliente cliente = new Cliente("ABC123456DEF", "Juan", "Pérez", "Gómez", false, fechaNacimiento, "555-123-4567");
        entityManager.persist(cliente);
        
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
}
