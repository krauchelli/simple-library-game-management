/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tugasakhirlibrary.mavenproject1.viewLayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import com.tugasakhirlibrary.mavenproject1.modelLayer.Database;
import com.tugasakhirlibrary.mavenproject1.modelLayer.User;
import com.tugasakhirlibrary.mavenproject1.modelLayer.UserModel;

public class HomeWindow extends javax.swing.JFrame {
    private int labelCount = 0;
    private String username;
    private List<JButton> buttons = new ArrayList<>();
    
    public HomeWindow(String username) {
        this.username = username;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        lToUtama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pUtama = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bAddGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));

        jPanel5.setBackground(new java.awt.Color(60, 40, 115));

        lToUtama.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lToUtama.setForeground(new java.awt.Color(255, 255, 255));
        lToUtama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lToUtama.setText("Simple Library Game");
        lToUtama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lToUtamaMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(this.username);

        pUtama.setBackground(new java.awt.Color(31, 16, 73));
        pUtama.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("");

        javax.swing.GroupLayout pUtamaLayout = new javax.swing.GroupLayout(pUtama);
        pUtama.setLayout(pUtamaLayout);
        pUtamaLayout.setHorizontalGroup(
            pUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUtamaLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pUtamaLayout.setVerticalGroup(
            pUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUtamaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        bAddGame.setBackground(new java.awt.Color(51, 153, 0));
        bAddGame.setForeground(new java.awt.Color(255, 255, 255));
        bAddGame.setText("Add New Game");
        bAddGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lToUtama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(bAddGame)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
            .addComponent(pUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lToUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAddGame))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lToUtamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lToUtamaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lToUtamaMouseClicked

    private void bAddGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddGameActionPerformed
        // TODO add your handling code here:
        AddNew();
    }//GEN-LAST:event_bAddGameActionPerformed

    private void AddNew() {
        GameAddWindow addWindow = new GameAddWindow(this, this.username);
        addWindow.setVisible(true);
    }
    
    public void refreshButtons() {
        pUtama.removeAll();
        for (JButton button : buttons) {
            pUtama.add(button);
        }
        pUtama.revalidate();
        pUtama.repaint();
    }

    public void addNewLabel(String buttonText, String gameInfo) {
        JButton newButton = new JButton(buttonText);
        newButton.setBackground(new java.awt.Color(0, 204, 0));
        newButton.setForeground(new java.awt.Color(255, 255, 255));
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] infoParts = gameInfo.split(", ");
                String gameName = infoParts[0].substring(6);  // Remove "Name: "
                String developer = infoParts[1].substring(11);  // Remove "Developer: "
                String releaseDate = infoParts[2].substring(14);  // Remove "Release Date: "
                String description = infoParts[3].substring(13);  // Remove "Description: "
                openGameInfoFrame(gameName, developer, releaseDate, description);
            }
        });

        int buttonWidth = 150;
        int buttonHeight = 30;
        int horizontalGap = 10; // Jarak horizontal antara tombol
        int verticalGap = 10;   // Jarak vertikal antara tombol
        int buttonsPerRow = 3;  // Jumlah tombol per baris
        int row = labelCount / buttonsPerRow;
        int col = labelCount % buttonsPerRow;

        int x = 20 + col * (buttonWidth + horizontalGap);
        int y = 50 + row * (buttonHeight + verticalGap);

        newButton.setBounds(x, y, buttonWidth, buttonHeight);

        buttons.add(newButton);
        labelCount++;
        refreshButtons(); // Ini penting agar perubahan di UI segera terlihat
    }
    
    public void openGameInfoFrame(String gameName, String developer, String releaseDate, String description) {
    new GameInfoWindow(gameName, developer, releaseDate, description, this.username).setVisible(true);
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     /*   *//* Set the Nimbus look and feel *//*
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        *//* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *//*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        *//* Create and display the form *//*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeWindow().setVisible(true);
            }
        });*/
    }

    //memperlihatkan username pada menu
   /* public void showUsernameControler {

    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lToUtama;
    private javax.swing.JPanel pUtama;
    // End of variables declaration//GEN-END:variables
}
