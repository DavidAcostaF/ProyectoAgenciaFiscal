/**
 * IPlacaDAO.java
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Placa;
import java.util.Calendar;
import java.util.List;

/**
 * Esta interfaz define el contrato para las operaciones CRUD (Crear, Leer,
 * Actualizar, Eliminar) relacionadas con las placas en la base de datos.
 *
 * Las implementaciones de esta interfaz proporcionan métodos para agregar,
 * consultar, actualizar y eliminar placas, así como para obtener placas
 * relacionadas con un cliente específico en la base de datos.
 *
 * @author af_da
 */
public interface IPlacaDAO {

    /**
     * Agrega una nueva placa a la base de datos.
     *
     * @param placa La placa a agregar.
     * @return La placa agregada.
     */
    public Placa agregar(Placa placa);

    /**
     * Consulta una placa en la base de datos por su ID.
     *
     * @param id El ID de la placa a consultar.
     * @return La placa encontrada, o null si no se encuentra ninguna placa con
     * el ID especificado.
     */
    public Placa consultar(Long id);

    /**
     * Consulta una placa en la base de datos por su serie.
     *
     * @param serie La serie de la placa a consultar.
     * @return La placa encontrada, o null si no se encuentra ninguna placa con
     * la serie especificada.
     */
    public Placa consultar(String serie);

    /**
     * Actualiza una placa existente en la base de datos.
     *
     * @param placa La placa actualizada.
     * @return La placa actualizada.
     */
    public Placa actualizar(Placa placa);

    /**
     * Consulta todas las placas asociadas a un cliente específico en la base de
     * datos.
     *
     * @param rfc El RFC del cliente cuyas placas se quieren consultar.
     * @return Una lista de placas asociadas al cliente especificado.
     */
    public List<Placa> consultarPlacasCliente(String rfc);

    /**
     * Consulta las placas que estén dentro de un periodo de tiempo
     * especificado.
     *
     * @param desde La fecha de inicio del periodo.
     * @param hasta La fecha de fin del periodo.
     * @return Una lista de placas que estén dentro del periodo especificado.
     */
    public List<Placa> consultarTramitePeriodo(Calendar desde, Calendar hasta);
}
