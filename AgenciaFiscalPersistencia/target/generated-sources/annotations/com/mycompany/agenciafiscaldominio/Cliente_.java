package com.mycompany.agenciafiscaldominio;

import com.mycompany.agenciafiscaldominio.Tramite;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-30T23:14:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Boolean> discapacitado;
    public static volatile ListAttribute<Cliente, Tramite> tramites;
    public static volatile SingularAttribute<Cliente, String> apellido_paterno;
    public static volatile SingularAttribute<Cliente, String> apellido_materno;
    public static volatile SingularAttribute<Cliente, Calendar> fecha_nacimiento;
    public static volatile SingularAttribute<Cliente, Long> id;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> rfc;

}