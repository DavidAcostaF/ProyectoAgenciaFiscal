package com.mycompany.agenciafiscaldominio;

import com.mycompany.agenciafiscaldominio.Vehiculo;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-27T19:55:12", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Placa.class)
public class Placa_ extends Tramite_ {

    public static volatile SingularAttribute<Placa, Boolean> estado;
    public static volatile SingularAttribute<Placa, Float> costo;
    public static volatile SingularAttribute<Placa, Calendar> fecha_emision;
    public static volatile SingularAttribute<Placa, String> serie;
    public static volatile SingularAttribute<Placa, Calendar> fecha_recepcion;
    public static volatile SingularAttribute<Placa, Vehiculo> vehiculo;

}