/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodologia;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio1
     */
    public Ejercicio1() {
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

        etiNombre = new javax.swing.JLabel();
        etiCiudad = new javax.swing.JLabel();
        btnOcultarNombre = new javax.swing.JButton();
        btnOcultarCiudad = new javax.swing.JButton();
        btnVisuNombre = new javax.swing.JButton();
        btnVisuCiudad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiNombre.setText("Juárez Lucas Edson Rubén");
        etiNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etiCiudad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiCiudad.setText("Oaxaca de Juárez");
        etiCiudad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOcultarNombre.setText("Ocultar Nombre");
        btnOcultarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcultarNombreActionPerformed(evt);
            }
        });

        btnOcultarCiudad.setText("Ocultar Ciudad");
        btnOcultarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcultarCiudadActionPerformed(evt);
            }
        });

        btnVisuNombre.setText("Visualizar Nombre");
        btnVisuNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisuNombreActionPerformed(evt);
            }
        });

        btnVisuCiudad.setText("Visualizar Ciudad");
        btnVisuCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisuCiudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVisuNombre)
                            .addComponent(btnOcultarNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVisuCiudad)
                            .addComponent(btnOcultarCiudad)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(etiNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(etiCiudad)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etiNombre)
                .addGap(18, 18, 18)
                .addComponent(etiCiudad)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOcultarNombre)
                    .addComponent(btnOcultarCiudad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisuNombre)
                    .addComponent(btnVisuCiudad))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOcultarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcultarNombreActionPerformed
        // TODO add your handling code here:
        etiNombre.setVisible(false);
    }//GEN-LAST:event_btnOcultarNombreActionPerformed

    private void btnOcultarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcultarCiudadActionPerformed
        // TODO add your handling code here:
        etiCiudad.setVisible(false);
    }//GEN-LAST:event_btnOcultarCiudadActionPerformed

    private void btnVisuNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisuNombreActionPerformed
        // TODO add your handling code here:
        etiNombre.setVisible(true);
    }//GEN-LAST:event_btnVisuNombreActionPerformed

    private void btnVisuCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisuCiudadActionPerformed
        // TODO add your handling code here:
        etiCiudad.setVisible(true);
    }//GEN-LAST:event_btnVisuCiudadActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
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
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOcultarCiudad;
    private javax.swing.JButton btnOcultarNombre;
    private javax.swing.JButton btnVisuCiudad;
    private javax.swing.JButton btnVisuNombre;
    private javax.swing.JLabel etiCiudad;
    private javax.swing.JLabel etiNombre;
    // End of variables declaration//GEN-END:variables
}
