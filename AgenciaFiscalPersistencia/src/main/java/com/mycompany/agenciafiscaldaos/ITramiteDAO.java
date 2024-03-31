/*
 * ITramiteDAO.java
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Tramite;
import java.util.Calendar;
import java.util.List;

/**
 * Esta interfaz define el contrato para las operaciones CRUD (Crear, Leer,
 * Actualizar, Eliminar) relacionadas con los trámites en la base de datos.
 *
 * Las implementaciones de esta interfaz proporcionan métodos para consultar
 * información sobre trámites, obtener el tipo de trámite, y filtrar trámites
 * por diferentes criterios, entre otros.
 *
 * @author af_da
 */
public interface ITramiteDAO {

    /**
     * Consulta la licencia asociada a un cliente en la base de datos.
     *
     * @param tramite El trámite que contiene la información del cliente.
     * @return La licencia asociada al cliente, o null si no se encuentra
     * ninguna.
     */
    public Tramite consultarLicenciaCliente(Tramite tramite);

    /**
     * Consulta las placas asociadas a un cliente en la base de datos.
     *
     * @param tramite El trámite que contiene la información del cliente.
     * @return Las placas asociadas al cliente, o null si no se encuentra
     * ninguna.
     */
    public Tramite consultarPlacasCliente(Tramite tramite);

    /**
     * Consulta todos los trámites en la base de datos.
     *
     * @return Una lista de todos los trámites registrados.
     */
    public List<Tramite> consultarTramites();

    /**
     * Consulta todos los trámites de clientes en la base de datos.
     *
     * @return Una lista de todos los trámites de clientes registrados.
     */
    public List<Tramite> consultarTramiteClientes();

    /**
     * Consulta todos los trámites de clientes cuyo nombre coincida con el
     * proporcionado.
     *
     * @param nombre El nombre del cliente a buscar.
     * @return Una lista de trámites de clientes cuyo nombre coincida con el
     * proporcionado.
     */
    public List<Tramite> consultarTramitesClienteNombre(String nombre);

    /**
     * Obtiene el tipo de trámite asociado al trámite proporcionado.
     *
     * @param tramite El trámite del que se desea obtener el tipo.
     * @return El tipo de trámite asociado al trámite proporcionado.
     */
    public String obtenerTipoTramite(Tramite tramite);

    /**
     * Consulta todos los trámites que tengan información de cliente asociada en
     * la base de datos.
     *
     * @return Una lista de trámites que contienen información de cliente
     * asociada.
     */
    public List<Tramite> consultarTramitesConCliente();

    /**
     * Consulta los trámites que coincidan con los criterios de filtro
     * especificados.
     *
     * @param tipo El tipo de trámite a filtrar.
     * @param nombre El nombre del cliente a filtrar.
     * @param desde La fecha de inicio del periodo a filtrar.
     * @param hasta La fecha de fin del periodo a filtrar.
     * @return Una lista de trámites que coinciden con los criterios de filtro
     * especificados.
     */
    public List<Tramite> consultarTramitesConFiltro(String tipo, String nombre, Calendar desde, Calendar hasta);
}
