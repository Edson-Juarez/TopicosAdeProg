/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edjuarez.ejercicios29_31;

public class Pedido {
    String articulo;
    int unidades;
    double precio, gastoEnvio, descuento;

    public Pedido(String articulo, int unidades, double precio, double gastoEnvio, double descuento) {
        articulo = "";
        unidades = 1;
        precio = 0;
        gastoEnvio = 3;
        descuento = 0;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setGastoEnvio(double gastoEnvio) {
        this.gastoEnvio = gastoEnvio;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getArticulo() {
        return articulo;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public double getGastoEnvio() {
        return gastoEnvio;
    }

    public double getDescuento() {
        return descuento;
    }
    
    public double getTotalSinIva(){
    double totalSinIva = (unidades * precio) + gastoEnvio;
    return totalSinIva;
    }
    
    public double getIva(){
        double iva = getTotalSinIva() * 0.5;
        return iva;
    }
    public double getTotalMasIva(){
        double totalMasIva = getTotalSinIva() + getIva();
        return totalMasIva;
    }
    
    public double getTotalDescuento(){
        double totalDescuento = getTotalMasIva() * descuento / 100;
        return totalDescuento;
    }
    
    public double getTotalPedido(){
        double totalPedido = getTotalMasIva() - getTotalDescuento();
        return totalPedido;
    }
}
