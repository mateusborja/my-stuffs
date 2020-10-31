//java polimorphism
package com.mateusborja.javapolymorphism01;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class AguaQuente extends Bebida {

    AguaQuente() {
        super("Agua quente", true);
    }

    @Override
    public void preparar() {
        System.out.println("Pegando o copo");
        System.out.println("Colocando a " + getNomeBebida() + " no copo...");
    }

}
