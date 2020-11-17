/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
package com.mateusborja.designpatterns01;

public class CalculadorImpostos {

    public void Calcula(Orcamento orcamento, Imposto impostoQualquer) {
        double imposto = impostoQualquer.calcula(orcamento);
        System.out.println("R$ " + imposto);

    }

}
