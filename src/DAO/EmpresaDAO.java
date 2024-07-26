/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Clases.Empresa;
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
public class EmpresaDAO {
    private Connection conexion;
    
    public EmpresaDAO(){
    }
    public boolean agregarEmpresa(Empresa emp) throws SQLException{
    boolean centinela = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String queryEmpresa = "insert into EMPRESA values(?,?,?,?,?,?,?,?,?,?)";
            CallableStatement cstmt = conexion.prepareCall(queryEmpresa);
            cstmt.setString(1, emp.getRazonSocial());
            cstmt.setString(2, emp.getRutEmpresa());
            cstmt.setInt(3, emp.getFono());
            cstmt.setString(4, emp.getCorreoElectronico());
            cstmt.setString(5, emp.getRepresentanteLegal());
            cstmt.setString(6, emp.getCiRepresentante());
            cstmt.setString(7, emp.getComunaRazon());
            cstmt.setString(8, emp.getDireccionRazon());
            cstmt.setString(9, emp.getCiudadRazon());
            cstmt.setString(10, emp.getRegionRazon());
            
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
    public List<Empresa> ListarEmpresa() throws SQLException{
    List<Empresa> lista = new ArrayList<>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String query = "select * from Empresa";
            CallableStatement cstmt = conexion.prepareCall(query);
            ResultSet rs = cstmt.executeQuery();
            while(rs.next()){
            Empresa emp = new Empresa();
            emp.setRazonSocial(rs.getString("razon_social"));
            emp.setRutEmpresa(rs.getString("rut_empresa"));
            emp.setFono(rs.getInt("fono"));
            emp.setCorreoElectronico(rs.getString("correo_electronico"));
            emp.setRepresentanteLegal(rs.getString("representante_legal"));
            emp.setCiRepresentante(rs.getString("ci_representante"));
            emp.setComunaRazon(rs.getString("comuna_razon"));
            emp.setDireccionRazon(rs.getString("direccion_razon"));
            emp.setCiudadRazon(rs.getString("ciudad_razon"));
            emp.setRegionRazon(rs.getString("region_razon"));
            lista.add(emp);
            
            }
        } catch (Exception e) {
            System.out.println("ERROR"+e.getMessage());
        }finally{
        this.conexion.close();
        }
        return lista;
    
    }
    public boolean modificarEmpresa(Empresa emp) throws SQLException{
    boolean centinela = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String queryEmpresa = "update EMPRESA set razon_social = ?,fono = ?,correo_electronico = ?,representante_legal = ?,ci_representante = ?,comuna_razon = ?,direccion_razon = ?,ciudad_razon = ?, region_razon = ?" +"where rut_empresa = ?";
            CallableStatement cstmt = conexion.prepareCall(queryEmpresa);
            cstmt.setString(1, emp.getRazonSocial());
            cstmt.setInt(2, emp.getFono());
            cstmt.setString(3, emp.getCorreoElectronico());
            cstmt.setString(4, emp.getRepresentanteLegal());
            cstmt.setString(5, emp.getCiRepresentante());
            cstmt.setString(6, emp.getComunaRazon());
            cstmt.setString(7, emp.getDireccionRazon());
            cstmt.setString(8, emp.getCiudadRazon());
            cstmt.setString(9, emp.getRegionRazon());
            cstmt.setString(10, emp.getRutEmpresa());
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
    public boolean eliminarEmpresa(String rutEmpresa) throws SQLException {
        boolean centinela = true;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String query = "DELETE FROM Empresa where rut_empresa =" + rutEmpresa;
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
