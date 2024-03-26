/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 *
 * @author af_da
 */
public class VehiculoDAO implements IVehiculoDAO {

    private IConexion conexion;

    public VehiculoDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public Vehiculo consultar(String serie) throws PersistenciaException {
        EntityManager entityManager = conexion.obtenerConexion();
        // objeto constructor de consultas
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        //Objeto consulta que se esta construyendo
        CriteriaQuery<Vehiculo> criteria = builder.createQuery(Vehiculo.class);
        Root<Automovil> root = criteria.from(Automovil.class);
        criteria.select(root).where(builder.equal(root.get("serie"), serie));

        //consulta construida
        TypedQuery<Vehiculo> query = entityManager.createQuery(criteria);
        List<Vehiculo> vehiculos = query.getResultList();
        entityManager.close();

        if (!vehiculos.isEmpty()) {
            return vehiculos.get(0);
        } else {
            throw new PersistenciaException("No se ha encontrado ningun vehiculo con la serie: " + serie);
        }
    }
}
