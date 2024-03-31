/**
 * VehiculoDAO.java
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Automovil;
import com.mycompany.agenciafiscaldominio.Vehiculo;
import com.mycompany.agenciafiscalexcepciones.PersistenciaException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Esta clase implementa la interfaz {@link IVehiculoDAO} y proporciona métodos
 * para realizar operaciones CRUD relacionadas con los vehículos en la base de
 * datos. Utiliza JPA y Criteria API para realizar consultas a la base de datos.
 *
 * La clase VehiculoDAO gestiona la persistencia de los objetos Vehiculo y
 * proporciona métodos para consultar vehículos por su serie o por la serie de
 * su placa.
 *
 * Esta clase es parte del conjunto de clases DAO (Data Access Object)
 * utilizadas para interactuar con la capa de persistencia de la aplicación.
 *
 * {@inheritDoc}
 */
public class VehiculoDAO implements IVehiculoDAO {

    private IConexion conexion;

    /**
     * Crea una instancia de VehiculoDAO con la conexión proporcionada.
     *
     * @param conexion La conexión utilizada para acceder a la base de datos.
     */
    public VehiculoDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Vehiculo consultar(String serie) throws PersistenciaException {
        EntityManager entityManager = conexion.obtenerConexion();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Vehiculo> criteria = builder.createQuery(Vehiculo.class);
        Root<Automovil> root = criteria.from(Automovil.class);
        criteria.select(root).where(builder.equal(root.get("serie"), serie));
        TypedQuery<Vehiculo> query = entityManager.createQuery(criteria);
        List<Vehiculo> vehiculos = query.getResultList();
        entityManager.close();

        if (!vehiculos.isEmpty()) {
            return vehiculos.get(0);
        } else {
            throw new PersistenciaException("No se ha encontrado ningun vehiculo con la serie: " + serie);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Vehiculo consultarPorPlaca(String placaSerie) throws PersistenciaException {
        EntityManager entityManager = conexion.obtenerConexion();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Vehiculo> criteriaQuery = criteriaBuilder.createQuery(Vehiculo.class);
        Root<Vehiculo> root = criteriaQuery.from(Vehiculo.class);
        criteriaQuery.select(root)
                .where(criteriaBuilder.equal(root.get("placa").get("serie"), placaSerie));
        criteriaQuery.orderBy(criteriaBuilder.desc(root.get("placa").get("id")));
        List<Vehiculo> vehiculos = entityManager.createQuery(criteriaQuery)
                .setMaxResults(1)
                .getResultList();
        entityManager.close();

        if (!vehiculos.isEmpty()) {
            return vehiculos.get(0);
        } else {
            throw new PersistenciaException("No se ha encontrado el vehiculo");
        }
    }
}
