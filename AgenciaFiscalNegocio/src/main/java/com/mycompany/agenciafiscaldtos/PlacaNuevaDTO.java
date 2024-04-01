/*
 * PlacaNuevaDTO.java
 */
package com.mycompany.agenciafiscaldtos;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para una nueva placa.
 * Contiene información sobre el costo de la nueva placa.
 * 
 */
public class PlacaNuevaDTO {

    private String costo;

    /**
     * Crea un nuevo objeto PlacaNuevaDTO con el costo especificado.
     * 
     * @param costo El costo de la nueva placa.
     */
    public PlacaNuevaDTO(String costo) {
        this.costo = costo;
    }

    /**
     * Obtiene el costo de la nueva placa.
     * 
     * @return El costo de la nueva placa.
     */
    public String getCosto() {
        return costo;
    }

    /**
     * Establece el costo de la nueva placa.
     * 
     * @param costo El costo de la nueva placa.
     */
    public void setCosto(String costo) {
        this.costo = costo;
    }
}
