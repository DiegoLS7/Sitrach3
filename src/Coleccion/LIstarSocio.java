/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccion;

import Clases.Empresa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class LIstarSocio {
    private List<Empresa> lista = new ArrayList<>();
    
    public LIstarSocio() {
    }

    public List<Empresa> getLista() {
        return lista;
    }

    public void setLista(List<Empresa> lista) {
        this.lista = lista;
    }
    


    public boolean agregarEmpresa(Empresa emp){
        for (Empresa empresa : lista) {
            if(empresa.getRutEmpresa().equals(emp.getRutEmpresa())){
             return false;
            }
        }
        lista.add(emp);
        return true;
    }
    public boolean modificarEmpresa(Empresa emp){
        for (Empresa empresa : lista) {
            if(empresa.getRutEmpresa().equals(emp.getRutEmpresa())){
             return false;
            }
        }
        lista.add(emp);
        return true;
    }
}
