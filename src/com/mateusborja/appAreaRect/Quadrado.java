package com.mateusborja.appAreaRect;

/**
 *
 * @author mateus.borja
 */
public  class Quadrado {

    static double lado;


    //initial stage
    public Quadrado() {
        lado = 5;
    }

    public Quadrado(double lado) {
        Quadrado.lado = lado;
        

    }

    public static double calcularArea() {
        return lado * lado;
    }

    public void setLado(double lado) {
        Quadrado.lado = lado;
        
    }
    
    

}
