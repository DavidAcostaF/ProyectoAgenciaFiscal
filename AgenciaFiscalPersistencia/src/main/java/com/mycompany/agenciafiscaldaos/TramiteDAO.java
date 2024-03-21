/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Licencia;
import com.mycompany.agenciafiscaldominio.Tramite;
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
public class TramiteDAO implements ITramiteDAO {

    private IConexion conexion;

    public TramiteDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public Tramite consultarLicencias(Tramite tramite) {
        EntityManager entityManager = conexion.obtenerConexion();
        // objeto constructor de consultas
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        //Objeto consulta que se esta construyendo
        CriteriaQuery<Tramite> criteria = builder.createQuery(Tramite.class);
        Root<Tramite> root = criteria.from(Tramite.class);
        criteria.select(root).where(builder.and(builder.equal(root.type(), Licencia.class), builder.equal(root.get("cliente").get("id"), tramite.getCliente().getId())));
        //consulta construida
        TypedQuery<Tramite> query = entityManager.createQuery(criteria);
        List<Tramite> tramites = query.getResultList();
        entityManager.close();
        Tramite ultimoTramite = null;
        if (!tramites.isEmpty()) {
            ultimoTramite = tramites.get(tramites.size() - 1);
        }

        return ultimoTramite;

    }
}
