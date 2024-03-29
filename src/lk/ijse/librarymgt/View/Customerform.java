/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.View;

import java.io.InputStream;
import java.sql.Connection;
import lk.ijse.librarymgt.controller.CustomerController;
import lk.ijse.librarymgt.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.librarymgt.db.DBConnection;
import lk.ijse.librarymgt.generator.IdGenerator;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ravindu
 */
public class Customerform extends javax.swing.JFrame {

    private DefaultTableModel dtm;

    /**
     * Creates new form Bookform
     */
    public Customerform() {
        initComponents();
        dtm = (DefaultTableModel) tbl_customer.getModel();
        getAllCutomers();
        setMemberID();
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
        btn_back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_memberid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_membername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_gender = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customer = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_refresh1 = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 228, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Member Form");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/librarymgt/img/icons8_Conference_100px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 100));

        btn_back.setBackground(new java.awt.Color(153, 153, 255));
        btn_back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 760, 200, 50));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Member ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 120, 30));

        txt_memberid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_memberid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_memberidActionPerformed(evt);
            }
        });
        jPanel2.add(txt_memberid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 280, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Member Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 180, 30));

        txt_membername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_membername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_membernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_membername, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 290, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Address");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, 30));

        txt_address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        jPanel2.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 280, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Phone");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 140, 30));

        txt_phone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        jPanel2.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 290, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Email");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 140, 30));

        txt_email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 280, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Gender");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 170, 30));

        txt_gender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genderActionPerformed(evt);
            }
        });
        jPanel2.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 290, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 1120, 220));

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MemberID", "Name", "Address", "Tel", "Email", "Gender"
            }
        ));
        tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_customer);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1060, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 1120, 160));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setBackground(new java.awt.Color(102, 255, 102));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_add.setText("ADD MEMBER");
        btn_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel4.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 60));

        btn_update.setBackground(new java.awt.Color(51, 51, 255));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_update.setText("UPDATE MEMBER");
        btn_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel4.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 60));

        btn_delete.setBackground(new java.awt.Color(255, 0, 0));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_delete.setText("DELETE MEMBER");
        btn_delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel4.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 60));

        btn_refresh1.setBackground(new java.awt.Color(255, 255, 102));
        btn_refresh1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_refresh1.setText("REFRESH MEMBER");
        btn_refresh1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, 60));

        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        jPanel4.add(btnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 250, 200, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_membernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_membernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_membernameActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO addtxt_bookiding code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try {
            String memberID = txt_memberid.getText();
            String memberName = txt_membername.getText();
            String address = txt_address.getText();
            String phone = txt_phone.getText();
            String email = txt_email.getText();
            String gender = txt_gender.getText();
//        Date dob = txt_dob.getText();

            CustomerDTO cusModel = new CustomerDTO(memberID, memberName, address, phone, email, gender);

            boolean addCustomer = CustomerController.addCustomer(cusModel);
            if (addCustomer) {
                JOptionPane.showMessageDialog(this, "Aded");
                clearAll();
                getAllCutomers();
            } else {
                JOptionPane.showMessageDialog(this, "Falied..!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_memberidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_memberidActionPerformed
        String cusomerID = txt_memberid.getText();
        try {
            clearAll();
            CustomerDTO searchCustomer = CustomerController.searchCustomer(cusomerID);
            txt_memberid.setText(searchCustomer.getMID());
            txt_membername.setText(searchCustomer.getMname());
            txt_address.setText(searchCustomer.getMaddress());
            txt_phone.setText(searchCustomer.getTel());
            txt_email.setText(searchCustomer.getEmail());
            txt_gender.setText(searchCustomer.getGender());

            InputStream is = this.getClass().getResourceAsStream("/lk/ijse/librarymgt/report/Members.jasper");
            Connection connection = DBConnection.getInstance().getConnection();
            HashMap map = new HashMap();
            map.put("customerid", cusomerID);
            JasperPrint print = JasperFillManager.fillReport(is, map, connection);
            JasperViewer.viewReport(print, false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_membername.requestFocus();
    }//GEN-LAST:event_txt_memberidActionPerformed

    private void txt_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_genderActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            String memberID = txt_memberid.getText();
            String memberName = txt_membername.getText();
            String address = txt_address.getText();
            String phone = txt_phone.getText();
            String email = txt_email.getText();
            String gender = txt_gender.getText();
            CustomerDTO cusModel = new CustomerDTO(memberID, memberName, address, phone, email, gender);
            boolean updateCustomer = CustomerController.updateCustomer(cusModel);
            if (updateCustomer) {
                getAllCutomers();
                clearAll();
                JOptionPane.showMessageDialog(this, "Updated");
            } else {
                JOptionPane.showMessageDialog(this, "Falied..!");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            String memberID = txt_memberid.getText();
            boolean deleteCustomer = deleteCustomer(memberID);
            if (deleteCustomer) {
                JOptionPane.showMessageDialog(this, "Deleted");
                clearAll();
                getAllCutomers();
            } else {
                JOptionPane.showMessageDialog(this, "Falied..!");
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
         new Dashboard().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void tbl_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseClicked
        int selectedRow = tbl_customer.getSelectedRow();
        String memberID = dtm.getValueAt(selectedRow, 0).toString();
        String memberName = dtm.getValueAt(selectedRow, 1).toString();
        String address = dtm.getValueAt(selectedRow, 2).toString();
        String phone = dtm.getValueAt(selectedRow, 3).toString();
        String email = dtm.getValueAt(selectedRow, 4).toString();
        String gender = dtm.getValueAt(selectedRow, 5).toString();
        txt_memberid.setText(memberID);
        txt_membername.setText(memberName);
        txt_address.setText(address);
        txt_phone.setText(phone);
        txt_email.setText(email);
        txt_gender.setText(gender);
    }//GEN-LAST:event_tbl_customerMouseClicked

    private void btn_refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh1ActionPerformed
    clearAll();
    }//GEN-LAST:event_btn_refresh1ActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String memberID = txt_memberid.getText();
        try {
            
            CustomerDTO searchCustomer = CustomerController.searchCustomer(memberID);
            txt_memberid.setText(searchCustomer.getMID());
            txt_membername.setText(searchCustomer.getMname());
            txt_address.setText(searchCustomer.getMaddress());
            txt_phone.setText(searchCustomer.getTel());
            txt_email.setText(searchCustomer.getEmail());
            txt_gender.setText(searchCustomer.getGender());
           

            InputStream is = this.getClass().getResourceAsStream("/lk/ijse/librarymgt/report/Members.jasper");
            Connection connection = DBConnection.getInstance().getConnection();
            HashMap map = new HashMap();
            map.put("customerid", memberID);
            JasperPrint print = JasperFillManager.fillReport(is, map, connection);
            JasperViewer.viewReport(print, false);
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
//            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
//            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_btnprintActionPerformed

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
            java.util.logging.Logger.getLogger(Customerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh1;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btnprint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_memberid;
    private javax.swing.JTextField txt_membername;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
 private void clearAll() {
        txt_memberid.setText("");
        txt_membername.setText("");
        txt_address.setText("");
        txt_phone.setText("");
        txt_email.setText("");
        txt_gender.setText("");
        txt_memberid.requestFocus();
    }

    private void getAllCutomers() {
        try {

            dtm.setRowCount(0);
            ArrayList<CustomerDTO> allCustomers = CustomerController.getAllCustomer();
            for (CustomerDTO cus : allCustomers) {
                Object[] rowData = {cus.getMID(), cus.getMname(), cus.getMaddress(), cus.getTel(),cus.getEmail(),cus.getGender()};
                dtm.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private boolean deleteCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return CustomerController.deleteCustomer(customerID);
    }
     private void setMemberID() {
        try {
            String MemberID;
            MemberID=IdGenerator.getNewID("Members", "MID", "M");
            txt_memberid.setText(MemberID);
        } catch (SQLException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customerform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
