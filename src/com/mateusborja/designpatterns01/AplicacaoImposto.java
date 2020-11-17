/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.designpatterns01;

public class AplicacaoImposto {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(1000);
        CalculadorImpostos calculaimpostos = new CalculadorImpostos();
        ISS iss = new ISS();
        ICMS icms = new ICMS();

        System.out.print("Orcamento inicial R$ " + orcamento.getValor());
        System.out.println();
        System.out.print("ISS a pagar  ");
        calculaimpostos.Calcula(orcamento, iss);

        orcamento.setValor(5400);
        System.out.println("Orçamento mês 10");
        System.out.println("R$ " + orcamento.getValor());

        System.out.print("IMCS a pagar ");
        calculaimpostos.Calcula(orcamento, icms);
    }

}
