//java polymorphism
package com.mateusborja.javapolymorphism01;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Refrigerante extends Bebida {

    Refrigerante() {
        super("Refrigerante", false);
    }

    @Override
    public void preparar() {
        System.out.println("Abrindo o refrigerante");
        System.out.println("Colocando gelo no copo...");

    }

}
