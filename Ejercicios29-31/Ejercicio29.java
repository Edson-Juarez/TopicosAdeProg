
package edjuarez.ejercicios29_31;

import java.awt.event.*;   
import javax.swing.*;     
import java.awt.*;   
import javax.swing.border.*;


public class Ejercicio29 extends JFrame implements ActionListener {
    
    public Ejercicio29() {    
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
    iniciarComp();  
    setSize(430, 340);    
    setLocationRelativeTo(null);       
    Norte.setSelected(true);    
    pNorte = new Rectangulo(0, 0);     
    pSur = new Rectangulo(0, 0);
    pEste = new Rectangulo(0, 0);
    pOeste = new Rectangulo(0, 0);
    }
  
    private JButton btnAsignar, btnArea, btnPerimetro;
    private ButtonGroup Paredes;
    private JLabel jLabel1, jLabel2;
    private JPanel jPanel1, jPanel2;
    private JRadioButton Norte, Sur, Este, Oeste;
    private JTextField  txtAncho, txtAlto;
    
    Rectangulo pNorte;
    Rectangulo pSur;
    Rectangulo pEste;
    Rectangulo pOeste;   
    
    public void iniciarComp(){
        Paredes = new ButtonGroup();
        jPanel1 = new JPanel();
        Norte = new JRadioButton("Pared Norte");
        Sur = new JRadioButton("Pared Sur");
        Este = new JRadioButton("Pared Este");
        Oeste = new JRadioButton("Pared Oeste");
        jPanel2 = new JPanel();
        jLabel1 = new JLabel("Ancho: ");
        txtAncho = new JTextField();
        jLabel2 = new JLabel("Alto: ");
        txtAlto = new JTextField();
        btnAsignar = new JButton("Asignar");
        btnArea = new JButton("Area");
        btnPerimetro = new JButton("Perimetro");
        
       
        jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Paredes", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 0, 11), Color.BLACK));
        jPanel2.setBorder(BorderFactory.createTitledBorder(null, "Tamaño", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 0, 11), Color.BLACK));
        
        
        Paredes.add(Norte);
        Paredes.add(Sur);
        Paredes.add(Este);
        Paredes.add(Oeste);

        
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(Norte)
                    .addComponent(Sur)
                    .addComponent(Este)
                    .addComponent(Oeste))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Norte)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sur)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Este)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Oeste)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAsignar, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAlto, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txtAncho))))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAncho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAlto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnAsignar)
                .addContainerGap())
        );

       
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnArea, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnPerimetro, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnArea)
                .addGap(18, 18, 18)
                .addComponent(btnPerimetro)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        
        
        btnAsignar.addActionListener(this);
        btnArea.addActionListener(this);
        btnPerimetro.addActionListener(this);
    }
    
    
    public void asignar(){
        double ancho, alto;
        ancho = Integer.parseInt(txtAncho.getText());
        alto = Integer.parseInt(txtAlto.getText());
        
        if (Norte.isSelected()) {
            pNorte.setAltura(alto);
            pNorte.setBase(ancho);
            txtAlto.setText("");
            txtAncho.setText("");
        } else if (Sur.isSelected()) {
            pSur.setAltura(alto);
            pSur.setBase(ancho);
            txtAlto.setText("");
            txtAncho.setText("");
        } else if  (Este.isSelected()){
            pEste.setAltura(alto);
            pEste.setBase(ancho);
            txtAlto.setText("");
            txtAncho.setText("");
        } else if  (Oeste.isSelected()){
            pOeste.setAltura(alto);
            pOeste.setBase(ancho);
            txtAlto.setText("");
            txtAncho.setText("");
        }
    }
    
   
    public void area (){
        double x = 0;
        
        if (Norte.isSelected()) {
            x = pNorte.getArea();
        } else if (Sur.isSelected()) {
            x = pSur.getArea();
        } else if  (Este.isSelected()){
            x = pEste.getArea();
        } else if  (Oeste.isSelected()){
            x = pOeste.getArea();
        }
        JOptionPane.showMessageDialog(null, "El Area de la pared seleccionada es: " + x);
    }
    
    public void perimetro(){
        double x = 0;
        
        if (Norte.isSelected()) {
            x = pNorte.getPerimetro();
        } else if (Sur.isSelected()) {
            x = pSur.getPerimetro();
        } else if  (Este.isSelected()){
            x = pEste.getPerimetro();
        } else if  (Oeste.isSelected()){
            x = pOeste.getPerimetro();
        }
        JOptionPane.showMessageDialog(null, "El perimetro de la pared seleccionada es: " + x);
    }
    
    public static void main(String[] args) {
        new Ejercicio29().setVisible(true);  
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JButton boton = (JButton) ae.getSource();
        
        if(boton == btnAsignar){
            asignar();
        }
        if(boton == btnArea){
            area();
        }
        if(boton == btnPerimetro){
            perimetro();
        }
    }   
    
    
}

