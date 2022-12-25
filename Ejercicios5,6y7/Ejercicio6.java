/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios567;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio6
     */
    public Ejercicio6() {
        initComponents();
    }
    
    public class ExcepcionIntervalo extends Exception {
    public ExcepcionIntervalo(String msg) {
        super(msg);
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDivindendo = new javax.swing.JTextField();
        txtDivisor = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        etiResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDivindendo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDivindendo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDivindendo.setBorder(javax.swing.BorderFactory.createTitledBorder("Número 1"));

        txtDivisor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDivisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDivisor.setBorder(javax.swing.BorderFactory.createTitledBorder("Número 2"));
        txtDivisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDivisorActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        etiResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDivindendo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(txtDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDivisor, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(txtDivindendo))
                .addGap(27, 27, 27)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDivisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDivisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDivisorActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        try {
            double x = Double.parseDouble(txtDivindendo.getText());
            double y = Double.parseDouble(txtDivisor.getText());
            if((y>100)||(x<0)||(y>100)&&(x<0)){
            throw new ExcepcionIntervalo("Números fuera de rango");
        }else if (x>y){
                double r= x/y;
                etiResultado.setText(""+r);
        }else if (y>x){
                double r= y/x;
                etiResultado.setText(""+r);
            }  
        } catch (NumberFormatException e) {
            etiResultado.setText("Ingrese digitos válidos");
        }catch(ArithmeticException ex){
            etiResultado.setText("División entre cero");
        }catch(ExcepcionIntervalo ex){
            etiResultado.setText("Números fuera de rango");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JTextField txtDivindendo;
    private javax.swing.JTextField txtDivisor;
    // End of variables declaration//GEN-END:variables
}
