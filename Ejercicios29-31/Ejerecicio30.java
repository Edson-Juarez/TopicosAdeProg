/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edjuarez.ejercicios29_31;

import java.awt.event.*;   
import javax.swing.*;     


public class Ejerecicio30 extends JFrame implements ActionListener {
    private Temperature temperatura1;
    private JButton btnFahrenheit, btnMas, btnMenos;
    private JTextField txtRango;
    
    
    public Ejerecicio30() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
    DeclararComponentes();  
    setSize(320, 350);    
    setLocationRelativeTo(null);   
    }
   
    
    public void DeclararComponentes(){
        btnMas = new JButton("+");
        btnMenos = new JButton("-");
        txtRango = new JTextField();
        btnFahrenheit = new JButton("Fahrenheit");
        temperatura1 = new Temperature();
        
        temperatura1.setBounds(40, 50, 230, 20);
        btnMas.setBounds(60, 190, 45, 25);
        btnMenos.setBounds(115, 190, 45, 25);
        txtRango.setBounds(175, 190, 65, 25);
        btnFahrenheit.setBounds(60, 235, 180, 25);
        
        temperatura1.setTemperatura(0);
        temperatura1.mostrarRangoColor();
        temperatura1.setHorizontalAlignment(SwingConstants.CENTER);
        
        getContentPane().add(temperatura1);
        getContentPane().add(btnMas);
        getContentPane().add(btnMenos);
        getContentPane().add(txtRango);
        getContentPane().add(btnFahrenheit);
        
        getContentPane().setLayout(null);
        
        btnMas.addActionListener(this);
        btnMenos.addActionListener(this);
        btnFahrenheit.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new Ejerecicio30().setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JButton boton = (JButton) ae.getSource();
        
        if(boton == btnMas){  
            double rango = Double.parseDouble(txtRango.getText());
            temperatura1.setTemperatura(temperatura1.getTemperatura() + rango);
            temperatura1.mostrarRangoColor();
        }
        if(boton == btnMenos){    
            double rango = Double.parseDouble(txtRango.getText());
            temperatura1.setTemperatura(temperatura1.getTemperatura() - rango);
            temperatura1.mostrarRangoColor();
        }
        if(boton == btnFahrenheit){     
            double Celsius = temperatura1.getTemperatura();
            double Fahrenheit = (1.8 * Celsius) + 32;
            JOptionPane.showMessageDialog(null,"La conversion de " + temperatura1.getText() + " es: " + Fahrenheit + " °F");
        }
    }
}
