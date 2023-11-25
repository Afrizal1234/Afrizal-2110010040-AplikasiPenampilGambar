/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.CardLayout;

/**
 *
 * @author ACER
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambarGUI
     */
    public PilihGambarButton() {
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

        btnPanel = new javax.swing.JPanel();
        btnAdidas = new javax.swing.JButton();
        btnNike = new javax.swing.JButton();
        btnVans = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        adidasLB = new javax.swing.JLabel();
        nikeLB = new javax.swing.JLabel();
        vansLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPanel.setBackground(new java.awt.Color(153, 0, 51));

        btnAdidas.setBackground(new java.awt.Color(204, 255, 153));
        btnAdidas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdidas.setText("Adidas");
        btnAdidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdidasActionPerformed(evt);
            }
        });
        btnPanel.add(btnAdidas);

        btnNike.setBackground(new java.awt.Color(204, 255, 153));
        btnNike.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNike.setText("Nike");
        btnNike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNikeActionPerformed(evt);
            }
        });
        btnPanel.add(btnNike);

        btnVans.setBackground(new java.awt.Color(204, 255, 153));
        btnVans.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVans.setText("Vans");
        btnVans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVansActionPerformed(evt);
            }
        });
        btnPanel.add(btnVans);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        btnPanel.add(jButton1);

        getContentPane().add(btnPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        adidasLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adidasLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/adidas.jpg"))); // NOI18N
        imagePanel.add(adidasLB, "0");

        nikeLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nikeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/nike.jpg"))); // NOI18N
        imagePanel.add(nikeLB, "1");

        vansLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vansLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/vans.jpg"))); // NOI18N
        imagePanel.add(vansLB, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdidasActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_btnAdidasActionPerformed

    private void btnNikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNikeActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_btnNikeActionPerformed

    private void btnVansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVansActionPerformed
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_btnVansActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adidasLB;
    private javax.swing.JButton btnAdidas;
    private javax.swing.JButton btnNike;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton btnVans;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nikeLB;
    private javax.swing.JLabel vansLB;
    // End of variables declaration//GEN-END:variables
}
