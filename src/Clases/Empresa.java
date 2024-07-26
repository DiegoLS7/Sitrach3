/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Diego
 */
public class Empresa {
    public String razonSocial;
    public String rutEmpresa;
    public int fono;
    public String correoElectronico;
    public String representanteLegal;
    public String ciRepresentante;
    public String comunaRazon;
    public String direccionRazon;
    public String ciudadRazon;
    public String regionRazon;

    public Empresa() {
    }

    public Empresa(String razonSocial, String rutEmpresa, int fono, String correoElectronico, String representanteLegal, String ciRepresentante, String comunaRazon, String direccionRazon, String ciudadRazon, String regionRazon) {
        this.razonSocial = razonSocial;
        this.rutEmpresa = rutEmpresa;
        this.fono = fono;
        this.correoElectronico = correoElectronico;
        this.representanteLegal = representanteLegal;
        this.ciRepresentante = ciRepresentante;
        this.comunaRazon = comunaRazon;
        this.direccionRazon = direccionRazon;
        this.ciudadRazon = ciudadRazon;
        this.regionRazon = regionRazon;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getCiRepresentante() {
        return ciRepresentante;
    }

    public void setCiRepresentante(String ciRepresentante) {
        this.ciRepresentante = ciRepresentante;
    }

    public String getComunaRazon() {
        return comunaRazon;
    }

    public void setComunaRazon(String comunaRazon) {
        this.comunaRazon = comunaRazon;
    }

    public String getDireccionRazon() {
        return direccionRazon;
    }

    public void setDireccionRazon(String direccionRazon) {
        this.direccionRazon = direccionRazon;
    }

    public String getCiudadRazon() {
        return ciudadRazon;
    }

    public void setCiudadRazon(String ciudadRazon) {
        this.ciudadRazon = ciudadRazon;
    }

    public String getRegionRazon() {
        return regionRazon;
    }

    public void setRegionRazon(String regionRazon) {
        this.regionRazon = regionRazon;
    }

    @Override
    public String toString() {
        return "Empresa{" + "razonSocial=" + razonSocial + ", rutEmpresa=" + rutEmpresa + ", fono=" + fono + ", correoElectronico=" + correoElectronico + ", representanteLegal=" + representanteLegal + ", ciRepresentante=" + ciRepresentante + ", comunaRazon=" + comunaRazon + ", direccionRazon=" + direccionRazon + ", ciudadRazon=" + ciudadRazon + ", regionRazon=" + regionRazon + '}';
    }
    
    
}
