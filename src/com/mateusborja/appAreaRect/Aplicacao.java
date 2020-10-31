
package com.mateusborja.appAreaRect;

/**
 *
 * @author mateus.borja
 */
public class Aplicacao {
    
    public static void main(String[] args) {
        
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(10, 20);
        Retangulo r3 = new Retangulo();
        
        Quadrado q1 = new Quadrado();
        
        double arear1 = r1.calcularArea();
        System.out.println(arear1);
        
        double arear2 = r2.calcularArea();
        System.out.println(arear2);
        
        double areaq1 = q1.calcularArea();
        System.out.println(areaq1);
        
        /*
        ussing methods set
        */
        
        r1.setValores(15, 85);
        r3.setValores(10, 35);
        
        double perimetror3 = r3.calcularPerimetro();
        System.out.println("Perimetro => " + perimetror3);
        
        double area3 = r1.calcularArea();
        System.out.println("area3 => " + area3 +" sqm.");
        
    }
    
}
