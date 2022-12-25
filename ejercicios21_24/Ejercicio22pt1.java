/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edjuarez.ejercicios21_24;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

/**
 *
 * @author Ed Juarez
 */
public class Ejercicio22pt1 extends JFrame{
    JPanel panel;
      @SuppressWarnings("OverridableMethodCallInConstructor")
      public Ejercicio22pt1(){
          setSize(350, 400); //Estableciendo tamaño de la ventana
          setLocationRelativeTo(null);
          inicioComponentes();
          setDefaultCloseOperation(EXIT_ON_CLOSE);
      }
      
      private void inicioComponentes(){
          creaPanel();   //Crea el panel para poner todo encima de el       
          crearEtiquetas();//Crea las  4 etiquetas 
          creatxtF();//Crea los dos campos de texto
          creabotons();//Crea los 3 botones y 1 Toggle 
          creaSlider();//Crea el Slider con las especificaciones de la tarea
      }
      
      private void creaPanel(){
          panel = new JPanel();
          panel.setLayout(null);
          this.getContentPane().add(panel);
      }
      
      private void crearEtiquetas(){
          JLabel etiEspacio = new JLabel("Espacio:");
          etiEspacio.setBounds(40, 50, 50, 25);
          panel.add(etiEspacio);
          
          JLabel etiTiempo = new JLabel("Tiempo:");
          etiTiempo.setBounds(200, 50, 50, 25);
          panel.add(etiTiempo);
          
          JLabel etiVelocidad = new JLabel("Velocidad:");
          etiVelocidad.setBounds(40, 130, 60, 25);
          panel.add(etiVelocidad);
          
          JLabel etiResultado = new JLabel("Resultado");
          etiResultado.setBounds(200, 130, 60, 25);
          etiResultado.setOpaque(true);
          etiResultado.setBackground(Color.green);
          panel.add(etiResultado);
      }
      
      private void creatxtF(){
          JTextField txtEspacio = new JTextField("0", SwingConstants.CENTER);
          txtEspacio.setBounds(40, 80, 65, 25);
          panel.add(txtEspacio);
          
          JTextField txtTiempo = new JTextField("0",SwingConstants.CENTER);
          txtTiempo.setBounds(200, 80, 65, 25);
          panel.add(txtTiempo);
      }
      
      private void creabotons(){
          JButton bCalc = new JButton("CALCULAR");
          bCalc.setBounds(40, 200, 100, 25);
          panel.add(bCalc);
          
          JButton bLimpiar = new JButton("LIMPIAR");
          bLimpiar.setBounds(160, 200, 85, 25);
          panel.add(bLimpiar);
          
          JButton bAsk = new JButton("?");
          bAsk.setBounds(270, 200, 50, 25);
          panel.add(bAsk);
          
          JToggleButton MS = new JToggleButton("metros/segundos");
          MS.setFont(new Font("arial",Font.PLAIN,9));
          MS.setBounds(40, 250, 110, 25);
          MS.setSelected(true);
          panel.add(MS);
      }
      
      private void creaSlider(){
          JSlider S1 = new JSlider();
          S1.setBounds(40, 290, 200, 30);
          S1.setMinimum(0);
          S1.setMaximum(100);
          S1.setValue(20);
          S1.setPaintTicks(true);
          S1.setMinorTickSpacing(5);
          panel.add(S1);
      }
      
      public static void main(String[] args) {
        Ejercicio22pt1 ejercicio = new Ejercicio22pt1();
        ejercicio.setVisible(true);
        ejercicio.setTitle("EJercicio 22 pt.1");
    }
}
