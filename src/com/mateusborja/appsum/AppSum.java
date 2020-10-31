package com.mateusborja.appsum;
/**
 *
 * @author mateus.borja
 */
public class AppSum {
    
    public static void main(String[] args) {
        int i,j;
        
        for (i = 100; i < 1000; i++) {
            for (j = 100; j < 1000; j++) {
                int n = i+j;
                if (n==888) {
                    System.out.println("A soma de " + i + " + " + j + "é igual a = " + n );
                }
                
            }
            
        }
               
        
        
        
    }
    
    
}
