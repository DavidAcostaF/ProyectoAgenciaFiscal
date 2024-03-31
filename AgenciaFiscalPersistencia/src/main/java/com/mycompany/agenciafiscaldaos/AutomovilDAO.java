/**
 * AutomovilDAO.java
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Automovil;
import javax.persistence.EntityManager;
/**
 * Esta clase implementa la interfaz {@link IAutomovilDAO} y proporciona métodos
 * para realizar operaciones CRUD relacionadas con los automóviles en la base de
 * datos. Utiliza JPA para interactuar con la capa de persistencia y gestionar
 * la entidad Automovil.
 *
 * La clase AutomovilDAO gestiona la persistencia de los objetos Automovil y
 * proporciona métodos para agregar y consultar automóviles en la base de datos.
 *
 * Esta clase es parte del conjunto de clases DAO (Data Access Object)
 * utilizadas para interactuar con la capa de persistencia de la aplicación.
 *
 * @author af_da
 */
public class AutomovilDAO implements IAutomovilDAO {

    private IConexion conexion;

    /**
     * Crea una instancia de AutomovilDAO con la conexión proporcionada.
     *
     * @param conexion La conexión utilizada para acceder a la base de datos.
     */
    public AutomovilDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Automovil agregar(Automovil automovil) {
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();
        entityManager.persist(automovil);
        entityManager.getTransaction().commit();
        entityManager.refresh(automovil);
        entityManager.close();
        return automovil;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Automovil consultar(Long id) {
        EntityManager entityManager = conexion.obtenerConexion();
        Automovil automovil = entityManager.find(Automovil.class, id);
        entityManager.close();
        return automovil;
    }

}
