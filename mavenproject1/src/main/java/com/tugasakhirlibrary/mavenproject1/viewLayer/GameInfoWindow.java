/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tugasakhirlibrary.mavenproject1.viewLayer;

/**
 *
 * @author ASUS ROG
 */
public class GameInfoWindow extends javax.swing.JFrame {
    String username;

    public GameInfoWindow(String title, String developer, String released, String description, String username) {
        this.username = username;
        initComponents(title, developer, released, description);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String title, String developer, String released, String description) {

        jPanel5 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pUtama = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lDev = new javax.swing.JLabel();
        lReleased = new javax.swing.JLabel();
        lDesc = new javax.swing.JLabel();
        lToUtama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));

        jPanel5.setBackground(new java.awt.Color(60, 40, 115));

        pUtama.setBackground(new java.awt.Color(31, 16, 73));
        pUtama.setForeground(new java.awt.Color(255, 255, 255));

        lTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lTitle.setForeground(new java.awt.Color(255, 255, 255));
        lTitle.setText(title);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Developer : ");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Released : ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Description : ");

        lDev.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lDev.setForeground(new java.awt.Color(255, 255, 255));
        lDev.setText(developer);

        lReleased.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lReleased.setForeground(new java.awt.Color(255, 255, 255));
        lReleased.setText(released);

        lDesc.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lDesc.setForeground(new java.awt.Color(255, 255, 255));
        lDesc.setText(description);

        javax.swing.GroupLayout pUtamaLayout = new javax.swing.GroupLayout(pUtama);
        pUtama.setLayout(pUtamaLayout);
        pUtamaLayout.setHorizontalGroup(
            pUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUtamaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pUtamaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lDev)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lReleased))
                    .addComponent(lTitle)
                    .addComponent(jLabel4))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        pUtamaLayout.setVerticalGroup(
            pUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUtamaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lTitle)
                .addGap(18, 18, 18)
                .addGroup(pUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lDev)
                    .addComponent(lReleased))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDesc)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(pUtama, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lToUtama.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lToUtama.setForeground(new java.awt.Color(255, 255, 255));
        lToUtama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lToUtama.setText("Library");
        lToUtama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lToUtamaMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS ROG\\Pictures\\GameLibrary_Image\\ProfileImage_resized.png")); // NOI18N
        jLabel1.setText(this.username);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lToUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(jLayeredPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lToUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1))
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
        dispose();
    }//GEN-LAST:event_lToUtamaMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      /*  *//* Set the Nimbus look and feel *//*
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lDesc;
    private javax.swing.JLabel lDev;
    private javax.swing.JLabel lReleased;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lToUtama;
    private javax.swing.JPanel pUtama;
    // End of variables declaration//GEN-END:variables
}
