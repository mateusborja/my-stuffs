//equacao 2 grau
package com.mateusborja.appEquacaoSegundoGrau;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, r1, r2, delta;

        System.out.println("Coeficiente A:");
        a = sc.nextDouble();

        System.out.println("Coeficiente B:");
        b = sc.nextDouble();

        System.out.println("Coeficiente C:");
        c = sc.nextDouble();

        delta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Impossivel Calcular as Raizes");
            System.out.println("O Coeficiente A e igual a zero");

        } else if (delta < 0) {
            System.out.println("Impossivel Calcular as Raizes");
            System.out.printf("O valor de Delta e menor que zero => %.5f%n", delta);

        } else {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("%nDelta = %.5f%n", delta);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);

        }

    }

}
