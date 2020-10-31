/*
    Um numero e considerado impar quando o resto de sua divisao e diferente != a zero;
    java if else - numeros pares
 */
package com.mateusborja.numerospareseimpares;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class NumerosImpares {

    public static void main(String[] args) {

        System.out.println("\nimpares de 0 a 10\n");

        for (int n = 0; n < 18; n++) {
            if (n % 2 != 0) { //condicao para numeros impares
                int sum = n + n; // soma de numeros impares no intervalo de zero a dezoito
                System.out.println("impar: " + n + " + " + n + " = " + sum); // valores impressos

            }

        }

    }

}
