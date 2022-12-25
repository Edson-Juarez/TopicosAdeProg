/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edjuarez.ejercicios29_31;

import java.awt.event.*;   
import javax.swing.*;     
import java.awt.*;   
import javax.swing.border.*;


public class DialogoPresentacion extends JDialog implements ActionListener{
    String programa, version, programador;
    private JButton btnEmpezar;
    private JLabel etiPrograma, etiProgramador, etiVersion, jLabel1;
    private JPanel jPanel1;
    
    public DialogoPresentacion(Frame parent, boolean modal) {
    super(parent, modal);     
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
    DeclararComponentes();  
    setSize(430, 360);    
    setLocationRelativeTo(null);   
    }
    
    public void DeclararComponentes(){
        jPanel1 = new JPanel();
        etiPrograma = new JLabel();
        etiVersion = new JLabel();
        jLabel1 = new JLabel("Programado por: ");
        etiProgramador = new JLabel();
        btnEmpezar = new JButton("Empezar");
       
        jPanel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        
        etiPrograma.setHorizontalAlignment(SwingConstants.CENTER);
        etiPrograma.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        etiVersion.setHorizontalAlignment(SwingConstants.CENTER);
        etiVersion.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

        etiProgramador.setHorizontalAlignment(SwingConstants.CENTER);
        etiProgramador.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jPanel1.setBounds(5, 5, 400, 300);
        
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(etiPrograma, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiVersion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiProgramador, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 154, Short.MAX_VALUE)
                .addComponent(btnEmpezar)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiPrograma, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiVersion, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(etiProgramador, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEmpezar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        getContentPane().setLayout(null);
        
        btnEmpezar.addActionListener(this);
    }
    
    public void setNombrePrograma(String Programa) {
        etiPrograma.setText(Programa);
    }

    public void setVersion(String Version) {
        etiVersion.setText(Version);
    }

    public void setNombreProgramador(String Programador) {
        etiProgramador.setText(Programador);
    }
    
    public static void main(String[] args) {
        DialogoPresentacion dialog = new DialogoPresentacion(new JFrame(), true);
            dialog.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        dialog.setVisible(true);
    }   
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JButton boton = (JButton) ae.getSource();
        
        if(boton == btnEmpezar){
            dispose();
        }
    } 
}
