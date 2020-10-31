//java polimorphism
package com.mateusborja.javapolymorphism01;

/**
 *
 * @author Mateus Borja at <www.mateusborja.life>
 */
public class SucoNatural extends Bebida {

    public SucoNatural() {
        super("Suco", false);
    }

    @Override
    public void preparar() {
        System.out.println("Pegar o suco na geladeira");
        System.out.println("Colocando gelo no copo");
        System.out.println("Acucar...");

    }

}
