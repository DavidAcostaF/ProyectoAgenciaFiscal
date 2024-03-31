/**
 * IVehiculo.java
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Vehiculo;
import com.mycompany.agenciafiscalexcepciones.PersistenciaException;

/**
 * Esta interfaz define el contrato para las operaciones CRUD (Crear, Leer,
 * Actualizar, Eliminar) relacionadas con los vehículos en la base de datos.
 *
 * Las implementaciones de esta interfaz proporcionan métodos para consultar
 * vehículos por su serie o por la serie de su placa.
 *
 */
public interface IVehiculoDAO {

    /**
     * Consulta un vehículo en la base de datos por su serie.
     *
     * @param serie La serie del vehículo que se desea consultar.
     * @return El vehículo correspondiente a la serie proporcionada, o null si
     * no se encuentra.
     * @throws PersistenciaException Si ocurre un error durante la consulta en
     * la base de datos.
     */
    public Vehiculo consultar(String serie) throws PersistenciaException;

    /**
     * Consulta un vehículo en la base de datos por la serie de su placa.
     *
     * @param placaSerie La serie de la placa del vehículo que se desea
     * consultar.
     * @return El vehículo correspondiente a la serie de la placa proporcionada,
     * o null si no se encuentra.
     * @throws PersistenciaException Si ocurre un error durante la consulta en
     * la base de datos.
     */
    public Vehiculo consultarPorPlaca(String placaSerie) throws PersistenciaException;
}
