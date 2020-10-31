//java while with if
package com.mateusborja.appMediaIdades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class MediaDeIdades {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int digitados = 0;

        while (idade >= 0) {

            soma += idade; // soma = soma + idade 
            digitados++;
            idade = sc.nextInt();

        }

        if (digitados > 0) {
            double media = (double) soma / digitados;
            System.out.printf("A média das idades e: %.2f%n", media);
        } else {
            System.out.println("Impossível calcular");
        }

        sc.close();
    }

}
