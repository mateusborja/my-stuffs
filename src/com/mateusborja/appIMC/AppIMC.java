package com.mateusborja.appIMC;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class AppIMC {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] colunas = {"Condição", "IMC em mulheres", "IMC em homens"};

        Object[][] dados = {
            {"Abaixo do peso ", "Menor que 19.1", "Menor que 20.7"},
            {"No peso ideal", "Entre 19.1 e 25.8", "Entre 20.8 e 26.4"},
            {"Um pouco acima do peso", "Entre 25.9 e 27.3", "Entre 26.5 e 27.8"},
            {"Acima do peso ideal", "Entre 27.4 e 32.3", "Entre 27.9 e 31.1"},
            {"Obeso", "Maior que 32.3 ", "Maior que 31.1"}
        };

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Qual seu peso: ");
        int peso = sc.nextInt();

        System.out.println("Qual sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("%s voce esta abaixo do peso e seu imc: %.2f.%n", nome, imc);

        } else if (imc < 25) {
            System.out.printf("%s seu peso esta ideal e seu imc: %.2f.%n", nome, imc);

        } else if (imc < 30) {
            System.out.printf("%s voce esta acima do peso. Seu imc esta:  %.2f.%n", nome, imc);

        } else if (imc < 35) {
            System.out.printf("%s Cuidado. Obesidade grau I. Seu imc: %.2f.%n", nome, imc);

        } else if (imc < 40) {
            System.out.printf("%s Cuidado!!!. Seu grau de Obesidade e II. Seu imc: %.2f.%n", nome, imc);

        } else {
            System.out.printf("%s muito cuidado!!!. Seu grau de Obesidade e mai alto III. Seu imc: %.2f.%n", nome, imc);
            System.out.println("Tenha cuidado. Obesidade pode matar.");

        }
        
        sc.close();

    }

}
