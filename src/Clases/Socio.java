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
public class Socio {
    public String sede;
    public char estado;
    public int nRegistro;
    public String fechaInscripcion;
    public String mesIngreso;
    public String fechaRecepcion;
    public String formaPago;
    public String mesDesc;
    public String puestroTrabajo;
    public String asociado;
    public String ci;
    public int telefono;
    public String email;
    public String beneficiario;
    public String empresaRutEmpresa;

    public Socio() {
    }

    public Socio(String sede, char estado, int nRegistro, String fechaInscripcion, String mesIngreso, String fechaRecepcion, String formaPago, String mesDesc, String puestroTrabajo, String asociado, String ci, int telefono, String email, String beneficiario, String empresaRutEmpresa) {
        this.sede = sede;
        this.estado = estado;
        this.nRegistro = nRegistro;
        this.fechaInscripcion = fechaInscripcion;
        this.mesIngreso = mesIngreso;
        this.fechaRecepcion = fechaRecepcion;
        this.formaPago = formaPago;
        this.mesDesc = mesDesc;
        this.puestroTrabajo = puestroTrabajo;
        this.asociado = asociado;
        this.ci = ci;
        this.telefono = telefono;
        this.email = email;
        this.beneficiario = beneficiario;
        this.empresaRutEmpresa = empresaRutEmpresa;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getMesIngreso() {
        return mesIngreso;
    }

    public void setMesIngreso(String mesIngreso) {
        this.mesIngreso = mesIngreso;
    }

    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(String fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getMesDesc() {
        return mesDesc;
    }

    public void setMesDesc(String mesDesc) {
        this.mesDesc = mesDesc;
    }

    public String getPuestroTrabajo() {
        return puestroTrabajo;
    }

    public void setPuestroTrabajo(String puestroTrabajo) {
        this.puestroTrabajo = puestroTrabajo;
    }

    public String getAsociado() {
        return asociado;
    }

    public void setAsociado(String asociado) {
        this.asociado = asociado;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getEmpresaRutEmpresa() {
        return empresaRutEmpresa;
    }

    public void setEmpresaRutEmpresa(String empresaRutEmpresa) {
        this.empresaRutEmpresa = empresaRutEmpresa;
    }

    @Override
    public String toString() {
        return "Socio{" + "sede=" + sede + ", estado=" + estado + ", nRegistro=" + nRegistro + ", fechaInscripcion=" + fechaInscripcion + ", mesIngreso=" + mesIngreso + ", fechaRecepcion=" + fechaRecepcion + ", formaPago=" + formaPago + ", mesDesc=" + mesDesc + ", puestroTrabajo=" + puestroTrabajo + ", asociado=" + asociado + ", ci=" + ci + ", telefono=" + telefono + ", email=" + email + ", beneficiario=" + beneficiario + ", empresaRutEmpresa=" + empresaRutEmpresa + '}';
    }
    
    
}
