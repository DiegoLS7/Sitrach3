/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Persona;
import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class PersonaDAO {
        private Connection conexion;
        
    public PersonaDAO() {
    }
    
    public boolean agregarPersona(Persona per) throws SQLException{
    boolean centinela = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String queryPersona = "insert into Persona values(?,?,?,?,?,?,?,?,?,?,?)";
            CallableStatement cstmt = conexion.prepareCall(queryPersona);
            cstmt.setDate(1, per.getfNac());
            cstmt.setString(2, String.valueOf(per.getEst_civil()));
            cstmt.setString(3, per.getDireccion());
            cstmt.setString(4, per.getVillaPobl());
            cstmt.setString(5, per.getComuna());
            cstmt.setString(6, per.getCiudad());
            cstmt.setString(7, per.getRegion());
            cstmt.setInt(8, per.getCelPersonal());
            cstmt.setString(9, per.getEmailPersona());
            cstmt.setString(10, per.getCi());
            cstmt.setString(11, per.getSocioCi());
            
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
    public List<Persona> ListarPersona() throws SQLException{
    List<Persona> lista = new ArrayList<>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String query = "select * from Persona";
            CallableStatement cstmt = conexion.prepareCall(query);
            ResultSet rs = cstmt.executeQuery();
            while(rs.next()){
            Persona per = new Persona();
            per.setfNac(rs.getDate("f_nac"));
            per.setEst_civil(rs.getString("est_civil").charAt(0));
            per.setDireccion(rs.getString("direccion"));
            per.setVillaPobl(rs.getString("villa_pobl"));
            per.setComuna(rs.getString("comuna"));
            per.setCiudad(rs.getString("ciudad"));
            per.setRegion(rs.getString("region"));
            per.setCelPersonal(rs.getInt("cel_personal"));
            per.setEmailPersona(rs.getString("emai_personal"));
            per.setCi(rs.getString("ci"));
            per.setSocioCi(rs.getString("socio_ci"));
            lista.add(per);
            
            }
        } catch (Exception e) {
            System.out.println("ERROR"+e.getMessage());
        }finally{
        this.conexion.close();
        }
        return lista;
    }
    
    public boolean modificarPersona(Persona per) throws SQLException{
    boolean centinela = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            
            String queryPersona = "update Persona set f_nac = ?, est_civil = ?,direccion = ?,villa_pobl = ?,comuna = ?,ciudad = ?,region= ?,cel_personal = ?,emai_personal =?,socio_ci = ?" + "WHERE ci = ?" ;
            CallableStatement cstmt = conexion.prepareCall(queryPersona);
            cstmt.setDate(1, per.getfNac());
            cstmt.setString(2, String.valueOf(per.getEst_civil()));
            cstmt.setString(3, per.getDireccion());
            cstmt.setString(4, per.getVillaPobl());
            cstmt.setString(5, per.getComuna());
            cstmt.setString(6, per.getCiudad());
            cstmt.setString(7, per.getRegion());
            cstmt.setInt(8, per.getCelPersonal());
            cstmt.setString(9, per.getEmailPersona());
            cstmt.setString(10, per.getSocioCi());
            cstmt.setString(11, per.getCi());
  
            
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
        public boolean eliminarPersona(String ci) throws SQLException {
        boolean centinela = true;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String query = "DELETE FROM Persona where ci =" + ci;
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
