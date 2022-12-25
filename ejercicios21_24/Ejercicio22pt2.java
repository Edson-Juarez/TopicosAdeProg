package edjuarez.ejercicios21_24;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Ejercicio22pt2 extends JFrame {
    JPanel panel;    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ejercicio22pt2() {
          setSize(300, 300); //Estableciendo tamaño de la ventana
          setLocationRelativeTo(null);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          inicioComponentes();
    }
    
    private void inicioComponentes(){
        CreaPanel();
        creaEti();
        creaconts();
    }
    
    private void CreaPanel(){
        panel = new JPanel();
          panel.setLayout(null);
          this.getContentPane().add(panel);
    }
    
    private void creaEti(){
        JLabel etiArticulos = new JLabel("Tipo de Artículos:");
          etiArticulos.setBounds(165, 20, 100, 10);
          panel.add(etiArticulos);
          
        JLabel etiProvi = new JLabel("Provincias");
        etiProvi.setBounds(30, 20, 70, 10);
        panel.add(etiProvi);
        
        JLabel eticolor = new JLabel();
        eticolor.setBounds(165, 200, 100, 20);
        eticolor.setBackground(Color.CYAN);
        eticolor.setOpaque(true);
        panel.add(eticolor);
    }
    
    private void creaconts(){
        JList listArti = new JList();
        listArti.setBounds(20, 40, 90, 150);
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("Centro");
        modelo.addElement("Xoxocotlán");
        modelo.addElement("San Felipe");
        modelo.addElement("San Martín");
        modelo.addElement("Zaachila");
        modelo.addElement("Cuilapam");
        modelo.addElement("Etla");
        modelo.addElement("Mitla");
        listArti.setModel(modelo);
        panel.add(listArti);
        
        
        JComboBox boxProvi = new JComboBox();
        boxProvi.setBounds(165, 40, 100, 20);
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("Liquidos");
        model.addElement("Maquinaria");
        model.addElement("Peligrosidad 1");
        model.addElement("Peligrosidad 2");
        model.addElement("Piezas");
        boxProvi.setModel(model);
        panel.add(boxProvi);
        
        JButton calc = new JButton("Cálculo Precio");
        calc.setBounds(10, 200, 120, 20);        
        panel.add(calc);
    }
    
    public static void main(String[] args) {
        Ejercicio22pt2 pt2 = new Ejercicio22pt2();
        pt2.setVisible(true);
        pt2.setTitle("Ejercicio 2");
    }
}