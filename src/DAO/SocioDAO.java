/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Socio;
import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Diego
 */
public class SocioDAO{
    private Connection conexion;

    public SocioDAO() {
    }
    public boolean agregarSocio(Socio soc) throws SQLException{
    boolean centinela = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String querySocio = "insert into SOCIO values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            CallableStatement cstmt = conexion.prepareCall(querySocio);
            cstmt.setString(1, soc.getSede());
            cstmt.setString(2, String.valueOf(soc.getEstado()));
            cstmt.setInt(3, soc.getnRegistro());
            cstmt.setString(4, soc.getFechaInscripcion());
            cstmt.setString(5, soc.getMesIngreso());
            cstmt.setString(6, soc.getFechaRecepcion());
            cstmt.setString(7, soc.getFormaPago());
            cstmt.setString(8, soc.getMesDesc());
            cstmt.setString(9, soc.getPuestroTrabajo());
            cstmt.setString(10, soc.getAsociado());
            cstmt.setString(11, soc.getCi());
            cstmt.setInt(12, soc.getTelefono());
            cstmt.setString(13, soc.getEmail());
            cstmt.setString(14, soc.getBeneficiario());
            cstmt.setString(15, soc.getEmpresaRutEmpresa());
            
            int control = cstmt.executeUpdate();
            
            if(control>0){
                centinela = true;
            }
        } catch (Exception e) {
            System.out.println("ERROR"+e.getMessage());
        }finally{
            this.conexion.close();
        }
    
        return centinela;
    }
    public List<Socio> ListarSocio() throws SQLException{
    List<Socio> lista = new ArrayList<>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String query = "select * from SOCIO";
            CallableStatement cstmt = conexion.prepareCall(query);
            ResultSet rs = cstmt.executeQuery();
            while(rs.next()){
            Socio soc = new Socio();
            soc.setSede(rs.getString("sede"));
            soc.setEstado(rs.getString("estado").charAt(0));
            soc.setnRegistro(rs.getInt("n_registro"));
            soc.setFechaInscripcion(rs.getString("fecha_inscripcion"));
            soc.setMesIngreso(rs.getString("mes_ingreso"));
            soc.setFechaRecepcion(rs.getString("fecha_recepcion"));
            soc.setFormaPago(rs.getString("forma_pago"));
            soc.setMesDesc(rs.getString("mes_desc"));
            soc.setPuestroTrabajo(rs.getString("puestro_trabajo"));
            soc.setAsociado(rs.getString("asociado"));
            soc.setCi(rs.getString("ci"));
            soc.setTelefono(rs.getInt("telefono"));
            soc.setEmail(rs.getString("email"));
            soc.setBeneficiario(rs.getString("beneficiario"));
            soc.setEmpresaRutEmpresa(rs.getString("empresa_rut_empresa"));
            lista.add(soc);
            
            }
        } catch (Exception e) {
            System.out.println("ERROR"+e.getMessage());
        }finally{
        this.conexion.close();
        }
        return lista;
    
    }
    
    public boolean modificarSocio(Socio soc) throws SQLException{
    boolean centinela = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            
            String querySocio = "update SOCIO set sede = ?, estado = ?,n_registro = ?,fecha_inscripcion = ?,mes_ingreso = ?,fecha_recepcion = ?,forma_pago= ?,mes_desc = ?,puestro_trabajo =?,asociado = ?, telefono= ?,email = ?,beneficiario = ?,empresa_rut_empresa = ?" + "WHERE ci = ?" ;
            CallableStatement cstmt = conexion.prepareCall(querySocio);
            cstmt.setString(1, soc.getSede());
            cstmt.setString(2, String.valueOf(soc.getEstado()));
            cstmt.setInt(3, soc.getnRegistro());
            cstmt.setString(4, soc.getFechaInscripcion());
            cstmt.setString(5, soc.getMesIngreso());
            cstmt.setString(6, soc.getFechaRecepcion());
            cstmt.setString(7, soc.getFormaPago());
            cstmt.setString(8, soc.getMesDesc());
            cstmt.setString(9, soc.getPuestroTrabajo());
            cstmt.setString(10, soc.getAsociado());
            cstmt.setInt(11, soc.getTelefono());
            cstmt.setString(12, soc.getEmail());
            cstmt.setString(13, soc.getBeneficiario());
            cstmt.setString(14, soc.getEmpresaRutEmpresa());
            cstmt.setString(15, soc.getCi());
            
            int control = cstmt.executeUpdate();
            
            if(control>0){
                centinela = true;
            }
        } catch (Exception e) {
            System.out.println("ERROR AL MODIFICAR"+e.getMessage());
        }finally{
            this.conexion.close();
        }
        return centinela;
    }
    public boolean eliminarSocio(String ci) throws SQLException {
        boolean centinela = true;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String query = "DELETE FROM Socio where ci =" + ci;
            CallableStatement cstmt = this.conexion.prepareCall(query);

            if (cstmt.executeUpdate() > 0) {
                centinela = false;
            }
        } catch (Exception e) {
            System.out.println("error al eliminar" + e.getMessage());
        } finally {
            this.conexion.close();
        }

        return centinela;
    }
}
