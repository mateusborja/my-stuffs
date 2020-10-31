
//java static
package com.mateusborja.javarecord;

/**
 *
 * @author mateus.borja
 */
public class Square  {
    
    
    private static double width;
    private static double height;
    
    private static double lado;
    
   
    Square (double widht, double height) {
        this.width = widht;
        this.height = height;
    }
    
   
    public static double calculateArea(double width, double height) {
        return width * height;
    }
    
    //method create
    public static Square create (double lado) {
        return new Square(lado, lado);
    }
    
       
    
}
