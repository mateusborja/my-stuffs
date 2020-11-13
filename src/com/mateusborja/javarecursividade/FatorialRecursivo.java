/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.javarecursividade;

public class FatorialRecursivo {
    
    public static int fatorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * fatorial(num - 1);

    }
    
    static int fatorialR;
    
    public static void main(String[] args) {
        
        fatorialR = FatorialRecursivo.fatorial(10);
        System.out.println(fatorialR);
        
        System.out.println("fatorial");
        for (int i = 0; i < 10; i++) {
            System.out.println(" "+ FatorialRecursivo.fatorial(i));
            
        }
        
    }

}
