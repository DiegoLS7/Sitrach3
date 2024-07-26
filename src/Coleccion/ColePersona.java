/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccion;

import Clases.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ColePersona {
    private List<Persona> lista = new ArrayList<>();
    
    public ColePersona() {
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
    
    public boolean agregarPersona(Persona per){
        for (Persona persona : lista) {
            if(persona.getCi().equals(per.getCi())){
             return false;
            }
        }
        lista.add(per);
        return true;
    }
    public boolean modificarPersona(Persona per){
        for (Persona persona: lista){
            if(persona.getCi().equals(per.getCi())){
            return false;
            }
        }
        lista.add(per);
        return true;
    }
    
}
