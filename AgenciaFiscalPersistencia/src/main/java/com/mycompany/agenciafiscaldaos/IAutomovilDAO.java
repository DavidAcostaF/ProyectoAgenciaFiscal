/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Automovil;

/**
 *
 * @author af_da
 */
public interface IAutomovilDAO {

    public Automovil agregar(Automovil automovil);

    public Automovil consultar(Long id);

}
