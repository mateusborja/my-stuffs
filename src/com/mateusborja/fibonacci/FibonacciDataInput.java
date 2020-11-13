/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.fibonacci;

import java.util.Scanner;

public class FibonacciDataInput {
    
    public static int fibonacciRecursivo(int num) {
        
        if (num < 2) {
            return 1;
        }
        
        return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2);
        
    }
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("range fibonacci: ");
            int fib1 = sc.nextInt();
            
            System.out.println("seq fibonacci: ");
            for (int i = 0; i < fib1; i++) {
                System.out.print(" " + fibonacciRecursivo(i));
                
            }
        }
        
    }
    
}
