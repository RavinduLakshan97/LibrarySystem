/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.View;

import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.librarymgt.controller.AutherController;
import static lk.ijse.librarymgt.controller.AutherController.deleteAuther;
import lk.ijse.librarymgt.controller.PublisherController;
import lk.ijse.librarymgt.dto.AutherDTO;
import lk.ijse.librarymgt.dto.PublisherDTO;

/**
 *
 * @author Ravindu
 */
public class Publisherform extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Publisherform() {
        initComponents();
        clearAll();
        setPublisherID();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_autheremail = new javax.swing.JTextField();
        txt_publishername = new javax.swing.JTextField();
        txt_publisherrid = new javax.swing.JTextField();
        txt_telephone = new javax.swing.JTextField();
        txt_country = new javax.swing.JTextField();
        btn_refresh = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 228, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Publisher");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Name of The Publisher");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 260, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Publisher ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 240, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Telephone NO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 240, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Country");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 240, 30));

        txt_autheremail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_autheremail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_autheremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 310, 30));

        txt_publishername.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_publishername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_publishername, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 310, 30));

        txt_publisherrid.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_publisherrid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_publisherrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 310, 30));

        txt_telephone.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_telephone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txt_telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 310, 30));

        txt_country.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_country.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_countryActionPerformed(evt);
            }
        });
        jPanel1.add(txt_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 310, 30));

        btn_refresh.setBackground(new java.awt.Color(255, 255, 102));
        btn_refresh.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_refresh.setText("REFRESH PUBLISHER");
        btn_refresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 420, 170, 60));

        btn_add.setBackground(new java.awt.Color(51, 153, 0));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_add.setText("ADD PUBLISHER");
        btn_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 130, 170, 60));

        btn_update.setBackground(new java.awt.Color(51, 51, 255));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_update.setText("UPDATE PUBLISHER");
        btn_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 220, 170, 60));

        btn_delete.setBackground(new java.awt.Color(255, 0, 0));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_delete.setText("DELETE PUBLISHER");
        btn_delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 320, 170, 60));

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
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 790, 200, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try {
            String PublisherID = txt_publisherrid.getText();
            String PublisherName = txt_publishername.getText();
            String Telephone = txt_telephone.getText();
            String Country = txt_country.getText();
            String email = txt_autheremail.getText();

            PublisherDTO cusModel = new PublisherDTO(PublisherID, PublisherName, Telephone, Country, email);
            boolean addPublisher = PublisherController.addPublisher(cusModel);
            if(addPublisher){
                JOptionPane.showMessageDialog(this, "Added");
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Publisherform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Publisherform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_countryActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
           try {
            String PublisherID = txt_publisherrid.getText();
            String PublisherName = txt_publishername.getText();
            String Telephone = txt_telephone.getText();
            String Country = txt_country.getText();
            String email = txt_autheremail.getText();
            
            AutherDTO cusModel = new AutherDTO(PublisherID, PublisherName, Telephone, Country, email);
        
            boolean updateAuther = AutherController.updateAuther(cusModel);
            if(updateAuther){
                JOptionPane.showMessageDialog(this, "Updated");
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Publisherform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Publisherform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
        String PublisherID = txt_publisherrid.getText();
        
            boolean deleteAuther = deleteAuther(PublisherID);
            if(deleteAuther){
                JOptionPane.showMessageDialog(this, "Deleted");
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Publisherform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Publisherform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        clearAll();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(Publisherform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Publisherform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Publisherform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Publisherform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Publisherform().setVisible(true);
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
    private javax.swing.JTextField txt_autheremail;
    private javax.swing.JTextField txt_country;
    private javax.swing.JTextField txt_publishername;
    private javax.swing.JTextField txt_publisherrid;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
private void clearAll() {
        txt_publisherrid.setText("");
        txt_publishername.setText("");
        txt_telephone.setText("");
        txt_country.setText("");
        txt_autheremail.setText("");
        txt_publisherrid.requestFocus();
}
private void setPublisherID() {
        int id = new Random().nextInt(999);
        String prefix = "P0";
        txt_publisherrid.setText(prefix + id);
    }
}
