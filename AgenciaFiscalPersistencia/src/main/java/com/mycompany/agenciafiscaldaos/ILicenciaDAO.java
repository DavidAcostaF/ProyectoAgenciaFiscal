/**
 * ILicenciaDAO.java
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Licencia;
import java.util.Calendar;
import java.util.List;

/**
 * Esta interfaz define el contrato para las operaciones CRUD (Crear, Leer,
 * Actualizar, Eliminar) relacionadas con las licencias en la base de datos.
 *
 * Las implementaciones de esta interfaz proporcionan métodos para agregar,
 * consultar, actualizar y eliminar licencias, así como para obtener licencias
 * relacionadas con un cliente específico en la base de datos.
 *
 * @author af_da
 */
public interface ILicenciaDAO {

    /**
     * Agrega una nueva licencia a la base de datos.
     *
     * @param licencia La licencia a agregar.
     * @return La licencia agregada.
     */
    public Licencia agregar(Licencia licencia);

    /**
     * Consulta una licencia en la base de datos por su ID.
     *
     * @param id El ID de la licencia a consultar.
     * @return La licencia encontrada, o null si no se encuentra ninguna
     * licencia con el ID especificado.
     */
    public Licencia consultar(Long id);

    /**
     * Consulta las licencias que estén dentro de un periodo de tiempo
     * especificado.
     *
     * @param desde La fecha de inicio del periodo.
     * @param hasta La fecha de fin del periodo.
     * @return Una lista de licencias que estén dentro del periodo especificado.
     */
    public List<Licencia> consultarTramitePeriodo(Calendar desde, Calendar hasta);

    /**
     * Actualiza una licencia existente en la base de datos.
     *
     * @param licencia La licencia actualizada.
     * @return La licencia actualizada.
     */
    public Licencia actualizar(Licencia licencia);

    /**
     * Consulta todas las licencias asociadas a un cliente específico en la base
     * de datos.
     *
     * @param rfc El RFC del cliente cuyas licencias se quieren consultar.
     * @return Una lista de licencias asociadas al cliente especificado.
     */
    public List<Licencia> consultarLicenciasCliente(String rfc);
}
