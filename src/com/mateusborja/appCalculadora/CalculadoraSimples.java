package com.mateusborja.appCalculadora;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class CalculadoraSimples {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double n1, n2, somar, subtrair, multiplicar, dividir;

        int op;

        System.out.println("Digite o primeiro valor: ");
        n1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor: ");
        n2 = entrada.nextDouble();

        System.out.println("######## Escolha a operacao desejada: ########");
        System.out.println("[ 1 ] => SOMAR:");
        System.out.println("[ 2 ] => SUBTRAIR:");
        System.out.println("[ 3 ] => MULTIPLICAR:");
        System.out.println("[ 4 ] => DIVIDIR:");
        System.out.println(">>>>>>>>>>>>>>>>> Digite sua opcao: ");

        op = entrada.nextInt();

        switch (op) {
            case 1:
                somar = n1 + n2;
                System.out.printf("\nValor da soma: => %.2f%n", somar);
                break;

            case 2:
                subtrair = n1 - n2;
                System.out.printf("\nValor da subtracao: => %.2f%n",  subtrair);
                break;

            case 3:
                multiplicar = n1 * n2;
                System.out.printf("Valor da multiplicacao: => %.2f%n", multiplicar);
                break;

            case 4:
                if (n1 < n2) {
                    System.out.println("\nImpossivel realizar o calculo");
                } else {

                    dividir = n1 / n2;
                    System.out.printf("\nValor da divisao: => %.2f%n", dividir);
                    break;
                }

            default:
                System.out.println("\n>>>>>> Operacao invalida. <<<<<<");

        }

    }

}
