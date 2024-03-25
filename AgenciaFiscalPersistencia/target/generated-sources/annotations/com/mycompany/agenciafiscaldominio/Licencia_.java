package com.mycompany.agenciafiscaldominio;

import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-25T04:22:45", comments="EclipseLink-2.7.12.v20230209-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-25T12:14:37", comments="EclipseLink-2.7.12.v20230209-rNA")
>>>>>>> 904329a63595ed3e4535d619242b839e13aa9b49
@StaticMetamodel(Licencia.class)
public class Licencia_ extends Tramite_ {

    public static volatile SingularAttribute<Licencia, String> vigencia;
    public static volatile SingularAttribute<Licencia, Calendar> fecha_vencimiento;
    public static volatile SingularAttribute<Licencia, Float> Costo;
    public static volatile SingularAttribute<Licencia, Calendar> fecha_expedicion;

}