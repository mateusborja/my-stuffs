//java switch
package com.mateusborja.javaswitch01;

import java.util.Scanner;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class PedidoEValor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(">>> Faça seu Pedido: <<<<");
        System.out.println("Codigo do pedido: ");
        int codigo = entrada.nextInt();
        int quantidade;
        double totalAPagar;

        switch (codigo) {
            case 1: 
                System.out.println("Quantidade desejada: ");
                quantidade = entrada.nextInt();
                totalAPagar = (double) quantidade * 4.0;
                System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
                break;
                
            case 2: 
                System.out.println("Quantidade desejada: ");
                quantidade = entrada.nextInt();
                totalAPagar = (double) quantidade * 4.5;
                System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
                break;
            
            case 3: 
                System.out.println("Quantidade desejada: ");
                quantidade = entrada.nextInt();
                totalAPagar = (double) quantidade * 5.0;
                System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
                break;
                
            case 4: 
                System.out.println("Quantidade desejada: ");
                quantidade = entrada.nextInt();
                totalAPagar = (double) quantidade * 2.0;
                System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
                break;
                
            case 5: 
                System.out.println("Quantidade desejada: ");
                quantidade = entrada.nextInt();
                totalAPagar = (double) quantidade * .15;
                System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
                break;
                
            default: 
                System.out.println("Número Inválido");
                   
        }

    }

}
