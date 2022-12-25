package edjuarez.ejercicios21_24;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio23pt2 extends JFrame {
    JPanel panel;
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ejercicio23pt2(){
        setSize(350, 200); //Estableciendo tamaño de la ventana
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicioC();
    }
    
    private void inicioC(){
        creaPan();
        creaEt();        
    }
    
    private void creaPan(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void creaEt(){
        JLabel e1 = new JLabel("V=S/t");
        e1.setBounds(30, 20, 60, 20);
        panel.add(e1);
        
         JLabel e2 = new JLabel("S= V*t");
        e2.setBounds(170, 20, 60, 20);
        panel.add(e2);
        
         JLabel e3 = new JLabel("Espacio:");
        e3.setBounds(30, 60, 60, 20);
        panel.add(e3);
        
         JLabel e4 = new JLabel("Velocidad:");
        e4.setBounds(170, 60, 60, 20);
        panel.add(e4);
        
         JLabel e5 = new JLabel("Tiempo:");
        e5.setBounds(170, 90, 60, 20);
        panel.add(e5);
        
         JLabel e6 = new JLabel("Tiempo:");
        e6.setBounds(30, 90, 60, 20);
        panel.add(e6);
        
         JLabel e7 = new JLabel("Velocidad:");
        e7.setBounds(30, 120, 60, 20);
        panel.add(e7);
        
         JLabel e8 = new JLabel("Espacio:");
        e8.setBounds(170, 120, 60, 20);
        panel.add(e8);
        
         JLabel e9 = new JLabel();
        e9.setBounds(100, 120, 60, 20);
        e9.setBackground(Color.yellow);
        e9.setOpaque(true);
        panel.add(e9);
        
         JLabel e10 = new JLabel();
        e10.setBounds(250, 120, 60, 20);
        e10.setBackground(Color.red);
        e10.setOpaque(true);
        panel.add(e10);
        
        
        
        
        JTextField e11 = new JTextField("0");
        e11.setBounds(100, 60, 60, 20);
        panel.add(e11);
        
        JTextField e12 = new JTextField("0");
        e12.setBounds(250, 90, 60, 20);
        panel.add(e12);
        
        JTextField e13 = new JTextField("0");
        e13.setBounds(250, 60, 60, 20);
        panel.add(e13);
        
        JTextField e14 = new JTextField("0");
        e14.setBounds(100, 90, 60, 20);
        panel.add(e14);   
        
        ActionListener pc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double a = Double.parseDouble(e11.getText());
               double b = Double.parseDouble(e14.getText());
               double r = a/b;
               e9.setText(""+ r);
            }
        };
        e11.addActionListener(pc);
        
        ActionListener tex = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double a = Double.parseDouble(e11.getText());
               double b = Double.parseDouble(e14.getText());
               double r = a/b;
               e9.setText(""+ r);
            }
        };
                e14.addActionListener(tex);
                
        ActionListener vav = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double a = Double.parseDouble(e12.getText());
               double b = Double.parseDouble(e13.getText());
               double r = a*b;
               e10.setText(""+ r);
            }
        };
                e12.addActionListener(vav);
                
        ActionListener otr = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double a = Double.parseDouble(e12.getText());
               double b = Double.parseDouble(e13.getText());
               double r = a*b;
               e10.setText(""+ r);
            }
        };
                e13.addActionListener(otr);
    }
    
    
    public static void main(String[] args) {
        Ejercicio23pt2 test = new Ejercicio23pt2();
        test.setVisible(true);
        test.setTitle("Ejercicio23 pt2");
    }
}
