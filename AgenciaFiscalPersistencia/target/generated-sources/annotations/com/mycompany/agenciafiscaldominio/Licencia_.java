package com.mycompany.agenciafiscaldominio;

import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-28T02:32:12", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Licencia.class)
public class Licencia_ extends Tramite_ {

    public static volatile SingularAttribute<Licencia, String> vigencia;
    public static volatile SingularAttribute<Licencia, Calendar> fecha_vencimiento;
    public static volatile SingularAttribute<Licencia, Float> Costo;
    public static volatile SingularAttribute<Licencia, Calendar> fecha_expedicion;

}