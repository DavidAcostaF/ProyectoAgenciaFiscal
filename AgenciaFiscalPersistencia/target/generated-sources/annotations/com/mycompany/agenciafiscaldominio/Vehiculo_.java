package com.mycompany.agenciafiscaldominio;

import com.mycompany.agenciafiscaldominio.Placa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-25T04:22:45", comments="EclipseLink-2.7.12.v20230209-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-25T12:14:37", comments="EclipseLink-2.7.12.v20230209-rNA")
>>>>>>> 904329a63595ed3e4535d619242b839e13aa9b49
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, String> marca;
    public static volatile SingularAttribute<Vehiculo, String> color;
    public static volatile SingularAttribute<Vehiculo, String> serie;
    public static volatile SingularAttribute<Vehiculo, Long> id;
    public static volatile SingularAttribute<Vehiculo, String> modelo;
    public static volatile SingularAttribute<Vehiculo, String> linea;
    public static volatile SingularAttribute<Vehiculo, Placa> placa;

}