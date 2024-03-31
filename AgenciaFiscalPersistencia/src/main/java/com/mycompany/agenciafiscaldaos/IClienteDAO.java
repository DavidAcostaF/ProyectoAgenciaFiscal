/**
 * IClienteDAO.java
 *
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Cliente;
import java.util.Calendar;
import java.util.List;

/**
 * Esta interfaz define las operaciones que pueden realizarse sobre la entidad
 * Cliente en la capa de acceso a datos.
 *
 * Las implementaciones de esta interfaz proporcionan métodos para agregar y
 * consultar clientes en la base de datos.
 */
public interface IClienteDAO {

    /**
     * Agrega un nuevo cliente a la base de datos.
     *
     * @param cliente El cliente a agregar.
     * @return El cliente agregado, incluyendo su ID asignado por la base de
     * datos.
     */
    public Cliente agregar(Cliente cliente);

    /**
     * Consulta todos los clientes almacenados en la base de datos.
     *
     * @return Una lista de todos los clientes almacenados, o una lista vacía si
     * no hay clientes.
     */
    public List<Cliente> consultarClientes();

    /**
     * Consulta un cliente en la base de datos utilizando su RFC.
     *
     * @param rfc El RFC del cliente a consultar.
     * @return El cliente encontrado, o null si no se encontró ningún cliente
     * con el RFC especificado.
     */
    public Cliente consultar(String rfc);

    /**
     * Consulta clientes en la base de datos utilizando filtros opcionales.
     *
     * @param nombre El nombre del cliente a consultar, o null para omitir este
     * filtro.
     * @param rfc El RFC del cliente a consultar, o null para omitir este
     * filtro.
     * @param fecha_nacimiento La fecha de nacimiento del cliente a consultar, o
     * null para omitir este filtro.
     * @return Una lista de clientes que cumplen con los filtros especificados,
     * o una lista vacía si no se encontraron clientes.
     */
    public List<Cliente> consultarClienteFiltro(String nombre, String rfc, Calendar fecha_nacimiento);
}
