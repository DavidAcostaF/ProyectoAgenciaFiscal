/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Placa;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author af_da
 */
public interface IPlacaDAO {

    public Placa agregar(Placa placa);

    public Placa consultar(Long id);

    public Placa consultar(String serie);

    public Placa actualizar(Placa placa);

    public List<Placa> consultarTramitePeriodo(Calendar desde, Calendar hasta);

}
