/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import Clases.Empresa;
import DAO.EmpresaDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Diego
 */
public class TestEmp {
    public static void main(String[] args) throws SQLException {
        EmpresaDAO dao = new EmpresaDAO();
        List<Empresa> lista = dao.ListarEmpresa();
        
        for (Empresa empresa : lista) {
            System.out.println(empresa);
        }
        // TODO code application logic here
    }
}
