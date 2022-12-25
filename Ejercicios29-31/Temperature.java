/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edjuarez.ejercicios29_31;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Aldahir Santiago
 */
public class Temperature extends JLabel{
   double temperatura;

    //En el constructor se le da un valor por defceto a nuestra variable.
    public Temperature() {
       temperatura = 0;
    }

    //El metodo set asigna la varible principal a la variable del metodo y lo muestra en una etiqueta.
    public void setTemperatura(double temperature) {
        this.temperatura = temperature;
        setText(temperatura + " °C");
    }
    //El metodo get regresa un valor de tipo doble.
    public double getTemperatura(){
        return temperatura;
    }
    
    //Se crea el metodo que dependiendo del rango en el que se encuentre la etiqueta de ese color cambiara el color de la etiqueta.
    public void mostrarRangoColor(){
        double Temperature = getTemperatura();
        if(Temperature < 0){
            setBackground(Color.BLUE);
            setOpaque(true);
        }else if(Temperature >= 0 && Temperature < 10 ){
            setBackground(Color.CYAN);
            setOpaque(true);
        }else if(Temperature >= 10 && Temperature < 25){
            setBackground(Color.MAGENTA);
            setOpaque(true);
        }else if (Temperature >= 25 && Temperature < 35){
            setBackground(Color.ORANGE);
            setOpaque(true);
        }else if(Temperature >= 35){
            setBackground(Color.RED);
            setOpaque(true);
        }else {setOpaque(false);}
        
    }
    
    //Se crea el metodo que permite cambiar la temperatura.
    public void cambiarTemperatura(double temperature){
        if(temperatura < 0){
            temperatura = temperatura - temperature;
        }
        else if(temperatura > 0){
            temperatura = temperatura + 5;
        }
    } 
}
