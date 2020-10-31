//java metho System
package com.mateusborja.appmedianumeros;

import java.util.Scanner;

/**
 *
 * @author mateus.borja
 */
public class MediaNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y, media;

        System.out.println("Digite o primeiro numero: => ");
        x = sc.nextDouble();

        System.out.println("Digite o segundo numero: => ");
        y = sc.nextDouble();

        media = (x + y) / 2;
        System.out.println("A media dos numeros e: => " + media);

    }

}
