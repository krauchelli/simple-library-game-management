/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tugasakhirlibrary.mavenproject1.viewLayer;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import com.tugasakhirlibrary.mavenproject1.modelLayer.Database;
import com.tugasakhirlibrary.mavenproject1.modelLayer.User;
import com.tugasakhirlibrary.mavenproject1.modelLayer.UserModel;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ASUS ROG
 */
public class RegisterWindow extends javax.swing.JFrame {
    public static boolean isRegistered = false;


    /**
     * Creates new form LoginWindow
     */
    public RegisterWindow(boolean visible) {
        initComponents();
        setVisible(visible);
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
        tPassRegister = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        tUserRegister = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(720, 480));

        jPanel1.setBackground(new java.awt.Color(24, 12, 59));
        jPanel1.setLayout(null);

        tPassRegister.setBackground(new java.awt.Color(153, 153, 153));
        tPassRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tPassRegisterKeyPressed(evt);
            }
        });
        jPanel1.add(tPassRegister);
        tPassRegister.setBounds(440, 250, 167, 37);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please Register");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 50, 138, 24);

        tUserRegister.setBackground(new java.awt.Color(153, 153, 153));
        tUserRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tUserRegisterKeyPressed(evt);
            }
        });
        jPanel1.add(tUserRegister);
        tUserRegister.setBounds(440, 190, 167, 37);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\kraun\\OneDrive\\Documents\\archivenandatugas\\SEMESTER 3\\Praktikum OOP - PBO\\Pertemuan TB\\library-game-management\\mavenproject1\\src\\main\\java\\com\\tugasakhirlibrary\\mavenproject1\\viewLayer\\Component\\defaultuser.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(470, 80, 100, 100);

        bRegister.setBackground(new java.awt.Color(51, 153, 0));
        bRegister.setForeground(new java.awt.Color(255, 255, 255));
        bRegister.setText("Register");
        bRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(bRegister);
        bRegister.setBounds(480, 320, 76, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kraun\\OneDrive\\Documents\\archivenandatugas\\SEMESTER 3\\Praktikum OOP - PBO\\Pertemuan TB\\library-game-management\\mavenproject1\\src\\main\\java\\com\\tugasakhirlibrary\\mavenproject1\\viewLayer\\Component\\resizedbackground.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 660, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void bRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterActionPerformed
        // TODO add your handling code here:
        savingUserController(getTuser(), getTpass());
        RegisterWindow.isRegistered = true;
        this.reset(true);
        new LoginWindow(true);
        this.setVisible(false);

    }//GEN-LAST:event_bRegisterActionPerformed

    private void tUserRegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tUserRegisterKeyPressed
        // TODO add your handling code here:
        getTuser();
    }//GEN-LAST:event_tUserRegisterKeyPressed

    private void tPassRegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPassRegisterKeyPressed
        // TODO add your handling code here:
        getTpass();
    }//GEN-LAST:event_tPassRegisterKeyPressed

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
            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

         //Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterWindow(true);
            }
        });
    }

    //reset field
    public void reset(boolean bin) {
        if (bin) {
            tUserRegister.setText("");
            tPassRegister.setText("");
        }
    }

    //method mendapatkan string dari textfield
    public String getTuser() {
        return tUserRegister.getText();
    }
    public String getTpass() {
        return tPassRegister.getText();
    }
    public void SaveUser(ActionListener actionListener) {
        bRegister.addActionListener(actionListener);
    }

    public void savingUserController(String username, String password) {
        String iduser = "u-" + NanoIdUtils.randomNanoId();
        iduser = iduser.substring(0, Math.min(iduser.length(),16));

        // checking data yang dimasukkan
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Butuh username!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Butuh password!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // database check
        try {
            System.out.println("attempting to add user to the database.. ");
            // create a database connection
            Database database = Database.getInstance();
            Connection connect = Database.getConnection();
            // create a user model
            UserModel userModel = new UserModel(connect);
            // add the user to the database
            userModel.addUser(new User(iduser, username, password));
            System.out.println("User added successfully!");
        } catch (SQLException er) {
            System.out.println(er.getMessage());
            JOptionPane.showMessageDialog(this, "kesalahan server",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tPassRegister;
    private javax.swing.JTextField tUserRegister;
    // End of variables declaration//GEN-END:variables

}