/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccion;

import Clases.Socio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ColeSocio {
    private List<Socio> lista = new ArrayList<>();
    
    public ColeSocio() {
    }

    public List<Socio> getLista() {
        return lista;
    }

    public void setLista(List<Socio> lista) {
        this.lista = lista;
    }
    
    public boolean agregarSocio(Socio soc){
        for (Socio socio : lista) {
            if(socio.getCi().equals(soc.getCi())){
             return false;
            }
        }
        lista.add(soc);
        return true;
    }
    public boolean modificarSocio(Socio soc){
        for (Socio socio: lista){
            if(socio.getCi().equals(soc.getCi())){
            return false;
            }
        }
        lista.add(soc);
        return true;
    }

}
