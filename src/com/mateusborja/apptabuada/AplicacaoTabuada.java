//java for - Tabuada
package com.mateusborja.apptabuada;

import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class AplicacaoTabuada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = i * n;
            System.out.println(i + " x " + n + " = " + tabuada);

        }

    }

}
