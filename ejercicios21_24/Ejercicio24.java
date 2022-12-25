package edjuarez.ejercicios21_24;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio24 extends JFrame {
    JPanel panel;
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ejercicio24(){
        setSize(350, 200); //Estableciendo tamaño de la ventana
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicioC();
    }
    
    private void inicioC(){
        creaPan();
        creaEtis();        
    }
    
    private void creaPan(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void creaEtis(){
        JLabel eti1 = new JLabel("Etiqueta");
        eti1.setBounds(50, 50, 90, 90);
        eti1.setBackground(Color.LIGHT_GRAY);
        eti1.setOpaque(true);
        panel.add(eti1);
        
        JLabel eti2 = new JLabel("");
        eti2.setBounds(60, 60, 90, 90);
        eti2.setBackground(Color.BLACK);
        eti2.setOpaque(true);
        panel.add(eti2);
        
        MouseListener ej = new  MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                eti2.setBackground(Color.LIGHT_GRAY);
                eti2.setText("Está Pulsado");
                eti1.setOpaque(false);
               eti1.setLocation(400, 400);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                eti1.setText("Pulsame");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                eti1.setText("Etiqueta");
                eti2.setBackground(Color.BLACK);
                eti1.setOpaque(true);
            }
        };
        eti1.addMouseListener(ej);
    }
    
    public static void main(String[] args) {
        Ejercicio24 test = new Ejercicio24();
        test.setVisible(true);
        test.setTitle("Ejercicio24");
    }
}
