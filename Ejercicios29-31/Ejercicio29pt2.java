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


public class Ejercicio29pt2 extends JFrame implements ActionListener {
    private Pedido PED;
    
    private JLabel etiArticulo, etiDescuento, etiGastoEnvio, etiPrecio, etiUnidades, etiIVA, etiTotalMasIva, etiTotalSinIVa, etiTotalPedido;
    private JButton btnAceptarPedido, btnDesgloce;
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15;
    private JTextField txtArticulo, txtDescuento, txtGastoEnvio, txtPrecio, txtUnidades;
    private JPanel jPanel1, jPanel2;
  
    
    public Ejercicio29pt2() {    
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
    initComponents();  
    setSize(760, 500);    
    setLocationRelativeTo(null);  
    PED = new Pedido("",0,0,0,0);
    }
   
    public void initComponents(){
        jLabel1 = new JLabel("SOLICITUD DE PEDIDO");
        jPanel1 = new JPanel();
        jLabel2 = new JLabel("Articulo:");
        txtArticulo = new JTextField();
        jLabel3 = new JLabel("Unidades:");
        txtUnidades = new JTextField();
        jLabel4 = new JLabel("Precio:");
        txtPrecio = new JTextField();
        jLabel5 = new JLabel("Gasto de Envio:");
        txtGastoEnvio = new JTextField();
        jLabel6 = new JLabel("% Descuento:");
        txtDescuento = new JTextField();
        jPanel2 = new JPanel();
        jLabel7 = new JLabel("Articulo:");
        etiUnidades = new JLabel();
        jLabel8 = new JLabel("Unidades:");
        etiArticulo = new JLabel();
        jLabel9 = new JLabel("Precio:");
        etiPrecio = new JLabel();
        jLabel10 = new JLabel("Gastos de Envio:");
        etiGastoEnvio = new JLabel();
        jLabel11 = new JLabel("Total Sin Iva:");
        etiTotalSinIVa = new JLabel();
        jLabel12 = new JLabel("IVA:");
        etiIVA = new JLabel();
        jLabel13 = new JLabel("Total Mas IVA:");
        etiTotalMasIva = new JLabel();
        jLabel14 = new JLabel("Descuento:");
        etiDescuento = new JLabel();
        jLabel15 = new JLabel("Total Pedido:");
        etiTotalPedido = new JLabel();
        btnAceptarPedido = new JButton("Aceptar Pedido");
        btnDesgloce = new JButton("Ver desglose");
        
        jPanel1.setBorder(BorderFactory.createTitledBorder("Datos del Pedido"));
        jPanel2.setBorder(BorderFactory.createTitledBorder("Ficha del Pedido"));
        
        etiUnidades.setBackground(Color.CYAN);
        etiArticulo.setBackground(Color.CYAN);
        etiPrecio.setBackground(Color.CYAN);
        etiGastoEnvio.setBackground(Color.CYAN);
        etiTotalSinIVa.setBackground(Color.CYAN);
        etiIVA.setBackground(Color.CYAN);
        etiTotalMasIva.setBackground(Color.CYAN);
        etiDescuento.setBackground(Color.CYAN);
        etiTotalPedido.setBackground(Color.CYAN);
        
        etiUnidades.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiArticulo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiPrecio.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiGastoEnvio.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiTotalSinIVa.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiIVA.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiTotalMasIva.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiDescuento.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiTotalPedido.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        etiUnidades.setOpaque(true);
        etiArticulo.setOpaque(true);
        etiPrecio.setOpaque(true);
        etiGastoEnvio.setOpaque(true);
        etiTotalSinIVa.setOpaque(true);
        etiIVA.setOpaque(true);
        etiTotalMasIva.setOpaque(true);
        etiDescuento.setOpaque(true);
        etiTotalPedido.setOpaque(true);
        
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(txtArticulo, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtUnidades)
                            .addComponent(txtPrecio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(txtGastoEnvio)
                            .addComponent(txtDescuento))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtArticulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUnidades, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGastoEnvio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDescuento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiArticulo, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiUnidades, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiPrecio, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(etiGastoEnvio, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiTotalSinIVa, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiIVA, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiTotalMasIva, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiDescuento, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiTotalPedido, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(etiArticulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(etiUnidades, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(etiPrecio, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(etiGastoEnvio,GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(etiTotalSinIVa, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(etiIVA, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(etiTotalMasIva, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(etiDescuento, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(etiTotalPedido, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAceptarPedido, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(btnDesgloce, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarPedido)
                    .addComponent(btnDesgloce))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        btnAceptarPedido.addActionListener(this);
        btnDesgloce.addActionListener(this);
    }
    
    public void aceptarPedido(){
        String Articulo = txtArticulo.getText();
        double descuento = Double.parseDouble(txtDescuento.getText());
        int unidades = Integer.parseInt(txtUnidades.getText());
        double precio = Double.parseDouble(txtPrecio.getText());
        double gastodeenvio = Double.parseDouble(txtGastoEnvio.getText());
        PED.setArticulo(Articulo);
        PED.setDescuento(descuento);
        PED.setGastoEnvio(gastodeenvio);
        PED.setUnidades(unidades);
        PED.setPrecio(precio);
    }
    
    public void desglose(){
        etiArticulo.setText(PED.getArticulo());
        etiUnidades.setText("" + PED.getUnidades());
        etiPrecio.setText("" + PED.getPrecio());
        etiGastoEnvio.setText("" + PED.getGastoEnvio());
        etiDescuento.setText("" + PED.getDescuento());
        etiIVA.setText("" + PED.getIva());
        etiTotalSinIVa.setText("" + PED.getTotalSinIva());
        etiTotalMasIva.setText("" + PED.getTotalMasIva());
        etiTotalPedido.setText("" + PED.getTotalPedido());
    }

    public static void main(String[] args) {
        new Ejercicio29pt2().setVisible(true);  
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JButton boton = (JButton) ae.getSource();
        if(boton == btnAceptarPedido){
            aceptarPedido();
        }
        if(boton == btnDesgloce){
            desglose();
        }
    }
    
}

