//java while with if and else
package com.mateusborja.appnumerocrescente;

import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class NumeroCrescente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("Crescente");
            } else {

                System.out.println("Decrescente");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }
        
        System.out.println("Numeros iguais");

        sc.close();

    }

}
