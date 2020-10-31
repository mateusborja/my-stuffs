/*
    Um numero e considerado par quando o resto de sua divisao e igual == a zero;
    java if else - numeros pares
 */
package com.mateusborja.numerospareseimpares;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class SomaNumerosPares {

    public static void main(String[] args) {

        for (int i = 0; i < 12; i++) { // inicio i = 0, condicao intervalo de 0 a 11, incremento i + 1
            if (i % 2 == 0) { // condicao de um numero ser par
                int sum = i + i; // soma dos numeros pares
                System.out.println("soma dos pares " + i + " + " + i + " = " + sum); // impressao da soma dos numeros pares
            }

        }

    }

}
