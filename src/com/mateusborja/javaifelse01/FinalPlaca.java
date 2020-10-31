//java if else
package com.mateusborja.javaifelse01;

import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class FinalPlaca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o final da Placa: ");
        int finalPlaca = sc.nextInt();

        if (finalPlaca == 4 || finalPlaca == 5) {
            System.out.println("Previsão de pagamento:");
            System.out.println("Até Fim de Outubro");

        } else if (finalPlaca == 6 || finalPlaca == 7) {
            System.out.println("Previsão de pagamento:");
            System.out.println("Até fim de Novembro");

        } else if (finalPlaca == 8 || finalPlaca == 9 || finalPlaca == 0) {
            System.out.println("Previsão de pagamento:");
            System.out.println("Até fim de Dezembro");

        } else {
            System.out.println("Previsão de pagamento:");
            System.out.println("Até fim de Setembro");
        }

    }

}
