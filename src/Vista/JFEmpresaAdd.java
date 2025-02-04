/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Clases.Empresa;
import Conexion.Conexion;
import DAO.EmpresaDAO;
import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class JFEmpresaAdd extends javax.swing.JFrame {
    EmpresaDAO empDAO = new EmpresaDAO();
    /**
     * Creates new form JFEmpresaAdd
     */
    public JFEmpresaAdd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaEm = new javax.swing.JTable();
        BtListar = new javax.swing.JButton();
        BtListar1 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTablaEm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Razon", "RutEmpresa", "Fono", "Correo", "Representante ", "CiRpresentante", "Comuna", "Direccion", "Ciudad", "Region"
            }
        ));
        jScrollPane1.setViewportView(JTablaEm);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 910, 180));

        BtListar.setText("Actualizar");
        BtListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtListarActionPerformed(evt);
            }
        });
        jPanel1.add(BtListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, -1, -1));

        BtListar1.setText("Buscar");
        BtListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtListar1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtListar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscar.setText("Ingrese Rut a buscar");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBuscarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, 30));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Empresas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, 30));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1080, 630));

        jPanel2.setBackground(new java.awt.Color(82, 196, 88));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-trabajadores-masculinos-24.png"))); // NOI18N
        jLabel1.setText("Todo");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 14, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-hombre-de-negocios-24.png"))); // NOI18N
        jLabel5.setText("Persona ");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 14, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-casa-24.png"))); // NOI18N
        jLabel2.setText("Principal ");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-trabajador-de-sexo-masculino-24.png"))); // NOI18N
        jLabel3.setText("Socio");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-empresa-25.png"))); // NOI18N
        jLabel4.setText("Empresa");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtListarActionPerformed
        // TODO add your handling code here:
        
        try {
            Listar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado al listart"+e.getMessage());
        }       
    }//GEN-LAST:event_BtListarActionPerformed

    private void BtListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtListar1ActionPerformed
        // TODO add your handling code here:
        try {
            buscarListar(txtBuscar.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado al listart por busqueda"+e.getMessage());
        }   

    }//GEN-LAST:event_BtListar1ActionPerformed

    
    private void txtBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarMouseEntered

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        // TODO add your handling code here:
        if (txtBuscar.getText().equals("Ingrese Rut a buscar")) {
            txtBuscar.setText("");
            txtBuscar.setForeground(Color.GRAY);
        }


    }//GEN-LAST:event_txtBuscarMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FREmpresa fre = new FREmpresa();
        fre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        JFPrincipal jfpr = new JFPrincipal();
        jfpr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        FRSocio frso = new FRSocio();
        frso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        JFEmpresaAdd jfrea = new JFEmpresaAdd();
        jfrea.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
        FRPersonaVer frpv = new FRPersonaVer();
        frpv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try {
            String rutEmpresa = txtBuscar.getText();
            
            if(empDAO.eliminarEmpresa(rutEmpresa)){
                JOptionPane.showMessageDialog(this, "Empresa Eliminada");
            }else{
                JOptionPane.showMessageDialog(null, "Empresa no se ha podido Eliminar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR EN Eliminar"+e.getMessage());
        }
        Listar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Listar(){
    try {
       
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("RAZON");
            dtm.addColumn("RUTEMPRESA");
            dtm.addColumn("FONO");
            dtm.addColumn("CORREO");
            dtm.addColumn("REPRESENTANTE");
            dtm.addColumn("CIREPRESENTATE");
            dtm.addColumn("COMUNA");
            dtm.addColumn("DIRECCION");
            dtm.addColumn("CIUDAD");
            dtm.addColumn("REGION");
    
            
            List<Empresa> lista = new EmpresaDAO().ListarEmpresa();
            String[] filas  = new String[10];   
            
            for (Empresa empresa : lista) {
                filas[0] = empresa.getRazonSocial();
                filas[1] = empresa.getRutEmpresa();
                filas[2] = String.valueOf(empresa.getFono());                
                filas[3] = empresa.getCorreoElectronico();
                filas[4] = empresa.getRepresentanteLegal();
                filas[5] = empresa.getCiRepresentante();
                filas[6] = empresa.getComunaRazon();
                filas[7] = empresa.getDireccionRazon();
                filas[8] = empresa.getCiudadRazon();
                filas[9] = empresa.getRegionRazon();          

                
                dtm.addRow(filas);
            }
            JTablaEm.setModel(dtm);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en Tabla "+e.getMessage());
        }           
    
    }
    
    public void buscarListar(String rut){
        try {       
        
        
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("RAZON");
            dtm.addColumn("RUTEMPRESA");
            dtm.addColumn("FONO");
            dtm.addColumn("CORREO");
            dtm.addColumn("REPRESENTANTE");
            dtm.addColumn("CIREPRESENTATE");
            dtm.addColumn("COMUNA");
            dtm.addColumn("DIRECCION");
            dtm.addColumn("CIUDAD");
            dtm.addColumn("REGION");
            
            List<Empresa> lista = new EmpresaDAO().ListarEmpresa();
            String[] filas  = new String[10];   
            
            for (Empresa empresa : lista) {
                if(empresa.getRutEmpresa().equals(rut)){
                filas[0] = empresa.getRazonSocial();
                filas[1] = rut;
                filas[2] = String.valueOf(empresa.getFono());                
                filas[3] = empresa.getCorreoElectronico();
                filas[4] = empresa.getRepresentanteLegal();
                filas[5] = empresa.getCiRepresentante();
                filas[6] = empresa.getComunaRazon();
                filas[7] = empresa.getDireccionRazon();
                filas[8] = empresa.getCiudadRazon();
                filas[9] = empresa.getRegionRazon();          

                
                dtm.addRow(filas);
                }
                
            }
            JTablaEm.setModel(dtm);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en Tabla de buscar "+e.getMessage());
        }   

    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFEmpresaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEmpresaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEmpresaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEmpresaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEmpresaAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtListar;
    private javax.swing.JButton BtListar1;
    private javax.swing.JTable JTablaEm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
