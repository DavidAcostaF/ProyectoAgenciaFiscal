package com.mycompany.agenciafiscaldominio;

import com.mycompany.agenciafiscaldominio.Tramite;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-25T04:22:45", comments="EclipseLink-2.7.12.v20230209-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-25T12:14:37", comments="EclipseLink-2.7.12.v20230209-rNA")
>>>>>>> 904329a63595ed3e4535d619242b839e13aa9b49
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