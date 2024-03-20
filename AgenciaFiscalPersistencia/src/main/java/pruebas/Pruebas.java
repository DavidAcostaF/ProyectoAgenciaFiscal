/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Licencia;
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

//         Crear una instancia de Calendar con la fecha de nacimiento deseada
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(1990, Calendar.JANUARY, 1);

//         Crear un objeto Cliente
        Cliente cliente = new Cliente("ABC123456DEF", "Juan", "Pérez", "Gómez", false, fechaNacimiento, "555-123-4567");
        entityManager.persist(cliente);

        Cliente cliente2 = new Cliente("ABC123456DEF", "David", "Acosta", "Fajardo", false, fechaNacimiento, "555-123-4567");
        entityManager.persist(cliente2);

        // Crear una instancia de Calendar para las fechas
        Calendar fechaVencimiento = Calendar.getInstance();
        fechaVencimiento.set(2025, Calendar.DECEMBER, 31); // Por ejemplo, fecha de vencimiento: 31 de diciembre de 2025

        Calendar fechaExpedicion = Calendar.getInstance();
        fechaExpedicion.set(2024, Calendar.MARCH, 19); // Por ejemplo, fecha de expedición: 19 de marzo de 2024

        entityManager.getTransaction().commit();
        entityManager.refresh(cliente);
        entityManager.refresh(cliente2);
        entityManager.getTransaction().begin();

        System.out.println(cliente.getId() + cliente.getNombre());
        Licencia licencia = new Licencia(fechaVencimiento, fechaExpedicion, "1 año", 1500F);
        Licencia licencia2 = new Licencia(fechaVencimiento, fechaExpedicion, "2 año", 2500F);

        licencia2.setCliente(cliente2);
        System.out.println("cliente 2"+cliente2.getNombre());
        entityManager.persist(licencia2);
        //licencias
        System.out.println(cliente.getId());
        licencia.setCliente(cliente);
        entityManager.persist(licencia);
        entityManager.getTransaction().commit();

        entityManager.close();
    }

//            // Crear un objeto Licencia
//        Licencia licencia = new Licencia(fechaVencimiento, fechaExpedicion, "1 año", 1500F);
//        //licencias
//        System.out.println(cliente.getId());
//        licencia.setCliente(cliente);
//        entityManager.persist(licencia);
//
////         Crear un objeto Cliente
//        Cliente cliente2 = new Cliente("ABC123456DEF", "David", "Acosta", "Fajardo", false, fechaNacimiento, "555-123-4567");
//        entityManager.persist(cliente2);
//// Crear un objeto Licencia
//        Licencia licencia2 = new Licencia(fechaVencimiento, fechaExpedicion, "2 año", 2500F);
//        //licencias
//        licencia.setCliente(cliente2);
//
//        entityManager.persist(licencia2);
}
