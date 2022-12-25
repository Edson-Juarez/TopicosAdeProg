
package edjuarez.ejercicios29_31;

public class Rectangulo {
    double base;
    double altura;


    public Rectangulo(double base, double altura) {
      base = 100.00;
      altura = 50.00;
    }

    
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    
    public double getAltura() {
        return altura;
    }
    
    
    public double getArea(){
    double a = base * altura;
    return a;
    }
    
    
    public double getPerimetro(){
    double p = (2 * base) + (2 * altura);
    return p;
    }
    
    
    public void cuadrar(){
    altura = base;
    }
}

