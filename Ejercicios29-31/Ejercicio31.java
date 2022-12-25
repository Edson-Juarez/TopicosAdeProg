/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edjuarez.ejercicios29_31;

import java.awt.event.*;  
import javax.swing.*;  
import java.awt.*;  


public class Ejercicio31 extends JFrame implements ActionListener{
    JLabel radio, etiResultado;
    JTextField txtRadio;
    JButton btnArea, btnPerimetro, btnVolumen, btnLimpiar;
    DialogoPresentacion dialogoPresentacion;   
    
    public Ejercicio31() {
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    DeclararComponentes();  
    setSize(335, 200);    
    setLocationRelativeTo(null);  
    }
    
    public void DeclararComponentes(){
        dialogoPresentacion = new DialogoPresentacion(null, true);  
        dialogoPresentacion.setNombrePrograma("Cálculo del Área del círculo");
        dialogoPresentacion.setVersion("V  1.0");
        dialogoPresentacion.setNombreProgramador("Juarez L Edson Rubén");

        radio = new JLabel("Radio:");
        txtRadio = new JTextField();
        btnArea = new JButton("Area");
        btnPerimetro = new JButton("Perimetro");
        btnVolumen = new JButton("Volumen");
        btnLimpiar = new JButton("Limpiar");
        etiResultado = new JLabel();
        
        radio.setBounds(100, 10, 40, 20);
        txtRadio.setBounds(140, 10, 75, 23);
        btnArea.setBounds(10, 50, 70, 25);
        btnPerimetro.setBounds(105, 50, 95, 25);
        btnVolumen.setBounds(220, 50, 85, 25);
        btnLimpiar.setBounds(110, 120, 95, 25);
        etiResultado.setBounds(10, 90, 300, 20);
        
        
        etiResultado.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        getContentPane().add(radio);
        getContentPane().add(txtRadio);
        getContentPane().add(btnArea);
        getContentPane().add(btnPerimetro);
        getContentPane().add(btnVolumen);
        getContentPane().add(btnLimpiar);
        getContentPane().add(etiResultado);
        
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        getContentPane().setLayout(null);
        
        btnArea.addActionListener(this);
        btnPerimetro.addActionListener(this);
        btnVolumen.addActionListener(this);
        btnLimpiar.addActionListener(this);
    }
    
    public void area() {
        int radio = Integer.parseInt(txtRadio.getText());
        double area = Math.PI * Math.pow(radio, 2);
        etiResultado.setText("El Area del circulo es:   " + area);
    }

    public void perimetro() {
        int radio = Integer.parseInt(txtRadio.getText());
        double perimetro = (2 * Math.PI) * radio;
        etiResultado.setText("El perimetro del circulo es:   " + perimetro);
    }
    
    public void volumen(){
        int radio = Integer.parseInt(txtRadio.getText());
        double volumen = ((4 * Math.PI) / 3) * Math.pow(radio, 3);
        etiResultado.setText("El volumen del circulo es:   " + volumen);
    }

    private void formWindowOpened(WindowEvent evt) {                                  
       int x = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2 -  dialogoPresentacion.getWidth()/2);
       int y = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 -  dialogoPresentacion.getHeight()/2);
       dialogoPresentacion.setLocation(x,y);
       dialogoPresentacion.setVisible(true);
    }             
    
    public static void main(String[] args) {
        new Ejercicio31().setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JButton boton = (JButton) ae.getSource();
        
        if(boton == btnArea){
            area();
        }
        if(boton == btnPerimetro){
            perimetro();
        }
        if(boton == btnVolumen){
            volumen();
        }
        if(boton == btnLimpiar){
            etiResultado.setText("");
            txtRadio.setText("");
        }
    }    
}
