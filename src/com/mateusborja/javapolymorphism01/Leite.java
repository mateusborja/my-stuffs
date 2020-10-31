//java polymorphism
package com.mateusborja.javapolymorphism01;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class Leite extends Bebida {

    Leite() {
        super("Leite", true);
    }

    @Override
    public void preparar() {
        System.out.println("Pegando o copo");
        System.out.println("Colocando o leite no copo...");

    }

}
