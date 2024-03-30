/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Licencia;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author af_da
 */
public interface ILicenciaDAO {

    public Licencia agregar(Licencia licencia);

    public Licencia consultar(Long id);

    public List<Licencia> consultarTramitePeriodo(Calendar desde, Calendar hasta);

    public Licencia actualizar(Licencia licencia);

}
