/*
 * IAutomovilDAO.java
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Automovil;

/*
 * Esta interfaz define las operaciones que pueden realizarse sobre la entidad Automovil en la capa de acceso a datos.
 * 
 * Las implementaciones de esta interfaz proporcionan métodos para agregar y consultar automóviles en la base de datos.
 * 
 */
public interface IAutomovilDAO {

    /**
     * Agrega un nuevo automóvil a la base de datos.
     *
     * @param automovil El automóvil a agregar.
     * @return El automóvil agregado, incluyendo su ID asignado por la base de
     * datos.
     */
    public Automovil agregar(Automovil automovil);

    /**
     * Consulta un automóvil en la base de datos utilizando su ID.
     *
     * @param id El ID del automóvil a consultar.
     * @return El automóvil encontrado, o null si no se encontró ningún
     * automóvil con el ID especificado.
     */
    public Automovil consultar(Long id);

}
