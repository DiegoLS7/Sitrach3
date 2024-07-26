/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Clases.Socio;
import DAO.SocioDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Diego
 */
public class TestSocioL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        SocioDAO dao = new SocioDAO();
        List<Socio> lista = dao.ListarSocio();
        
        for (Socio socio : lista) {
            System.out.println(socio);
        }
        // TODO code application logic here
    }
    
}
