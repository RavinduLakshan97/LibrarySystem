/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.View;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.librarymgt.controller.AutherController;
import static lk.ijse.librarymgt.controller.AutherController.deleteAuther;
import lk.ijse.librarymgt.dto.AutherDTO;
import lk.ijse.librarymgt.generator.IdGenerator;

/**
 *
 * @author Ravindu
 */
public class Autherform extends javax.swing.JFrame {
    
    private DefaultTableModel dtm;
    /**
     * Creates new form Autherform
     */
    public Autherform() {
        initComponents();
         dtm = (DefaultTableModel) tbl_auther.getModel();
         getAllAuthers();
         setAutherID();
         
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
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_auther = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txt_authername = new javax.swing.JTextField();
        txt_autherid = new javax.swing.JTextField();
        txt_authergender = new javax.swing.JTextField();
        txt_country = new javax.swing.JTextField();
        txt_autheremail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 228, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Authers");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/librarymgt/img/icons8_Administrator_Male_100px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 130));

        btn_back.setBackground(new java.awt.Color(153, 153, 255));
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 760, 200, 50));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_auther.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Auther", "Auther ID", "Gender", "Country", "Email"
            }
        ));
        tbl_auther.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_autherMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_auther);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 800, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 840, 130));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setBackground(new java.awt.Color(51, 153, 0));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_add.setText("ADD AUTHER");
        btn_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel3.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 60));

        btn_update.setBackground(new java.awt.Color(51, 51, 255));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_update.setText("UPDATE AUTHER");
        btn_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 60));

        btn_delete.setBackground(new java.awt.Color(255, 0, 0));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_delete.setText("DELETE AUTHER");
        btn_delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 60));

        btn_refresh.setBackground(new java.awt.Color(255, 255, 102));
        btn_refresh.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_refresh.setText("REFRESH AUTHER");
        btn_refresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel3.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 180, 190, 490));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_authername.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_authername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txt_authername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 310, 30));

        txt_autherid.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_autherid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txt_autherid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 310, 30));

        txt_authergender.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_authergender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txt_authergender, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 310, 30));

        txt_country.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_country.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_countryActionPerformed(evt);
            }
        });
        jPanel4.add(txt_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 310, 30));

        txt_autheremail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_autheremail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txt_autheremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 310, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Name of The Auther");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Auther ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 180, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Gender");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Country");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Email");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 840, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try {
            String AutherID = txt_autherid.getText();
            String AutherName = txt_authername.getText();
            String Gender = txt_authergender.getText();
            String Country = txt_country.getText();
            String email = txt_autheremail.getText();

            AutherDTO cusModel = new AutherDTO(AutherID, AutherName, Gender, Country, email);
            boolean addAuther = AutherController.addAuther(cusModel);
            if(addAuther){
                JOptionPane.showMessageDialog(this, "Added");
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Autherform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Autherform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_countryActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
           try {
            String AutherID = txt_autherid.getText();
            String AutherName = txt_authername.getText();
            String Gender = txt_authergender.getText();
            String Country = txt_country.getText();
            String email = txt_autheremail.getText();
            
            AutherDTO cusModel = new AutherDTO(AutherID, AutherName, Gender, Country, email);
        
            boolean updateAuther = AutherController.updateAuther(cusModel);
            if(updateAuther){
                JOptionPane.showMessageDialog(this, "Updated");
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Autherform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Autherform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
        String AutherID = txt_autherid.getText();
        
            boolean deleteAuther = deleteAuther(AutherID);
            if(deleteAuther){
                JOptionPane.showMessageDialog(this, "Deleted");
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Autherform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Autherform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        clearAll();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void tbl_autherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_autherMouseClicked
        int selectedRow = tbl_auther.getSelectedRow();
        String AutherID = dtm.getValueAt(selectedRow, 0).toString();
        String AutherName = dtm.getValueAt(selectedRow, 1).toString();
        String Gender = dtm.getValueAt(selectedRow, 2).toString();
        String Country = dtm.getValueAt(selectedRow, 3).toString();
        String Email = dtm.getValueAt(selectedRow, 4).toString();
        txt_autherid.setText(AutherID);
        txt_authername.setText(AutherName);
        txt_authergender.setText(Gender);
        txt_country.setText(Country);
        txt_autheremail.setText(Email);
    }//GEN-LAST:event_tbl_autherMouseClicked

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
            java.util.logging.Logger.getLogger(Autherform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autherform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autherform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autherform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autherform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_auther;
    private javax.swing.JTextField txt_autheremail;
    private javax.swing.JTextField txt_authergender;
    private javax.swing.JTextField txt_autherid;
    private javax.swing.JTextField txt_authername;
    private javax.swing.JTextField txt_country;
    // End of variables declaration//GEN-END:variables
private void clearAll() {
        txt_autherid.setText("");
        txt_authername.setText("");
        txt_authergender.setText("");
        txt_country.setText("");
        txt_autheremail.setText("");
        txt_autherid.requestFocus();
}
private void getAllAuthers() {
        try {

            dtm.setRowCount(0);
            ArrayList<AutherDTO> allCustomers = AutherController.getAllAuther();
            for (AutherDTO cus : allCustomers) {
                Object[] rowData = {cus.getAID(), cus.getAname(), cus.getGender(), cus.getCountry(),cus.getEmail()};
                dtm.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void setAutherID() {
        try {
            String AutherID;
            AutherID=IdGenerator.getNewID("Auther", "AID", "A");
            txt_autherid.setText(AutherID);
        } catch (SQLException ex) {
            Logger.getLogger(Autherform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Autherform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
