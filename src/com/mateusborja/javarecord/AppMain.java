//java record and static modifier
package com.mateusborja.javarecord;

/**
 *
 * @author mateus.borja
 */
public class AppMain {
    
    public static void main(String[] args) {
        
        double area1 = Square.calculateArea(8, 25);
        
        Square sq1 = Square.create(25);
        
        System.out.println(area1);
        
        System.out.println(sq1);
             
        
    }
    
}
