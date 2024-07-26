/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author Diego
 */
public class Persona {
    public Date fNac;
    public char est_civil;
    public String direccion;
    public String villaPobl;
    public String comuna;
    public String ciudad;
    public String region;
    public int celPersonal;
    public String emailPersona;
    public String ci;
    public String socioCi;

    public Persona() {
    }

    public Persona(Date fNac, char est_civil, String direccion, String villaPobl, String comuna, String ciudad, String region, int celPersonal, String emailPersona, String ci, String socioCi) {
        this.fNac = fNac;
        this.est_civil = est_civil;
        this.direccion = direccion;
        this.villaPobl = villaPobl;
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.region = region;
        this.celPersonal = celPersonal;
        this.emailPersona = emailPersona;
        this.ci = ci;
        this.socioCi = socioCi;
    }

    public Date getfNac() {
        return fNac;
    }

    public void setfNac(Date fNac) {
        this.fNac = fNac;
    }

    public char getEst_civil() {
        return est_civil;
    }

    public void setEst_civil(char est_civil) {
        this.est_civil = est_civil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getVillaPobl() {
        return villaPobl;
    }

    public void setVillaPobl(String villaPobl) {
        this.villaPobl = villaPobl;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getCelPersonal() {
        return celPersonal;
    }

    public void setCelPersonal(int celPersonal) {
        this.celPersonal = celPersonal;
    }

    public String getEmailPersona() {
        return emailPersona;
    }

    public void setEmailPersona(String emailPersona) {
        this.emailPersona = emailPersona;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getSocioCi() {
        return socioCi;
    }

    public void setSocioCi(String socioCi) {
        this.socioCi = socioCi;
    }

    @Override
    public String toString() {
        return "Persona{" + "fNac=" + fNac + ", est_civil=" + est_civil + ", direccion=" + direccion + ", villaPobl=" + villaPobl + ", comuna=" + comuna + ", ciudad=" + ciudad + ", region=" + region + ", celPersonal=" + celPersonal + ", emailPersona=" + emailPersona + ", ci=" + ci + ", socioCi=" + socioCi + '}';
    }
    
    
    
}
