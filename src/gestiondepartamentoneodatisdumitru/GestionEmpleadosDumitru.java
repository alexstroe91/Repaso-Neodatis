/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondepartamentoneodatisdumitru;

import java.sql.Date;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

/**
 *
 * @author DAM2A-28
 */
public class GestionEmpleadosDumitru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Abre la base de datos. Para lo cual se utiliza la clase ODBFactory con el método open().
        //Si no existe, la crea
        ODB odb = ODBFactory.open("GestionEmpleados.test");
        
        Departamentos dep1 = new Departamentos(1, "Direccion", "Móstoles");
        Departamentos dep2 = new Departamentos(2, "Recursos Humanos", "Fuenlabrada");
        Departamentos dep3 = new Departamentos(3, "Programación", "Leganés");
                
        Empleados d1 = new Empleados(1, "Stroe", "Director general", null, Date.valueOf("2019-04-11"), 3500.00, 1000.00, dep1);
        Empleados d2 = new Empleados(2, "Gil", "Director recursos humanos", d1, Date.valueOf("2019-11-23"), 2500.00, 750.00, dep2);
        
        Empleados emp1 = new Empleados(3, "Cuesta", "Supervisor recursos humanos", d2, Date.valueOf("2020-03-21"), 2500.00, 0, dep2);
        Empleados emp2 = new Empleados(4, "López", "Programador senior", d1, Date.valueOf("2020-05-19"), 1750, 0, dep3);
        Empleados emp3 = new Empleados(5, "Zaharia", "Programador junior", d1, Date.valueOf("2020-11-10"), 1500, 0, dep3);
        Empleados emp4 = new Empleados(6, "Varas", "Programador junior", d1, Date.valueOf("2020-11-10"), 1500, 0, dep3);
        
        odb.store(dep1);
        odb.store(dep2);
        odb.store(dep3);
        odb.store(d1);
        odb.store(d2);
        odb.store(emp1);
        odb.store(emp2);
        odb.store(emp3);
        odb.store(emp4);
        
        CriteriaQuery query = new CriteriaQuery(Empleados.class); 
        
        Objects<Empleados> listado = odb.getObjects(query);
        
        while (listado.hasNext()){
            Empleados e = listado.next();
            System.out.println((e.toString()));
        }
        
    }
    
}
