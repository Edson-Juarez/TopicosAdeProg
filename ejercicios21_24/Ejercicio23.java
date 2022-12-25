package edjuarez.ejercicios21_24;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Ejercicio23 extends JFrame {
    JPanel panel;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ejercicio23(){
        setSize(300, 200); //Estableciendo tamaño de la ventana
        setLocationRelativeTo(null);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicioComponentes();
        }
    
    private void inicioComponentes(){
        creaPanel();
        creadis();
    }
    
    private void creaPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void creadis(){
        JLabel tx = new JLabel("Radio:");
        tx.setBounds(30, 30, 50, 15);
        panel.add(tx);
        
        JTextField wop = new JTextField();
        wop.setBounds(90, 30, 70, 20);
        panel.add(wop);
        
        JLabel red = new JLabel("");
        red.setBounds(20, 110, 200, 20);
        red.setBackground(Color.red);
        red.setOpaque(true);
        panel.add(red);
        
        JButton area = new JButton("area");
        area.setBounds(10, 70, 65, 20);
        panel.add(area);
        
        JButton peri = new JButton("Perimetro");
        peri.setBounds(80, 70, 100, 20);
        panel.add(peri);
        
        JButton clean = new JButton("Limpiar");
        clean.setBounds(185, 70, 80, 20);
        panel.add(clean);
        //A partir de aquí se calcula el area
        ActionListener ca = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 double y = Double.parseDouble(wop.getText());
                 double a = Math.PI*(Math.pow(y, 2));
                 red.setText(a+"");
            }
        };        
        area.addActionListener(ca);
        
        //Pasamos a clcular el perimetro
        ActionListener pc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(wop.getText());
                double p = (2*Math.PI*x);
                red.setText(p+"");
            }
        };
        peri.addActionListener(pc);
        
        //Limpiamos la etiqueta de los resultados
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wop.setText("0");
                red.setText("");
            }
        };
        clean.addActionListener(l);
    }   
    
    public static void main(String[] args) {
        Ejercicio23 ej = new Ejercicio23();
        ej.setVisible(true);
        ej.setTitle("Ejercicio 23");
    }
}

