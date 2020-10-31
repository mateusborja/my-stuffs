package com.mateusborja.appAreaRect;

/**
 *
 * @author mateus.borja
 */
public class Retangulo {

    private double largura;
    private double altura;

    /*java constructor calls 
        second constructor
     */
    public Retangulo() {
        this(4, 3);
        //largura = 8;
        //altura = 12;
    }

    //java constructor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
    
    public double calcularPerimetro() {
        return 2.0 * (largura + altura);
    }
    
    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
    

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setValores (double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    

}
