/*
    Um numero e considerado par quando o resto de sua divisao e igual == a zero;
    java if else - numeros pares
 */
package com.mateusborja.numerospareseimpares;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class NumerosPares {

    public static void main(String[] args) {

        System.out.println("\npares de 0 a 10:\n");
        
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("pares: " + i);
            }
        }

    }

}
