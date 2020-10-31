//java array com for e if
package com.mateusborja.javaarray;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class ArrayNumerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("qtde numeros no array: ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        System.out.println("numeros do array: ");
        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("pares do array: ");
        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                System.out.printf("[ %.1f ] ", vet[i]);
            }

        }

        sc.close();

    }

}
