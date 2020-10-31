//java array, for, if 
package com.mateusborja.javaarray;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class ArraySumPercent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("qtde de pessoas: ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        System.out.println("nome, idade e altura das " + n + " pessoas?");
        for (int i = 0; i < n; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            alturas[i] = sc.nextDouble();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("[nome: %s], [idade: %danos], [altura: %.2fm]%n", nomes[i], idades[i], alturas[i]);

        }

        System.out.println();
        double soma = 0.0, media = 0.0;
        for (int i = 0; i < n; i++) {
            soma += alturas[i];
            media = soma / n;
        }
        
        System.out.printf("media das alturas: %.2fm%n", media);

        int ct = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 18) {
                ct++;
            }
        }

        double porcentagem = ct * 100 / n;
        System.out.printf("menos de 18 anos: %.2f%% da coleção.%n", porcentagem);

        sc.close();

    }

}
