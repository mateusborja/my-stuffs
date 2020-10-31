//java acces modifiers and set and get methods
package com.mateusborja.contabancaria;

/**
 *
 * @author mateus.borja
 */
public class Aplicacao {

    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        c1.setNumConta(5422);
        c1.setContaAtiva(true);

        c2.setNumConta(4587);
        c2.setContaAtiva(true);

        c1.depositar(500);
        c1.sacar(250);

        c2.depositar(400);
        c2.sacar(100);
        c2.sacar(20);
        c2.sacar(80);
        c2.sacar(8);

        double s1 = c1.getContaSaldo();
        double s2 = c2.getContaSaldo();

        //double sums1s2 = s1 + s2;

        System.out.println(s1);
        System.out.println(s2);

    }

}
