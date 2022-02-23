/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondepartamentoneodatisdumitru;

/**
 *
 * @author DAM2A-28
 */
public class Departamentos {
    private String deptno, dnombre, localidad;

    @Override
    public String toString() {
        return "Departamentos{" + " deptno = " + deptno + ", dnombre = " + dnombre + ", localidad = " + localidad + " }";
    }

    public Departamentos(String deptno, String dnombre, String localidad) {
        this.deptno = deptno;
        this.dnombre = dnombre;
        this.localidad = localidad;
    }

    public Departamentos() {
    }
    
    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
    
}
