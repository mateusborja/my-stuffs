/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.javarecursividade;

import java.util.Scanner;

public class Somatorio {

    public static int somatorioDeUmNumero(int num) {

        if (num == 1) {
            return 1;
        }

        return num + somatorioDeUmNumero(num - 1);

    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("digite um número: ");
        int num = sc.nextInt();
        
        System.out.println();
        System.out.println("somatório de " + num + " é: " + somatorioDeUmNumero(num));
        
        
        sc.close();
        
        
        
    }

}
