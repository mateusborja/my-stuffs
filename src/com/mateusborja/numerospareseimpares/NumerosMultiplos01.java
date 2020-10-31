/*
    Um numero e multiplo  de outro, basta encontrar um número inteiro de modo
    que a multiplicação entre eles resulte no primeiro número;
    java if else - numeros pares
 */
package com.mateusborja.numerospareseimpares;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class NumerosMultiplos01 {

    public static void main(String[] args) {

        for (int a = 0; a <= 180; a++) { // inicio com a = 0, condica de 0 a 180, e o incremento a + 1
            if (a % 18 == 0) { // achar multiplos de 18
                int sum = a + a; // SOMA dos multiplos de 18 de zero a 180
                System.out.println("multiplos de 18: 0 a 180 => " + a); // impressao dos multiplos de 18
                System.out.println("soma dos multiplos é: " + a + " + " + a + " = " + sum + "\n");

            }

        }

    }

}
