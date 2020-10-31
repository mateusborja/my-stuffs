// numeros primos
package com.mateusborja.numerosprimos;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class NumerosPrimos {

    public static boolean numerPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) 
                return false;

        }
        return true;
        
    }
    
    
    public static void main(String[] args) {
        
        for (int i = 2; i <=100; i ++) {
            if (numerPrimo(i)) 
                System.out.println("numeros primos: " + i);
        }
        
        
    }
    
    
}
